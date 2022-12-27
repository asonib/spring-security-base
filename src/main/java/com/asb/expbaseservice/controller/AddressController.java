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

    @GetMapping("/address/user/{id}")
    @Cacheable(value = TextConstants.ADDRESS_CACHE_VALUE, key = "#userId")
    public Address getAddressByUserId(@PathVariable(value = "id") String userId) throws ResourceNotFoundException {
        return addressService.getAddressByUserId(userId);
    }

    @GetMapping("/address/{id}")
    @Cacheable(value = TextConstants.ADDRESS_CACHE_VALUE, key = "#addressId")
    public Address getAddressByAddressId(@PathVariable(value = "id") String addressId) throws ResourceNotFoundException {
        return addressService.getAddressByAddressId(addressId);
    }

    @DeleteMapping("/address/{addressId}/{userId}")
    @CacheEvict(value = TextConstants.ADDRESS_CACHE_VALUE, key = "#userId")
    public String deleteAddressById(@PathVariable(value = "addressId") String addressId,
                                    @PathVariable(value = "userId") String userId) throws ResourceNotFoundException {
        return addressService.deleteAddressById(addressId, userId);
    }
}
