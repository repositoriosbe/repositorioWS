package cl.bluex.generadoretiqueta.bean.request;

/**
 * @author eherrera
 *
 */
public class RequestGeneraEtiquetaHub {
	private long eevvNroId;
	private int codigoImpresora;
	private int codigoFormatoImpresion;
	private int codigoUsuario;
	private String tipoFormato;
	private int nroBulto;
	
	/**
	 * crea instancia de RequestGeneraEtiquetaHub
	 *
	 */
	public RequestGeneraEtiquetaHub() {
		super();
	}

	/**
	 * @return the codigoImpresora
	 */
	public int getCodigoImpresora() {
		return codigoImpresora;
	}

	/**
	 * @param codigoImpresora the codigoImpresora to set
	 */
	public void setCodigoImpresora(final int codigoImpresora) {
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
	 * @return the codigoUsuario
	 */
	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	/**
	 * @param codigoUsuario the codigoUsuario to set
	 */
	public void setCodigoUsuario(final int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
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
	 * @return the nroBulto
	 */
	public int getNroBulto() {
		return nroBulto;
	}

	/**
	 * @param nroBulto the nroBulto to set
	 */
	public void setNroBulto(final int nroBulto) {
		this.nroBulto = nroBulto;
	}

	/**
	 * @return the eevvNroId
	 */
	public long getEevvNroId() {
		return eevvNroId;
	}

	/**
	 * @param eevvNroId the eevvNroId to set
	 */
	public void setEevvNroId(final long eevvNroId) {
		this.eevvNroId = eevvNroId;
	}
	
}
