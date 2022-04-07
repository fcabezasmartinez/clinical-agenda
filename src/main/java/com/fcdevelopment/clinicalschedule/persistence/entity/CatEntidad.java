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
@Table(name = "cat_entidad")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CatEntidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_entidad")
    private Integer id;
    @Column(name = "cod_entidad")
    private String codEntidad;
    @Column(name = "des_entidad")
    private String desEntidad;
    private String direccion;
    private String telefono;
    @Column(name = "nro_plano")
    private Integer nroPlano;
    @Column(name = "id_municipio")
    private Integer idMunicipio;
    private Integer representante;
    private String email;
    private Character prestamo;
    @Column(name = "id_homocontable")
    private String idHomocontable;
    @Column(name = "tipo_documento")
    private String tipoDocumento;
    @Column(name = "numero_documento")
    private String numeroDocumento;
    @OneToMany(mappedBy = "entidad", fetch = FetchType.LAZY)
    private List<Factura> facturas;
    @OneToMany(mappedBy = "entidad", fetch = FetchType.LAZY)
    private List<Paciente> pacientes;


}
