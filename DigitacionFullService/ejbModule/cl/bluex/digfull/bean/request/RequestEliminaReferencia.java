package cl.bluex.digfull.bean.request;

/**
 * @author Edgardo Herrera
 * 
 */
public class RequestEliminaReferencia {
	private long eevvNmrId;
	private String codigoTipoReferencia;

	/**
	 * Crea instancia de {@link RequestEliminaReferencia}.
	 * 
	 */
	public RequestEliminaReferencia() {
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
	 * @return the codigoTipoReferencia
	 */
	public String getCodigoTipoReferencia() {
		return codigoTipoReferencia;
	}

	/**
	 * @param codigoTipoReferencia
	 *            the codigoTipoReferencia to set
	 */
	public void setCodigoTipoReferencia(final String codigoTipoReferencia) {
		this.codigoTipoReferencia = codigoTipoReferencia;
	}

}
