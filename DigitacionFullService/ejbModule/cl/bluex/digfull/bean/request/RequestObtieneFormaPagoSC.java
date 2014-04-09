package cl.bluex.digfull.bean.request;

/**
 * @author Edgardo Herrera
 * 
 */
public class RequestObtieneFormaPagoSC {
	private long eevvNmrId;
	private String codigoServicio;

	/**
	 * Crea instancia de {@link RequestObtieneFormaPagoSC}.
	 * 
	 */
	public RequestObtieneFormaPagoSC() {
		super();
	}

	/**
	 * @return the eevvNmrId
	 */
	public long getEevvNmrId() {
		return eevvNmrId;
	}

	/**
	 * @param eevvNmrId
	 *            the eevvNmrId to set
	 */
	public void setEevvNmrId(final long eevvNmrId) {
		this.eevvNmrId = eevvNmrId;
	}

	/**
	 * @return the codigoServicio
	 */
	public String getCodigoServicio() {
		return codigoServicio;
	}

	/**
	 * @param codigoServicio
	 *            the codigoServicio to set
	 */
	public void setCodigoServicio(final String codigoServicio) {
		this.codigoServicio = codigoServicio;
	}

}
