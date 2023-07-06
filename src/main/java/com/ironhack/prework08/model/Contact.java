package com.ironhack.prework08.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class Contact {
    private  String name;
    private String phone;

}
