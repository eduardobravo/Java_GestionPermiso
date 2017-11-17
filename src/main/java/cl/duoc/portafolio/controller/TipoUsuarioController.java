/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.portafolio.controller;

import cl.duoc.portafolio.entities.TipoUsuario;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.apache.log4j.Logger;
import ws_pkg.TIPOUSUARIOTapi;
import ws_pkg.TIPOUSUARIOTapi_Service;
/**
 *
 * @author Edo
 */
public class TipoUsuarioController {
    private final static Logger logger = Logger.getLogger(TipoUsuarioController.class);

    public List<TipoUsuario> getTipoUsuarios() {
        List<TipoUsuario> listaTipoUsuarios = null;
        TIPOUSUARIOTapi_Service service = null;
        TIPOUSUARIOTapi port = null;
        ObjectMapper mapper = null;
        try {
            mapper = new ObjectMapper();
            service = new TIPOUSUARIOTapi_Service();
            port = service.getTIPOUSUARIOTapiPort();
            String result = port.tuSel();
            listaTipoUsuarios = mapper.readValue(result, new TypeReference<List<TipoUsuario>>(){}); 
        } catch (Exception e) {
            logger.error("Error grave obteniendo Tipos de Usuarios desde WS.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
            mapper = null;
        }
        return listaTipoUsuarios;
    }
}
