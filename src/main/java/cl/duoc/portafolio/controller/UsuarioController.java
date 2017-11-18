/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.portafolio.controller;

import cl.duoc.portafolio.entities.Usuario;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.apache.log4j.Logger;
import ws_pkg.USUARIOTapi;
import ws_pkg.USUARIOTapi_Service;

/**
 *
 * @author Edo
 */
public class UsuarioController {

    private final static Logger logger = Logger.getLogger(UsuarioController.class);

    public List<Usuario> getUsuarios(String Activo) {
        List<Usuario> listaUsuarios = null;
        USUARIOTapi_Service service = null;
        USUARIOTapi port = null;
        ObjectMapper mapper = null;
        if (Activo.equals("-1") || Activo.equals("0") || Activo.equals("1")) {
            try {
                mapper = new ObjectMapper();
                service = new USUARIOTapi_Service();
                port = service.getUSUARIOTapiPort();
                String result = port.uSel(Activo);
                listaUsuarios = mapper.readValue(result, new TypeReference<List<Usuario>>() {
                });
            } catch (Exception e) {
                logger.error("Error grave obteniendo Usuarios desde WS.", e);
                throw new RuntimeException(e);
            } finally {
                service = null;
                port = null;
                mapper = null;
            }
        }
        return listaUsuarios;
    }

    public boolean crearUsuario(Usuario usu) {
        USUARIOTapi_Service service = null;
        USUARIOTapi port = null;
        try {
            boolean resultado = false;
            service = new ws_pkg.USUARIOTapi_Service();
            port = service.getUSUARIOTapiPort();
            int result = port.uIns(usu.getRut(), usu.getFecha_contrato(), usu.getApellidom(), usu.getPassword(), usu.getFecha_ingreso(), usu.getRut_creacion(), usu.getNombre(), usu.getApellidop());

            if (result > 0) {
                resultado = true;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave creando Usuarios desde WS.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    }

    public boolean actualizarUsuario(Usuario usu) {
        USUARIOTapi_Service service = null;
        USUARIOTapi port = null;
        try {
            boolean resultado = false;
            service = new ws_pkg.USUARIOTapi_Service();
            port = service.getUSUARIOTapiPort();
            int result = port.uUpd(usu.getRut(), usu.getFecha_contrato(), usu.getApellidom(), usu.getPassword(), usu.getRut_creacion(), usu.getFecha_ingreso(), usu.getNombre(), usu.getApellidop());

            if (result > 0) {
                resultado = true;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave creando Usuarios desde WS.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    }
    
    public boolean eliminarUsuario(String rut) {
        USUARIOTapi_Service service = null;
        USUARIOTapi port = null;
        try {
            boolean resultado = false;
            service = new ws_pkg.USUARIOTapi_Service();
            port = service.getUSUARIOTapiPort();
            int result = port.uDel(rut);

            if (result <= 0) {
                resultado = false;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave eliminando usuario.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    }

    public boolean activarUsuario(String rut, int activo) {
        USUARIOTapi_Service service = null;
        USUARIOTapi port = null;
        try {
            boolean resultado = false;
            service = new ws_pkg.USUARIOTapi_Service();
            port = service.getUSUARIOTapiPort();
            int result = port.uActive(rut, String.valueOf(activo));

            if (result > 0) {
                resultado = true;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave eliminando usuario.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    }

    public Usuario obtenerUsuario(String rut) {
        USUARIOTapi_Service service = null;
        USUARIOTapi port = null;
        ObjectMapper mapper = null;
        try {
            mapper = new ObjectMapper();
            service = new ws_pkg.USUARIOTapi_Service();
            port = service.getUSUARIOTapiPort();
            String result = port.uSelId(rut);
            List<Usuario> usu = mapper.readValue(result, new TypeReference<List<Usuario>>() {
                });
            return usu.get(0);
        } catch (Exception e) {
            logger.error("Error grave al obtener usuario.", e);
            throw new RuntimeException(e);
        } finally {
            mapper = null;
            service = null;
            port = null;
        }
    }

}
