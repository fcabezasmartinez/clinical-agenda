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
@Table(name = "cat_ocupacion")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CatOcupacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ocupacion")
    private Integer id;
    @Column(name = "cod_ocupacion")
    private String codOcupacion;
    @Column(name = "des_ocupacion")
    private String desOcupacion;
    @OneToMany(mappedBy = "ocupacion", fetch = FetchType.LAZY)
    private List<Paciente> pacientes;

}
