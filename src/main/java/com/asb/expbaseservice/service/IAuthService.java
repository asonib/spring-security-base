package com.asb.expbaseservice.service;

import com.asb.expbaseservice.exception.ResourceNotFoundException;
import com.asb.expbaseservice.model.UserRequest;
import com.asb.expbaseservice.model.UserResponse;
import com.asb.expbaseservice.model.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestBody;

public interface IAuthService extends UserDetailsService {
    UserResponse userSignup(UserDto userDto) throws ResourceNotFoundException;
    UserDto getUser(String email);
}
