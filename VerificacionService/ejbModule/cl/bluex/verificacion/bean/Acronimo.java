package cl.bluex.verificacion.bean;

import cl.bluex.verificamodel.to.AcronimoTO;

/**
 * @author eherrera
 *
 */
public class Acronimo {
	private String codigo;
	private String descripcion;
	
	/**
	 * crea instancia de Acronimo
	 *
	 */
	public Acronimo() {
		super();
	}

	/**
	 * crea instancia de Acronimo
	 *
	 * @param acronimoTO
	 */
	public Acronimo(final AcronimoTO acronimoTO) {
		if (acronimoTO != null) {
			this.codigo = acronimoTO.getCodigo();
			this.descripcion = acronimoTO.getDescripcion();
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
