package cl.bluex.listas.bean;

import cl.bluex.digmodel.to.PaisTO;

/**
 * Almacena datos del pais.
 * 
 * @author Edgardo Herrera
 * 
 */
public class Pais {
	private String codigo;
	private String descripcion;
	private String codigoMoneda;

	/**
	 * crea instancia de Pais
	 *
	 */
	public Pais() {
		super();
	}

	/**
	 * Crea instancia de {@link Pais}.
	 * 
	 * @param paisTO
	 */
	public Pais(final PaisTO paisTO) {
		if (paisTO != null) {
			this.codigo = paisTO.getCodigo();
			this.descripcion = paisTO.getDescripcion();
			this.codigoMoneda = paisTO.getCodigoMoneda();
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
	 * @return the codigoMoneda
	 */
	public String getCodigoMoneda() {
		return codigoMoneda;
	}

	/**
	 * @param codigoMoneda
	 *            the codigoMoneda to set
	 */
	public void setCodigoMoneda(final String codigoMoneda) {
		this.codigoMoneda = codigoMoneda;
	}

}
