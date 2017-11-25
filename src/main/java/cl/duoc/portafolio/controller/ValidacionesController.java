/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.portafolio.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author lun4t1k0
 */
public class ValidacionesController {
    
    //ValidarRut
    public static boolean validarRut(String rut) {
 
    boolean validacion = false;
    try {
    rut =  rut.toUpperCase();
    rut = rut.replace(".", "");
    rut = rut.replace("-", "");
    int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

    char dv = rut.charAt(rut.length() - 1);

    int m = 0, s = 1;
    for (; rutAux != 0; rutAux /= 10) {
    s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
    }
    if (dv == (char) (s != 0 ? s + 47 : 75)) {
    validacion = true;
    }

    } catch (java.lang.NumberFormatException e) {
    } catch (Exception e) {
    }
    return validacion;
    }

    public String ValidarFecha(String fecha1, String fecha2) throws ParseException{
        
        SimpleDateFormat sf = new SimpleDateFormat("dd/mm/yyyy");
        Date fechaIngreso = sf.parse(fecha1);
        Date FechaContrato = sf.parse(fecha2);
          
          if (FechaContrato.after(fechaIngreso)) {
              System.out.println("fechaContrato es Mayor que fecha Ingreso");            
        }else if(FechaContrato.before(fechaIngreso)){
              System.out.println("Fecha de Contrato es menor que Fecha de Ingreso");
              return "Fecha de Contrato es menor que fecha de ingreso, favor revisar";
        }else if (FechaContrato.equals(fechaIngreso)) {
              System.out.println("Las Fechas Son iguales");
        }
        
        return null;
        
    }
}