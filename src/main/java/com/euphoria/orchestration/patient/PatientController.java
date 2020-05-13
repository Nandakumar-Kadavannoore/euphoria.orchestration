/*
 * Controller Class for patients related activity.
 * @author com.euphoria
 */
package com.euphoria.orchestration.patient;

import com.euphoria.orchestration.patient.model.PatientRequest;
import com.euphoria.orchestration.patient.model.PatientResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

/**
 * Controller for patients CRUD operations.
 */
@Controller("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<PatientResponse> createPatient(
            @Validated  @RequestBody PatientRequest patientRequest) {
       return Mono.fromCallable(() -> patientService.createPatient(patientRequest));
    }

    @PutMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Mono<PatientResponse> updatePatient(
            @RequestBody PatientRequest patientRequest) {
        return Mono.fromCallable(() -> patientService.updatePatient(patientRequest));
    }

    @GetMapping("/{patientId}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<PatientResponse> readPatient(
            @PathVariable(required = true) String patientId) {
        return Mono.fromCallable(() -> patientService.readPatient(patientId));
    }

    @DeleteMapping("/{patientId}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<PatientResponse> deletePatient(
            @PathVariable(required = true) String patientId) {
        return Mono.fromCallable(() -> patientService.deletePatient(patientId));
    }

}
