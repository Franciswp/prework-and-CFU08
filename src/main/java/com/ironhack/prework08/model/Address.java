package com.ironhack.prework08.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class Address {
    private String streetAddress;
    private String city;
    private String postalCode;
}
