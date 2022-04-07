package com.fcdevelopment.clinicalschedule.persistence;

import com.fcdevelopment.clinicalschedule.domain.Patient;
import com.fcdevelopment.clinicalschedule.domain.repository.PatientRepositiry;
import com.fcdevelopment.clinicalschedule.persistence.crud.PacienteCrudRepository;
import com.fcdevelopment.clinicalschedule.persistence.entity.Paciente;
import com.fcdevelopment.clinicalschedule.persistence.mapper.PatientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PacienteRepository implements PatientRepositiry {
    @Autowired
    private PacienteCrudRepository pacienteCrudRepository;

    @Autowired
    private PatientMapper mapper;

    @Override
    public List<Patient> getAll() {
        List<Paciente> pacientes = (List<Paciente>) pacienteCrudRepository.findAll();
        return mapper.toPatients(pacientes);
    }

    @Override
    public Optional<Patient> getPatient(int patientId) {
        return Optional.empty();
    }

    @Override
    public Patient save(Patient patient) {
        Paciente paciente = mapper.toPaciente(patient);
        return mapper.toPatient(pacienteCrudRepository.save(paciente));
    }

    @Override
    public void delete(int patientId) {

    }
}
