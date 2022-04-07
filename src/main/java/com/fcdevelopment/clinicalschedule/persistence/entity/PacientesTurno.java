/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcdevelopment.clinicalschedule.persistence.entity;


import com.fcdevelopment.clinicalschedule.persistence.entity.util.CitasAsignadas;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author cabezas
 */
public class PacientesTurno implements Serializable {

    private int idTurno;
    private String paciente;
    private String factura;

    public PacientesTurno() {
    }

    public PacientesTurno(int idTurno, String Paciente, String Factura) {
        this.idTurno = idTurno;
        this.paciente = Paciente;
        this.factura = Factura;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public static void asociarPacienteACita(List<PacientesTurno> lstPacientesTurnos, List<CitasAsignadas> lstCitasAsignadas, Integer pIdTurno, Integer pIdAgendaTurno) {

        PacientesTurno pacientesTurno = null;
        for (CitasAsignadas lstCitasAsignada : lstCitasAsignadas) {
            if ((lstCitasAsignada.getNumeroTurno() == pIdTurno) && (lstCitasAsignada.getIdTurnoAgenda() == pIdAgendaTurno)) {
                String nombre = lstCitasAsignada.getNombre1() + ' ' + lstCitasAsignada.getNombre2() + ' '
                        + lstCitasAsignada.getApellido1() + ' ' + lstCitasAsignada.getApellido2();
                pacientesTurno = new PacientesTurno(lstCitasAsignada.getNumeroTurno(), nombre, lstCitasAsignada.getDesFactura());
                lstPacientesTurnos.add(pacientesTurno);
            }
        }
    }

}
