/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcdevelopment.clinicalschedule.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 *
 * @author victor
 */
@Entity
@Table(name = "t_pacientes")
@Data
@NoArgsConstructor
public class Paciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_paciente")
    private Integer id;
    private Short edad;
    @Column(name = "med_edad")
    private String medEdad;
    @Column(name = "fecha_nac")
    private LocalDate fechaNac;
    private String identificacion;
    private String responsable;
    @Column(name = "nombre_padre")
    private String nombrePadre;
    @Column(name = "nombre_madre")
    private String nombreMadre;
    private String direccion;
    private String telefono;
    private String apellido1;
    private String apellido2;
    private String nombre1;
    private String nombre2;
    @Column(name = "nro_historia")
    private String nroHistoria;
    @Column(name = "nro_ficha_sis")
    private String nroFichaSis;
    @Column(name = "nro_con")
    private String nroCon;
    private String nn;
    @Column(name = "nombre_acompanante")
    private String nombreAcompanante;
    @Column(name = "direccion_acompanante")
    private String direccionAcompanante;
    @Column(name = "telefono_acompanante")
    private String telefonoAcompanante;
    @Column(name = "direccion_responsable")
    private String direccionResponsable;
    @Column(name = "telefono_responsable")
    private String telefonoResponsable;
    @Column(name = "correo_electronico")
    private String correoElectronico;
    @Column(name = "edad_responsable")
    private Short edadResponsable;
    @Column(name = "med_edad_responsable")
    private String medEdadResponsable;
    @Column(name = "identificacion_responsable")
    private String identificacionResponsable;
    @Column(name = "grupo_sanguineo")
    private String grupoSanguineo;
    private String rh;
    private Character estado;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @OneToMany(mappedBy = "paciente", fetch = FetchType.LAZY)
    private List<Agenda> agendas;
    @OneToMany(mappedBy = "paciente", fetch = FetchType.LAZY)
    private List<Factura> facturas;
    @JoinColumn(name = "id_afiliado")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatAfiliado afiliado;
    @JoinColumn(name = "id_barrio")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatBarrioVereda barrio;
    @JoinColumn(name = "id_ocupacion")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatOcupacion ocupacion;
    @JoinColumn(name = "id_municipio")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatMunicipio municipio;
    @JoinColumn(name = "id_corregimiento")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatCorregimiento corregimiento;
    @JoinColumn(name = "id_religion")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatReligion religion;
    @JoinColumn(name = "id_pueblo_indigena")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatPuebloIndigena puebloIndigena;
    @JoinColumn(name = "id_regimen")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatRegimen regimen;
    @JoinColumn(name = "id_tipo_identificacion")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatTipoIdentificacion tipoIdentificacion;
    @JoinColumn(name = "id_entidad")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatEntidad entidad;
    @JoinColumn(name = "id_escolaridad")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatEscolaridad escolaridad;
    @JoinColumn(name = "id_oit")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatOit oit;
    @JoinColumn(name = "id_estado_civil")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatEstadoCivil estadoCivil;
    @JoinColumn(name = "id_grupo_poblacional")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatGrupoPoblacional grupoPoblacional;
    @JoinColumn(name = "id_estrato")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatEstrato estrato;
    @JoinColumn(name = "id_genero")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatGenero genero;
    @JoinColumn(name = "id_grupo")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatGrupo grupo;

}
