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
    
    public boolean crearTipoUso (TipoUso tipoUso) {
        TIPOUSOTapi_Service service = null;
        TIPOUSOTapi port = null;
        try {
            boolean resultado = false;
            service = new ws_pkg.TIPOUSOTapi_Service();
            port = service.getTIPOUSOTapiPort();
            
//            StringBuilder idTipoUsuario = new StringBuilder();
//            idTipoUsuario.append(tipoUso.getid_tipo_usuario());
            int result = port.tusoUpd(tipoUso.getglosa_tipo_uso(), tipoUso.getrut_modificacion(),tipoUso.getid_tipo_uso().toString());

            if (result > 0) {
                resultado = true;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave creando Tipo de Uso desde WS.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    }
    
        public boolean actualizarTipoUso(TipoUso tipoUso) {
        TIPOUSOTapi_Service service = null;
        TIPOUSOTapi port = null;
        try {
            boolean resultado = false;
            service = new ws_pkg.TIPOUSOTapi_Service();
            port = service.getTIPOUSOTapiPort();
            
//            StringBuilder idTipoUsuario = new StringBuilder();
//            idTipoUsuario.append(TipoUsuario.getid_tipo_usuario());
            int result = port.tusoUpd(tipoUso.getglosa_tipo_uso(), tipoUso.getrut_modificacion(),tipoUso.getid_tipo_uso().toString());

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
        
    public boolean eliminarTipoUso(String idTipoUso) {
        TIPOUSOTapi_Service service = null;
        TIPOUSOTapi port = null;
        try {
            boolean resultado = false;
            service = new ws_pkg.TIPOUSOTapi_Service();
            port = service.getTIPOUSOTapiPort();
            int result = port.tusoDel(idTipoUso);

            if (result <= 0) {
                resultado = false;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave eliminando al Tipo Uso.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    } 
    
    public TipoUso obtenerTipoUso(String idTipoUso) {
        TIPOUSOTapi_Service service = null;
        TIPOUSOTapi port = null;
        ObjectMapper mapper = null;
        try {
            mapper = new ObjectMapper();
            service = new ws_pkg.TIPOUSOTapi_Service();
            port = service.getTIPOUSOTapiPort();
            String result = port.tusoSelId(idTipoUso);
            List<TipoUso> UnidadI = mapper.readValue(result, new TypeReference<List<TipoUso>>() {
                });
            return UnidadI.get(0);
        } catch (Exception e) {
            logger.error("Error grave al obtener el Tipo de Uso.", e);
            throw new RuntimeException(e);
        } finally {
            mapper = null;
            service = null;
            port = null;
        }
    }
    
}
