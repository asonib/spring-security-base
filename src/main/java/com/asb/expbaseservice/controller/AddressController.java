package com.asb.expbaseservice.controller;

import com.asb.expbaseservice.constants.TextConstants;
import com.asb.expbaseservice.exception.ResourceNotFoundException;
import com.asb.expbaseservice.model.Address;
import com.asb.expbaseservice.model.Users;
import com.asb.expbaseservice.service.IAddressService;
import com.asb.expbaseservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AddressController {

    @Autowired
    private IAddressService addressService;

    @GetMapping("/address")
    public List<Address> getAllUsers() {
        return addressService.getAllAddressList();
    }

    @GetMapping("/address/{id}")
    @Cacheable(value = TextConstants.ADDRESS_CACHE_VALUE, key = "#userId")
    public Address getUserById(@PathVariable(value = "id") Long userId) throws ResourceNotFoundException {
        return addressService.getAddressById(userId);
    }

    @DeleteMapping("/address/{addressId}/{userId}")
    @CacheEvict(value = TextConstants.ADDRESS_CACHE_VALUE, key = "#userId")
    public String deleteAddressById(@PathVariable(value = "addressId") Long addressId,
                                    @PathVariable(value = "userId") Long userId) throws ResourceNotFoundException {
        return addressService.deleteAddressById(addressId, userId);
    }
}
