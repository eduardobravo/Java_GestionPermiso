/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.portafolio.controller;

import cl.duoc.portafolio.entities.Usuario;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import ws_pkg.USUARIOTapi;
import ws_pkg.USUARIOTapi_Service;

/**
 *
 * @author 
 */
public class IndexController {

    private final static Logger logger = Logger.getLogger(IndexController.class);

    public List<Usuario> getUsuarios() {
        List<Usuario> listaUsuarios = null;
        USUARIOTapi_Service service = null;
        USUARIOTapi port = null;
        ObjectMapper mapper = null;
        try {
            mapper = new ObjectMapper();
            service = new USUARIOTapi_Service();
            port = service.getUSUARIOTapiPort();
            String result = port.uSel();
            listaUsuarios = mapper.readValue(result, new TypeReference<List<Usuario>>(){}); 
        } catch (Exception e) {
            logger.error("Error grave obteniendo Usuarios desde WS.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
            mapper = null;
        }
        return listaUsuarios;
    }
}
