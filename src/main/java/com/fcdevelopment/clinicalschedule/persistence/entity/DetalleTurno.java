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
 * @author cabezas
 */
@Entity
@Table(name = "t_detalle_turno")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DetalleTurno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_detalle_turno")
    private Integer id;
    @Column(name = "numero_turno")
    private Integer numeroTurno;
    @OneToMany(mappedBy = "detalleTurno", fetch = FetchType.LAZY)
    private List<Agenda> agendas;
    @JoinColumn(name = "id_turno_agenda")
    @ManyToOne(fetch = FetchType.LAZY)
    private TurnosAgenda turnosAgenda;
    
}
