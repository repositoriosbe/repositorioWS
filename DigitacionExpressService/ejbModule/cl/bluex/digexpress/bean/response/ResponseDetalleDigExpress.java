package cl.bluex.digexpress.bean.response;

import cl.bluex.digexpress.bean.DetalleDigitacionExpress;

/**
 * Almacena datos de respuesta para detalle digitacion express.
 * 
 * @author Edgardo Herrera
 *
 */
public class ResponseDetalleDigExpress {
    private DetalleDigitacionExpress detalle;
    
    public ResponseDetalleDigExpress() {
	super();
    }
    
    public ResponseDetalleDigExpress(final DetalleDigitacionExpress detalle) {
	super();
	this.detalle = detalle;
    }

    public DetalleDigitacionExpress getDetalle() {
        return detalle;
    }

    public void setDetalle(final DetalleDigitacionExpress detalle) {
        this.detalle = detalle;
    }
    
}
