package cl.bluex.listas.bean;

import cl.bluex.digmodel.to.DiaPagoTO;


/**
 * Almacena datos del dia de pago.
 * 
 * @author Edgardo Herrera
 * 
 */
public class DiaPago {
	private String codigo;
	private String descripcion;

	/**
	 * crea instancia de DiaPago
	 *
	 */
	public DiaPago() {
		super();
	}

	/**
	 * crea instancia de DiaPago
	 *
	 * @param diaPagoTO
	 */
	public DiaPago(final DiaPagoTO diaPagoTO) {
		if (diaPagoTO != null) {
			this.codigo = diaPagoTO.getCodigo();
			this.descripcion = diaPagoTO.getDescripcion();
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
