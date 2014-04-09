package cl.bluex.ws.common.head;

import java.io.Serializable;

/**
 * Clase de cabecera.
 * 
 * @author Edgardo Herrera
 *
 */
public class Cabecera implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String token;
 
	public Cabecera() {
		super();
	}

	public String getToken() {
		return token;
	}

	public void setToken(final String token) {
		this.token = token;
	}
	
	

}
