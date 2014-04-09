package cl.bluex.generadoretiqueta.bean;

/**
 * @author eherrera
 *
 */
public class ParametrosGuiaPieza {
	private int codigoEmpresaTrad;
	private int tipoDocumento;
	private long numeroFolio;
	private int nroBulto;
	
	/**
	 * crea instancia de ParametrosGuiaPieza
	 *
	 */
	public ParametrosGuiaPieza() {
		super();
	}

	/**
	 * @return the codigoEmpresaTrad
	 */
	public int getCodigoEmpresaTrad() {
		return codigoEmpresaTrad;
	}

	/**
	 * @param codigoEmpresaTrad the codigoEmpresaTrad to set
	 */
	public void setCodigoEmpresaTrad(final int codigoEmpresaTrad) {
		this.codigoEmpresaTrad = codigoEmpresaTrad;
	}

	/**
	 * @return the tipoDocumento
	 */
	public int getTipoDocumento() {
		return tipoDocumento;
	}

	/**
	 * @param tipoDocumento the tipoDocumento to set
	 */
	public void setTipoDocumento(final int tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
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
