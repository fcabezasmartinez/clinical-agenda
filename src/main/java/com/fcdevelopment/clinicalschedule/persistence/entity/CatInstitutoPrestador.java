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
@Table(name = "cat_instituto_prestador")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CatInstitutoPrestador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ips")
    private Integer id;
    @Column(name = "cod_ips")
    private String codIps;
    @Column(name = "des_ips")
    private String desIps;
    @Column(name = "tipo_identificacion")
    private String tipoIdentificacion;
    @Column(name = "pie_factura")
    private String pieFactura;
    @Column(name = "texto_factura")
    private String textoFactura;
    @Column(name = "ruta_logo")
    private String rutaLogo;
    private String direccion;
    private String principal;
    private String estado;
    private String telefono;
    @Column(name = "id_municipio")
    private Integer idMunicipio;
    private Integer nivel;
    @OneToMany(mappedBy = "ips", fetch = FetchType.LAZY)
    private List<Agenda> agendas;
    @OneToMany(mappedBy = "ips", fetch = FetchType.LAZY)
    private List<Factura> facturas;
    @OneToMany(mappedBy = "ips", fetch = FetchType.LAZY)
    private List<TurnosAgenda> turnosAgendas;


}
