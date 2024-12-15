package com.koerber.hospital.persistence.repositories;

import com.koerber.hospital.persistence.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorManagementRepository extends JpaRepository<Doctor, Long> {

    Doctor findDoctorByName(String doctorName);

}
