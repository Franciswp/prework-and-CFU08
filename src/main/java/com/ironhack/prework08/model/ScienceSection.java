package com.ironhack.prework08.model;

import com.ironhack.prework08.model.entities.SectionEntity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name="id")
public class ScienceSection extends SectionEntity {
    private final int scienceCredit;
    private Integer labRoomNum;

    public ScienceSection(int scienceCredit) {
        super(30);
        this.scienceCredit = scienceCredit;
    }
}
