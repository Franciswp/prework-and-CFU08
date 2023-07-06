package com.ironhack.prework08.repository;

import com.ironhack.prework08.model.entities.SectionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SectionRepo extends JpaRepository<SectionEntity,String>{
    @Override
    List<SectionEntity> findAll();
}
