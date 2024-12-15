package com.koerber.hospital.persistence.repositories;

import java.util.Optional;

import com.koerber.hospital.persistence.entities.Patient;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

public abstract class PatientManagementRepositoryImpl implements  PatientManagementRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Patient findPatientByName(String patientName) {
        String sql = "SELECT p FROM Patient p WHERE p.name = :patientName";
        Query query = entityManager.createQuery(sql);
        Optional<Patient> patient = query.getResultList().stream().findFirst();
        return patient.orElse(null);
    }
}
