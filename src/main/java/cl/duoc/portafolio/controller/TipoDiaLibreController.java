/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.portafolio.controller;

import cl.duoc.portafolio.entities.TipoDiaLibre;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.apache.log4j.Logger;
import ws_pkg.TIPODIALIBRETapi;
import ws_pkg.TIPODIALIBRETapi_Service;


/**
 *
 * @author Edo
 */
public class TipoDiaLibreController {
    
        private final static Logger logger = Logger.getLogger(TipoDiaLibre.class);
        
        public List<TipoDiaLibre> getDiaLibres() {
        List<TipoDiaLibre> listaTipoDiaLibres = null;
        TIPODIALIBRETapi_Service service = null;
        TIPODIALIBRETapi port = null;
        ObjectMapper mapper = null;
        try {
            mapper = new ObjectMapper();
            service = new TIPODIALIBRETapi_Service();
            port = service.getTIPODIALIBRETapiPort();
            String result = port.tdlSel();
            listaTipoDiaLibres = mapper.readValue(result, new TypeReference<List<TipoDiaLibre>>(){}); 
        } catch (Exception e) {
            logger.error("Error grave obteniendo Tipos de Día Libre desde WS.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
            mapper = null;
        }
        return listaTipoDiaLibres;
    } 
        
    public boolean crearTipoDiaLibre (TipoDiaLibre tipoDiaLibre) {
        TIPODIALIBRETapi_Service service = null;
        TIPODIALIBRETapi port = null;
        try {
            boolean resultado = false;
            service = new ws_pkg.TIPODIALIBRETapi_Service();
            port = service.getTIPODIALIBRETapiPort();
            
            StringBuilder idtipoDiaLibre = new StringBuilder();
            idtipoDiaLibre.append(tipoDiaLibre.getId_tipo_dia_libre());
            StringBuilder cantDias = new StringBuilder();
            cantDias.append(tipoDiaLibre.getCantidad_dias());
            
            int result = port.tdlUpd(idtipoDiaLibre.toString()
                   , tipoDiaLibre.getGlosa_tipo_dia_libre(),tipoDiaLibre.getRut_actualizacion(), cantDias.toString());

            if (result > 0) {
                resultado = true;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave creando Tipo de Día Libre WS.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    }
    
        public boolean actualizarTipoDiaLibre(TipoDiaLibre tipoDiaLibre) {
        TIPODIALIBRETapi_Service service = null;
        TIPODIALIBRETapi port = null;
        try {
            boolean resultado = false;
            service = new ws_pkg.TIPODIALIBRETapi_Service();
            port = service.getTIPODIALIBRETapiPort();
            
            StringBuilder idtipoDiaLibre = new StringBuilder();
            idtipoDiaLibre.append(tipoDiaLibre.getId_tipo_dia_libre());
            StringBuilder cantDias = new StringBuilder();
            cantDias.append(tipoDiaLibre.getCantidad_dias());
            
            int result = port.tdlUpd(idtipoDiaLibre.toString()
                   , tipoDiaLibre.getGlosa_tipo_dia_libre(),tipoDiaLibre.getRut_actualizacion(), cantDias.toString());
            
            if (result > 0) {
                resultado = true;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave actualizando lista de Tipo de Uso desde WS.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    
    }
        
    public boolean eliminarTipoDiaLibre(String idTipoDiaLibre) {
        TIPODIALIBRETapi_Service service = null;
        TIPODIALIBRETapi port = null;
        try {
            boolean resultado = false;
            service = new ws_pkg.TIPODIALIBRETapi_Service();
            port = service.getTIPODIALIBRETapiPort();
            int result = port.tdlDel(idTipoDiaLibre);

            if (result <= 0) {
                resultado = false;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave eliminando el Tipo Día Libre.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    } 
    
    public TipoDiaLibre obtenerTipoUso(String idTipoDiaLibre) {
        TIPODIALIBRETapi_Service service = null;
        TIPODIALIBRETapi port = null;
        ObjectMapper mapper = null;
        try {
            mapper = new ObjectMapper();
            service = new ws_pkg.TIPODIALIBRETapi_Service();
            port = service.getTIPODIALIBRETapiPort();
            String result = port.tdlSelId(idTipoDiaLibre);
            List<TipoDiaLibre> diaLibres = mapper.readValue(result, new TypeReference<List<TipoDiaLibre>>() {
                });
            return diaLibres.get(0);
        } catch (Exception e) {
            logger.error("Error grave al obtener el Tipo Día Libre.", e);
            throw new RuntimeException(e);
        } finally {
            mapper = null;
            service = null;
            port = null;
        }
    }
    
    
}
