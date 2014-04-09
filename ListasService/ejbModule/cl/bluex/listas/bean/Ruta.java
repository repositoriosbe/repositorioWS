package cl.bluex.listas.bean;

import cl.bluex.digmodel.to.RutaTO;

/**
 * Almacena datos de la ruta.
 * 
 * @author Edgardo Herrera
 * 
 */
public class Ruta {
	private String codigo;
	private String descripcion;

	/**
	 * crea instancia de Ruta
	 * 
	 */
	public Ruta() {
		super();
	}

	/**
	 * crea instancia de Ruta
	 * 
	 * @param rutaTO
	 */
	public Ruta(final RutaTO rutaTO) {
		if (rutaTO != null) {
			this.codigo = rutaTO.getCodigo();
			this.descripcion = rutaTO.getDescripcion();
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
