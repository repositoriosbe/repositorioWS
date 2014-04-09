package cl.bluex.digfull.bean.request;

/**
 * @author Edgardo Herrera
 * 
 */
public class RequestObtieneServiciosComplementarios {
	private long eevvNmrId;

	/**
	 * Crea instancia de {@link RequestObtieneServiciosComplementarios}.
	 * 
	 */
	public RequestObtieneServiciosComplementarios() {
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
}
