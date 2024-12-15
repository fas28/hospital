package com.koerber.hospital.application.services;

import com.koerber.hospital.application.business_objects.ConsultBO;
import com.koerber.hospital.application.mappers.DTOToBOMapper;
import com.koerber.hospital.persistence.entities.Consult;
import com.koerber.hospital.persistence.entities.Doctor;
import com.koerber.hospital.persistence.entities.Pathology;
import com.koerber.hospital.persistence.entities.Patient;
import com.koerber.hospital.persistence.entities.Speciality;
import com.koerber.hospital.persistence.repositories.HospitalManagementRepository;
import com.koerber.hospital.ui.controllers.dtos.ConsultDTO;
import com.koerber.hospital.ui.controllers.dtos.ListOfConsultsDTO;
import com.koerber.hospital.ui.controllers.dtos.ListOfPatientsDTO;
import com.koerber.hospital.ui.controllers.dtos.PatientDTO;
import com.koerber.hospital.ui.controllers.dtos.SpecialityDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalManagementService {

    private final HospitalManagementRepository hospitalManagementRepository;

    @Autowired
    public HospitalManagementService(HospitalManagementRepository hospitalManagementRepository) {
        this.hospitalManagementRepository = hospitalManagementRepository;
    }

    public void addConsult(final ConsultDTO consultDTO) {
        //Map DTO to BO
        final ConsultBO consultBO = DTOToBOMapper.mapConsultDTOToConsultBO(consultDTO);

        Patient patient = findPatientByName(consultBO.getPatient().getName());
        Doctor doctor = findDoctorByName(consultBO.getDoctor().getName());
        Pathology pathology = findPathologyByName(consultBO.getPathology().getName());
        Speciality speciality = new Speciality();
        speciality.setName(consultBO.getSpeciality().getName());

        Consult consultToAdd = new Consult();
        consultToAdd.setPatient(patient);
        consultToAdd.setDoctor(doctor);
        consultToAdd.setSpeciality(speciality);
        consultToAdd.setPathology(pathology);

        //Call the repository to save the consult
        hospitalManagementRepository.save(consultToAdd);
    }

    public ListOfConsultsDTO listConsults(final PatientDTO patientDTO) {
        //Mapper to convert the DTO to business entity
        //Call the repository to list the consults

        //mapper to convert to DTO
        return new ListOfConsultsDTO();
    }

    public SpecialityDTO getTopSpecialities() {
        //Call the repository to get the top specialities

        //mapper to convert to DTO
        return new SpecialityDTO();

    }

    public ListOfPatientsDTO listAllPatients(final String age, final int name) {
        //Call the repository to list all patients
        //mapper to convert to DTO
        return new ListOfPatientsDTO();
    }


    private Patient findPatientByName(String patientName) {
        //Call the repository to find the patient by name
        return hospitalManagementRepository.findPatientByName(patientName);
    }

    private Doctor findDoctorByName(String doctorName) {
        //Call the repository to find the doctor by name
        return hospitalManagementRepository.findDoctorByName(doctorName);
    }

    private Pathology findPathologyByName(String pathologyName) {
        //Call the repository to find the pathology by name
        return hospitalManagementRepository.findPathologyByName(pathologyName);
    }

}
