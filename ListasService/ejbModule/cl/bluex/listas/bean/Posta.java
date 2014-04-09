package cl.bluex.listas.bean;

import cl.bluex.digmodel.to.PostaTO;

/**
 * Almacena datos de la posta.
 * 
 * @author Edgardo Herrera
 *
 */
public class Posta {
	private String codigo;
	private String descripcion;
	private String codigoComuna;
	private String comuna;
	private long codigoRegion;

	/**
	 * crea instancia de Posta
	 *
	 */
	public Posta() {
		super();
	}

	/**
	 * crea instancia de Posta
	 *
	 * @param to
	 */
	public Posta(final PostaTO to) {
		if (to != null) {
			this.codigo = to.getCodigo();
			this.descripcion = to.getDescripcion();
			this.codigoComuna = to.getCodigoComuna();
			this.comuna = to.getComuna();
			this.codigoRegion = to.getCodigoRegion();
		}
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *            the codigo to set
	 */
	public void setCodigo(final String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion
	 *            the descripcion to set
	 */
	public void setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the codigoComuna
	 */
	public String getCodigoComuna() {
		return codigoComuna;
	}

	/**
	 * @param codigoComuna
	 *            the codigoComuna to set
	 */
	public void setCodigoComuna(final String codigoComuna) {
		this.codigoComuna = codigoComuna;
	}

	/**
	 * @return the comuna
	 */
	public String getComuna() {
		return comuna;
	}

	/**
	 * @param comuna
	 *            the comuna to set
	 */
	public void setComuna(final String comuna) {
		this.comuna = comuna;
	}

	/**
	 * @return the codigoRegion
	 */
	public long getCodigoRegion() {
		return codigoRegion;
	}

	/**
	 * @param codigoRegion
	 *            the codigoRegion to set
	 */
	public void setCodigoRegion(final long codigoRegion) {
		this.codigoRegion = codigoRegion;
	}

}
