package com.ironhack.prework08.model.entities;

import com.ironhack.prework08.model.House;
import com.ironhack.prework08.model.Wing;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "house_assignment")
public class HouseAssignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private House house;

    @Enumerated(EnumType.STRING)
    private Wing wing;

    private Integer assignedBed;

    @OneToOne(mappedBy="houseAssignment")
    private Student student;


    public HouseAssignment(House house,
                           Wing wing, Integer assignedBed, Student student) {
        this.id = id;
        this.house = house;
        this.wing = wing;
        this.assignedBed = assignedBed;
        this.student = student;
    }
}

