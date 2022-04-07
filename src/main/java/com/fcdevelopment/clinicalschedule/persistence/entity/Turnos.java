/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcdevelopment.clinicalschedule.persistence.entity;

import com.fcdevelopment.clinicalschedule.persistence.entity.util.CitasAsignadas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author cabezas
 */
public class Turnos {

    private int idTurno;
    private int idAgendaProfesional;
    private Date horaInicial;
    private Date horaFinal;

    public Date getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(Date horaInicial) {
        this.horaInicial = horaInicial;
    }

    public Date getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Date horaFinal) {
        this.horaFinal = horaFinal;
    }

    public int getIdAgendaProfesional() {
        return idAgendaProfesional;
    }

    public void setIdAgendaProfesional(int idAgendaProfesional) {
        this.idAgendaProfesional = idAgendaProfesional;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    private List<PacientesTurno> lstPacientesTurnos;

    public List<PacientesTurno> getLstPacientesTurnos() {
        return lstPacientesTurnos;
    }

    public void setLstPacientesTurnos(List<PacientesTurno> lstPacientesTurnos) {
        this.lstPacientesTurnos = lstPacientesTurnos;
    }

    public Turnos() {

    }

    public Turnos(int idTurno, int idAgendaProfesional, Date hInicio, Date hFin) {
        this.idTurno = idTurno;
        this.idAgendaProfesional = idAgendaProfesional;
        this.horaInicial = hInicio;
        this.horaFinal = hFin;

        lstPacientesTurnos = new ArrayList<PacientesTurno>();

        /* if (getIdTurno() == 1) {
            pTurnos.add(new PacientesTurno(this.idTurno, "alejandra", "0001"));
            pTurnos.add(new PacientesTurno(this.idTurno, "Juan", "0000"));
            pTurnos.add(new PacientesTurno(this.idTurno, "Carlos", "0002"));
        } else {
            pTurnos.add(new PacientesTurno(this.idTurno, "Karol", "0221"));
            pTurnos.add(new PacientesTurno(this.idTurno, "ali", "033"));

        }*/
    }

    /* funcion que devuelve la lista de agenda del profesional */
    private List<AgendaTurno> listaAgendaTurnos(String fecha, int idProfesional, List<TurnosAgenda> lista) {

        List<AgendaTurno> lstAgenTur = new ArrayList<>();

        for (TurnosAgenda lstTurnosAgenda : lista) {

        /*    lstAgenTur.add(new AgendaTurno(lstTurnosAgenda.getIdTurnoAgenda(),
                    lstTurnosAgenda.getHoraInicio(),
                    lstTurnosAgenda.getHoraFinal(),
                    lstTurnosAgenda.getIntervalo()));*/
        }
        return lstAgenTur;
    }

    public List<Turnos> listarTurnosProfesional(String fecha, int idProfesional,
                                                List<TurnosAgenda> lstAgendaProfesionales, List<CitasAsignadas> lstCitasAsignadas) {

        /* lista de turnos que se devuelve a la interfaz */
        List<Turnos> turnosList = new ArrayList<Turnos>();
        /* se obtiene la lista de la agenda de los profesionales */
        List<AgendaTurno> lstAgendaProfesional = listaAgendaTurnos(fecha, idProfesional, lstAgendaProfesionales);

        for (AgendaTurno agendaProfesional : lstAgendaProfesional) {

            Date dI = agendaProfesional.getfInicio();
            Date dF = agendaProfesional.getfFin();

            int intervalo = agendaProfesional.getIntervalo();
            int numeroTurnos = numeroTurnos(dI, dF, intervalo);

            /* variable que recibe la hora inicial */
            Calendar f1 = Calendar.getInstance();
            f1.setTime(dI);

            /* variable que recibe la hora inicial */
            Calendar f2 = Calendar.getInstance();
            f2.setTime(dI);

            for (int i = 0; i < numeroTurnos; i++) {

                /* le sumamos a f1 el intervalo */
                f1.set(Calendar.MINUTE, f1.get(Calendar.MINUTE) + intervalo);

                /* vamos creando los turnos pasandole el nro turno, f2 hora inicia, f1 que tiene el valor sumado */
                Turnos turnoSelf = new Turnos(i + 1, agendaProfesional.getIdAgendaTurno(), f2.getTime(), f1.getTime());

                //PacientesTurno p = PacientesTurno.asociarPacienteACita(lstCitasAsignadas, turnoSelf.getIdTurno(), turnoSelf.getIdAgendaProfesional());
                
                PacientesTurno.asociarPacienteACita(turnoSelf.getLstPacientesTurnos(), lstCitasAsignadas, turnoSelf.getIdTurno(), turnoSelf.getIdAgendaProfesional());
                /*if (p != null){
                  turnoSelf.getLstPacientesTurnos().add(p);
                }*/
                /*turnoSelf.getLstPacientesTurnos().add(new PacientesTurno(getIdTurno(), "alejandra", "0001"));
                if(i==1){
                    turnoSelf.getLstPacientesTurnos().add(new PacientesTurno(getIdTurno(), "juanito", "04444sdf1"));
                    turnoSelf.getLstPacientesTurnos().add(new PacientesTurno(getIdTurno(), "anita", "04444sdfd1"));
                    turnoSelf.getLstPacientesTurnos().add(new PacientesTurno(getIdTurno(), "ferchito", "0dsf44441"));
                }*/
                turnosList.add(turnoSelf);
                /* le asociamos a f2 el valor sumado de f1, para que sea la nueva hora de inicio */
                f2.setTime(f1.getTime());

            }
        }

        return turnosList;
    }

    private int numeroTurnos(Date fInicio, Date fFin, int intervalo) {

        int va = 0;

        int hi = fInicio.getHours();
        int mi = fInicio.getMinutes();

        int hf = fFin.getHours();
        int mf = fFin.getMinutes();

        int minutos = ((hf * 60) + mf) - ((hi * 60) + mi); // pasar todo a minutos

        if (intervalo > 0) {
            va = (minutos / intervalo);
            System.out.println("Horadddddd: " + va);

        }

        return va;
    }

}
