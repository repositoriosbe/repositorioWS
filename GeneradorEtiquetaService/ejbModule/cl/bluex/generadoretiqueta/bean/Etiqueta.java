package cl.bluex.generadoretiqueta.bean;

/**
 * @author Edgardo Herrera
 * 
 */
public class Etiqueta {
	private String contenidoEtiqueta;

	/**
	 * Crea instancia de {@link Etiqueta}.
	 * 
	 */
	public Etiqueta() {
		super();
	}


	/**
	 * Crea instancia de {@link Etiqueta}.
	 * 
	 * @param contenidoEtiqueta
	 */
	public Etiqueta(final String contenidoEtiqueta) {
		super();
		this.contenidoEtiqueta = contenidoEtiqueta;
	}

	/**
	 * @return the contenidoEtiqueta
	 */
	public String getContenidoEtiqueta() {
		return contenidoEtiqueta;
	}

	/**
	 * @param contenidoEtiqueta
	 *            the contenidoEtiqueta to set
	 */
	public void setContenidoEtiqueta(final String contenidoEtiqueta) {
		this.contenidoEtiqueta = contenidoEtiqueta;
	}

}
