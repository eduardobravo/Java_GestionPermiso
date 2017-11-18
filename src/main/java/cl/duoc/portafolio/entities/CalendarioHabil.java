/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.portafolio.entities;

/**
 *
 * @author Edo
 */
public class CalendarioHabil {
    private int id_calendario;
    private int anio;
    private int mes;
    private int dia;
    private int habil;
    private String rut_creacion;
    private String fecha_creacion;
    private String rut_actualizacion;
    private String fecha_actualizacion;
    private int flag_activo;

    public CalendarioHabil() {
        this.id_calendario = 0;
        this.anio = 0;
        this.mes = 0;
        this.dia = 0;
        this.habil = 0;
        this.rut_creacion = "";
        this.fecha_creacion = "";
        this.rut_actualizacion = "";
        this.fecha_actualizacion = "";
        this.flag_activo = 0;
    }

    public CalendarioHabil(int id_calendario, int anio, int mes, int dia, int habil, String rut_creacion, String fecha_creacion, String rut_actualizacion, String fecha_actualizacion, int flag_activo) {
        this.id_calendario = id_calendario;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.habil = habil;
        this.rut_creacion = rut_creacion;
        this.fecha_creacion = fecha_creacion;
        this.rut_actualizacion = rut_actualizacion;
        this.fecha_actualizacion = fecha_actualizacion;
        this.flag_activo = flag_activo;
    }

    public int getId_calendario() {
        return id_calendario;
    }

    public void setId_calendario(int id_calendario) {
        this.id_calendario = id_calendario;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHabil() {
        return habil;
    }

    public void setHabil(int habil) {
        this.habil = habil;
    }

    public String getRut_creacion() {
        return rut_creacion;
    }

    public void setRut_creacion(String rut_creacion) {
        this.rut_creacion = rut_creacion;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getRut_actualizacion() {
        return rut_actualizacion;
    }

    public void setRut_actualizacion(String rut_actualizacion) {
        this.rut_actualizacion = rut_actualizacion;
    }

    public String getFecha_actualizacion() {
        return fecha_actualizacion;
    }

    public void setFecha_actualizacion(String fecha_actualizacion) {
        this.fecha_actualizacion = fecha_actualizacion;
    }

    public int getFlag_activo() {
        return flag_activo;
    }

    public void setFlag_activo(int flag_activo) {
        this.flag_activo = flag_activo;
    }

    @Override
    public String toString() {
        return "CalendarioHabil{" + "id_calendario=" + id_calendario + ", anio=" + anio + ", mes=" + mes + ", dia=" + dia + ", habil=" + habil + ", rut_creacion=" + rut_creacion + ", fecha_creacion=" + fecha_creacion + ", rut_actualizacion=" + rut_actualizacion + ", fecha_actualizacion=" + fecha_actualizacion + ", flag_activo=" + flag_activo + '}';
    }
}
