/*
 * Controller Class for patients related activity.
 * @author com.euphoria
 */
package com.euphoria.orchestration.patient.repository;

import com.euphoria.orchestration.patient.model.Patient;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Patient Repository.
 */
@Mapper
public interface PatientRepository {

    @Select("SELECT * FROM patient WHERE id = #{patientId} AND active = true")
    public Patient findPatientById(String patientId);

    void createPatient(Patient patient);

    void updatePatient(Patient patient);

    @Update("UPDATE patient SET active = false WHERE id = #{patientId}")
    void deletePatientById(String patientId);
}
