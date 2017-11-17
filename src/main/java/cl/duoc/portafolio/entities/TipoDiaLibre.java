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
public class TipoDiaLibre {
    private int id_tipo_dia_libre;
    private String glosa_tipo_dia_libre;
    private int cantidad_dias;
    private String rut_creacion;
    private String fecha_creacion;
    private String rut_actualizacion;
    private String fecha_actualizacion;

    public TipoDiaLibre() {
        this.id_tipo_dia_libre = 0;
        this.glosa_tipo_dia_libre = "";
        this.cantidad_dias = 0;
        this.rut_creacion = "";
        this.fecha_creacion = "";
        this.rut_actualizacion = "";
        this.fecha_actualizacion = "";
    }

    public TipoDiaLibre(int id_tipo_dia_libre, String glosa_tipo_dia_libre, int cantidad_dias, String rut_creacion, String fecha_creacion, String rut_actualizacion, String fecha_actualizacion) {
        this.id_tipo_dia_libre = id_tipo_dia_libre;
        this.glosa_tipo_dia_libre = glosa_tipo_dia_libre;
        this.cantidad_dias = cantidad_dias;
        this.rut_creacion = rut_creacion;
        this.fecha_creacion = fecha_creacion;
        this.rut_actualizacion = rut_actualizacion;
        this.fecha_actualizacion = fecha_actualizacion;
    }

    public int getId_tipo_dia_libre() {
        return id_tipo_dia_libre;
    }

    public void setId_tipo_dia_libre(int id_tipo_dia_libre) {
        this.id_tipo_dia_libre = id_tipo_dia_libre;
    }

    public String getGlosa_tipo_dia_libre() {
        return glosa_tipo_dia_libre;
    }

    public void setGlosa_tipo_dia_libre(String glosa_tipo_dia_libre) {
        this.glosa_tipo_dia_libre = glosa_tipo_dia_libre;
    }

    public int getCantidad_dias() {
        return cantidad_dias;
    }

    public void setCantidad_dias(int cantidad_dias) {
        this.cantidad_dias = cantidad_dias;
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

    @Override
    public String toString() {
        return "TipoDiaLibre{" + "id_tipo_dia_libre=" + id_tipo_dia_libre + ", glosa_tipo_dia_libre=" + glosa_tipo_dia_libre + ", cantidad_dias=" + cantidad_dias + ", rut_creacion=" + rut_creacion + ", fecha_creacion=" + fecha_creacion + ", rut_actualizacion=" + rut_actualizacion + ", fecha_actualizacion=" + fecha_actualizacion + '}';
    }

}
