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
@Table(name = "cat_unidad_funcional")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CatUnidadFuncional implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_unidad_funcional")
    private Integer id;
    @Column(name = "des_unidad_funcional")
    private String desUnidadFuncional;
    @Column(name = "cod_unidad_funcional")
    private String codUnidadFuncional;
    @OneToMany(mappedBy = "unidadFuncional", fetch = FetchType.LAZY)
    private List<Factura> facturas;

}
