package com.micro.services.controller;

import com.micro.services.entity.Address;
import com.micro.services.model.AddressRequest;
import com.micro.services.model.AddressResponse;
import com.micro.services.repository.AddressRepo;
import com.micro.services.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;
    @Autowired
    AddressRepo addressRepo;

    @PostMapping("/registerAddress")
    public ResponseEntity<AddressRequest> registerAddress(@RequestBody Address address) {

        return ResponseEntity.ok(
                addressService.registerAddress(addressRepo.save(address)));
    }

    @GetMapping("/getAddress/{id}")
    public AddressResponse getAddressById(@PathVariable int id) {
        Address address = addressRepo.findById(id);
        return addressService.getById(address);


    }
}
