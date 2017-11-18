/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.portafolio.controller;

import cl.duoc.portafolio.entities.TipoUsuario;
import cl.duoc.portafolio.entities.UnidadInterna;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.apache.log4j.Logger;
import ws_pkg.TIPOUSUARIOTapi;
import ws_pkg.TIPOUSUARIOTapi_Service;
import ws_pkg.UNIDADINTERNATapi;
import ws_pkg.UNIDADINTERNATapi_Service;
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
    
    public boolean crearTipoUsuario (TipoUsuario TipoUsuario) {
        TIPOUSUARIOTapi_Service service = null;
        TIPOUSUARIOTapi port = null;
        try {
            boolean resultado = false;
            service = new ws_pkg.TIPOUSUARIOTapi_Service();
            port = service.getTIPOUSUARIOTapiPort();
            
            StringBuilder idTipoUsuario = new StringBuilder();
            idTipoUsuario.append(TipoUsuario.getid_tipo_usuario());
            int result = port.tuUpd(TipoUsuario.getrut_actualizacion(), TipoUsuario.getglosa_tipo_usuario(),idTipoUsuario.toString());

            if (result > 0) {
                resultado = true;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave creando Tipo de Usuario desde WS.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    }
    
        public boolean actualizarTipoUsuario(TipoUsuario TipoUsuario) {
        TIPOUSUARIOTapi_Service service = null;
        TIPOUSUARIOTapi port = null;
        try {
            boolean resultado = false;
            service = new ws_pkg.TIPOUSUARIOTapi_Service();
            port = service.getTIPOUSUARIOTapiPort();
            
            StringBuilder idTipoUsuario = new StringBuilder();
            idTipoUsuario.append(TipoUsuario.getid_tipo_usuario());
            int result = port.tuUpd(TipoUsuario.getrut_actualizacion(), TipoUsuario.getglosa_tipo_usuario(),idTipoUsuario.toString());

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
        
        
}
