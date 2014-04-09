package cl.bluex.listas.bean;

import cl.bluex.digmodel.to.FamiliaProductoTO;

/**
 * Almacena datos de la familia de productos.
 * 
 * @author Edgardo Herrera
 * 
 */
public class FamiliaProducto {
	private String codigo;
	private String descripcion;

	/**
	 * crea instancia de FamiliaProducto
	 * 
	 */
	public FamiliaProducto() {
		super();
	}

	/**
	 * crea instancia de FamiliaProducto
	 * 
	 * @param familiaProductoTO
	 */
	public FamiliaProducto(final FamiliaProductoTO familiaProductoTO) {
		if (familiaProductoTO != null) {
			this.codigo = familiaProductoTO.getCodigo();
			this.descripcion = familiaProductoTO.getDescripcion();
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

}
