/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.portafolio.controller;

import cl.duoc.portafolio.entities.TipoAprobacion;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.apache.log4j.Logger;
import ws_pkg.TIPOAPROBACIONTapi;
import ws_pkg.TIPOAPROBACIONTapi_Service;

/**
 *
 * @author Edo
 */
public class TipoAprobacionController {
    private final static Logger logger = Logger.getLogger(TipoAprobacionController.class);

    public List<TipoAprobacion> getTipoAprobaciones() {
        List<TipoAprobacion> listaTipoAprobaciones = null;
        ObjectMapper mapper = null;
        TIPOAPROBACIONTapi_Service service = null;
        TIPOAPROBACIONTapi port = null;
            try {
                mapper = new ObjectMapper();
                service = new TIPOAPROBACIONTapi_Service();
                port = service.getTIPOAPROBACIONTapiPort();
                String result = port.taSel();
                listaTipoAprobaciones = mapper.readValue(result, new TypeReference<List<TipoAprobacion>>() {
                });
            } catch (Exception e) {
                logger.error("Error grave obteniendo el listado de aprobaciones desde el WS.", e);
                throw new RuntimeException(e);
            } finally {
                service = null;
                port = null;
                mapper = null;
            }
        return listaTipoAprobaciones;
    }

    public boolean crearTipoAprobacion(TipoAprobacion ta) {
        List<TipoAprobacion> listaTipoAprobaciones = null;
        ObjectMapper mapper = null;
        TIPOAPROBACIONTapi_Service service = null;
        TIPOAPROBACIONTapi port = null;
        try {
            boolean resultado = false;
            mapper = new ObjectMapper();
            service = new TIPOAPROBACIONTapi_Service();
            port = service.getTIPOAPROBACIONTapiPort();
            
            String result = port.taIns(ta.getGlosa_tipo_aprobacion(),ta.getRut_creacion());
            
            listaTipoAprobaciones = mapper.readValue(result, new TypeReference<List<TipoAprobacion>>() {
                });
            if (listaTipoAprobaciones.get(0).getId_tipo_aprobacion() > 0) {
                resultado = true;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave creando el tipo de aprobación desde WS.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    }

    public boolean actualizarTipoAprobacion(TipoAprobacion ta) {
        TIPOAPROBACIONTapi_Service service = null;
        TIPOAPROBACIONTapi port = null;
        try {
            boolean resultado = false;
            service = new TIPOAPROBACIONTapi_Service();
            port = service.getTIPOAPROBACIONTapiPort();
            
            //parseo de int a string
            StringBuilder sbGetId_tipo_aprobacion = new StringBuilder();
            sbGetId_tipo_aprobacion.append(ta.getId_tipo_aprobacion());
            
            int result = port.taUpd(ta.getRut_creacion(), sbGetId_tipo_aprobacion.toString(), ta.getGlosa_tipo_aprobacion());

            if (result > 0) {
                resultado = true;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave editando el tipo de aprobación desde WS.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    }
    
    public boolean eliminarMenu(String ID) {
        TIPOAPROBACIONTapi_Service service = null;
        TIPOAPROBACIONTapi port = null;
        try {
            boolean resultado = false;
            service = new TIPOAPROBACIONTapi_Service();
            port = service.getTIPOAPROBACIONTapiPort();
            int result = port.taDel(ID);

            if (result > 0) {
                resultado = true;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave eliminando el tipo de aprobación.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    }

    public TipoAprobacion obtenerMenu(String ID) {
        TIPOAPROBACIONTapi_Service service = null;
        TIPOAPROBACIONTapi port = null;
        ObjectMapper mapper = null;
        try {
            mapper = new ObjectMapper();
            service = new TIPOAPROBACIONTapi_Service();
            port = service.getTIPOAPROBACIONTapiPort();
            String result = port.taSelId(ID);
            List<TipoAprobacion> ta = mapper.readValue(result, new TypeReference<List<TipoAprobacion>>() {
                });
            return ta.get(0);
        } catch (Exception e) {
            logger.error("Error grave obteniendo el tipo de aprobación.", e);
            throw new RuntimeException(e);
        } finally {
            mapper = null;
            service = null;
            port = null;
        }
    }
}
