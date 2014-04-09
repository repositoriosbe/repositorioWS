package cl.bluex.verificacion.bean.request;

import cl.bluex.verificacion.bean.Oser;

/**
 * @author eherrera
 *
 */
public class RequestOser {
	private Oser oser;
	
	/**
	 * crea instancia de RequestOser
	 *
	 */
	public RequestOser() {
		super();
	}

	/**
	 * @return the oser
	 */
	public Oser getOser() {
		return oser;
	}

	/**
	 * @param oser the oser to set
	 */
	public void setOser(final Oser oser) {
		this.oser = oser;
	}
	
}
