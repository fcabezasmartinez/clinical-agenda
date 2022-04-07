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
@Table(name = "cat_tipo_citas")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CatTipoCita implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_cita")
    private Integer id;
    @Column(name = "cod_tipo_cita")
    private String codTipoCita;
    @Column(name = "des_tipo_cita")
    private String desTipoCita;
    @Column(name = "id_formato_consulta")
    private Integer idFormatoConsulta;
    @Column(name = "edad_min")
    private Integer edadMin;
    @Column(name = "edad_maxima")
    private Integer edadMaxima;
    @Column(name = "id_genero")
    private Integer idGenero;
    private Character activa;
    @OneToMany(mappedBy = "tipoCita", fetch = FetchType.LAZY)
    private List<Agenda> agendas;

}
