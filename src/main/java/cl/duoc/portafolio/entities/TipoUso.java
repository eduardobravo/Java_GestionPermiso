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
public class TipoUso {
    private Integer id_tipo_uso;
    private String glosa_tipo_uso;
    private String rut_creacion;
    private String fecha_creacion;
    private String rut_modificacion;
    private String fecha_modificacion;

    public TipoUso() {
        this.id_tipo_uso = 0;
        this.glosa_tipo_uso = "";
        this.rut_creacion = "";
        this.fecha_creacion = "";
        this.rut_modificacion = "";
        this.fecha_modificacion = "";
    }
    
    public TipoUso(Integer id_tipo_uso, String glosa_tipo_uso, String rut_creacion, String fecha_creacion, String rut_modificacion, String fecha_modificacion) {
        this.id_tipo_uso = id_tipo_uso;
        this.glosa_tipo_uso = glosa_tipo_uso;
        this.rut_creacion = rut_creacion;
        this.fecha_creacion = fecha_creacion;
        this.rut_modificacion = rut_modificacion;
        this.fecha_modificacion = fecha_modificacion;
    }

    public Integer getid_tipo_uso() {
        return id_tipo_uso;
    }

    public void setid_tipo_uso(Integer id_tipo_uso) {
        this.id_tipo_uso = id_tipo_uso;
    }

    public String getglosa_tipo_uso() {
        return glosa_tipo_uso;
    }

    public void setglosa_tipo_uso(String glosa_tipo_uso) {
        this.glosa_tipo_uso = glosa_tipo_uso;
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

    public String getrut_modificacion() {
        return rut_modificacion;
    }

    public void setrut_modificacion(String rut_modificacion) {
        this.rut_modificacion = rut_modificacion;
    }

    public String getfecha_modificacion() {
        return fecha_modificacion;
    }

    public void setfecha_modificacion(String fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }

    @Override
    public String toString() {
        return "TipoUso{" + "id_tipo_uso=" + id_tipo_uso + ", glosa_tipo_uso=" + glosa_tipo_uso + ", rut_creacion=" + rut_creacion + ", fecha_creacion=" + fecha_creacion + ", rut_modificacion=" + rut_modificacion + ", fecha_modificacion=" + fecha_modificacion + '}';
    }
    
}
