package com.ironhack.prework08.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Course {

    @Id
    private String courseCode;
    private String courseName;

    @OneToMany(mappedBy="course", fetch = FetchType.EAGER)
    private Set<Section> sections;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.sections = sections;
    }
}

