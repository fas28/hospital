package com.koerber.hospital.persistence.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "pathology")
public class Pathology {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String name;

    @ManyToMany(mappedBy = "patientPathologies")
    private Set<Patient> patients = new HashSet<>();

    @OneToMany(mappedBy = "pathology")
    private Set<Symptom> symptoms = new HashSet<>();

}
