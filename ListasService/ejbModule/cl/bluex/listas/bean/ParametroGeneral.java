package cl.bluex.listas.bean;

import cl.bluex.digmodel.to.ParametroGeneralTO;

/**
 * @author eherrera
 *
 */
public class ParametroGeneral {
	private String idParametro;
	private String nombreCampo;
	private String valorCampo;
	
	/**
	 * crea instancia de ParametroGeneral
	 *
	 */
	public ParametroGeneral() {
		super();
	}
	
	/**
	 * crea instancia de ParametroGeneral
	 *
	 * @param to
	 */
	public ParametroGeneral(final ParametroGeneralTO to) {
		if (to != null) {
			this.idParametro = to.getIdParametro();
			this.nombreCampo = to.getNombreCampo();
			this.valorCampo = to.getValorCampo();
		}
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
