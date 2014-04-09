package cl.bluex.digexpress.bean.response;

import cl.bluex.digexpress.bean.CabeceraAgrupacion;

/**
 * Almacena datos de respuesta para cabecera de la agrupacion.
 * 
 * @author Edgardo Herrera
 * 
 */
public class ResponseCabeceraAgrupacion {
	private CabeceraAgrupacion cabeceraAgrupacion;

	/**
	 * crea instancia de ResponseCabeceraAgrupacion
	 *
	 */
	public ResponseCabeceraAgrupacion() {
		super();
	}

	/**
	 * crea instancia de ResponseCabeceraAgrupacion
	 *
	 * @param cabeceraAgrupacion
	 */
	public ResponseCabeceraAgrupacion(
			final CabeceraAgrupacion cabeceraAgrupacion) {
		this.cabeceraAgrupacion = cabeceraAgrupacion;
	}

	/**
	 * @return the cabeceraAgrupacion
	 */
	public CabeceraAgrupacion getCabeceraAgrupacion() {
		return cabeceraAgrupacion;
	}

	/**
	 * @param cabeceraAgrupacion the cabeceraAgrupacion to set
	 */
	public void setCabeceraAgrupacion(final CabeceraAgrupacion cabeceraAgrupacion) {
		this.cabeceraAgrupacion = cabeceraAgrupacion;
	}

	

}
