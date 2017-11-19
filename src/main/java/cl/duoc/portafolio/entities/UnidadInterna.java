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
public class UnidadInterna {
    private Integer id_unidad_interna;
    private String glosa_unidad_interna;
    private String rut_creacion;
    private String fecha_creacion;
    private String rut_actualizacion;
    private String fecha_actualizacion;
    private int flag_activo;

    public UnidadInterna() {
        this.id_unidad_interna = 0;
        this.glosa_unidad_interna = "";
        this.rut_creacion = "";
        this.fecha_creacion = "";
        this.rut_actualizacion = "";
        this.fecha_actualizacion = "";
        this.flag_activo = 0;
    }
    
    public UnidadInterna(Integer id_unidad_interna, String glosa_unidad_interna, String rut_creacion, String fecha_creacion, String rut_actualizacion, String fecha_actualizacion, int flag_activo) {
        this.id_unidad_interna = id_unidad_interna;
        this.glosa_unidad_interna = glosa_unidad_interna;
        this.rut_creacion = rut_creacion;
        this.fecha_creacion = fecha_creacion;
        this.rut_actualizacion = rut_actualizacion;
        this.fecha_actualizacion = fecha_actualizacion;
        this.flag_activo = flag_activo;
    }

    public Integer getId_unidad_interna() {
        return id_unidad_interna;
    }

    public void setId_unidad_interna(Integer id_unidad_interna) {
        this.id_unidad_interna = id_unidad_interna;
    }

    public String getGlosa_unidad_interna() {
        return glosa_unidad_interna;
    }

    public void setGlosa_unidad_interna(String glosa_unidad_interna) {
        this.glosa_unidad_interna = glosa_unidad_interna;
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
        return "UnidadInterna{" + "id_unidad_interna=" + id_unidad_interna + ", glosa_unidad_interna=" + glosa_unidad_interna + ", rut_creacion=" + rut_creacion + ", fecha_creacion=" + fecha_creacion + ", rut_actualizacion=" + rut_actualizacion + ", fecha_actualizacion=" + fecha_actualizacion + ", flag_activo=" + flag_activo + '}';
    }

}
