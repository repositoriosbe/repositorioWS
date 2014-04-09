package cl.bluex.listas.bean;

import cl.bluex.digmodel.to.ProductoTO;

/**
 * Almacena datos del producto.
 * 
 * @author Edgardo Herrera
 * 
 */
public class Producto {
	private String codigo;
	private String descripcion;
	private String codigoFamilia;
	private String descripcionFamilia;

	/**
	 * crea instancia de Producto
	 *
	 */
	public Producto() {
		super();
	}

	/**
	 * crea instancia de Producto
	 *
	 * @param to
	 */
	public Producto(final ProductoTO to) {
		if (to != null) {
			this.codigo = to.getCodigo();
			this.descripcion = to.getDescripcion();
			this.codigoFamilia = to.getCodigoFamilia();
			this.descripcionFamilia = to.getDescripcionFamilia();
		}
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
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
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
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

	/**
	 * @return the descripcionFamilia
	 */
	public String getDescripcionFamilia() {
		return descripcionFamilia;
	}

	/**
	 * @param descripcionFamilia the descripcionFamilia to set
	 */
	public void setDescripcionFamilia(final String descripcionFamilia) {
		this.descripcionFamilia = descripcionFamilia;
	}

}
