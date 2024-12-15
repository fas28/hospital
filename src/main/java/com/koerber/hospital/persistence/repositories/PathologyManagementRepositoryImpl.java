package com.koerber.hospital.persistence.repositories;

import java.util.Optional;

import com.koerber.hospital.persistence.entities.Pathology;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

public abstract class PathologyManagementRepositoryImpl implements PathologyManagementRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Pathology findPathologyByName(String pathologyName) {
        String sql = "SELECT p FROM Pathology p WHERE p.name = :pathologyName";
        Query query = entityManager.createQuery(sql);
        Optional<Pathology> pathology = query.getResultList().stream().findFirst();
        return pathology.orElse(null);
    }

}
