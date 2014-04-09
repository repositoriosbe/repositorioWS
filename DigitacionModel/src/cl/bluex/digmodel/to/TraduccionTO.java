package cl.bluex.digmodel.to;

import java.io.Serializable;

/**
 * TO para traducción.
 * 
 * @author Edgardo Herrera
 *
 */
public class TraduccionTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 8314323480584317072L;
    private String codigoOrigen;
    private String descripcionOrigen;
    private String codigoTraducido;
    private String descripcionTraducido;

    /**
     * Crea instancia {@link TraduccionTO}.
     */
    public TraduccionTO() {
	super();
    }

    /**
     * @return the codigoOrigen
     */
    public String getCodigoOrigen() {
        return codigoOrigen;
    }

    /**
     * @param codigoOrigen the codigoOrigen to set
     */
    public void setCodigoOrigen(final String codigoOrigen) {
        this.codigoOrigen = codigoOrigen;
    }

    /**
     * @return the descripcionOrigen
     */
    public String getDescripcionOrigen() {
        return descripcionOrigen;
    }

    /**
     * @param descripcionOrigen the descripcionOrigen to set
     */
    public void setDescripcionOrigen(final String descripcionOrigen) {
        this.descripcionOrigen = descripcionOrigen;
    }

    /**
     * @return the codigoTraducido
     */
    public String getCodigoTraducido() {
        return codigoTraducido;
    }

    /**
     * @param codigoTraducido the codigoTraducido to set
     */
    public void setCodigoTraducido(final String codigoTraducido) {
        this.codigoTraducido = codigoTraducido;
    }

    /**
     * @return the descripcionTraducido
     */
    public String getDescripcionTraducido() {
        return descripcionTraducido;
    }

    /**
     * @param descripcionTraducido the descripcionTraducido to set
     */
    public void setDescripcionTraducido(final String descripcionTraducido) {
        this.descripcionTraducido = descripcionTraducido;
    }

}
