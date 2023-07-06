package com.ironhack.prework08.model;

import com.ironhack.prework08.model.entities.SectionEntity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name="id")
public class MathSection extends SectionEntity {
    private final int mathCredit;

    public MathSection(int mathCredit) {
        super(30);
        this.mathCredit = mathCredit;
    }
}

