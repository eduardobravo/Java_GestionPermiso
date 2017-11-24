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
            listaTipoUsuarios = mapper.readValue(result, new TypeReference<List<TipoUsuario>>() {
            });
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

    public boolean crearTipoUsuario(TipoUsuario tipoUsuario) {
        TIPOUSUARIOTapi_Service service = null;
        TIPOUSUARIOTapi port = null;
        List<TipoUsuario> listaTipoUsuarios = null;
        ObjectMapper mapper = null;
        try {
            boolean resultado = false;
            service = new ws_pkg.TIPOUSUARIOTapi_Service();
            port = service.getTIPOUSUARIOTapiPort();

//            StringBuilder idTipoUsuario = new StringBuilder();
//            idTipoUsuario.append(tipoUsuario.getid_tipo_usuario());
            String result = port.tuIns(tipoUsuario.getglosa_tipo_usuario(), tipoUsuario.getrut_actualizacion());

            listaTipoUsuarios = mapper.readValue(result, new TypeReference<List<TipoUsuario>>() {});

            if (listaTipoUsuarios.get(0).getid_tipo_usuario() > 0) {
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

    public boolean actualizarTipoUsuario(TipoUsuario tipoUsuario) {
        TIPOUSUARIOTapi_Service service = null;
        TIPOUSUARIOTapi port = null;
        try {
            boolean resultado = false;
            service = new ws_pkg.TIPOUSUARIOTapi_Service();
            port = service.getTIPOUSUARIOTapiPort();

            StringBuilder idTipoUsuario = new StringBuilder();
            idTipoUsuario.append(tipoUsuario.getid_tipo_usuario());
            int result = port.tuUpd(tipoUsuario.getrut_actualizacion(), tipoUsuario.getglosa_tipo_usuario(), idTipoUsuario.toString());

            if (result > 0) {
                resultado = true;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave actualizando Tipo de Usuario desde WS.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }

    }

    public boolean eliminarTipoUsuario(String idTipoUsuario) {
        TIPOUSUARIOTapi_Service service = null;
        TIPOUSUARIOTapi port = null;
        try {
            boolean resultado = false;
            service = new ws_pkg.TIPOUSUARIOTapi_Service();
            port = service.getTIPOUSUARIOTapiPort();
            int result = port.tuDel(idTipoUsuario);

            if (result <= 0) {
                resultado = false;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave eliminando al Tipo Usuario.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    }

    public TipoUsuario obtenerTipoUsuario(String idTipoUsuario) {
        TIPOUSUARIOTapi_Service service = null;
        TIPOUSUARIOTapi port = null;
        ObjectMapper mapper = null;
        try {
            mapper = new ObjectMapper();
            service = new ws_pkg.TIPOUSUARIOTapi_Service();
            port = service.getTIPOUSUARIOTapiPort();
            String result = port.tuSelId(idTipoUsuario);
            List<TipoUsuario> UnidadI = mapper.readValue(result, new TypeReference<List<TipoUsuario>>() {
            });
            return UnidadI.get(0);
        } catch (Exception e) {
            logger.error("Error grave al obtener el Tipo de Usuario.", e);
            throw new RuntimeException(e);
        } finally {
            mapper = null;
            service = null;
            port = null;
        }
    }

}
