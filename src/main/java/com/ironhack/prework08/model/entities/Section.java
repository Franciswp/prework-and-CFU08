package com.ironhack.prework08.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Section {
    @Id
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="course_code")
    private Course course;

    private int roomNum;
    private int instructorId;


    public Section(Course course, int roomNum, int instructorId) {
        this.id = id;
        this.course = course;
        this.roomNum = roomNum;
        this.instructorId = instructorId;
    }
}

