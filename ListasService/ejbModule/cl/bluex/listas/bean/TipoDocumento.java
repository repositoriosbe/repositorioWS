package cl.bluex.listas.bean;

import cl.bluex.digmodel.to.TipoDocumentoTO;

/**
 * Almacena datos del tipo de documento.
 * 
 * @author Edgardo Herrera
 * 
 */
public class TipoDocumento {
	private String codigo;
	private String descripcion;

	/**
	 * crea instancia de TipoDocumento
	 *
	 */
	public TipoDocumento() {
		super();
	}

	/**
	 * crea instancia de TipoDocumento
	 *
	 * @param tipoDocumentoTO
	 */
	public TipoDocumento(final TipoDocumentoTO tipoDocumentoTO) {
		if (tipoDocumentoTO != null) {
			this.codigo = tipoDocumentoTO.getCodigo();
			this.descripcion = tipoDocumentoTO.getDescripcion();
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
