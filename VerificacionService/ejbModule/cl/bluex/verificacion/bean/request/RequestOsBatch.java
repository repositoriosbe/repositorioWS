package cl.bluex.verificacion.bean.request;

import cl.bluex.verificacion.bean.OsBatch;

/**
 * @author eherrera
 *
 */
public class RequestOsBatch {
	private OsBatch osBatch;
	
	/**
	 * crea instancia de RequestOser
	 *
	 */
	public RequestOsBatch() {
		super();
	}

	/**
	 * @return the osBatch
	 */
	public OsBatch getOsBatch() {
		return osBatch;
	}

	/**
	 * @param osBatch the osBatch to set
	 */
	public void setOsBatch(final OsBatch osBatch) {
		this.osBatch = osBatch;
	}
	
}
