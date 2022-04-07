/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcdevelopment.clinicalschedule.persistence.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author victor
 */
@Entity
@Table(name = "t_profesionales")
public class Profesional implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_profesional")
    private Integer id;
    @Column(name = "cod_profesional")
    private String codProfesional;
    @Column(name = "des_profesional")
    private String desProfesional;
    @Column(name = "numero_registro")
    private Integer numeroRegistro;
    @OneToMany(mappedBy = "profesional", fetch = FetchType.LAZY)
    private List<Agenda> agendas;
    @OneToMany(mappedBy = "profesional", fetch = FetchType.LAZY)
    private List<TurnosAgenda> turnosAgendas;
    @JoinColumn(name = "id_especialidad")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatEspecialidad especialidad;
    @JoinColumn(name = "id_usuario")
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;
}
