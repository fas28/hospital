package com.koerber.hospital.application.services;
import com.koerber.hospital.persistence.repositories.HospitalManagementRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalManagementService {

    private final HospitalManagementRepositoryInterface hospitalManagementRepository;

    @Autowired
    public HospitalManagementService(HospitalManagementRepositoryInterface hospitalManagementRepository) {
        this.hospitalManagementRepository = hospitalManagementRepository;
    }

    public void addConsult(final String doctor, final String speciality, final String patient) {
        //Mapper to convert the DTO to business entity
        //Call the repository to add the consult
    }

}
