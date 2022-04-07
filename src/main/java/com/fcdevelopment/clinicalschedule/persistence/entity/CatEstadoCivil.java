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
@Table(name = "cat_estado_civil")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CatEstadoCivil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_estado_civil")
    private Integer id;
    @Column(name = "cod_estado_civil")
    private String codEstadoCivil;
    @Column(name = "des_estado_civil")
    private String desEstadoCivil;
    @OneToMany(mappedBy = "estadoCivil", fetch = FetchType.LAZY)
    private List<Paciente> pacientes;
    
}
