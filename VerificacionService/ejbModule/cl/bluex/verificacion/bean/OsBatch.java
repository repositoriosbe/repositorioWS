package cl.bluex.verificacion.bean;


/**
 * @author eherrera
 *
 */
public class OsBatch {
	private int codigoEmpresa;
	private String codigoPosta;
	private String codigoEncabezado;
	private long numeroSecuencia;
	private String fechaCreacionBatch;
	private long numeroDocumentoDesde;
	private long numeroDocumentoHasta;
	
	/**
	 * crea instancia de OsBatch
	 *
	 */
	public OsBatch() {
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
	 * @return the numeroDocumentoDesde
	 */
	public long getNumeroDocumentoDesde() {
		return numeroDocumentoDesde;
	}

	/**
	 * @param numeroDocumentoDesde the numeroDocumentoDesde to set
	 */
	public void setNumeroDocumentoDesde(final long numeroDocumentoDesde) {
		this.numeroDocumentoDesde = numeroDocumentoDesde;
	}

	/**
	 * @return the numeroDocumentoHasta
	 */
	public long getNumeroDocumentoHasta() {
		return numeroDocumentoHasta;
	}

	/**
	 * @param numeroDocumentoHasta the numeroDocumentoHasta to set
	 */
	public void setNumeroDocumentoHasta(final long numeroDocumentoHasta) {
		this.numeroDocumentoHasta = numeroDocumentoHasta;
	}

	/**
	 * @return the fechaCreacionBatch
	 */
	public String getFechaCreacionBatch() {
		return fechaCreacionBatch;
	}

	/**
	 * @param fechaCreacionBatch the fechaCreacionBatch to set
	 */
	public void setFechaCreacionBatch(final String fechaCreacionBatch) {
		this.fechaCreacionBatch = fechaCreacionBatch;
	}
	
}
