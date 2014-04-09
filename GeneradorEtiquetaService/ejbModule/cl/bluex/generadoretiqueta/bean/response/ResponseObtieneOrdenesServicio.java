package cl.bluex.generadoretiqueta.bean.response;

import java.util.List;

import cl.bluex.generadoretiqueta.bean.OrdenServicio;

/**
 * @author eherrera
 *
 */
public class ResponseObtieneOrdenesServicio {
	List<OrdenServicio> ordenesServicio;
	
	/**
	 * crea instancia de ResponseObtieneOrdenesServicio
	 *
	 */
	public ResponseObtieneOrdenesServicio() {
		super();
	}

	/**
	 * crea instancia de ResponseObtieneOrdenesServicio
	 *
	 * @param osers
	 */
	public ResponseObtieneOrdenesServicio(final List<OrdenServicio> ordenesServicio) {
		super();
		this.ordenesServicio = ordenesServicio;
	}

	/**
	 * @return the ordenesServicio
	 */
	public List<OrdenServicio> getOrdenesServicio() {
		return ordenesServicio;
	}

	/**
	 * @param ordenesServicio the ordenesServicio to set
	 */
	public void setOrdenesServicio(final List<OrdenServicio> ordenesServicio) {
		this.ordenesServicio = ordenesServicio;
	}
	
}
