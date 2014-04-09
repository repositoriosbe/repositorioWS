package cl.bluex.seguridad.bean.request;

/**
 * @author eherrera
 *
 */
public class RequestObtieneRolUsuario {
	private int codigoSistema;
	private int codigoApp;
	
	/**
	 * crea instancia de RequestObtieneRolUsuario
	 *
	 */
	public RequestObtieneRolUsuario() {
		super();
	}

	/**
	 * @return the codigoSistema
	 */
	public int getCodigoSistema() {
		return codigoSistema;
	}

	/**
	 * @param codigoSistema the codigoSistema to set
	 */
	public void setCodigoSistema(final int codigoSistema) {
		this.codigoSistema = codigoSistema;
	}

	/**
	 * @return the codigoApp
	 */
	public int getCodigoApp() {
		return codigoApp;
	}

	/**
	 * @param codigoApp the codigoApp to set
	 */
	public void setCodigoApp(final int codigoApp) {
		this.codigoApp = codigoApp;
	}
	
}
