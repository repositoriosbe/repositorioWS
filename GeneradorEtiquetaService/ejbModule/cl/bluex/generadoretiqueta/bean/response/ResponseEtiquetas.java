package cl.bluex.generadoretiqueta.bean.response;

import java.util.List;

import cl.bluex.generadoretiqueta.bean.Etiqueta;

/**
 * @author Edgardo Herrera
 * 
 */
public class ResponseEtiquetas {
	private List<Etiqueta> etiquetas;

	/**
	 * Crea instancia de {@link ResponseEtiquetas}.
	 * 
	 */
	public ResponseEtiquetas() {
		super();
	}

	/**
	 * Crea instancia de {@link ResponseEtiquetas}.
	 * 
	 * @param etiqueta
	 */
	public ResponseEtiquetas(final List<Etiqueta> etiquetas) {
		super();
		this.etiquetas = etiquetas;
	}

	/**
	 * @return the etiquetas
	 */
	public List<Etiqueta> getEtiquetas() {
		return etiquetas;
	}

	/**
	 * @param etiquetas the etiquetas to set
	 */
	public void setEtiquetas(final List<Etiqueta> etiquetas) {
		this.etiquetas = etiquetas;
	}

}
