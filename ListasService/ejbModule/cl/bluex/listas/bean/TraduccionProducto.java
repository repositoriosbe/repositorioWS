package cl.bluex.listas.bean;

import cl.bluex.digmodel.to.TraduccionProductoTO;

/**
 * @author eherrera
 *
 */
public class TraduccionProducto {
	private String codigoOrigen;
	private String descripcionOrigen;
	private String codigoTraducido;
	private String descripcionTraducido;
	private String codigoFamilia;
	
	/**
	 * crea instancia de TraduccionProducto
	 *
	 */
	public TraduccionProducto() {
		super();
	}

	public TraduccionProducto(final TraduccionProductoTO to) {
		if (to != null) {
			this.codigoOrigen = to.getCodigoOrigen();
			this.descripcionOrigen = to.getDescripcionOrigen();
			this.codigoTraducido = to.getCodigoTraducido();
			this.descripcionTraducido = to.getDescripcionTraducido();
			this.codigoFamilia = to.getCodigoFamilia();
		}
	}
	
	/**
	 * @return the codigoOrigen
	 */
	public String getCodigoOrigen() {
		return codigoOrigen;
	}

	/**
	 * @param codigoOrigen the codigoOrigen to set
	 */
	public void setCodigoOrigen(final String codigoOrigen) {
		this.codigoOrigen = codigoOrigen;
	}

	/**
	 * @return the descripcionOrigen
	 */
	public String getDescripcionOrigen() {
		return descripcionOrigen;
	}

	/**
	 * @param descripcionOrigen the descripcionOrigen to set
	 */
	public void setDescripcionOrigen(final String descripcionOrigen) {
		this.descripcionOrigen = descripcionOrigen;
	}

	/**
	 * @return the codigoTraducido
	 */
	public String getCodigoTraducido() {
		return codigoTraducido;
	}

	/**
	 * @param codigoTraducido the codigoTraducido to set
	 */
	public void setCodigoTraducido(final String codigoTraducido) {
		this.codigoTraducido = codigoTraducido;
	}

	/**
	 * @return the descripcionTraducido
	 */
	public String getDescripcionTraducido() {
		return descripcionTraducido;
	}

	/**
	 * @param descripcionTraducido the descripcionTraducido to set
	 */
	public void setDescripcionTraducido(final String descripcionTraducido) {
		this.descripcionTraducido = descripcionTraducido;
	}

	/**
	 * @return the codigoFamilia
	 */
	public String getCodigoFamilia() {
		return codigoFamilia;
	}

	/**
	 * @param codigoFamilia the codigoFamilia to set
	 */
	public void setCodigoFamilia(final String codigoFamilia) {
		this.codigoFamilia = codigoFamilia;
	}

}
