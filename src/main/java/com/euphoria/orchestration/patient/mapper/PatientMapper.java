/*
 * Java Beans Mapper for Patient.
 * @author com.euphoria
 */
package com.euphoria.orchestration.patient.mapper;

import com.euphoria.orchestration.patient.model.Patient;
import com.euphoria.orchestration.patient.model.PatientRequest;
import com.euphoria.orchestration.patient.model.PatientResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PatientMapper {

    PatientMapper INSTANCE = Mappers.getMapper(PatientMapper.class);

    Patient requestToModel(PatientRequest patientRequest);

    PatientResponse modelToResponse(Patient patient);
}
