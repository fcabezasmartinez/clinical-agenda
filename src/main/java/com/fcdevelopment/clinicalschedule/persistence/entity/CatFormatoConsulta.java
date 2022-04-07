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
@Table(name = "cat_formato_consultas")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CatFormatoConsulta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_formato_consulta")
    private Integer id;
    @Column(name = "des_formato_consulta")
    private String desFormatoConsulta;
    @Column(name = "cod_formato_consulta")
    private String codFormatoConsulta;

}
