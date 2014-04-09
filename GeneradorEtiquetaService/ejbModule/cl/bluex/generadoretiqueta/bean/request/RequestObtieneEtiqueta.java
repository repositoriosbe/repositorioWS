package cl.bluex.generadoretiqueta.bean.request;

import cl.bluex.generadoretiqueta.bean.DatosImpresion;

/**
 * @author Edgardo Herrera
 * 
 */
public class RequestObtieneEtiqueta {
	private DatosImpresion datosImpresion;

	/**
	 * Crea instancia de {@link RequestObtieneEtiqueta}.
	 * 
	 */
	public RequestObtieneEtiqueta() {
		super();
	}

	/**
	 * Crea instancia de {@link RequestObtieneEtiqueta}.
	 * 
	 * @param datosImpresion
	 */
	public RequestObtieneEtiqueta(final DatosImpresion datosImpresion) {
		this.datosImpresion = datosImpresion;
	}

	/**
	 * @return the datosImpresion
	 */
	public DatosImpresion getDatosImpresion() {
		return datosImpresion;
	}

	/**
	 * @param datosImpresion
	 *            the datosImpresion to set
	 */
	public void setDatosImpresion(final DatosImpresion datosImpresion) {
		this.datosImpresion = datosImpresion;
	}

}
