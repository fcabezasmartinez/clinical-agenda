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
@Table(name = "cat_municipio")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CatMunicipio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_municipio")
    private Integer id;
    @Column(name = "cod_municipio")
    private String codMunicipio;
    @Column(name = "des_municipio")
    private String desMunicipio;
    @Column(name = "id_departamento")
    private Integer idDepartamento;
    @OneToMany(mappedBy = "municipio", fetch = FetchType.LAZY)
    private List<Paciente> pacientes;

}
