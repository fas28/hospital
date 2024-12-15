package com.koerber.hospital.persistence.repositories;

import com.koerber.hospital.persistence.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientManagementRepository extends JpaRepository<Patient,Long> {

    Patient findPatientByName(String patientName);

}
