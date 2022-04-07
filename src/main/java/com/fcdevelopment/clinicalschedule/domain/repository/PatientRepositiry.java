package com.fcdevelopment.clinicalschedule.domain.repository;

import com.fcdevelopment.clinicalschedule.domain.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientRepositiry {
    List<Patient> getAll();
    Optional<Patient> getPatient(int patientId);
    Patient save(Patient patient);
    void delete(int patientId);
}
