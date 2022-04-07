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
@Table(name = "cat_pueblo_indigena")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CatPuebloIndigena implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pueblo_indigena")
    private Integer id;
    @Column(name = "cod_pueblo_indigena")
    private String codPuebloIndigena;
    @Column(name = "des_pueblo_indigena")
    private String desPuebloIndigena;
    @OneToMany(mappedBy = "puebloIndigena", fetch = FetchType.LAZY)
    private List<Paciente> tDatosPersonalesList;
}
