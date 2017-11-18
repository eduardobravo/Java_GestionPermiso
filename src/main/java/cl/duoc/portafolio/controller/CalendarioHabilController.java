/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.portafolio.controller;

import cl.duoc.portafolio.entities.CalendarioHabil;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.apache.log4j.Logger;
import ws_pkg.CALENDARIOHABIL_Service;
import ws_pkg.CALENDARIOHABIL;

/**
 *
 * @author Edo
 */
public class CalendarioHabilController {
    private final static Logger logger = Logger.getLogger(CalendarioHabilController.class);

    public List<CalendarioHabil> getCalendarioHabiles() {
        List<CalendarioHabil> listaCalendarioHabiles = null;
        CALENDARIOHABIL_Service service = null;
        CALENDARIOHABIL port = null;
        ObjectMapper mapper = null;
            try {
                mapper = new ObjectMapper();
                service = new CALENDARIOHABIL_Service();
                port = service.getCALENDARIOHABILPort();
                String result = port.chSel();
                listaCalendarioHabiles = mapper.readValue(result, new TypeReference<List<CalendarioHabil>>() {
                });
            } catch (Exception e) {
                logger.error("Error grave obteniendo las fechas desde el WS.", e);
                throw new RuntimeException(e);
            } finally {
                service = null;
                port = null;
                mapper = null;
            }
        return listaCalendarioHabiles;
    }

    public boolean crearCalendarioHabil(CalendarioHabil chb) {
        CALENDARIOHABIL_Service service = null;
        CALENDARIOHABIL port = null;
        try {
            boolean resultado = false;
            service = new ws_pkg.CALENDARIOHABIL_Service();
            port = service.getCALENDARIOHABILPort();
            
            //parseos de int a string
            StringBuilder sbGetHabil = new StringBuilder();
            sbGetHabil.append(chb.getHabil());
            StringBuilder sbGetMes = new StringBuilder();
            sbGetMes.append(chb.getMes());
            StringBuilder sbGetAnio = new StringBuilder();
            sbGetAnio.append(chb.getAnio());
            StringBuilder sbGetDia = new StringBuilder();
            sbGetDia.append(chb.getDia());
            
            String result = port.chIns(sbGetHabil.toString(), sbGetMes.toString(), chb.getRut_creacion(),sbGetAnio.toString(), sbGetDia.toString());

            if (Integer.parseInt(result) > 0) {
                resultado = true;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave creando la fecha desde WS.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    }

    public boolean actualizarCalendarioHabil(CalendarioHabil chb) {
        CALENDARIOHABIL_Service service = null;
        CALENDARIOHABIL port = null;
        try {
            boolean resultado = false;
            service = new ws_pkg.CALENDARIOHABIL_Service();
            port = service.getCALENDARIOHABILPort();
            
            //parseos de int a string
            StringBuilder sbGetHabil = new StringBuilder();
            sbGetHabil.append(chb.getHabil());
            StringBuilder sbGetMes = new StringBuilder();
            sbGetMes.append(chb.getMes());
            StringBuilder sbGetAnio = new StringBuilder();
            sbGetAnio.append(chb.getAnio());
            StringBuilder sbGetDia = new StringBuilder();
            sbGetDia.append(chb.getDia());
            StringBuilder sbGetId_calendario = new StringBuilder();
            sbGetId_calendario.append(chb.getId_calendario());
            
            int result = port.chUpd(chb.getRut_actualizacion(), sbGetHabil.toString(), sbGetMes.toString(), sbGetId_calendario.toString(), sbGetAnio.toString(), sbGetDia.toString());

            if (result > 0) {
                resultado = true;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave editando fecha desde WS.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    }
    
    public boolean eliminarCalendarioHabil(String ID) {
        CALENDARIOHABIL_Service service = null;
        CALENDARIOHABIL port = null;
        try {
            boolean resultado = false;
            service = new ws_pkg.CALENDARIOHABIL_Service();
            port = service.getCALENDARIOHABILPort();
            int result = port.chDel(ID);

            if (result > 0) {
                resultado = true;
            }

            return resultado;
        } catch (Exception e) {
            logger.error("Error grave eliminando fecha.", e);
            throw new RuntimeException(e);
        } finally {
            service = null;
            port = null;
        }
    }

    public CalendarioHabil obtenerCalendarioHabil(String ID) {
        CALENDARIOHABIL_Service service = null;
        CALENDARIOHABIL port = null;
        ObjectMapper mapper = null;
        try {
            mapper = new ObjectMapper();
            service = new ws_pkg.CALENDARIOHABIL_Service();
            port = service.getCALENDARIOHABILPort();
            String result = port.chSelId(ID);
            List<CalendarioHabil> caha = mapper.readValue(result, new TypeReference<List<CalendarioHabil>>() {
                });
            return caha.get(0);
        } catch (Exception e) {
            logger.error("Error grave obteniendo fecha.", e);
            throw new RuntimeException(e);
        } finally {
            mapper = null;
            service = null;
            port = null;
        }
    }
}
