package cl.bluex.ws.common.exceptions;

/**
 * ValidationException. Exception lanzada cuando una validacion no se cumple
 * 
 * @author Sebastian E. Navia Iturriaga
 */
public class ValidationException extends Exception {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -2201034626777546482L;

    /** The codigo. */
    private final String codigo;

    /**
     * Instantiates a new validation exception.
     */
    public ValidationException() {
	super();
	this.codigo = null;
    }

    /**
     * Instantiates a new validation exception.
     * 
     * @param codigo
     *            the codigo
     * @param mensaje
     *            the mensaje
     */
    public ValidationException(String codigo, String mensaje) {
	super(mensaje);
	this.codigo = codigo;
    }

    /**
     * Instantiates a new validation exception.
     * 
     * @param codigo
     *            the codigo
     * @param mensaje
     *            the mensaje
     * @param cause
     *            the cause
     */
    public ValidationException(String codigo, String mensaje, Throwable cause) {
	super(mensaje, cause);
	this.codigo = codigo;
    }

    /**
     * Gets the codigo.
     * 
     * @return the codigo
     */
    public String getCodigo() {
	return this.codigo;
    }
}
