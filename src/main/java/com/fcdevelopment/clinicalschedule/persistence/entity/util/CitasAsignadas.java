/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcdevelopment.clinicalschedule.persistence.entity.util;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author cabezas
 */
public class CitasAsignadas implements Serializable {

    private Integer idAgenda;
    private Date fechaCita;
    private Integer idDetalleTurno;
    private Integer idTurnoAgenda;
    private Integer numeroTurno;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String user;
    private Integer idTipoCita;
    private String deTipoCita;
    private Integer idFactura;
    private String desFactura;

    public CitasAsignadas() {
    }

    /*public CitasAsignadas(Integer idAgenda, Date fechaCita) {

        this.idAgenda = idAgenda;
        this.fechaCita = fechaCita;
    }*/
    public CitasAsignadas(Integer idAgenda, Date fechaCita, Integer idDetalleTurno,
                          Integer idTurnoAgenda, Integer numeroTurno, String nombre1, String nombre2,
                          String apellido1, String apellido2, String user, Integer idTipoCita,
                          String deTipoCita) {

        this.idAgenda = idAgenda;
        this.fechaCita = fechaCita;
        this.idDetalleTurno = idDetalleTurno;
        this.idTurnoAgenda = idTurnoAgenda;
        this.numeroTurno = numeroTurno;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.user = user;
        this.idTipoCita = idTipoCita;
        this.deTipoCita = deTipoCita;

    }

    public Integer getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(Integer idAgenda) {
        this.idAgenda = idAgenda;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public Integer getIdDetalleTurno() {
        return idDetalleTurno;
    }

    public void setIdDetalleTurno(Integer idDetalleTurno) {
        this.idDetalleTurno = idDetalleTurno;
    }

    public Integer getIdTurnoAgenda() {
        return idTurnoAgenda;
    }

    public void setIdTurnoAgenda(Integer idTurnoAgenda) {
        this.idTurnoAgenda = idTurnoAgenda;
    }

    public Integer getNumeroTurno() {
        return numeroTurno;
    }

    public void setNumeroTurno(Integer numeroTurno) {
        this.numeroTurno = numeroTurno;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getIdTipoCita() {
        return idTipoCita;
    }

    public void setIdTipoCita(Integer idTipoCita) {
        this.idTipoCita = idTipoCita;
    }

    public String getDeTipoCita() {
        return deTipoCita;
    }

    public void setDeTipoCita(String deTipoCita) {
        this.deTipoCita = deTipoCita;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public String getDesFactura() {
        return desFactura;
    }

    public void setDesFactura(String desFactura) {
        this.desFactura = desFactura;
    }

}
