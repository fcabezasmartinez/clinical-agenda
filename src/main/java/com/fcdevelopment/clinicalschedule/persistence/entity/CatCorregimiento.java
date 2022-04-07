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
@Table(name = "cat_corregimiento")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CatCorregimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_corregimiento")
    private Integer id;
    @Column(name = "cod_corregimiento")
    private String codCorregimiento;
    @Column(name = "des_corregimiento")
    private String desCorregimiento;
    private String tipo;
    @Column(name = "id_departamento")
    private Integer idDepartamento;
    @Column(name = "id_municipio")
    private Integer idMunicipio;
    private Character resguardo;
    @OneToMany(mappedBy = "corregimiento", fetch = FetchType.LAZY)
    private List<Paciente> pacientes;

}
