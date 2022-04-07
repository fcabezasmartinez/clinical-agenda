package com.fcdevelopment.clinicalschedule.domain.service;

import com.fcdevelopment.clinicalschedule.domain.Patient;
import com.fcdevelopment.clinicalschedule.domain.repository.PatientRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepositiry patientRepositiry;

    public List<Patient> getAll(){
        return patientRepositiry.getAll();
    }

    public Patient save(Patient patient) {
        return patientRepositiry.save(patient);
    }
}
