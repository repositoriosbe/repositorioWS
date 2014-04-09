package cl.bluex.verificacion.bean.response;

import java.util.List;

import cl.bluex.verificacion.bean.Oser;

/**
 * @author eherrera
 *
 */
public class ResponseOser {
	private List<Oser> osers;
	
	/**
	 * crea instancia de ResponseOser
	 *
	 */
	public ResponseOser() {
		super();
	}

	/**
	 * crea instancia de ResponseOser
	 *
	 * @param osers
	 */
	public ResponseOser(final List<Oser> osers) {
		super();
		this.osers = osers;
	}

	/**
	 * @return the osers
	 */
	public List<Oser> getOsers() {
		return osers;
	}

	/**
	 * @param osers the osers to set
	 */
	public void setOsers(final List<Oser> osers) {
		this.osers = osers;
	}

}
