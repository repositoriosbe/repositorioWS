package cl.bluex.digmodel.to;

import java.io.Serializable;

/**
 * Almacena datos del tipo de etiquetas fijas.
 * 
 * @author Edgardo Herrera
 * 
 */
public class ConversionTO implements Serializable {

	/**
     * 
     */
	private static final long serialVersionUID = -1611910335532497662L;
	private long codigo;
	private String descripcion;

	/**
	 * nueva instancia de {@link ConversionTO}.
	 */
	public ConversionTO() {
		super();
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
