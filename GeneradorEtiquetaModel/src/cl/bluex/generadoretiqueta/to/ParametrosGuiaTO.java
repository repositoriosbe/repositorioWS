package cl.bluex.generadoretiqueta.to;

/**
 * @author eherrera
 *
 */
public class ParametrosGuiaTO {
	private String tipoDocumento;
	private long numeroFolio;
	private int codigoEmpresa;
	private int nroBulto;
	
	/**
	 * crea instancia de ParametrosGuiaTO
	 *
	 */
	public ParametrosGuiaTO() {
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
	 * @return the tipoDocumento
	 */
	public String getTipoDocumento() {
		return tipoDocumento;
	}

	/**
	 * @param tipoDocumento the tipoDocumento to set
	 */
	public void setTipoDocumento(final String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}



	/**
	 * @return the numeroFolio
	 */
	public long getNumeroFolio() {
		return numeroFolio;
	}



	/**
	 * @param numeroFolio the numeroFolio to set
	 */
	public void setNumeroFolio(final long numeroFolio) {
		this.numeroFolio = numeroFolio;
	}
	
}