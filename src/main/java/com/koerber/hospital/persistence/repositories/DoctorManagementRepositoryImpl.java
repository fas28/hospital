package com.koerber.hospital.persistence.repositories;

import java.util.Optional;

import com.koerber.hospital.persistence.entities.Doctor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

public abstract class DoctorManagementRepositoryImpl implements DoctorManagementRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Doctor findDoctorByName(String doctorName) {
        String sql = "SELECT d FROM Doctor d WHERE d.name = :doctorName";
        Query query = entityManager.createQuery(sql);
        Optional<Doctor> doctor = query.getResultList().stream().findFirst();
        return doctor.orElse(null);
    }

}
