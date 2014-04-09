package cl.bluex.listas.bean;

import cl.bluex.digmodel.to.TraduccionEmpresaTO;

/**
 * Almacena datos del TraduccionEmpresa.
 * 
 * @author Edgardo Herrera
 * 
 */
public class TraduccionEmpresa {
	private long codigo;
	private String descripcion;
	private long codigoOriginal;

	/**
	 * Constructor.
	 */
	public TraduccionEmpresa() {
		super();
	}

	/**
	 * crea instancia de TraduccionEmpresa
	 *
	 * @param to
	 */
	public TraduccionEmpresa(final TraduccionEmpresaTO to) {
		if (to != null) {
			this.codigo = to.getCodigo();
			this.descripcion = to.getDescripcion();
			this.codigoOriginal = to.getCodigoOriginal();
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

	/**
	 * @return the codigoOriginal
	 */
	public long getCodigoOriginal() {
		return codigoOriginal;
	}

	/**
	 * @param codigoOriginal
	 *            the codigoOriginal to set
	 */
	public void setCodigoOriginal(final long codigoOriginal) {
		this.codigoOriginal = codigoOriginal;
	}

}
