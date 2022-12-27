package com.asb.expbaseservice.service.impl;

import com.asb.expbaseservice.exception.ResourceNotFoundException;
import com.asb.expbaseservice.model.Address;
import com.asb.expbaseservice.model.Users;
import com.asb.expbaseservice.repository.AddressRepository;
import com.asb.expbaseservice.repository.UserRepository;
import com.asb.expbaseservice.service.IAddressService;
import com.asb.expbaseservice.utils.KafkaProducerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class AddressServiceImpl implements IAddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    KafkaProducerUtil kafkaProducerUtil;

    private static final String SERVICE_NAME = "AddressServiceImpl - exp-base-service";

    @Override
    public List<Address> getAllAddressList() {
        kafkaProducerUtil.sendStringMessage("INFO :: "+ SERVICE_NAME +" :: getAllAddressList API called on "+new Date());
        return addressRepository.findAll();
    }

    @Override
    public Address getAddressByUserId(String userId) throws ResourceNotFoundException {
        kafkaProducerUtil.sendStringMessage("INFO :: "+ SERVICE_NAME +" :: getAddressById for Id {"+userId+"} API called on "+new Date());
        Users userAddress = userRepository.findByUserId(userId);
        if(userAddress == null){
            throw new ResourceNotFoundException("Unable find address with user id {"+userId+"}");
        }
        return userAddress.getAddress();
    }

    @Override
    public String deleteAddressById(String addressId, String userId) throws ResourceNotFoundException {
        kafkaProducerUtil.sendStringMessage("INFO :: "+ SERVICE_NAME +" :: deleteAddressById for Id {"+userId+"} API called on "+new Date());
        Address address = addressRepository.findByAddressIdentification(addressId);
        if(address == null){
            throw new ResourceNotFoundException("Unable find address with id {"+addressId+"}");
        }
        Users users = userRepository.findByUserId(userId);
        if(users == null){
            throw new ResourceNotFoundException("Unable find user with id {"+userId+"}");
        }
        users.setAddress(null);
        userRepository.save(users);
        addressRepository.delete(address);
        return "Address Deleted.";

    }

    @Override
    public Address getAddressByAddressId(String addressId) throws ResourceNotFoundException {
        kafkaProducerUtil.sendStringMessage("INFO :: "+ SERVICE_NAME +" :: getAddressById for Id {"+addressId+"} API called on "+new Date());
        Address userAddress = addressRepository.findByAddressIdentification(addressId);
        if(userAddress == null){
            throw new ResourceNotFoundException("Unable find address with address id {"+addressId+"}");
        }
        return userAddress;
    }
}
