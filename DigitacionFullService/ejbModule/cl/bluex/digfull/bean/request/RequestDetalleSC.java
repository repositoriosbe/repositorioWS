package cl.bluex.digfull.bean.request;

import cl.bluex.digfull.bean.ServicioComplementarioDetalle;

/**
 * Request metodo inserta detalle Servicio complementario.
 * @author Edgardo Herrera
 *
 */
public class RequestDetalleSC {
	private ServicioComplementarioDetalle servicioComplementarioDetalle;
    
    /**
     * 
     */
    public RequestDetalleSC() {
	super();
    }

    public ServicioComplementarioDetalle getServicioComplementarioDetalle() {
        return servicioComplementarioDetalle;
    }

    public void setServicioComplementarioDetalle(
    	ServicioComplementarioDetalle servicioComplementarioDetalle) {
        this.servicioComplementarioDetalle = servicioComplementarioDetalle;
    }

}
