package cl.bluex.listas.bean;

import cl.bluex.digmodel.to.EmpresaTO;

/**
 * @author Edgardo Herrera
 * 
 */
public class Empresa {
	private long codigo;
	private String descripcion;

	/**
	 * Crea instancia de {@link Empresa}.
	 */
	public Empresa() {
		super();
	}

	/**
	 * Crea instancia de {@link Empresa}.
	 * 
	 * @param empresaTO
	 *            datos de la empresa
	 */
	public Empresa(final EmpresaTO empresaTO) {
		if (empresaTO != null) {
			this.codigo = empresaTO.getCodigo();
			this.descripcion = empresaTO.getDescripcion();
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
