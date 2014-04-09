package cl.bluex.verificacion.bean.response;

import java.util.List;

import cl.bluex.verificacion.bean.Batch;

/**
 * @author eherrera
 *
 */
public class ResponseBatches {
	private List<Batch> batches;
	
	/**
	 * crea instancia de ResponseBatches
	 *
	 */
	public ResponseBatches() {
		super();
	}
	
	/**
	 * crea instancia de ResponseBatches
	 *
	 * @param batches
	 */
	public ResponseBatches(final List<Batch> batches) {
		super();
		this.batches = batches;
	}

	/**
	 * @return the batches
	 */
	public List<Batch> getBatches() {
		return batches;
	}

	/**
	 * @param batches the batches to set
	 */
	public void setBatches(final List<Batch> batches) {
		this.batches = batches;
	}
	
}
