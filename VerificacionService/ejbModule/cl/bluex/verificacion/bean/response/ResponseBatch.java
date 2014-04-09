package cl.bluex.verificacion.bean.response;

/**
 * @author eherrera
 *
 */
public class ResponseBatch {
	private long numeroSecuencia;
	
	/**
	 * crea instancia de ResponseBatch
	 *
	 */
	public ResponseBatch() {
		super();
	}
	
	/**
	 * crea instancia de ResponseBatch
	 *
	 * @param numeroSecuencia
	 */
	public ResponseBatch(final long numeroSecuencia) {
		super();
		this.numeroSecuencia = numeroSecuencia;
	}

	/**
	 * @return the numeroSecuencia
	 */
	public long getNumeroSecuencia() {
		return numeroSecuencia;
	}

	/**
	 * @param numeroSecuencia the numeroSecuencia to set
	 */
	public void setNumeroSecuencia(final long numeroSecuencia) {
		this.numeroSecuencia = numeroSecuencia;
	}

}
