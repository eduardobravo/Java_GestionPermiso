/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.portafolio.controller;

import cl.duoc.portafolio.entities.Menu;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.apache.log4j.Logger;
import ws_pkg.MENUTapi;
import ws_pkg.MENUTapi_Service;

/**
 *
 * @author Edo
 */
public class MenuController {
    private final static Logger logger = Logger.getLogger(MenuController.class);

    public List<Menu> getMenus() {
        List<Menu> listaMenues = null;
        MENUTapi_Service service = null;
        MENUTapi port = null;
        ObjectMapper mapper = null;
            try {
                mapper = new ObjectMapper();
                service = new MENUTapi_Service();
                port = service.getMENUTapiPort();
                String result = port.mSel();
                listaMenues = mapper.readValue(result, new TypeReference<List<Menu>>() {
                });
            } catch (Exception e) {
                logger.error("Error grave obteniendo los menú desde el WS.", e);
                throw new RuntimeException(e);
            } finally {
                service = null;
                port = null;
                mapper = null;
            }
        return listaMenues;
    }

    public boolean crearMenu(Menu m) {
        List<Menu> listaMenues = null;
        ObjectMapper mapper = null;
        MENUTapi_Service service = null;
        MENUTapi port = null;
        try {
            boolean resultado = false;
            mapper = new ObjectMapper();
            service = new MENUTapi_Service();
            port = service.getMENUTapiPort();
            
            String result = port.mIns(m.getRut_creacion(), m.getGlosa_menu(),m.getPagina());
            listaMenues = mapper.readValue(result, new TypeReference<List<Menu>>() {
                });
            if (listaMenues.get(0).getId_menu() > 0) {
                resultado = true;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave creando el menú desde WS.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    }

    public boolean actualizarMenu(Menu m) {
        MENUTapi_Service service = null;
        MENUTapi port = null;
        try {
            boolean resultado = false;
            service = new MENUTapi_Service();
            port = service.getMENUTapiPort();
            
            //parseo de int a string
            StringBuilder sbGetId_menu = new StringBuilder();
            sbGetId_menu.append(m.getId_menu());
            
            int result = port.mUpd(m.getRut_actualizacion(),sbGetId_menu.toString(),m.getGlosa_menu(),m.getPagina());

            if (result > 0) {
                resultado = true;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave editando el menú desde WS.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    }
    
    public boolean eliminarMenu(String ID) {
        MENUTapi_Service service = null;
        MENUTapi port = null;
        try {
            boolean resultado = false;
            service = new MENUTapi_Service();
            port = service.getMENUTapiPort();
            int result = port.mDel(ID);

            if (result > 0) {
                resultado = true;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave eliminando el menú.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    }

    public Menu obtenerMenu(String ID) {
        MENUTapi_Service service = null;
        MENUTapi port = null;
        ObjectMapper mapper = null;
        try {
            mapper = new ObjectMapper();
            service = new MENUTapi_Service();
            port = service.getMENUTapiPort();
            String result = port.mSelId(ID);
            List<Menu> me = mapper.readValue(result, new TypeReference<List<Menu>>() {
                });
            return me.get(0);
        } catch (Exception e) {
            logger.error("Error grave obteniendo el menú.", e);
            throw new RuntimeException(e);
        } finally {
            mapper = null;
            service = null;
            port = null;
        }
    }
}
