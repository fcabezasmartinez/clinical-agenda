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
@Table(name = "t_usuarios")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer id;
    @Column(name = "cod_usuario")
    private String codUsuario;
    @Column(name = "datos_usuario")
    private String datosUsuario;
    private String user;
    private String pass;
    private String identificacion;
    private String apellido1;
    private String apellido2;
    private String nombre1;
    private String nombre2;
    private Character estado;
    @Column(name = "puede_anular")
    private Character puedeAnular;
    private String telefono;
    @JoinColumn(name = "id_rol")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatRol rol;
    @JoinColumn(name = "id_tipo_identificacion")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatTipoIdentificacion tipoIdentificacion;
    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
    private List<Agenda> agendas;
    @OneToMany(mappedBy = "usuarioAnula", fetch = FetchType.LAZY)
    private List<Agenda> agendasAnula;
    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
    private List<Factura> facturas;
    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
    private List<TurnosAgenda> turnosAgendas;
    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
    private List<Profesional> profesionales;
}
