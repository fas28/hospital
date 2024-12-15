package com.koerber.hospital.persistence.repositories;

import com.koerber.hospital.persistence.entities.Consult;
import com.koerber.hospital.persistence.entities.Doctor;
import com.koerber.hospital.persistence.entities.Pathology;
import com.koerber.hospital.persistence.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalManagementRepository extends JpaRepository<Consult, Long> {

    Patient findPatientByName(String patientName);

    Doctor findDoctorByName(String doctorName);

    Pathology findPathologyByName(String patientName);

}
