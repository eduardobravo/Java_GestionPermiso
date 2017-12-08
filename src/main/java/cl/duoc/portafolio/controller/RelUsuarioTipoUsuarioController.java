/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.portafolio.controller;

import cl.duoc.portafolio.entities.RelUsuarioTipoUsuario;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.apache.log4j.Logger;
import ws_pkg.RELUSUARIOTIPOUSUTapi;
import ws_pkg.RELUSUARIOTIPOUSUTapi_Service;

/**
 *
 * @author Edo
 */
public class RelUsuarioTipoUsuarioController {
    private final static Logger logger = Logger.getLogger(MenuController.class);

    public List<RelUsuarioTipoUsuario> getREL_USU_TIUSU() {
        List<RelUsuarioTipoUsuario> listaREL_USU_TIUSUs = null;
        RELUSUARIOTIPOUSUTapi_Service service = null;
        RELUSUARIOTIPOUSUTapi port = null;
        ObjectMapper mapper = null;
            try {
                mapper = new ObjectMapper();
                service = new RELUSUARIOTIPOUSUTapi_Service();
                port = service.getRELUSUARIOTIPOUSUTapiPort();
                String result = port.rutuSel();
                listaREL_USU_TIUSUs = mapper.readValue(result, new TypeReference<List<RelUsuarioTipoUsuario>>() {
                });
            } catch (Exception e) {
                logger.error("Error grave obteniendo relación Usuario - Tipo Usuario desde el WS.", e);
                throw new RuntimeException(e);
            } finally {
                service = null;
                port = null;
                mapper = null;
            }
        return listaREL_USU_TIUSUs;
    }

    public boolean crearREL_USU_TIUSU(RelUsuarioTipoUsuario rutu) {
        List<RelUsuarioTipoUsuario> listaMenues = null;
        ObjectMapper mapper = null;
        RELUSUARIOTIPOUSUTapi_Service service = null;
        RELUSUARIOTIPOUSUTapi port = null;
        try {
            boolean resultado = false;
            mapper = new ObjectMapper();
            service = new RELUSUARIOTIPOUSUTapi_Service();
            port = service.getRELUSUARIOTIPOUSUTapiPort();
            
            String ID = String.valueOf(rutu.getID_TIPO_USUARIO());
            int result = port.rutuIns(rutu.getRUT(), ID, rutu.getRUT_CREACION());
            if (result > 0) {
                resultado = true;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave creando relación Usuario - Tipo Usuario desde WS.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    }

    
    public boolean eliminarREL_USU_TIUSU(String RUT, String ID) {
        RELUSUARIOTIPOUSUTapi_Service service = null;
        RELUSUARIOTIPOUSUTapi port = null;
        try {
            boolean resultado = false;
            service = new RELUSUARIOTIPOUSUTapi_Service();
            port = service.getRELUSUARIOTIPOUSUTapiPort();
            int result = port.rutuDel(RUT, ID);

            if (result > 0) {
                resultado = true;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave eliminando relación Usuario - Tipo Usuario.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    }

    public RelUsuarioTipoUsuario obtenerREL_USU_TIUSU(String RUT, String ID) {
        RELUSUARIOTIPOUSUTapi_Service service = null;
        RELUSUARIOTIPOUSUTapi port = null;
        ObjectMapper mapper = null;
        try {
            mapper = new ObjectMapper();
            service = new RELUSUARIOTIPOUSUTapi_Service();
            port = service.getRELUSUARIOTIPOUSUTapiPort();
            String result = port.rutuSelId(RUT, ID);
            List<RelUsuarioTipoUsuario> me = mapper.readValue(result, new TypeReference<List<RelUsuarioTipoUsuario>>() {
                });
            return me.get(0);
        } catch (Exception e) {
            logger.error("Error grave obteniendo relación Usuario - Tipo Usuario.", e);
            throw new RuntimeException(e);
        } finally {
            mapper = null;
            service = null;
            port = null;
        }
    }
}
