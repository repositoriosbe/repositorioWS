package cl.bluex.verificacion.bean;

/**
 * @author eherrera
 *
 */
public class DetalleBatch {
	private int codigoEmpresa;
	private String codigoPosta;
	private String codigoEncabezado;
	private long numeroSecuencia;
	private long eevvNmrId;
	private String codigoEstadoDcbt;
	private String codigoUsuario;
	
	/**
	 * crea instancia de DetalleBatch
	 *
	 */
	public DetalleBatch() {
		super();
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

	/**
	 * @return the codigoPosta
	 */
	public String getCodigoPosta() {
		return codigoPosta;
	}

	/**
	 * @param codigoPosta the codigoPosta to set
	 */
	public void setCodigoPosta(final String codigoPosta) {
		this.codigoPosta = codigoPosta;
	}

	/**
	 * @return the codigoEncabezado
	 */
	public String getCodigoEncabezado() {
		return codigoEncabezado;
	}

	/**
	 * @param codigoEncabezado the codigoEncabezado to set
	 */
	public void setCodigoEncabezado(final String codigoEncabezado) {
		this.codigoEncabezado = codigoEncabezado;
	}

	/**
	 * @return the codigoUsuario
	 */
	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	/**
	 * @param codigoUsuario the codigoUsuario to set
	 */
	public void setCodigoUsuario(final String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	/**
	 * @return the codigoEstadoDcbt
	 */
	public String getCodigoEstadoDcbt() {
		return codigoEstadoDcbt;
	}

	/**
	 * @param codigoEstadoDcbt the codigoEstadoDcbt to set
	 */
	public void setCodigoEstadoDcbt(final String codigoEstadoDcbt) {
		this.codigoEstadoDcbt = codigoEstadoDcbt;
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

	/**
	 * @return the eevvNmrId
	 */
	public long getEevvNmrId() {
		return eevvNmrId;
	}

	/**
	 * @param eevvNmrId the eevvNmrId to set
	 */
	public void setEevvNmrId(final long eevvNmrId) {
		this.eevvNmrId = eevvNmrId;
	}
	
}
