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
@Table(name = "cat_tipo_identificacion")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CatTipoIdentificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_identificacion")
    private Integer id;
    @Column(name = "cod_tipo_identificacion")
    private String codTipoIdentificacion;
    @Column(name = "des_tipo_identificacion")
    private String desTipoIdentificacion;
    @OneToMany(mappedBy = "tipoIdentificacion", fetch = FetchType.LAZY)
    private List<Usuario> usuarios;
    @OneToMany(mappedBy = "tipoIdentificacion", fetch = FetchType.LAZY)
    private List<Paciente> pacientes;

}
