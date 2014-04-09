package cl.bluex.generadoretiqueta.bean.response;

import cl.bluex.generadoretiqueta.bean.Etiqueta;

/**
 * @author Edgardo Herrera
 * 
 */
public class ResponseEtiqueta {
	private Etiqueta etiqueta;

	/**
	 * Crea instancia de {@link ResponseEtiqueta}.
	 * 
	 */
	public ResponseEtiqueta() {
		super();
	}

	/**
	 * Crea instancia de {@link ResponseEtiqueta}.
	 * 
	 * @param etiqueta
	 */
	public ResponseEtiqueta(final Etiqueta etiqueta) {
		super();
		this.etiqueta = etiqueta;
	}

	/**
	 * @return the etiqueta
	 */
	public Etiqueta getEtiqueta() {
		return etiqueta;
	}

	/**
	 * @param etiqueta the etiqueta to set
	 */
	public void setEtiqueta(final Etiqueta etiqueta) {
		this.etiqueta = etiqueta;
	}

}
