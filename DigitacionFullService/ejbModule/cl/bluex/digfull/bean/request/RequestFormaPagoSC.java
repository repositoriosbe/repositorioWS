package cl.bluex.digfull.bean.request;

import cl.bluex.digfull.bean.ServicioComplementarioPago;

/**
 * request inserta forma de pago servicios complementarios.
 * 
 * @author Edgardo Herrera
 *
 */
public class RequestFormaPagoSC {
    private ServicioComplementarioPago servicioComplementarioPago;
    
    /**
     * Constructor.
     */
    public RequestFormaPagoSC() {
	super();
    }

    /**
     * @return the servicioComplementarioPago
     */
    public ServicioComplementarioPago getServicioComplementarioPago() {
        return servicioComplementarioPago;
    }

    /**
     * @param servicioComplementarioPago the servicioComplementarioPago to set
     */
    public void setServicioComplementarioPago(
	    final ServicioComplementarioPago servicioComplementarioPago) {
        this.servicioComplementarioPago = servicioComplementarioPago;
    }
    
}
