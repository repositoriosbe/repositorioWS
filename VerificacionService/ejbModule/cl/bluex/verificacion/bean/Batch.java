package cl.bluex.verificacion.bean;

import cl.bluex.verificamodel.to.BatchTO;

/**
 * @author eherrera
 *
 */
public class Batch {
	private int codigoEmpresa;
	private String codigoPosta;
	private String codigoEncabezado;
	private String codigoUsuario;
	private long numeroSecuencia;
	private String codigoEstadoBatch;
	private String fechaCreacionBatch;
	private String numeroBatch;
	private String fechaCierreBatch;
	private int totalDetalleBatch;
	private long eevvNmrId;
	private String codigoMoneda;
	
	
	
	/**
	 * crea instancia de Batch
	 *
	 */
	public Batch() {
		super();
	}
	
	/**
	 * crea instancia de Batch
	 *
	 * @param to
	 */
	public Batch(final BatchTO to) {
		if (to != null) {
			this.codigoEmpresa = to.getCodigoEmpresa();
			this.codigoEncabezado = to.getCodigoEncabezado();
			this.codigoEstadoBatch = to.getCodigoEstadoBatch();
			this.codigoPosta = to.getCodigoPosta();
			this.codigoUsuario = to.getCodigoUsuario();
			this.numeroSecuencia = to.getNumeroSecuencia();
			this.numeroBatch = to.getNumeroBatch();
			this.fechaCreacionBatch = to.getFechaCreacionBatch();
			this.fechaCierreBatch = to.getFechaCierreBatch();
			this.totalDetalleBatch = to.getTotalDetalleBatch();
			this.eevvNmrId = to.getEevvNmrId();
			this.codigoMoneda = to.getCodigoMoneda();
		}
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
	 * @return the codigoEstadoBatch
	 */
	public String getCodigoEstadoBatch() {
		return codigoEstadoBatch;
	}

	/**
	 * @param codigoEstadoBatch the codigoEstadoBatch to set
	 */
	public void setCodigoEstadoBatch(final String codigoEstadoBatch) {
		this.codigoEstadoBatch = codigoEstadoBatch;
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
	 * @return the numeroBatch
	 */
	public String getNumeroBatch() {
		return numeroBatch;
	}

	/**
	 * @param numeroBatch the numeroBatch to set
	 */
	public void setNumeroBatch(final String numeroBatch) {
		this.numeroBatch = numeroBatch;
	}

	/**
	 * @return the totalDetalleBatch
	 */
	public int getTotalDetalleBatch() {
		return totalDetalleBatch;
	}

	/**
	 * @param totalDetalleBatch the totalDetalleBatch to set
	 */
	public void setTotalDetalleBatch(final int totalDetalleBatch) {
		this.totalDetalleBatch = totalDetalleBatch;
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

	/**
	 * @return the fechaCierreBatch
	 */
	public String getFechaCierreBatch() {
		return fechaCierreBatch;
	}

	/**
	 * @param fechaCierreBatch the fechaCierreBatch to set
	 */
	public void setFechaCierreBatch(final String fechaCierreBatch) {
		this.fechaCierreBatch = fechaCierreBatch;
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

	/**
	 * @return the codigoMoneda
	 */
	public String getCodigoMoneda() {
		return codigoMoneda;
	}

	/**
	 * @param codigoMoneda the codigoMoneda to set
	 */
	public void setCodigoMoneda(final String codigoMoneda) {
		this.codigoMoneda = codigoMoneda;
	}
	
}
