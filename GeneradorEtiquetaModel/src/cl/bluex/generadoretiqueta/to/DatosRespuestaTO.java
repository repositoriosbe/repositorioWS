/**
 * 
 */
package cl.bluex.generadoretiqueta.to;

import java.io.Serializable;

/**
 * @author rmoscoso.
 *
 */
public class DatosRespuestaTO implements Serializable {

	private static final long serialVersionUID = 2911945859318375437L;
	
	private int codigo;
	private String mensaje;

	/**
	 * Constructor de la clase
	 */
	public DatosRespuestaTO() {
		super();
	}

	/**
	 * @param codigo
	 * @param mensaje
	 */
	public DatosRespuestaTO(int codigo, String mensaje) {
		this.codigo = codigo;
		this.mensaje = mensaje;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(final int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * @param mensaje the mensaje to set
	 */
	public void setMensaje(final String mensaje) {
		this.mensaje = mensaje;
	}

	
	
	
}
