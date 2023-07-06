package com.ironhack.prework08.model.entities;

import com.ironhack.prework08.controller.CustomerController;
import com.ironhack.prework08.model.Address;
import com.ironhack.prework08.model.Contact;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerEntityTest {
    @Autowired
    private CustomerController controller;
    private CustomerEntity customer;
    private CustomerEntity customer2;

    private Address address;
    private Contact contact;

    @Test
    public void setUp(){
        address = new Address();
        address.setStreetAddress("Wilhelm Street");
        address.setCity("Heilbronn");
        address.setPostalCode("24356");

        contact = new Contact();
        contact.setName("Adams Smith");
        contact.setPhone("+001 33927926");

        customer = new CustomerEntity("Christian","Jame", address,contact);
        controller.addNewCustomer(customer);
        customer2 = new CustomerEntity("Pretty ","Woman",address,contact);
        controller.addNewCustomer(customer2);
    }

}