package com.koerber.hospital.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "consult")
public class Consult {

    @Id
    private Long consultId;


}
