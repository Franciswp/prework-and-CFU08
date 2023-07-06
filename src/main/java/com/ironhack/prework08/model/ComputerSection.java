package com.ironhack.prework08.model;

import com.ironhack.prework08.model.entities.SectionEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name="id")
public class ComputerSection extends SectionEntity {
    private final int computerCredit;


    public ComputerSection(int computerCredit) {
        super(15);
        this.computerCredit = computerCredit;
    }
}
