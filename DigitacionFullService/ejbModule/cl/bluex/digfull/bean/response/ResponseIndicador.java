package cl.bluex.digfull.bean.response;

/**
 * @author Edgardo Herrera
 *
 */
public class ResponseIndicador {
	private String indicador;
	
	/**
	 * Crea instancia de {@link ResponseIndicador}.
	 *
	 */
	public ResponseIndicador() {
		super();
	}

	/**
	 * Crea instancia de {@link ResponseIndicador}.
	 *
	 * @param indicador
	 */
	public ResponseIndicador(final String indicador) {
		super();
		this.indicador = indicador;
	}

	/**
	 * @return the indicador
	 */
	public String getIndicador() {
		return indicador;
	}

	/**
	 * @param indicador the indicador to set
	 */
	public void setIndicador(final String indicador) {
		this.indicador = indicador;
	}
	
}
