package cl.bluex.listas.bean;

import cl.bluex.digmodel.to.ProductoServicioTO;

/**
 * @author Edgardo Herrera
 * 
 */
public class ProductoServicio {
	private String codigo;
	private String descripcion;
	private String codigoOrigen;
	private String codigoFamilia;

	/**
	 * instancia de {@link ProductoServicio}.
	 */
	public ProductoServicio() {
		super();
	}

	/**
	 * instancia de {@link ProductoServicio}.
	 * 
	 * @param to
	 */
	public ProductoServicio(final ProductoServicioTO to) {
		if (to != null) {
			this.codigo = to.getCodigo();
			this.codigoOrigen = to.getCodigoOrigen();
			this.descripcion = to.getDescripcion();
			this.codigoFamilia = to.getCodigoFamilia();
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
	 * @return the codigoOrigen
	 */
	public String getCodigoOrigen() {
		return codigoOrigen;
	}

	/**
	 * @param codigoOrigen
	 *            the codigoOrigen to set
	 */
	public void setCodigoOrigen(final String codigoOrigen) {
		this.codigoOrigen = codigoOrigen;
	}

	/**
	 * @return the codigoFamilia
	 */
	public String getCodigoFamilia() {
		return codigoFamilia;
	}

	/**
	 * @param codigoFamilia
	 *            the codigoFamilia to set
	 */
	public void setCodigoFamilia(final String codigoFamilia) {
		this.codigoFamilia = codigoFamilia;
	}

}
