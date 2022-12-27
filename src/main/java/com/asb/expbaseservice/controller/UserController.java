package com.asb.expbaseservice.controller;

import com.asb.expbaseservice.exception.ResourceNotFoundException;
import com.asb.expbaseservice.model.UserRequest;
import com.asb.expbaseservice.model.UserResponse;
import com.asb.expbaseservice.model.Users;
import com.asb.expbaseservice.model.Users;
import com.asb.expbaseservice.model.dto.UserDto;
import com.asb.expbaseservice.repository.UserRepository;
import com.asb.expbaseservice.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/users")
    public List<UserResponse> getAllUsers() {
        List<UserDto> userDtos = userService.getAllUsers();
        List<UserResponse> userResponses = new ArrayList<>();
        for (int i = 0; i < userDtos.size(); i++) {
            UserResponse userResponse = new UserResponse();
            BeanUtils.copyProperties(userDtos.get(i), userResponse);
            userResponses.add(userResponse);
        }
        return userResponses;
    }

    @GetMapping("/user/{id}")
    @Cacheable(value = "users", key = "#userId")
    public UserResponse getUserById(@PathVariable(value = "id") String userId) throws ResourceNotFoundException {
        UserDto userDto = userService.getUserById(userId);
        UserResponse userRet = new UserResponse();
        BeanUtils.copyProperties(userDto, userRet);
        return userRet;
    }

    @PutMapping("/user/{id}")
    @CachePut(value = "users", key = "#userId")
    public UserResponse updateUser(@PathVariable(value = "id") String userId,
                            @RequestBody UserDto userDetails) throws ResourceNotFoundException {
        UserDto userDto = userService.updateUser(userId, userDetails);
        UserResponse userResponse = new UserResponse();
        BeanUtils.copyProperties(userDto, userResponse);
        return userResponse;
    }

    @DeleteMapping("/user/{id}")
    @CacheEvict(value = "users", key = "#userId")
    public Map<String, Boolean> deleteUser(@PathVariable(value = "id") String userId)
            throws ResourceNotFoundException {
        return userService.deleteUser(userId);
    }
}