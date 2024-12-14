package com.koerber.hospital.persistence.repositories;

import com.koerber.hospital.persistence.entities.Consult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalManagementRepositoryInterface extends JpaRepository<Consult, Long> {

}
