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
public class TipoAprobacion {
    private int id_tipo_aprobacion;
    private String glosa_tipo_aprobacion;
    private String rut_creacion;
    private String fecha_creacion;
    private String rut_actualizacion;
    private String fecha_actualizacion;

    public TipoAprobacion() {
        this.id_tipo_aprobacion = 0;
        this.glosa_tipo_aprobacion = "";
        this.rut_creacion = "";
        this.fecha_creacion = "";
        this.rut_actualizacion = "";
        this.fecha_actualizacion = "";
    }
    
    public TipoAprobacion(int id_tipo_aprobacion, String glosa_tipo_aprobacion, String rut_creacion, String fecha_creacion, String rut_actualizacion, String fecha_actualizacion) {
        this.id_tipo_aprobacion = id_tipo_aprobacion;
        this.glosa_tipo_aprobacion = glosa_tipo_aprobacion;
        this.rut_creacion = rut_creacion;
        this.fecha_creacion = fecha_creacion;
        this.rut_actualizacion = rut_actualizacion;
        this.fecha_actualizacion = fecha_actualizacion;
    }

    public int getId_tipo_aprobacion() {
        return id_tipo_aprobacion;
    }

    public void setId_tipo_aprobacion(int id_tipo_aprobacion) {
        this.id_tipo_aprobacion = id_tipo_aprobacion;
    }

    public String getGlosa_tipo_aprobacion() {
        return glosa_tipo_aprobacion;
    }

    public void setGlosa_tipo_aprobacion(String glosa_tipo_aprobacion) {
        this.glosa_tipo_aprobacion = glosa_tipo_aprobacion;
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
        return "TipoAprobacion{" + "id_tipo_aprobacion=" + id_tipo_aprobacion + ", glosa_tipo_aprobacion=" + glosa_tipo_aprobacion + ", rut_creacion=" + rut_creacion + ", fecha_creacion=" + fecha_creacion + ", rut_actualizacion=" + rut_actualizacion + ", fecha_actualizacion=" + fecha_actualizacion + '}';
    }
    
}
