package cl.bluex.listas.bean;

import cl.bluex.digmodel.to.ComunaTO;


/**
 * Almacena datos de la comuna.
 * 
 * @author Edgardo Herrera
 *
 */
public class Comuna {
	private String codigo;
	private String descripcion;

	/**
	 * crea instancia de Comuna
	 *
	 */
	public Comuna() {
		super();
	}

	/**
	 * crea instancia de Comuna
	 *
	 * @param comunaTO
	 */
	public Comuna(final ComunaTO comunaTO) {
		if (comunaTO != null) {
			this.codigo = comunaTO.getCodigo();
			this.descripcion = comunaTO.getDescripcion();
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
