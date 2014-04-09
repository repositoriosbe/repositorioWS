package cl.bluex.digfull.bean.request;

/**
 * @author Edgardo Herrera
 *
 */
public class RequestObtieneTraduccionServicioReal {
	private long codigoEmpresa;
	private String codigoServicio;
	private String codigoProducto;
	private long codigoRegion;
	
	/**
	 * Crea instancia de {@link RequestObtieneTraduccionServicioReal}.
	 *
	 */
	public RequestObtieneTraduccionServicioReal() {
		super();
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

	/**
	 * @return the codigoProducto
	 */
	public String getCodigoProducto() {
		return codigoProducto;
	}

	/**
	 * @param codigoProducto the codigoProducto to set
	 */
	public void setCodigoProducto(final String codigoProducto) {
		this.codigoProducto = codigoProducto;
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
