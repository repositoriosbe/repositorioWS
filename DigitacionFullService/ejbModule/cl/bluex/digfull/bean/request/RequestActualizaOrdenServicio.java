package cl.bluex.digfull.bean.request;

import cl.bluex.digfull.bean.OrdenServicio;

/**
 * request de orden de servicio.
 * 
 * @author Edgardo Herrera
 *
 */
public class RequestActualizaOrdenServicio {
    private OrdenServicio ordenServicio;
    
    /**
     * Constructor.
     */
    public RequestActualizaOrdenServicio() {
	super();
    }

    /**
     * @return the ordenServicio
     */
    public OrdenServicio getOrdenServicio() {
        return ordenServicio;
    }

    /**
     * @param ordenServicio the ordenServicio to set
     */
    public void setOrdenServicio(final OrdenServicio ordenServicio) {
        this.ordenServicio = ordenServicio;
    }
    
    
}
