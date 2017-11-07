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
    private final static Logger logger = Logger.getLogger(IndexController.class);

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
            listaUnidadInternas = mapper.readValue(result, new TypeReference<List<UnidadInterna>>(){}); 
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
}
