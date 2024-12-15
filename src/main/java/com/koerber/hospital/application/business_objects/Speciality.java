package com.koerber.hospital.application.business_objects;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SpecialityEnum {

    DERMATOLOGY("Dermatology"),
    OPHTHALMOLOGY("Ophthalmology"),
    RADIOLOGY("Radiology"),
    FAMILY_MEDICINE("Family Medicine"),
    PEDIATRICS("Pediatrics");

    final String name;

}
