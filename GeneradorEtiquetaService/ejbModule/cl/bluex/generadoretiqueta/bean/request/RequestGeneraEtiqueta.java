package cl.bluex.generadoretiqueta.bean.request;

/**
 * @author eherrera
 *
 */
public class RequestGeneraEtiqueta {
	private long eevvNmrId;
	private long codigoUsuario;
	private long codigoImpresora;
	private int codigoFormatoImpresion;
	private String tipoFormato;
	
	/**
	 * crea instancia de RequestGeneraEtiqueta
	 *
	 */
	public RequestGeneraEtiqueta() {
		super();
	}

	/**
	 * @return the codigoUsuario
	 */
	public long getCodigoUsuario() {
		return codigoUsuario;
	}

	/**
	 * @param codigoUsuario the codigoUsuario to set
	 */
	public void setCodigoUsuario(final long codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	/**
	 * @return the codigoImpresora
	 */
	public long getCodigoImpresora() {
		return codigoImpresora;
	}

	/**
	 * @param codigoImpresora the codigoImpresora to set
	 */
	public void setCodigoImpresora(final long codigoImpresora) {
		this.codigoImpresora = codigoImpresora;
	}

	/**
	 * @return the codigoFormatoImpresion
	 */
	public int getCodigoFormatoImpresion() {
		return codigoFormatoImpresion;
	}

	/**
	 * @param codigoFormatoImpresion the codigoFormatoImpresion to set
	 */
	public void setCodigoFormatoImpresion(final int codigoFormatoImpresion) {
		this.codigoFormatoImpresion = codigoFormatoImpresion;
	}

	/**
	 * @return the tipoFormato
	 */
	public String getTipoFormato() {
		return tipoFormato;
	}

	/**
	 * @param tipoFormato the tipoFormato to set
	 */
	public void setTipoFormato(final String tipoFormato) {
		this.tipoFormato = tipoFormato;
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
