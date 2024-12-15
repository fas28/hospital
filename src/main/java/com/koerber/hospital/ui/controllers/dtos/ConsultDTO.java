package com.koerber.hospital.ui.controllers.dtos;

import lombok.Value;

@Value
public class ConsultDTO {
    //Add jakarta validation
    String patientName;
    String doctorName;
    String speciality;
    String pathology;

}
