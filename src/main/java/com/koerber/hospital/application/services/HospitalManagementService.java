package com.koerber.hospital.application.services;

import com.koerber.hospital.application.business_objects.ConsultBO;
import com.koerber.hospital.application.mappers.DTOToBOMapper;
import com.koerber.hospital.persistence.entities.Consult;
import com.koerber.hospital.persistence.entities.Doctor;
import com.koerber.hospital.persistence.entities.Pathology;
import com.koerber.hospital.persistence.entities.Patient;
import com.koerber.hospital.persistence.entities.Speciality;
import com.koerber.hospital.persistence.repositories.DoctorManagementRepository;
import com.koerber.hospital.persistence.repositories.PathologyManagementRepository;
import com.koerber.hospital.persistence.repositories.PatientManagementRepository;
import com.koerber.hospital.ui.controllers.dtos.ConsultDTO;
import com.koerber.hospital.ui.controllers.dtos.ListOfConsultsDTO;
import com.koerber.hospital.ui.controllers.dtos.ListOfPatientsDTO;
import com.koerber.hospital.ui.controllers.dtos.PatientDTO;
import com.koerber.hospital.ui.controllers.dtos.SpecialityDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalManagementService {

    private final PatientManagementRepository patientManagementRepository;
    private final DoctorManagementRepository doctorManagementRepository;
    private final PathologyManagementRepository pathologyManagementRepository;

    @Autowired
    public HospitalManagementService(PatientManagementRepository patientManagementRepository,
                                     DoctorManagementRepository doctorManagementRepository,
                                     PathologyManagementRepository pathologyManagementRepository) {
        this.patientManagementRepository = patientManagementRepository;
        this.doctorManagementRepository = doctorManagementRepository;
        this.pathologyManagementRepository = pathologyManagementRepository;
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
        //hospitalManagementRepository.save(consultToAdd);
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
        return patientManagementRepository.findPatientByName(patientName);
    }

    private Doctor findDoctorByName(String doctorName) {
        //Call the repository to find the doctor by name
        return doctorManagementRepository.findDoctorByName(doctorName);
    }

    private Pathology findPathologyByName(String pathologyName) {
        //Call the repository to find the pathology by name
        return pathologyManagementRepository.findPathologyByName(pathologyName);
    }

}
