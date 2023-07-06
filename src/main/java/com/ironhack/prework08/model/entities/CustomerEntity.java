package com.ironhack.prework08.model.entities;

import com.ironhack.prework08.model.Address;
import com.ironhack.prework08.model.Contact;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String firstName;
    private String lastName;

    @Embedded
    Address currentAddress;

    @AttributeOverrides({
            @AttributeOverride(name="streetAddress",column=@Column(name="perm_street")),
            @AttributeOverride(name="city",column=@Column(name="perm_city")),
            @AttributeOverride(name="postalCode",column=@Column(name="perm_postal"))
    })
    @Embedded
    private Address permanentAddress;


    @AttributeOverrides({
            @AttributeOverride(name="name",column=@Column(name="emergency_contact_name")),
            @AttributeOverride(name="phone",column=@Column(name="emergency_contact_phone"))
    })
    @Embedded
    private Contact emergencyContact;


    public CustomerEntity(String firstName, String lastName,
                          Address currentAddressAddress, Contact emergencyContact) {
        this.firstName = firstName;
        this.lastName = lastName;
        setCurrentAddress(currentAddressAddress);
        setEmergencyContact(emergencyContact);
    }
}
