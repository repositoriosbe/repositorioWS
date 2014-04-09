package cl.bluex.digmodel.to;

/**
 * @author eherrera
 *
 */
public class ParametroGeneralTO {
	private String idParametro;
	private String nombreCampo;
	private String valorCampo;
	
	/**
	 * crea instancia de ParametroGeneralTO
	 *
	 */
	public ParametroGeneralTO() {
		super();
	}

	/**
	 * @return the idParametro
	 */
	public String getIdParametro() {
		return idParametro;
	}

	/**
	 * @param idParametro the idParametro to set
	 */
	public void setIdParametro(final String idParametro) {
		this.idParametro = idParametro;
	}

	/**
	 * @return the nombreCampo
	 */
	public String getNombreCampo() {
		return nombreCampo;
	}

	/**
	 * @param nombreCampo the nombreCampo to set
	 */
	public void setNombreCampo(final String nombreCampo) {
		this.nombreCampo = nombreCampo;
	}

	/**
	 * @return the valorCampo
	 */
	public String getValorCampo() {
		return valorCampo;
	}

	/**
	 * @param valorCampo the valorCampo to set
	 */
	public void setValorCampo(final String valorCampo) {
		this.valorCampo = valorCampo;
	}
	
}
