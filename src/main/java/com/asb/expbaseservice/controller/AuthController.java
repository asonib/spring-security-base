package com.asb.expbaseservice.controller;

import com.asb.expbaseservice.exception.ResourceNotFoundException;
import com.asb.expbaseservice.model.UserRequest;
import com.asb.expbaseservice.model.UserResponse;
import com.asb.expbaseservice.model.dto.UserDto;
import com.asb.expbaseservice.service.IAuthService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AuthController {

    @Autowired
    IAuthService authService;

    @PostMapping("/user/signup")
    public UserResponse userSignup(@RequestBody UserRequest userRequest) throws ResourceNotFoundException {
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userRequest, userDto);
        return authService.userSignup(userDto);
    }
}
