/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcdevelopment.clinicalschedule.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author victor
 */
@Entity
@Table(name = "cat_departamento")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CatDepartamento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_departamento")
    private Integer id;

    @Column(name = "cod_departamento")
    private String codDepartamento;
    @Column(name = "des_departamento")
    private String desDepartamento;


}
