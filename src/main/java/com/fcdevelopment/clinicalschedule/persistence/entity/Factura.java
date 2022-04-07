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
@Table(name = "t_factura")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private Integer id;
    @Column(name = "cod_ips")
    private String codIps;
    @Column(name = "nro_fac")
    private String nroFac;
    @Column(name = "fac_fec")
    @Temporal(TemporalType.DATE)
    private Date facFec;
    private String usr;
    @Column(name = "id_arqueo")
    private Integer idArqueo;
    @Column(name = "fac_vlt")
    private Double facVlt;
    @Column(name = "fac_sub")
    private Double facSub;
    @Column(name = "fac_cpg")
    private Double facCpg;
    @Column(name = "hora_fac")
    @Temporal(TemporalType.TIME)
    private Date horaFac;
    @Column(name = "apellido1_paciente")
    private String apellido1Paciente;
    @Column(name = "apellido2_paciente")
    private String apellido2Paciente;
    @Column(name = "nombre1_paciente")
    private String nombre1Paciente;
    @Column(name = "nombre2_paciente")
    private String nombre2Paciente;
    @Column(name = "des_tipo_ident_paciente")
    private String desTipoIdentPaciente;
    @Column(name = "des_ident_paciente")
    private String desIdentPaciente;
    @Column(name = "edad_paciente")
    private Integer edadPaciente;
    @Column(name = "des_tipo_edad_paciente")
    private String desTipoEdadPaciente;
    @Column(name = "sex_paciente")
    private String sexPaciente;
    @Column(name = "fnc_paciente")
    @Temporal(TemporalType.DATE)
    private Date fncPaciente;
    @Column(name = "nro_his_pac")
    private String nroHisPac;
    @Column(name = "fol_nro_pac")
    private String folNroPac;
    @Column(name = "nivel_sis_pac")
    private String nivelSisPac;
    @Column(name = "dir_pac")
    private String dirPac;
    @Column(name = "tel_pac")
    private String telPac;
    private String barrio;
    @Column(name = "id_entidad_paciente")
    private Integer idEntidadPaciente;
    @Column(name = "des_entidad_paciente")
    private String desEntidadPaciente;
    @Column(name = "id_contrato")
    private Integer idContrato;
    @Column(name = "des_contrato")
    private String desContrato;
    @Column(name = "nro_contrato")
    private String nroContrato;
    @Column(name = "cod_regimen_paciente")
    private String codRegimenPaciente;
    @Column(name = "des_regimen_paciente")
    private String desRegimenPaciente;
    @Column(name = "cod_afiliado_paciente")
    private String codAfiliadoPaciente;
    @Column(name = "id_historia")
    private Integer idHistoria;
    @Column(name = "id_agenda")
    private Integer idAgenda;
    @Column(name = "id_admision")
    private Integer idAdmision;
    @Column(name = "cod_tip_fact")
    private String codTipFact;
    private String liquidada;
    private Integer consecutivo;
    @Column(name = "id_usuario_anula")
    private Integer idUsuarioAnula;
    @Column(name = "usr_anula")
    private String usrAnula;
    @Column(name = "fecha_anula")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAnula;
    private Integer cuenta;
    @Column(name = "id_cuentacobro")
    private Integer idCuentacobro;
    private Integer idapertura;
    @JoinColumn(name = "id_paciente")
    @ManyToOne(fetch = FetchType.LAZY)
    private Paciente paciente;
    @JoinColumn(name = "id_entidad")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatEntidad entidad;
    @JoinColumn(name = "id_ips")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatInstitutoPrestador ips;
    @JoinColumn(name = "id_usuario")
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;
    @JoinColumn(name = "id_Und_Funcional")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatUnidadFuncional unidadFuncional;

}
