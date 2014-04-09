package cl.bluex.generadoretiqueta.bean;

/**
 * @author eherrera
 *
 */
public class ParametrosCodigoBulto {
	private long numeroSerieOser;
	private String idTipoDocumento;
	private int codigoEmpresa;
	
	/**
	 * crea instancia de CodigoBulto
	 *
	 */
	public ParametrosCodigoBulto() {
		super();
	}

	/**
	 * @return the numeroSerieOser
	 */
	public long getNumeroSerieOser() {
		return numeroSerieOser;
	}

	/**
	 * @param numeroSerieOser the numeroSerieOser to set
	 */
	public void setNumeroSerieOser(final long numeroSerieOser) {
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
