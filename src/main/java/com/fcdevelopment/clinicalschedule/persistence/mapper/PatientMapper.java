package com.fcdevelopment.clinicalschedule.persistence.mapper;

import com.fcdevelopment.clinicalschedule.domain.Patient;
import com.fcdevelopment.clinicalschedule.persistence.entity.Paciente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PatientMapper {
    @Mappings({
            @Mapping(source = "id", target = "patientId"),
            @Mapping(source = "tipoIdentificacion.id", target = "identificationType"),
            @Mapping(source = "identificacion", target = "identification"),
            @Mapping(source = "nombre1", target = "name1"),
            @Mapping(source = "nombre2", target = "name2"),
            @Mapping(source = "apellido1", target = "lastName1"),
            @Mapping(source = "apellido2", target = "lastName2"),
            @Mapping(source = "fechaNac", target = "birthday"),
            @Mapping(source = "edad", target = "age"),
            @Mapping(source = "medEdad", target = "ageMeasure"),
            @Mapping(source = "correoElectronico", target = "email"),
            @Mapping(source = "telefono", target = "phone"),
            @Mapping(source = "municipio.id", target = "departmentId"),
            @Mapping(source = "corregimiento.id", target = "cityId"),
            @Mapping(source = "direccion", target = "address"),

    })
    Patient toPatient(Paciente paciente);
    List<Patient> toPatients(List<Paciente> pacientes);

    @InheritInverseConfiguration
    Paciente toPaciente(Patient patient);
}
