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
public class TipoUsuario {
    private Integer id_tipo_usuario;
    private String glosa_tipo_usuario;
    private String rut_creacion;
    private String fecha_creacion;
    private String rut_actualizacion;
    private String fecha_actualizacion;
    private int flag_activo;

    public TipoUsuario() {
        this.id_tipo_usuario = 0;
        this.glosa_tipo_usuario = "";
        this.rut_creacion = "";
        this.fecha_creacion = "";
        this.rut_actualizacion = "";
        this.fecha_actualizacion = "";
        this.flag_activo = 0;
    }

    public TipoUsuario(Integer id_tipo_usuario, String glosa_tipo_usuario, String rut_creacion, String fecha_creacion, String rut_actualizacion, String fecha_actualizacion, int flag_activo) {
        this.id_tipo_usuario = id_tipo_usuario;
        this.glosa_tipo_usuario = glosa_tipo_usuario;
        this.rut_creacion = rut_creacion;
        this.fecha_creacion = fecha_creacion;
        this.rut_actualizacion = rut_actualizacion;
        this.fecha_actualizacion = fecha_actualizacion;
        this.flag_activo = flag_activo;
    }

    public Integer getid_tipo_usuario() {
        return id_tipo_usuario;
    }

    public void setid_tipo_usuario(Integer id_tipo_usuario) {
        this.id_tipo_usuario = id_tipo_usuario;
    }

    public String getglosa_tipo_usuario() {
        return glosa_tipo_usuario;
    }

    public void setglosa_tipo_usuario(String glosa_tipo_usuario) {
        this.glosa_tipo_usuario = glosa_tipo_usuario;
    }

    public String getrut_creacion() {
        return rut_creacion;
    }

    public void setrut_creacion(String rut_creacion) {
        this.rut_creacion = rut_creacion;
    }

    public String getfecha_creacion() {
        return fecha_creacion;
    }

    public void setfecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getrut_actualizacion() {
        return rut_actualizacion;
    }

    public void setrut_actualizacion(String rut_actualizacion) {
        this.rut_actualizacion = rut_actualizacion;
    }

    public String getfecha_actualizacion() {
        return fecha_actualizacion;
    }

    public void setfecha_actualizacion(String fecha_actualizacion) {
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
        return "TipoUsuario{" + "id_tipo_usuario=" + id_tipo_usuario + ", glosa_tipo_usuario=" + glosa_tipo_usuario + ", rut_creacion=" + rut_creacion + ", fecha_creacion=" + fecha_creacion + ", rut_actualizacion=" + rut_actualizacion + ", fecha_actualizacion=" + fecha_actualizacion + ", flag_activo=" + flag_activo + '}';
    }

}
