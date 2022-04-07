/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcdevelopment.clinicalschedule.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author cabezas
 */
@Entity
@Table(name = "t_turnos_agendas")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TurnosAgenda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_turno_agenda")
    private Integer id;
    @Column(name = "fecha_turno")
    @Temporal(TemporalType.DATE)
    private Date fechaTurno;
    @Column(name = "hora_inicio")
    @Temporal(TemporalType.TIME)
    private Date horaInicio;
    @Column(name = "hora_final")
    @Temporal(TemporalType.TIME)
    private Date horaFinal;
    private Short intervalo;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @JoinColumn(name = "id_ips")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatInstitutoPrestador ips;
    @JoinColumn(name = "id_profesional")
    @ManyToOne(fetch = FetchType.LAZY)
    private Profesional profesional;
    @JoinColumn(name = "id_usuario")
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;
    @OneToMany(mappedBy = "turnosAgenda", fetch = FetchType.LAZY)
    private List<DetalleTurno> detalleTurnos;
    
}
