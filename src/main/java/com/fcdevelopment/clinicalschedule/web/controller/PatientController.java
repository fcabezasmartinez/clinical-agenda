package com.fcdevelopment.clinicalschedule.web.controller;

import com.fcdevelopment.clinicalschedule.domain.Patient;
import com.fcdevelopment.clinicalschedule.domain.service.PatientService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping
    @ApiOperation("return a list the all patient")
    public ResponseEntity<List<Patient>> getAll(){
        return new ResponseEntity<>(patientService.getAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Patient> save(@RequestBody Patient patient){
        return new ResponseEntity<>(patientService.save(patient), HttpStatus.CREATED);
    }
}
