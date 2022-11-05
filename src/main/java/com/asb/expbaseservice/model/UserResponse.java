package com.asb.expbaseservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponse implements Serializable {
    private String userId;
    private String firstName;
    private String lastName;
    private String emailId;
    private Address address;
    private Boolean isEmailVerified;
}
