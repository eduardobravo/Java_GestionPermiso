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
public class RelUsuarioTipoUsuario {

    private String RUT;
    private int ID_TIPO_USUARIO;
    private int FLAG_ACTIVO;
    private String FECHA_CREACION;
    private String RUT_CREACION;
    private String FECHA_ACTUALIZACION;
    private String RUT_ACTUALIZACION;

    public RelUsuarioTipoUsuario() {
        this.RUT = "";
        this.ID_TIPO_USUARIO = 0;
        this.FLAG_ACTIVO = 0;
        this.FECHA_CREACION = "";
        this.RUT_CREACION = "";
        this.FECHA_ACTUALIZACION = "";
        this.RUT_ACTUALIZACION = "";
    }
    
    public RelUsuarioTipoUsuario(String RUT, int ID_TIPO_USUARIO, int FLAG_ACTIVO, String FECHA_CREACION, String RUT_CREACION, String FECHA_ACTUALIZACION, String RUT_ACTUALIZACION) {
        this.RUT = RUT;
        this.ID_TIPO_USUARIO = ID_TIPO_USUARIO;
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

    public int getID_TIPO_USUARIO() {
        return ID_TIPO_USUARIO;
    }

    public void setID_TIPO_USUARIO(int ID_TIPO_USUARIO) {
        this.ID_TIPO_USUARIO = ID_TIPO_USUARIO;
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
        return "RelUsuarioTipoUsuario{" + "RUT=" + RUT + ", ID_TIPO_USUARIO=" + ID_TIPO_USUARIO + ", FLAG_ACTIVO=" + FLAG_ACTIVO + ", FECHA_CREACION=" + FECHA_CREACION + ", RUT_CREACION=" + RUT_CREACION + ", FECHA_ACTUALIZACION=" + FECHA_ACTUALIZACION + ", RUT_ACTUALIZACION=" + RUT_ACTUALIZACION + '}';
    }
    
}
