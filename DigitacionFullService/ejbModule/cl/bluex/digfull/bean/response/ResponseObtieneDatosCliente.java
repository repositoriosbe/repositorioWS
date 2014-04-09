package cl.bluex.digfull.bean.response;

import cl.bluex.digfull.bean.DatosCliente;

/**
 * Response obtiene datos del cliente.
 * 
 * @author Edgardo Herrera
 * 
 */
public class ResponseObtieneDatosCliente {
	private DatosCliente datosCliente;

	/**
	 * Constructor.
	 */
	public ResponseObtieneDatosCliente() {
		super();
	}

	/**
	 * Constructor.
	 * 
	 * @param datosCliente
	 *            datos del cliente
	 */
	public ResponseObtieneDatosCliente(final DatosCliente datosCliente) {
		super();
		this.datosCliente = datosCliente;
	}

	/**
	 * @return the datosCliente
	 */
	public DatosCliente getDatosCliente() {
		return datosCliente;
	}

	/**
	 * @param datosCliente
	 *            the datosCliente to set
	 */
	public void setDatosCliente(final DatosCliente datosCliente) {
		this.datosCliente = datosCliente;
	}

}
