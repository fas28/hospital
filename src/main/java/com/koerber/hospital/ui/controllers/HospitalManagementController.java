package com.koerber.hospital.ui.controllers;

import com.koerber.hospital.application.services.HospitalManagementService;
import com.koerber.hospital.ui.controllers.dtos.ConsultDTO;
import com.koerber.hospital.ui.controllers.dtos.ListOfConsultsDTO;
import com.koerber.hospital.ui.controllers.dtos.ListOfPatientsDTO;
import com.koerber.hospital.ui.controllers.dtos.PatientDTO;
import com.koerber.hospital.ui.controllers.dtos.SpecialityDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HospitalManagementController {

    private final HospitalManagementService hospitalManagementService;

    @Autowired
    public HospitalManagementController(HospitalManagementService hospitalManagementService) {
        this.hospitalManagementService = hospitalManagementService;
    }

    @PostMapping("/addConsult")
    public void createConsult(@RequestBody ConsultDTO consultDTO) {
        hospitalManagementService.addConsult(consultDTO);
    }

    @GetMapping("/listPatientConsults")
    public ListOfConsultsDTO listPatientConsults(@RequestBody PatientDTO patientDTO) {
        return hospitalManagementService.listConsults(patientDTO);
    }

    @GetMapping("/getTopSpecialities")
    public SpecialityDTO getTopSpecialities() {
        return hospitalManagementService.getTopSpecialities();
    }

    @GetMapping("/listAllPatients")
    public ListOfPatientsDTO listAllPatients(@RequestParam String name, @RequestParam int age) {
        return hospitalManagementService.listAllPatients(name, age);
    }

}