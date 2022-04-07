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
@Table(name = "cat_grupo_poblacional")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CatGrupoPoblacional implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_grupo_poblacional")
    private Integer id;
    @Column(name = "cod_grupo_pob")
    private String codGrupoPob;
    @Column(name = "des_grupo_pob")
    private String desGrupoPob;
    @Column(name = "aplica_descuento")
    private Character aplicaDescuento;
    @OneToMany(mappedBy = "grupoPoblacional", fetch = FetchType.LAZY)
    private List<Paciente> pacientes;
    
}
