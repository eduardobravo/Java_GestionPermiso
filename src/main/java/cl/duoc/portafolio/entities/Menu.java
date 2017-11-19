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
public class Menu {
    private int id_menu;
    private String glosa_menu;
    private String pagina;
    private String rut_creacion;
    private String fecha_creacion;
    private String rut_actualizacion;
    private String fecha_actualizacion;
    private int flag_activo;

    public Menu() {
        this.id_menu = 0;
        this.glosa_menu = "";
        this.pagina = "";
        this.rut_creacion = "";
        this.fecha_creacion = "";
        this.rut_actualizacion = "";
        this.fecha_actualizacion = "";
        this.flag_activo = 0;
    }
    
    public Menu(int id_menu, String glosa_menu, String pagina, String rut_creacion, String fecha_creacion, String rut_actualizacion, String fecha_actualizacion, int flag_activo) {
        this.id_menu = id_menu;
        this.glosa_menu = glosa_menu;
        this.pagina = pagina;
        this.rut_creacion = rut_creacion;
        this.fecha_creacion = fecha_creacion;
        this.rut_actualizacion = rut_actualizacion;
        this.fecha_actualizacion = fecha_actualizacion;
        this.flag_activo = flag_activo;
    }

    public int getId_menu() {
        return id_menu;
    }

    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    public String getGlosa_menu() {
        return glosa_menu;
    }

    public void setGlosa_menu(String glosa_menu) {
        this.glosa_menu = glosa_menu;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
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
        return "Menu{" + "id_menu=" + id_menu + ", glosa_menu=" + glosa_menu + ", pagina=" + pagina + ", rut_creacion=" + rut_creacion + ", fecha_creacion=" + fecha_creacion + ", rut_actualizacion=" + rut_actualizacion + ", fecha_actualizacion=" + fecha_actualizacion + ", flag_activo=" + flag_activo + '}';
    }
}
