package cl.bluex.listas.bean;

import java.io.Serializable;

import cl.bluex.digmodel.to.ConversionTO;


/**
 * @author Edgardo Herrera
 * 
 */
public class Conversion implements Serializable {

	/**
     * 
     */
	private static final long serialVersionUID = 7154925890963072936L;
	private long codigo;
	private String descripcion;

	/**
	 * crea instancia de Conversion
	 *
	 */
	public Conversion() {
		super();
	}

	/**
	 * crea instancia de Conversion
	 *
	 * @param to
	 */
	public Conversion(final ConversionTO to) {
		if (to != null) {
			this.codigo = to.getCodigo();
			this.descripcion = to.getDescripcion();
		}
	}

	/**
	 * @return the codigo
	 */
	public long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *            the codigo to set
	 */
	public void setCodigo(final long codigo) {
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
