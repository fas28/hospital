package com.koerber.hospital.persistence.repositories;

import com.koerber.hospital.persistence.entities.Pathology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PathologyManagementRepository extends JpaRepository<Pathology, Long> {
    Pathology findPathologyByName(String pathologyName);

}
