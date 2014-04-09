package cl.bluex.digfull.bean.request;

import cl.bluex.digfull.bean.ServicioComplementario;

/**
 * Request inserta servicio complementario.
 * 
 * @author Edgardo Herrera
 *
 */
public class RequestInsertaServicioComplementario {
    private ServicioComplementario servicioComplementario;
    
    /**
     * Constructor.
     */
    public RequestInsertaServicioComplementario() {
	super();
    }

    public RequestInsertaServicioComplementario(
	    final ServicioComplementario servicioComplementario) {
	this.servicioComplementario = servicioComplementario;
    }

    /**
     * @return the servicioComplementario
     */
    public ServicioComplementario getServicioComplementario() {
        return servicioComplementario;
    }

    /**
     * @param servicioComplementario the servicioComplementario to set
     */
    public void setServicioComplementario(
    	final ServicioComplementario servicioComplementario) {
        this.servicioComplementario = servicioComplementario;
    }
    
    
    
    
}
