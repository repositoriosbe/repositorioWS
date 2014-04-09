package cl.bluex.generadoretiqueta.bean.response;

import java.util.List;

import cl.bluex.generadoretiqueta.bean.Etiqueta;

/**
 * @author eherrera
 *
 */
public class ResponseEtiquetaHub {
	private List<Etiqueta> etiquetas;
	private String codigoCompuesto;
	
	/**
	 * crea instancia de ResponseEtiquetaHub
	 *
	 */
	public ResponseEtiquetaHub() {
		super();
	}
	
	public ResponseEtiquetaHub(final List<Etiqueta> etiquetas, final String codigoCompuesto) {
		super();
		this.etiquetas = etiquetas;
		this.codigoCompuesto = codigoCompuesto;
	}

	/**
	 * @return the codigoCompuesto
	 */
	public String getCodigoCompuesto() {
		return codigoCompuesto;
	}

	/**
	 * @param codigoCompuesto the codigoCompuesto to set
	 */
	public void setCodigoCompuesto(final String codigoCompuesto) {
		this.codigoCompuesto = codigoCompuesto;
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
