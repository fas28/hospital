package com.koerber.hospital.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "symptom")
public class Symptom {

    @Id
    private Long symptomId;

    private String description;

}
