package com.koerber.hospital.application.mappers;

import com.koerber.hospital.application.business_objects.ConsultBO;
import com.koerber.hospital.application.business_objects.DoctorBO;
import com.koerber.hospital.application.business_objects.PathologyBO;
import com.koerber.hospital.application.business_objects.PatientBO;
import com.koerber.hospital.application.business_objects.SpecialityBO;
import com.koerber.hospital.application.business_objects.SpecialityEnum;
import com.koerber.hospital.ui.controllers.dtos.ConsultDTO;

public final class DTOToBOMapper {

    public static ConsultBO mapConsultDTOToConsultBO(final ConsultDTO consultDTO) {
        final DoctorBO doctor = DoctorBO.builder().name(consultDTO.getDoctorName()).build();
        final PatientBO patient = PatientBO.builder().name(consultDTO.getPatientName()).build();
        final SpecialityBO speciality = SpecialityBO.builder().name(SpecialityEnum.valueOf(consultDTO.getSpeciality()).name()).build();
        final PathologyBO pathology = PathologyBO.builder().name(consultDTO.getPathology()).build();

        return ConsultBO.builder()
            .doctor(doctor)
            .patient(patient)
            .speciality(speciality)
            .pathology(pathology)
            .build();
    }

}
