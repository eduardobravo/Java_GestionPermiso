/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.portafolio.controller;

import cl.duoc.portafolio.entities.UnidadInterna;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.apache.log4j.Logger;
import ws_pkg.UNIDADINTERNATapi;
import ws_pkg.UNIDADINTERNATapi_Service;

/**
 *
 * @author Edo
 */
public class UnidadInternaController {

    private final static Logger logger = Logger.getLogger(UnidadInternaController.class);

    public List<UnidadInterna> getUnidadInternas() {
        List<UnidadInterna> listaUnidadInternas = null;
        UNIDADINTERNATapi_Service service = null;
        UNIDADINTERNATapi port = null;
        ObjectMapper mapper = null;
        try {
            mapper = new ObjectMapper();
            service = new UNIDADINTERNATapi_Service();
            port = service.getUNIDADINTERNATapiPort();
            String result = port.uiSel();
            listaUnidadInternas = mapper.readValue(result, new TypeReference<List<UnidadInterna>>() {});
        } catch (Exception e) {
            logger.error("Error grave obteniendo Unidad Interna desde WS.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
            mapper = null;
        }
        return listaUnidadInternas;
    }

    public boolean crearUnidadInterna(UnidadInterna UnidadI) {
        UNIDADINTERNATapi_Service service = null;
        UNIDADINTERNATapi port = null;
        List<UnidadInterna> listaUnidadInternas = null;
        ObjectMapper mapper = null;
        try {
            boolean resultado = false;
            service = new ws_pkg.UNIDADINTERNATapi_Service();
            port = service.getUNIDADINTERNATapiPort();
            
            String result = port.uiIns(UnidadI.getRut_actualizacion(), UnidadI.getGlosa_unidad_interna());

            listaUnidadInternas = mapper.readValue(result, new TypeReference<List<UnidadInterna>>() {});

            if (listaUnidadInternas.get(0).getId_unidad_interna() > 0) {
                resultado = true;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave creando Unidad Interna desde WS.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    }

    public boolean actualizarUnidadInterna(UnidadInterna UnidadI) {
        UNIDADINTERNATapi_Service service = null;
        UNIDADINTERNATapi port = null;
        try {
            boolean resultado = false;
            service = new ws_pkg.UNIDADINTERNATapi_Service();
            port = service.getUNIDADINTERNATapiPort();
            int result = port.uiUpd(UnidadI.getRut_actualizacion(), UnidadI.getId_unidad_interna().toString(), UnidadI.getGlosa_unidad_interna());

            if (result > 0) {
                resultado = true;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave actualizando lista de Unidad Interna desde WS.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    }

    public boolean eliminarUnidadInterna(String idUnidadI) {
        UNIDADINTERNATapi_Service service = null;
        UNIDADINTERNATapi port = null;
        try {
            boolean resultado = false;
            service = new ws_pkg.UNIDADINTERNATapi_Service();
            port = service.getUNIDADINTERNATapiPort();
            int result = port.uiDel(idUnidadI);

            if (result <= 0) {
                resultado = false;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave eliminando la Unidad Interna.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    }

    public UnidadInterna obtenerUnidadInterna(String idUnidadI) {
        UNIDADINTERNATapi_Service service = null;
        UNIDADINTERNATapi port = null;
        ObjectMapper mapper = null;
        try {
            mapper = new ObjectMapper();
            service = new ws_pkg.UNIDADINTERNATapi_Service();
            port = service.getUNIDADINTERNATapiPort();
            String result = port.uiSelId(idUnidadI);
            List<UnidadInterna> UnidadI = mapper.readValue(result, new TypeReference<List<UnidadInterna>>() {
            });
            return UnidadI.get(0);
        } catch (Exception e) {
            logger.error("Error grave al obtener la Unidad Interna.", e);
            throw new RuntimeException(e);
        } finally {
            mapper = null;
            service = null;
            port = null;
        }
    }
}
