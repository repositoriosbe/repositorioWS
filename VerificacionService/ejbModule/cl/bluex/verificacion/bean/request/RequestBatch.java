package cl.bluex.verificacion.bean.request;

import cl.bluex.verificacion.bean.Batch;

/**
 * @author eherrera
 *
 */
public class RequestBatch {
	private Batch batch;
	
	/**
	 * crea instancia de RequestBatch
	 *
	 */
	public RequestBatch() {
		super();
	}

	/**
	 * @return the batch
	 */
	public Batch getBatch() {
		return batch;
	}

	/**
	 * @param batch the batch to set
	 */
	public void setBatch(final Batch batch) {
		this.batch = batch;
	}

}
