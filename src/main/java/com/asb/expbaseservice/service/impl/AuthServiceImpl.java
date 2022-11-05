package com.asb.expbaseservice.service.impl;

import com.asb.expbaseservice.exception.ResourceNotFoundException;
import com.asb.expbaseservice.model.UserRequest;
import com.asb.expbaseservice.model.UserResponse;
import com.asb.expbaseservice.model.Users;
import com.asb.expbaseservice.model.dto.UserDto;
import com.asb.expbaseservice.repository.UserRepository;
import com.asb.expbaseservice.service.IAuthService;
import com.asb.expbaseservice.utils.KafkaProducerUtil;
import com.asb.expbaseservice.utils.Utils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

@Service
public class AuthServiceImpl implements IAuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Utils utils;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    KafkaProducerUtil kafkaProducerUtil;

    private static final String SERVICE_NAME = "AuthServiceImpl - exp-base-service";

    @Override
    public UserResponse userSignup(UserDto userDto) throws ResourceNotFoundException {
        kafkaProducerUtil.sendStringMessage("INFO :: "+ SERVICE_NAME +" :: userSignUp API called on "+new Date());
        Users checkUser = userRepository.findByEmailId(userDto.getEmailId());
        if(checkUser != null){
            throw new ResourceNotFoundException("User already exists with email {"+ userDto.getEmailId()+"}");
        }
        Users users = Users.builder()
                .userId(utils.generateUserId(30))
                .address(userDto.getAddress())
                .emailId(userDto.getEmailId())
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .isEmailVerified(Boolean.FALSE)
                .password(bCryptPasswordEncoder.encode(userDto.getPassword()))
                .build();
        Users users1 = userRepository.save(users);
        UserResponse userResponse = new UserResponse();
        BeanUtils.copyProperties(users1, userResponse);
        return userResponse;
    }

    @Override
    public UserDto getUser(String email) {
        Users users = userRepository.findByEmailId(email);
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(users, userDto);
        return userDto;
    }

    @Override
    public UserDetails loadUserByUsername(String emailId) throws UsernameNotFoundException {
        Users userEntity = userRepository.findByEmailId(emailId);

        if (userEntity == null)
            throw new UsernameNotFoundException(emailId);

        return new User(userEntity.getEmailId(), userEntity.getPassword(), new ArrayList<>());
    }
}
