package cl.bluex.monitor.mapper;

import java.util.Map;

import cl.bluex.ws.common.exceptions.BluexException;


/**
 * interfaz de mapeo.
 * 
 * @author Edgardo Herrera
 *
 */
public interface MonitorMapper {

    /**
     * Mapper obtieneInformacionMonitor.
     * 
     * @param params parametros de entrada y salida
     * @throws BluexException
     */
    void obtieneInformacionMonitor(Map<String, Object> params) throws BluexException;
    

}
