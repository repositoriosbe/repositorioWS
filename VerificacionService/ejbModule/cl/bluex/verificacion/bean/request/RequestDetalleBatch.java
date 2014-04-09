package cl.bluex.verificacion.bean.request;

import cl.bluex.verificacion.bean.DetalleBatch;

/**
 * @author eherrera
 *
 */
public class RequestDetalleBatch {
	private DetalleBatch detalleBatch;
	
	/**
	 * crea instancia de RequestDetalleBatch
	 *
	 */
	public RequestDetalleBatch() {
		super();
	}

	/**
	 * @return the detalleBatch
	 */
	public DetalleBatch getDetalleBatch() {
		return detalleBatch;
	}

	/**
	 * @param detalleBatch the detalleBatch to set
	 */
	public void setDetalleBatch(final DetalleBatch detalleBatch) {
		this.detalleBatch = detalleBatch;
	}
	
}
