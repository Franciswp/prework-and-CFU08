package com.ironhack.prework08.controller;

import com.ironhack.prework08.model.entities.CustomerEntity;
import com.ironhack.prework08.repository.CustomerRepo;
import com.ironhack.prework08.service.CustomerService;
import com.ironhack.prework08.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerController {
    @Autowired
    private CustomerService service;

    public CustomerEntity addNewCustomer(CustomerEntity customer) {
        return service.addNewCustomer(customer);
    }

}
