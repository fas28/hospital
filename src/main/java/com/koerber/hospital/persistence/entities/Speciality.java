package com.koerber.hospital.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "speciality")
public class Speciality {

    @Id
    private Long specialityId;

    private String specialityName;

    @OneToOne()
    private Doctor doctor;
}
