package com.asb.expbaseservice.model.dto;

import com.asb.expbaseservice.model.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private Long id;
    private String userId;
    private Address address;
    private String firstName;
    private String lastName;
    private String emailId;
    private String password;
    private Boolean isEmailVerified;
}
