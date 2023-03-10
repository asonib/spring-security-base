package com.asb.expbaseservice.service;

import com.asb.expbaseservice.exception.ResourceNotFoundException;
import com.asb.expbaseservice.model.Users;
import com.asb.expbaseservice.model.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface IUserService {
    List<UserDto> getAllUsers();
    UserDto getUserById(String userId) throws ResourceNotFoundException;
    UserDto updateUser(String userId, UserDto userDetails) throws ResourceNotFoundException;
    Map<String, Boolean> deleteUser(String userId) throws ResourceNotFoundException;
}
