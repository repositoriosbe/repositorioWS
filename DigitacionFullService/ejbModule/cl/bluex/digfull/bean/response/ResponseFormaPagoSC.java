package cl.bluex.digfull.bean.response;

import java.util.List;

import cl.bluex.digfull.bean.ServicioComplementarioPago;

/**
 * @author Edgardo Herrera
 * 
 */
public class ResponseFormaPagoSC {
	private List<ServicioComplementarioPago> pagos;

	public ResponseFormaPagoSC() {
		super();
	}

	public ResponseFormaPagoSC(final List<ServicioComplementarioPago> pagos) {
		super();
		this.pagos = pagos;
	}

	/**
	 * @return the pagos
	 */
	public List<ServicioComplementarioPago> getPagos() {
		return pagos;
	}

	/**
	 * @param pagos
	 *            the pagos to set
	 */
	public void setPagos(final List<ServicioComplementarioPago> pagos) {
		this.pagos = pagos;
	}

}
