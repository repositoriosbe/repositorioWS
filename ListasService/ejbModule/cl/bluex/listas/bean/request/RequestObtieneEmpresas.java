/**
 * 
 */
package cl.bluex.listas.bean.request;

/**
 * @author eherrera
 *
 */
public class RequestObtieneEmpresas {
	private long codigoUsuario;
	private long codigoAplicacion;
	private long codigoSistema;
	
	/**
	 * crea instancia de RequestObtieneEmpresas
	 *
	 */
	public RequestObtieneEmpresas() {
		super();
	}

	/**
	 * @return the codigoUsuario
	 */
	public long getCodigoUsuario() {
		return codigoUsuario;
	}

	/**
	 * @param codigoUsuario the codigoUsuario to set
	 */
	public void setCodigoUsuario(final long codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	/**
	 * @return the codigoAplicacion
	 */
	public long getCodigoAplicacion() {
		return codigoAplicacion;
	}

	/**
	 * @param codigoAplicacion the codigoAplicacion to set
	 */
	public void setCodigoAplicacion(final long codigoAplicacion) {
		this.codigoAplicacion = codigoAplicacion;
	}

	/**
	 * @return the codigoSistema
	 */
	public long getCodigoSistema() {
		return codigoSistema;
	}

	/**
	 * @param codigoSistema the codigoSistema to set
	 */
	public void setCodigoSistema(final long codigoSistema) {
		this.codigoSistema = codigoSistema;
	}
	
}
