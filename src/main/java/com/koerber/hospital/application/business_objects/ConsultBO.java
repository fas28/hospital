package com.koerber.hospital.application.business_objects;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ConsultBO {
    DoctorBO doctor;
    SpecialityBO speciality;
    PatientBO patient;
    PathologyBO pathology;
}
