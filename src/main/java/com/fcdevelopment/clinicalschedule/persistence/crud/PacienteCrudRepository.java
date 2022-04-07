package com.fcdevelopment.clinicalschedule.persistence.crud;

import com.fcdevelopment.clinicalschedule.persistence.entity.Paciente;
import org.springframework.data.repository.CrudRepository;

public interface PacienteCrudRepository extends CrudRepository<Paciente, Integer> {
}
