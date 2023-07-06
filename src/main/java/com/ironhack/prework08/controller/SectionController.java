package com.ironhack.prework08.controller;

import com.ironhack.prework08.model.ComputerSection;
import com.ironhack.prework08.model.entities.SectionEntity;
import com.ironhack.prework08.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SectionController {
    @Autowired
    private SectionService sectionService;


    public SectionEntity addSection(SectionEntity service) {
        return sectionService.addSection(service);
    }

}
