package cl.bluex.generadoretiqueta.to;

/**
 * @author eherrera
 *
 */
public class ParamOrdenServicioTO {
	private String numeroSerieOser;
	private String idTipoDocumento;
	private int codigoEmpresa;
	
	/**
	 * crea instancia de ParamOrdenServicioTO
	 *
	 */
	public ParamOrdenServicioTO() {
		super();
	}

	/**
	 * @return the numeroSerieOser
	 */
	public String getNumeroSerieOser() {
		return numeroSerieOser;
	}

	/**
	 * @param numeroSerieOser the numeroSerieOser to set
	 */
	public void setNumeroSerieOser(final String numeroSerieOser) {
		this.numeroSerieOser = numeroSerieOser;
	}

	/**
	 * @return the idTipoDocumento
	 */
	public String getIdTipoDocumento() {
		return idTipoDocumento;
	}

	/**
	 * @param idTipoDocumento the idTipoDocumento to set
	 */
	public void setIdTipoDocumento(final String idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}

	/**
	 * @return the codigoEmpresa
	 */
	public int getCodigoEmpresa() {
		return codigoEmpresa;
	}

	/**
	 * @param codigoEmpresa the codigoEmpresa to set
	 */
	public void setCodigoEmpresa(final int codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}
	
}
