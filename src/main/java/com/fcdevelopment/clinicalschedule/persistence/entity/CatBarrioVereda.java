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
@Table(name = "cat_barrio_vereda")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CatBarrioVereda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_barrio")
    private Integer id;
    @Column(name = "cod_barrio")
    private String codBarrio;
    @Column(name = "des_barrio")
    private String desBarrio;
    @Column(name = "id_zona")
    private Integer idZona;
    @Column(name = "id_municipio")
    private Integer idMunicipio;
    @Column(name = "id_departamento")
    private Integer idDepartamento;
    @Column(name = "id_corregimiento")
    private Integer idCorregimiento;
    @OneToMany(mappedBy = "barrio", fetch = FetchType.LAZY)
    private List<Paciente> pacientes;

}
