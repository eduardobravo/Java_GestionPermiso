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
public class RelUsuarioUnidadInterna {

    private String RUT;
    private int ID_UNIDAD_INTERNA;
    private int JEFE;
    private int ID_UNIDAD_INTERNA_PADRE;
    private int FLAG_ACTIVO;
    private String FECHA_CREACION;
    private String RUT_CREACION;
    private String FECHA_ACTUALIZACION;
    private String RUT_ACTUALIZACION;

    public RelUsuarioUnidadInterna() {
        this.RUT = "";
        this.ID_UNIDAD_INTERNA = 0;
        this.JEFE = 0;
        this.ID_UNIDAD_INTERNA_PADRE = 0;
        this.FLAG_ACTIVO = 0;
        this.FECHA_CREACION = "";
        this.RUT_CREACION = "";
        this.FECHA_ACTUALIZACION = "";
        this.RUT_ACTUALIZACION = "";
    }

    public RelUsuarioUnidadInterna(String RUT, int ID_UNIDAD_INTERNA, int JEFE, int ID_UNIDAD_INTERNA_PADRE, int FLAG_ACTIVO, String FECHA_CREACION, String RUT_CREACION, String FECHA_ACTUALIZACION, String RUT_ACTUALIZACION) {
        this.RUT = RUT;
        this.ID_UNIDAD_INTERNA = ID_UNIDAD_INTERNA;
        this.JEFE = JEFE;
        this.ID_UNIDAD_INTERNA_PADRE = ID_UNIDAD_INTERNA_PADRE;
        this.FLAG_ACTIVO = FLAG_ACTIVO;
        this.FECHA_CREACION = FECHA_CREACION;
        this.RUT_CREACION = RUT_CREACION;
        this.FECHA_ACTUALIZACION = FECHA_ACTUALIZACION;
        this.RUT_ACTUALIZACION = RUT_ACTUALIZACION;
    }

    public String getRUT() {
        return RUT;
    }

    public void setRUT(String RUT) {
        this.RUT = RUT;
    }

    public int getID_UNIDAD_INTERNA() {
        return ID_UNIDAD_INTERNA;
    }

    public void setID_UNIDAD_INTERNA(int ID_UNIDAD_INTERNA) {
        this.ID_UNIDAD_INTERNA = ID_UNIDAD_INTERNA;
    }

    public int getJEFE() {
        return JEFE;
    }

    public void setJEFE(int JEFE) {
        this.JEFE = JEFE;
    }

    public int getID_UNIDAD_INTERNA_PADRE() {
        return ID_UNIDAD_INTERNA_PADRE;
    }

    public void setID_UNIDAD_INTERNA_PADRE(int ID_UNIDAD_INTERNA_PADRE) {
        this.ID_UNIDAD_INTERNA_PADRE = ID_UNIDAD_INTERNA_PADRE;
    }

    public int getFLAG_ACTIVO() {
        return FLAG_ACTIVO;
    }

    public void setFLAG_ACTIVO(int FLAG_ACTIVO) {
        this.FLAG_ACTIVO = FLAG_ACTIVO;
    }

    public String getFECHA_CREACION() {
        return FECHA_CREACION;
    }

    public void setFECHA_CREACION(String FECHA_CREACION) {
        this.FECHA_CREACION = FECHA_CREACION;
    }

    public String getRUT_CREACION() {
        return RUT_CREACION;
    }

    public void setRUT_CREACION(String RUT_CREACION) {
        this.RUT_CREACION = RUT_CREACION;
    }

    public String getFECHA_ACTUALIZACION() {
        return FECHA_ACTUALIZACION;
    }

    public void setFECHA_ACTUALIZACION(String FECHA_ACTUALIZACION) {
        this.FECHA_ACTUALIZACION = FECHA_ACTUALIZACION;
    }

    public String getRUT_ACTUALIZACION() {
        return RUT_ACTUALIZACION;
    }

    public void setRUT_ACTUALIZACION(String RUT_ACTUALIZACION) {
        this.RUT_ACTUALIZACION = RUT_ACTUALIZACION;
    }

    @Override
    public String toString() {
        return "RelUsuarioUnidadInterna{" + "RUT=" + RUT + ", ID_UNIDAD_INTERNA=" + ID_UNIDAD_INTERNA + ", JEFE=" + JEFE + ", ID_UNIDAD_INTERNA_PADRE=" + ID_UNIDAD_INTERNA_PADRE + ", FLAG_ACTIVO=" + FLAG_ACTIVO + ", FECHA_CREACION=" + FECHA_CREACION + ", RUT_CREACION=" + RUT_CREACION + ", FECHA_ACTUALIZACION=" + FECHA_ACTUALIZACION + ", RUT_ACTUALIZACION=" + RUT_ACTUALIZACION + '}';
    }
    
}
