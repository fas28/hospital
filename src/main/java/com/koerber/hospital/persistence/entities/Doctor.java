package com.koerber.hospital.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    private Long idNumber;

    private String name;

}
