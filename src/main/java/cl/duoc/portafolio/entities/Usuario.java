/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.portafolio.entities;


/**
 *
 * @author 
 */
public class Usuario {
    
    private String rut;
    private String password;
    private String fecha_contrato;
    private String rut_creacion;
    private String fecha_ingreso;
    private String fecha_creacion;
    private String nombre;
    
    public Usuario(){
        this.rut = "";
        this.password = "";
        this.fecha_contrato = "";
        this.rut_creacion = "";
        this.fecha_ingreso = "";
        this.fecha_creacion = "";
        this.nombre = "";
    }

    public Usuario(String rut, String password, String fecha_contrato, String rut_creacion, String fecha_ingreso, String fecha_creacion, String nombre) {
        this.rut = rut;
        this.password = password;
        this.fecha_contrato = fecha_contrato;
        this.rut_creacion = rut_creacion;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_creacion = fecha_creacion;
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFecha_contrato() {
        return fecha_contrato;
    }

    public void setFecha_contrato(String fecha_contrato) {
        this.fecha_contrato = fecha_contrato;
    }

    public String getRut_creacion() {
        return rut_creacion;
    }

    public void setRut_creacion(String rut_creacion) {
        this.rut_creacion = rut_creacion;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuario{" + "rut=" + rut + ", password=" + password + ", fecha_contrato=" + fecha_contrato + ", rut_creacion=" + rut_creacion + ", fecha_ingreso=" + fecha_ingreso + ", fecha_creacion=" + fecha_creacion + ", nombre=" + nombre + '}';
    }
    
    
}
