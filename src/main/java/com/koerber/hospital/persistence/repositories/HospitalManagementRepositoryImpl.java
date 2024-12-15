package com.koerber.hospital.persistence.repositories;

import java.util.Optional;

import com.koerber.hospital.persistence.entities.Doctor;
import com.koerber.hospital.persistence.entities.Pathology;
import com.koerber.hospital.persistence.entities.Patient;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public abstract class HospitalManagementRepositoryImpl implements HospitalManagementRepository {

    EntityManager entityManager;

    @Override
    public Patient findPatientByName(String patientName) {
        String sql = "SELECT p FROM Patient p WHERE p.name = :patientName";
        Query query = entityManager.createQuery(sql);
        Optional<Patient> patient = query.getResultList().stream().findFirst();
        return patient.orElse(null);
    }

    @Override
    public Doctor findDoctorByName(String doctorName) {
        String sql = "SELECT d FROM Doctor p WHERE d.name = :doctorName";
        Query query = entityManager.createQuery(sql);
        Optional<Doctor> doctor = query.getResultList().stream().findFirst();
        return doctor.orElse(null);
    }

    @Override
    public Pathology findPathologyByName(String pathologyName) {
        String sql = "SELECT p FROM Pathology p WHERE p.name = :pathologyName";
        Query query = entityManager.createQuery(sql);
        Optional<Pathology> pathology = query.getResultList().stream().findFirst();
        return pathology.orElse(null);
    }

}
