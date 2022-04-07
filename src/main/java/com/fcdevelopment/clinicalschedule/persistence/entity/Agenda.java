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

/**
 *
 * @author victor
 */
@Entity
@Table(name = "t_agendas")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Agenda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_agenda")
    private Integer id;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "datos_paciente")
    private String datosPaciente;
    @Column(name = "id_factura")
    private Integer idFactura;
    private String estado;
    @Column(name = "fecha_cita")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCita;
    @Column(name = "fecha_anulacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAnulacion;
    @Column(name = "fecha_cita_diligenciada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCitaDiligenciada;
    @JoinColumn(name = "id_ips")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatInstitutoPrestador ips;
    @JoinColumn(name = "id_paciente")
    @ManyToOne(fetch = FetchType.LAZY)
    private Paciente paciente;
    @JoinColumn(name = "id_profesional")
    @ManyToOne(fetch = FetchType.LAZY)
    private Profesional profesional;
    @JoinColumn(name = "id_tipo_cita")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatTipoCita tipoCita;
    @JoinColumn(name = "id_detalle_turno")
    @ManyToOne(fetch = FetchType.LAZY)
    private DetalleTurno detalleTurno;
    @JoinColumn(name = "id_usuario")
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;
    @JoinColumn(name = "id_usuario_anula")
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuarioAnula;
    @JoinColumn(name = "id_tipo_anulacion_cita")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatTipoAnulacionCita tipoAnulacionCita;
}
