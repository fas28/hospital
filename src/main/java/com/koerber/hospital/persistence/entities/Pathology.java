package com.koerber.hospital.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "pathology")
public class Pathology {

    @Id
    private Long pathologyId;

    private String pathologyName;

}
