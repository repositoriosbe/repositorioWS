/**
 * 
 */
package cl.bluex.seguridad.bean.request;

/**
 * @author eherrera
 *
 */
public class RequestObtieneOpcionesMenu {
	private long codigoSistema;
	
	/**
	 * crea instancia de RequestObtieneOpcionesMenu
	 *
	 */
	public RequestObtieneOpcionesMenu() {
		super();
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
