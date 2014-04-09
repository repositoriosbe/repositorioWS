package cl.bluex.digfull.bean.response;

/**
 * @author Edgardo Herrera
 *
 */
public class ResponseTraduccionServicioReal {
	private String codigoServicioReal;
	
	/**
	 * Crea instancia de {@link ResponseTraduccionServicioReal}.
	 *
	 */
	public ResponseTraduccionServicioReal() {
		super();
	}
	
	/**
	 * Crea instancia de {@link ResponseTraduccionServicioReal}.
	 *
	 * @param codigoServicioReal
	 */
	public ResponseTraduccionServicioReal(final String codigoServicioReal) {
		super();
		this.codigoServicioReal = codigoServicioReal;
	}

	/**
	 * @return the codigoServicioReal
	 */
	public String getCodigoServicioReal() {
		return codigoServicioReal;
	}

	/**
	 * @param codigoServicioReal the codigoServicioReal to set
	 */
	public void setCodigoServicioReal(final String codigoServicioReal) {
		this.codigoServicioReal = codigoServicioReal;
	}
	
}
