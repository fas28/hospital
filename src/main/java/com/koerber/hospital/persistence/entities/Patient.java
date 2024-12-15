package com.koerber.hospital.persistence.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    @ManyToMany
    @JoinTable(name = "patient_pathology",
               joinColumns = @JoinColumn(name = "patient", referencedColumnName = "id"),
               inverseJoinColumns = @JoinColumn(name = "pathology", referencedColumnName = "id"))
    private Set<Pathology> patientPathologies = new HashSet<>();


}
