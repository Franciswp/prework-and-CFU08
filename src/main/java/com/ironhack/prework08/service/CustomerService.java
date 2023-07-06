package com.ironhack.prework08.service;

import com.ironhack.prework08.model.entities.CustomerEntity;
import com.ironhack.prework08.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;


    public List<CustomerEntity> getAllCustomers() {
        return customerRepo.findAll();
    }

    public CustomerEntity addNewCustomer(CustomerEntity customer) {
        return customerRepo.save(customer);
    }
}
