package cl.bluex.listas.bean;

import cl.bluex.digmodel.to.MonedaTO;

/**
 * Almacena datos de la moneda.
 * 
 * @author Edgardo Herrera
 *
 */
public class Moneda {

	private String codigo;
	private String descripcion;

	/**
	 * crea instancia de Moneda
	 *
	 */
	public Moneda() {
		super();
	}

	/**
	 * crea instancia de Moneda
	 *
	 * @param monedaTO
	 */
	public Moneda(final MonedaTO monedaTO) {
		if (monedaTO != null) {
			this.codigo = monedaTO.getCodigo();
			this.descripcion = monedaTO.getDescripcion();
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

}
