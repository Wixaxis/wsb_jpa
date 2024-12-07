package com.jpacourse.mapper;

import com.jpacourse.dto.PatientTO;
import com.jpacourse.dto.VisitTO;
import com.jpacourse.persistence.entity.PatientEntity;
import com.jpacourse.persistence.entity.VisitEntity;

import java.util.stream.Collectors;

public class PatientMapper {

    public static PatientTO mapToTO(PatientEntity entity) {
        PatientTO to = new PatientTO();
        to.setId(entity.getId());
        to.setFirstName(entity.getFirstName());
        to.setLastName(entity.getLastName());
        to.setTelephoneNumber(entity.getTelephoneNumber());
        to.setEmail(entity.getEmail());
        to.setPatientNumber(entity.getPatientNumber());
        to.setDateOfBirth(entity.getDateOfBirth());
        to.setHasPriorityPrivileges(entity.getHasPriorityPrivileges()); // Map the new field
        to.setVisits(entity.getVisits().stream().map(PatientMapper::mapVisitToTO).collect(Collectors.toList()));
        return to;
    }

    private static VisitTO mapVisitToTO(VisitEntity entity) {
        VisitTO to = new VisitTO();
        to.setId(entity.getId());
        to.setDescription(entity.getDescription());
        to.setTime(entity.getTime());
        to.setDoctorFirstName(entity.getDoctor().getFirstName());
        to.setDoctorLastName(entity.getDoctor().getLastName());
        to.setTreatmentTypes(entity.getMedicalTreatments().stream().map(t -> t.getType().name()).collect(Collectors.toList()));
        return to;
    }
}