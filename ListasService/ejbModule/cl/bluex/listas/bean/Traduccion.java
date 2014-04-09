package cl.bluex.listas.bean;

import cl.bluex.digmodel.to.TraduccionTO;

/**
 * Almacena datos de traduccion.
 * 
 * @author Edgardo Herrera
 *
 */
public class Traduccion {
    private String codigoOrigen;
    private String descripcionOrigen;
    private String codigoTraducido;
    private String descripcionTraducido;
    
    public Traduccion() {
	super();
    }
    
    public Traduccion(final TraduccionTO traduccionTO) {
	if (traduccionTO != null) {
	    this.codigoOrigen = traduccionTO.getCodigoOrigen();
	    this.descripcionOrigen = traduccionTO.getDescripcionOrigen();
	    this.codigoTraducido = traduccionTO.getCodigoTraducido();
	    this.descripcionTraducido = traduccionTO.getDescripcionTraducido();
	}
    }

    public String getCodigoOrigen() {
        return codigoOrigen;
    }

    public void setCodigoOrigen(final String codigoOrigen) {
        this.codigoOrigen = codigoOrigen;
    }

    public String getDescripcionOrigen() {
        return descripcionOrigen;
    }

    public void setDescripcionOrigen(final String descripcionOrigen) {
        this.descripcionOrigen = descripcionOrigen;
    }

    public String getCodigoTraducido() {
        return codigoTraducido;
    }

    public void setCodigoTraducido(final String codigoTraducido) {
        this.codigoTraducido = codigoTraducido;
    }

    public String getDescripcionTraducido() {
        return descripcionTraducido;
    }

    public void setDescripcionTraducido(final String descripcionTraducido) {
        this.descripcionTraducido = descripcionTraducido;
    }
    
    
}
