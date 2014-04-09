package cl.bluex.monitor;

import java.util.List;

import cl.bluex.monitor.to.DatosAgrupacionMonitorTO;
import cl.bluex.ws.common.exceptions.BluexException;



/**
 * Interfaz metodos monitor.
 * 
 * @author Edgardo Herrera
 *
 */
public interface MonitorDao {

    /**
     * Metodo para obtener la informacion monitor.
     * 
     * @param codigoEmpresa el codigo de empresa
     * @param codigoSorter el codigo del sorter
     * 
     * @return lista de {@link DatosAgrupacionMonitorTO}
     */
    List<DatosAgrupacionMonitorTO> obtieneInformacionMonitor(long codigoEmpresa, 
	    final long codigoSorter) throws BluexException;

}
