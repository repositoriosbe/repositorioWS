package cl.bluex.digexpress.bean.response;

import cl.bluex.digexpress.bean.Agrupacion;

/**
 * Almacena datos de respuesta de la agrupacion.
 * 
 * @author Edgardo Herrera
 * 
 */
public class ResponseAgrupacion {
	private Agrupacion agrupacion;

	/**
	 * crea instancia de ResponseAgrupacion
	 *
	 */
	public ResponseAgrupacion() {
		super();
	}

	/**
	 * crea instancia de ResponseAgrupacion
	 *
	 * @param agrupacion
	 */
	public ResponseAgrupacion(final Agrupacion agrupacion) {
		this.agrupacion = agrupacion;
	}

	/**
	 * @return the agrupacion
	 */
	public Agrupacion getAgrupacion() {
		return agrupacion;
	}

	/**
	 * @param agrupacion the agrupacion to set
	 */
	public void setAgrupacion(final Agrupacion agrupacion) {
		this.agrupacion = agrupacion;
	}

}
