package com.fcdevelopment.clinicalschedule.domain;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@Data
public class Patient {
    private int patientId;
    private int identificationType;
    private String identification;
    private String name1;
    private String name2;
    private String lastName1;
    private String lastName2;
    private LocalDate birthday;
    private int age;
    private String ageMeasure;
    private String email;
    private String phone;
    private int departmentId;
    private int cityId;
    private String address;
}
