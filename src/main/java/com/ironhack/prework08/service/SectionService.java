package com.ironhack.prework08.service;

import com.ironhack.prework08.model.entities.SectionEntity;
import com.ironhack.prework08.repository.SectionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SectionService {
    @Autowired
    private SectionRepo sectionRepo;

    public SectionEntity addSection(SectionEntity section) {
        return sectionRepo.save(section);
    }

}