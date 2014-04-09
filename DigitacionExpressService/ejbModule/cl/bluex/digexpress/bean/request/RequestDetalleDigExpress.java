package cl.bluex.digexpress.bean.request;

import cl.bluex.digexpress.bean.DetalleDigitacionExpress;

/**
 * Almacena datos de entrada de detalle digitacion express.
 * 
 * @author Edgardo Herrera
 *
 */
public class RequestDetalleDigExpress {
    private DetalleDigitacionExpress detalleDigitacionExpress;
    
    /**
     * crea instancia {@link RequestDetalleDigExpress}.
     */
    public RequestDetalleDigExpress() {
	super();
    }

    public DetalleDigitacionExpress getDetalleDigitacionExpress() {
        return detalleDigitacionExpress;
    }

    public void setDetalleDigitacionExpress(
    	final DetalleDigitacionExpress detalleDigitacionExpress) {
        this.detalleDigitacionExpress = detalleDigitacionExpress;
    }
    
}
