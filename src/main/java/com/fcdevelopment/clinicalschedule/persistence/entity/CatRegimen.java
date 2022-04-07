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
@Table(name = "cat_regimen")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CatRegimen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_regimen")
    private Integer id;
    @Column(name = "cod_regimen")
    private String codRegimen;
    @Column(name = "des_regimen")
    private String desRegimen;
    @OneToMany(mappedBy = "regimen", fetch = FetchType.LAZY)
    private List<Paciente> pacientes;
}
