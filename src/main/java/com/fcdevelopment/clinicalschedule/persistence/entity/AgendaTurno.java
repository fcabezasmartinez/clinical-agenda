/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcdevelopment.clinicalschedule.persistence.entity;

import java.util.Date;

/**
 *
 * @author cabezas
 */
public class AgendaTurno {

    private int idAgendaTurno;
    private Date fInicio;
    private Date fFin;
    private int Intervalo;

    public AgendaTurno(int idAgendaTurno, Date fInicio, Date fFin, int Intervalo) {
        this.idAgendaTurno = idAgendaTurno;
        this.fInicio = fInicio;
        this.fFin = fFin;
        this.Intervalo = Intervalo;
    }

    public int getIdAgendaTurno() {
        return idAgendaTurno;
    }

    public void setIdAgendaTurno(int idAgendaTurno) {
        this.idAgendaTurno = idAgendaTurno;
    }

    public Date getfInicio() {
        return fInicio;
    }

    public void setfInicio(Date fInicio) {
        this.fInicio = fInicio;
    }

    public Date getfFin() {
        return fFin;
    }

    public void setfFin(Date fFin) {
        this.fFin = fFin;
    }

    public int getIntervalo() {
        return Intervalo;
    }

    public void setIntervalo(int Intervalo) {
        this.Intervalo = Intervalo;
    }

}
