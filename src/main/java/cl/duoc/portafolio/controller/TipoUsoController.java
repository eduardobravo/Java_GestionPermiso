/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.portafolio.controller;

import cl.duoc.portafolio.entities.TipoUso;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.apache.log4j.Logger;
import ws_pkg.TIPOUSOTapi;
import ws_pkg.TIPOUSOTapi_Service;
/**
 *
 * @author Edo
 */
public class TipoUsoController {
    private final static Logger logger = Logger.getLogger(TipoUsoController.class);

    public List<TipoUso> getTipoUsos() {
        List<TipoUso> listaTipoUsos = null;
        TIPOUSOTapi_Service service = null;
        TIPOUSOTapi port = null;
        ObjectMapper mapper = null;
        try {
            mapper = new ObjectMapper();
            service = new TIPOUSOTapi_Service();
            port = service.getTIPOUSOTapiPort();
            String result = port.tusoSel();
            listaTipoUsos = mapper.readValue(result, new TypeReference<List<TipoUso>>(){}); 
        } catch (Exception e) {
            logger.error("Error grave obteniendo Tipos de Usos desde WS.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
            mapper = null;
        }
        return listaTipoUsos;
    }
    
}
