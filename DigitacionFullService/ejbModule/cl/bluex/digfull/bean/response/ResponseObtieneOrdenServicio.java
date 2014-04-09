package cl.bluex.digfull.bean.response;

import cl.bluex.digfull.bean.OrdenServicio;

/**
 * @author Edgardo Herrera
 * 
 */
public class ResponseObtieneOrdenServicio {
	private OrdenServicio ordenServicio;

	/**
	 * Crea instancia de {@link ResponseObtieneOrdenServicio}.
	 * 
	 */
	public ResponseObtieneOrdenServicio() {
		super();
	}

	/**
	 * Crea instancia de {@link ResponseObtieneOrdenServicio}.
	 * 
	 * @param ordenServicio
	 */
	public ResponseObtieneOrdenServicio(final OrdenServicio ordenServicio) {
		this.ordenServicio = ordenServicio;
	}

	/**
	 * @return the ordenServicio
	 */
	public OrdenServicio getOrdenServicio() {
		return ordenServicio;
	}

	/**
	 * @param ordenServicio
	 *            the ordenServicio to set
	 */
	public void setOrdenServicio(final OrdenServicio ordenServicio) {
		this.ordenServicio = ordenServicio;
	}
}
