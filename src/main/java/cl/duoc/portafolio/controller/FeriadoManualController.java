/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.portafolio.controller;

import cl.duoc.portafolio.entities.FeriadoManual;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.apache.log4j.Logger;
import ws_pkg.FERIADOMANUALTapi;
import ws_pkg.FERIADOMANUALTapi_Service;

/**
 *
 * @author Edo
 */
public class FeriadoManualController {
    private final static Logger logger = Logger.getLogger(FeriadoManualController.class);

    public List<FeriadoManual> getFeriadoManuales() {
        List<FeriadoManual> listaFeriadoManuales = null;
        FERIADOMANUALTapi_Service service = null;
        FERIADOMANUALTapi port = null;
        ObjectMapper mapper = null;
            try {
                mapper = new ObjectMapper();
                service = new FERIADOMANUALTapi_Service();
                port = service.getFERIADOMANUALTapiPort();
                String result = port.fmSel();
                listaFeriadoManuales = mapper.readValue(result, new TypeReference<List<FeriadoManual>>() {
                });
            } catch (Exception e) {
                logger.error("Error grave obteniendo las fechas desde el WS.", e);
                throw new RuntimeException(e);
            } finally {
                service = null;
                port = null;
                mapper = null;
            }
        return listaFeriadoManuales;
    }

    public boolean crearFeriadoManual(FeriadoManual fm) {
        FERIADOMANUALTapi_Service service = null;
        FERIADOMANUALTapi port = null;
        List<FeriadoManual> listaFeriadoManuales = null;
        ObjectMapper mapper = null;
        try {
            boolean resultado = false;
            service = new ws_pkg.FERIADOMANUALTapi_Service();
            port = service.getFERIADOMANUALTapiPort();
            
            //parseos de int a string
            StringBuilder sbGetMes = new StringBuilder();
            sbGetMes.append(fm.getMes());
            StringBuilder sbGetAnio = new StringBuilder();
            sbGetAnio.append(fm.getAnio());
            StringBuilder sbGetDia = new StringBuilder();
            sbGetDia.append(fm.getDia());
            
            String result = port.fmIns(sbGetMes.toString(), fm.getRut_creacion(),sbGetAnio.toString(), sbGetDia.toString());

            listaFeriadoManuales = mapper.readValue(result, new TypeReference<List<FeriadoManual>>() {
                });
            
            if (listaFeriadoManuales.get(0).getId_feriado_manual() > 0) {
                resultado = true;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave creando la fecha desde WS.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    }

    public boolean actualizarFeriadoManual(FeriadoManual fm) {
        FERIADOMANUALTapi_Service service = null;
        FERIADOMANUALTapi port = null;
        try {
            boolean resultado = false;
            service = new ws_pkg.FERIADOMANUALTapi_Service();
            port = service.getFERIADOMANUALTapiPort();
            
            //parseos de int a string
            StringBuilder sbGetMes = new StringBuilder();
            sbGetMes.append(fm.getMes());
            StringBuilder sbGetAnio = new StringBuilder();
            sbGetAnio.append(fm.getAnio());
            StringBuilder sbGetDia = new StringBuilder();
            sbGetDia.append(fm.getDia());
            StringBuilder sbGetId_feriado_manual = new StringBuilder();
            sbGetId_feriado_manual.append(fm.getId_feriado_manual());
            
            int result = port.fmUpd(fm.getRut_actualizacion(), sbGetMes.toString(), sbGetAnio.toString(), sbGetDia.toString(), sbGetId_feriado_manual.toString());

            if (result > 0) {
                resultado = true;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave editando fecha desde WS.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    }
    
    public boolean eliminarFeriadoManual(String ID) {
        FERIADOMANUALTapi_Service service = null;
        FERIADOMANUALTapi port = null;
        try {
            boolean resultado = false;
            service = new ws_pkg.FERIADOMANUALTapi_Service();
            port = service.getFERIADOMANUALTapiPort();
            int result = port.fmDel(ID);

            if (result > 0) {
                resultado = true;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave eliminando fecha.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    }

    public FeriadoManual obtenerFeriadoManual(String ID) {
        FERIADOMANUALTapi_Service service = null;
        FERIADOMANUALTapi port = null;
        ObjectMapper mapper = null;
        try {
            mapper = new ObjectMapper();
            service = new ws_pkg.FERIADOMANUALTapi_Service();
            port = service.getFERIADOMANUALTapiPort();
            String result = port.fmSelId(ID);
            List<FeriadoManual> fema = mapper.readValue(result, new TypeReference<List<FeriadoManual>>() {
                });
            return fema.get(0);
        } catch (Exception e) {
            logger.error("Error grave obteniendo fecha.", e);
            throw new RuntimeException(e);
        } finally {
            mapper = null;
            service = null;
            port = null;
        }
    }
}
