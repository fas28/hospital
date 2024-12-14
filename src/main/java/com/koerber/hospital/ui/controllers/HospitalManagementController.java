package com.koerber.hospital.ui.controllers;

import com.koerber.hospital.application.services.HospitalManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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
    public void addConsult(@RequestParam String doctor, @RequestParam String speciality, @RequestParam String patient) {
        //Mapper to convert the input to DTO
       //Call the service to add the consult
    }

}