package com.ironhack.prework08.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
@Inheritance(strategy= InheritanceType.JOINED)
@Table(name = "Course_section")
public class SectionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private String id;
    @Column(name = "course_code")
    private String courseCode;

    @Column(name = "room_number")
    private Integer roomNum;

    @Column(name = "number_enrolled")
    private Integer enrolled;

    @Column
    private String instructor;

    @Column
    private Integer capacity;

    public SectionEntity(int capacity){
        setCapacity(capacity);
    }
}
