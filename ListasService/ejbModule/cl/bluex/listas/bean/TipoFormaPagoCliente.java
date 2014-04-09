package cl.bluex.listas.bean;

import cl.bluex.digmodel.to.TipoFormaPagoClienteTO;

/**
 * Almacena datos de tipo de forma de pago.
 * 
 * @author Edgardo Herrera
 * 
 */
public class TipoFormaPagoCliente {
	private String codigo;
	private String descripcion;

	
	/**
	 * crea instancia de TipoFormaPagoCliente
	 */
	public TipoFormaPagoCliente() {
		super();
	}

	
	/**
	 * crea instancia de TipoFormaPagoCliente
	 *
	 * @param tipoFormaPagoClienteTO
	 */
	public TipoFormaPagoCliente(
			final TipoFormaPagoClienteTO tipoFormaPagoClienteTO) {
		if (tipoFormaPagoClienteTO != null) {
			this.codigo = tipoFormaPagoClienteTO.getCodigo();
			this.descripcion = tipoFormaPagoClienteTO.getDescripcion();
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
