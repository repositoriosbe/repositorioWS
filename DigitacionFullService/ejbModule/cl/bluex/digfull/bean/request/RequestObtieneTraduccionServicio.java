package cl.bluex.digfull.bean.request;

/**
 * @author Edgardo Herrera
 *
 */
public class RequestObtieneTraduccionServicio {
	private long codigoEmpresa;
	private String codigoServicioReal;
	private long codigoRegion;
	
	/**
	 * Crea instancia de {@link RequestObtieneTraduccionServicio}.
	 *
	 */
	public RequestObtieneTraduccionServicio() {
		super();
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

	/**
	 * @return the codigoRegion
	 */
	public long getCodigoRegion() {
		return codigoRegion;
	}

	/**
	 * @param codigoRegion the codigoRegion to set
	 */
	public void setCodigoRegion(final long codigoRegion) {
		this.codigoRegion = codigoRegion;
	}

	/**
	 * @return the codigoEmpresa
	 */
	public long getCodigoEmpresa() {
		return codigoEmpresa;
	}

	/**
	 * @param codigoEmpresa the codigoEmpresa to set
	 */
	public void setCodigoEmpresa(final long codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}
	
}

