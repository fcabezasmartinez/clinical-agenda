/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcdevelopment.clinicalschedule.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author victor
 */
@Entity
@Table(name = "cat_religion")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CatReligion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_religion")
    private Integer id;
    @Column(name = "cod_religion")
    private String codReligion;
    @Column(name = "des_religion")
    private String desReligion;
    @OneToMany(mappedBy = "religion", fetch = FetchType.LAZY)
    private List<Paciente> pacientes;
}
