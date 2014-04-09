package cl.bluex.monitor.bean.response;

import java.util.List;

import cl.bluex.monitor.bean.DatosAgrupacionMonitor;
import cl.bluex.monitor.to.DatosAgrupacionMonitorTO;

/**
 * @author Edgardo Herrera
 *
 */
public class ResponseObtieneInfoMonitor {

    private List<DatosAgrupacionMonitor> datosAgrupacionMonitores;
    
    /**
     * Constructor.
     */
    public ResponseObtieneInfoMonitor() {
	super();
    }
    
    /**
     * Constructor.
     * 
     * @param {{@link DatosAgrupacionMonitorTO}
     */
    public ResponseObtieneInfoMonitor(final List<DatosAgrupacionMonitor> datosAgrupacionMonitores) {
	this.datosAgrupacionMonitores = datosAgrupacionMonitores;
    }

    /**
     * @return the datosAgrupacionMonitores
     */
    public List<DatosAgrupacionMonitor> getDatosAgrupacionMonitores() {
        return datosAgrupacionMonitores;
    }

    /**
     * @param datosAgrupacionMonitores the datosAgrupacionMonitores to set
     */
    public void setDatosAgrupacionMonitores(
    	final List<DatosAgrupacionMonitor> datosAgrupacionMonitores) {
        this.datosAgrupacionMonitores = datosAgrupacionMonitores;
    }
    
}
