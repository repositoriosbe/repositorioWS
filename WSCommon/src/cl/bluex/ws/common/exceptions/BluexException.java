package cl.bluex.ws.common.exceptions;

import java.sql.SQLException;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.ws.WebFault;

import org.apache.ibatis.exceptions.PersistenceException;

/**
 * BluexException. Exception Base para Nueva Web
 * 
 * @author Sebastian E. Navia Iturriaga
 */
@WebFault(
	name = "BluexException",
	targetNamespace = "http://ws.bluex.cl/")
@XmlAccessorType(XmlAccessType.FIELD)
public class BluexException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2201034626777546482L;

	private FaultCode faultCode;

	/**
	 * crea instancia de BluexException
	 *
	 * @param message
	 * @param faultCode
	 */
	public BluexException(final String message, final FaultCode faultCode) {
		super(message);
		this.faultCode = faultCode;
	}

	/**
	 * crea instancia de BluexException
	 *
	 * @param message
	 * @param faultCode
	 * @param mes
	 */
	public BluexException(final String message, final FaultCode faultCode, final String mes) {
		super(message);
		this.faultCode = faultCode;
	}

	/**
	 * crea instancia de BluexException
	 *
	 * @param message
	 * @param faultCode
	 * @param cause
	 */
	public BluexException(final String message, final FaultCode faultCode, final Throwable cause) {
		super(message, cause);
		this.faultCode = faultCode;
	}

	public BluexException(final FaultCode code) {
		super();
		this.faultCode = code;
	}

	/**
	 * Instantiates a new bluex exception.
	 */
	public BluexException() {
		super();
		getFaultCode().setCodigo((String) null);
//		getFaultCode().setMensaje((String) null);
	}

	/**
	 * Instantiates a new bluex exception.
	 * 
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public BluexException(final String message, final Throwable cause) {
		super(message, cause);
		getFaultCode().setCodigo((String) null);
//		getFaultCode().setMensaje(message);
	}

	/**
	 * Instantiates a new bluex exception.
	 * 
	 * @param mensaje
	 *            the mensaje
	 */
	public BluexException(final String mensaje) {
		super(mensaje);
		getFaultCode().setCodigo((String) null);
//		getFaultCode().setMensaje(mensaje);
	}

	/**
	 * Instantiates a new bluex exception.
	 * 
	 * @param cause
	 *            the cause
	 */
	public BluexException(final Throwable cause) {
		super(cause);
		getFaultCode().setCodigo((String) null);
//		getFaultCode().setMensaje((String) null);
	}

	/**
	 * Instantiates a new bluex exception.
	 * 
	 * @param exception
	 *            the exception
	 */
	public BluexException(final PersistenceException exception) {
		super(exception.getMessage(), exception);
		if (exception.getCause() instanceof SQLException) {
			final SQLException sqlException = (SQLException) exception.getCause();
			getFaultCode().setCodigo("" + sqlException.getErrorCode());
		} else {
			getFaultCode().setCodigo("");
		}
	}

	/**
	 * Instantiates a new bluex exception.
	 * 
	 * @param codigo
	 *            the codigo
	 * @param mensaje
	 *            the mensaje
	 */
	public BluexException(final String codigo, final String mensaje) {
		super(mensaje);
		getFaultCode().setCodigo(codigo);
//		getFaultCode().setMensaje(mensaje);
	}

	/**
	 * Instantiates a new bluex exception.
	 * 
	 * @param mensaje
	 *            the mensaje
	 * @param codigo
	 *            the codigo
	 * @param cause
	 *            the cause
	 */
	public BluexException(final String mensaje, final String codigo, final Throwable cause) {
		super(mensaje, cause);
		getFaultCode().setCodigo(codigo);
//		getFaultCode().setMensaje(mensaje);
	}

	/**
	 * Gets the codigo.
	 * 
	 * @return the codigo
	 */
	public String getCodigo() {
		return getFaultCode().getCodigo();
	}

	public FaultCode getFaultCode() {
		if (faultCode == null) {
			faultCode = new FaultCode();
		}
		return this.faultCode;
	}

}
