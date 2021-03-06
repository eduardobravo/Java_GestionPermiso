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
            rut = rut.toUpperCase();
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

    //Formatear Rut 
    public String FormatearRUT(String rut) {

        int cont = 0;
        String format;
        rut = rut.replace(".", "");
        rut = rut.replace("-", "");
        format = "-" + rut.substring(rut.length() - 1);
        for (int i = rut.length() - 2; i >= 0; i--) {
            format = rut.substring(i, i + 1) + format;
            cont++;
            if (cont == 3 && i != 0) {
                format = "" + format;
                cont = 0;
            }
        }
        return format;
    }

    public String ValidarFecha(String fecha1, String fecha2) throws ParseException {

        SimpleDateFormat sf = new SimpleDateFormat("dd/mm/yyyy");
        Date fechaIngreso = sf.parse(fecha1);
        Date FechaContrato = sf.parse(fecha2);

        if (FechaContrato.after(fechaIngreso)) {
            System.out.println("fechaContrato es Mayor que fecha Ingreso");
        } else if (FechaContrato.before(fechaIngreso)) {
            System.out.println("Fecha de Contrato es menor que Fecha de Ingreso");
            return "Fecha de Contrato es menor que fecha de ingreso, favor revisar";
        } else if (FechaContrato.equals(fechaIngreso)) {
            System.out.println("Las Fechas Son iguales");
        }

        return null;

    }

    //validar maximo de caracteres 
    public String ValidarLargoCampo(int maximo, int largoCampo) {
        if (largoCampo > maximo) {
            return "Ha exedido, el largo maximo de caracteres que son " + maximo;
        }
        return null;

    }

}
