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
@Table(name = "cat_afiliado")
@Setter @Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CatAfiliado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_afiliado")
    private Integer id;
    @Column(name = "cod_taf")
    private String codTaf;
    @Column(name = "des_taf")
    private String desTaf;
    @OneToMany(mappedBy = "afiliado", fetch = FetchType.LAZY)
    private List<Paciente> pacientes;
    
}
