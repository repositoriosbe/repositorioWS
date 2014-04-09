package cl.bluex.digfull.bean.response;

/**
 * @author Edgardo Herrera
 *
 */
public class ResponseTraduccionServicio {
	private String codigoServicio;
	
	/**
	 * Crea instancia de {@link ResponseTraduccionServicio}.
	 *
	 */
	public ResponseTraduccionServicio() {
		super();
	}

	/**
	 * Crea instancia de {@link ResponseTraduccionServicio}.
	 *
	 * @param codigoServicio
	 */
	public ResponseTraduccionServicio(final String codigoServicio) {
		super();
		this.codigoServicio = codigoServicio;
	}

	/**
	 * @return the codigoServicio
	 */
	public String getCodigoServicio() {
		return codigoServicio;
	}

	/**
	 * @param codigoServicio the codigoServicio to set
	 */
	public void setCodigoServicio(final String codigoServicio) {
		this.codigoServicio = codigoServicio;
	}
	
}
