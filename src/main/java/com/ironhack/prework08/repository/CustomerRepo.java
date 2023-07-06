package com.ironhack.prework08.repository;

import com.ironhack.prework08.model.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepo extends JpaRepository<CustomerEntity,Long> {

}
