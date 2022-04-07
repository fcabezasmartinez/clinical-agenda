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
@Table(name = "cat_zona")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CatZona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_zona")
    private Integer id;
    @Column(name = "cod_zona")
    private String codZona;
    @Column(name = "des_zona")
    private String desZona;

}
