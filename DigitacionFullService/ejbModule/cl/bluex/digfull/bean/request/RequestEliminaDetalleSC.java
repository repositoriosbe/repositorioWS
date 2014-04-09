package cl.bluex.digfull.bean.request;

/**
 * Request metodo inserta detalle Servicio complementario.
 * 
 * @author Edgardo Herrera
 * 
 */
public class RequestEliminaDetalleSC {
	private long eevvNmrid;
	private String codigoServicio;
	private long codigoEmpresa;

	
	/**
	 * crea instancia de RequestEliminaDetalleSC
	 *
	 */
	public RequestEliminaDetalleSC() {
		super();
	}


	/**
	 * @return the eevvNmrid
	 */
	public long getEevvNmrid() {
		return eevvNmrid;
	}


	/**
	 * @param eevvNmrid the eevvNmrid to set
	 */
	public void setEevvNmrid(final long eevvNmrid) {
		this.eevvNmrid = eevvNmrid;
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
