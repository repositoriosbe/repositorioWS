package cl.bluex.listas.bean;

import cl.bluex.digmodel.to.TipoDocumentoClienteTO;

/**
 * Almacena datos de tipo documento cliente.
 * 
 * @author Edgardo Herrera
 * 
 */
public class TipoDocumentoCliente {
	private String codigo;
	private String descripcion;

	/**
	 * crea instancia de TipoDocumentoCliente
	 *
	 */
	public TipoDocumentoCliente() {
		super();
	}

	/**
	 * crea instancia de TipoDocumentoCliente
	 *
	 * @param tipoDocumentoClienteTO
	 */
	public TipoDocumentoCliente(
			final TipoDocumentoClienteTO tipoDocumentoClienteTO) {
		if (tipoDocumentoClienteTO != null) {
			this.codigo = tipoDocumentoClienteTO.getCodigo();
			this.descripcion = tipoDocumentoClienteTO.getDescripcion();
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
