/*
 * Controller Class for patients related activity.
 * @author com.euphoria
 */
package com.euphoria.orchestration.patient;

import com.euphoria.orchestration.patient.mapper.PatientMapper;
import com.euphoria.orchestration.patient.model.Patient;
import com.euphoria.orchestration.patient.model.PatientRequest;
import com.euphoria.orchestration.patient.model.PatientResponse;
import com.euphoria.orchestration.patient.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Patient Service Class.
 */
@Component
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientMapper patientMapper;

    @Transactional
    public PatientResponse createPatient(PatientRequest patientRequest) {
        Patient patient = patientMapper.requestToModel(patientRequest);
        patientRepository.createPatient(patient);
        patient = patientRepository.findPatientById(patient.getId());
        return patientMapper.modelToResponse(patient);
    }

    @Transactional
    public PatientResponse updatePatient(PatientRequest patientRequest) {
        Patient patient = patientMapper.requestToModel(patientRequest);
        patientRepository.updatePatient(patient);
        patient = patientRepository.findPatientById(patient.getId());
        return patientMapper.modelToResponse(patient);
    }

    public PatientResponse readPatient(String patientId) {
        Patient patient = patientRepository.findPatientById(patientId);
        PatientResponse patientResponse =  patientMapper.modelToResponse(patient);
        return patientResponse;
    }

    @Transactional
    public PatientResponse deletePatient(String patientId) {
        Patient patient = patientRepository.findPatientById(patientId);
        patientRepository.deletePatientById(patientId);
        return  patientMapper.modelToResponse(patient);
    }
}
