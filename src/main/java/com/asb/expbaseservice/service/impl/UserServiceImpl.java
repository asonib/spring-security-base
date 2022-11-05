package com.asb.expbaseservice.service.impl;

import com.asb.expbaseservice.exception.ResourceNotFoundException;
import com.asb.expbaseservice.model.Address;
import com.asb.expbaseservice.model.UserResponse;
import com.asb.expbaseservice.model.Users;
import com.asb.expbaseservice.model.dto.UserDto;
import com.asb.expbaseservice.repository.AddressRepository;
import com.asb.expbaseservice.repository.UserRepository;
import com.asb.expbaseservice.service.IUserService;
import com.asb.expbaseservice.utils.KafkaProducerUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    KafkaProducerUtil kafkaProducerUtil;

    private static final String SERVICE_NAME = "UserServiceImpl - exp-base-service";

    @Override
    public List<UserDto> getAllUsers() {
        kafkaProducerUtil.sendStringMessage("INFO :: "+ SERVICE_NAME +" :: getAllUsers API called on "+new Date());
        if(userRepository.count() == 0){
            return new ArrayList<>();
        }
        List<Users> users = userRepository.findAll();
        List<UserDto> userResponses = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            UserDto userDto = new UserDto();
            BeanUtils.copyProperties(users.get(i), userDto);
            userResponses.add(userDto);
        }
        return userResponses;
    }

    @Override
    public UserDto getUserById(Long userId) throws ResourceNotFoundException {
        kafkaProducerUtil.sendStringMessage("INFO :: "+ SERVICE_NAME +" :: getUserByID for Id {"+userId+"} API called on "+new Date());
        Users user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("Users not found for this id :: " + userId));
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(user, userDto);
        return userDto;
    }

    @Override
    public UserDto updateUser(Long userId, UserDto userDetails) throws ResourceNotFoundException {
        kafkaProducerUtil.sendStringMessage("INFO :: "+ SERVICE_NAME +" :: updateUser for Id {"+userId+"} API called on "+new Date());
        Users user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("Users not found for this id :: " + userId));

        if(!Objects.isNull(userDetails) && userDetails.getEmailId() != null){
            user.setEmailId(userDetails.getEmailId());
        }
        if(!Objects.isNull(userDetails) && userDetails.getFirstName() != null){
            user.setFirstName(userDetails.getFirstName());
        }
        if(!Objects.isNull(userDetails) && userDetails.getLastName() != null){
            user.setLastName(userDetails.getLastName());
        }
        if(!Objects.isNull(userDetails.getAddress())){
            user.setAddress(userDetails.getAddress());
        }

        final Users updatedUser = userRepository.save(user);
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(updatedUser, userDto);
        return userDto;
    }

    @Override
    public Map<String, Boolean> deleteUser(Long userId) throws ResourceNotFoundException {
        kafkaProducerUtil.sendStringMessage("INFO :: "+ SERVICE_NAME + " :: deleteUser for Id {"+userId+"} API called on "+new Date());
        Users user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("Users not found for this id :: " + userId));

        userRepository.delete(user);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
