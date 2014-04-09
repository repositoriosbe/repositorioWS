package cl.bluex.generadoretiqueta.bean;


/**
 * @author eherrera
 *
 */
public class ParametroDestino {
	private String codigoEmpresaTrad;
	private String codigoTipoServicio;
	private String codigoPosta;
	private long codigoInfluencia;
	private long codigoTipoNegocio;
	
	/**
	 * crea instancia de ParametroDestino
	 *
	 */
	public ParametroDestino() {
		super();
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
	 * @return the codigoInfluencia
	 */
	public long getCodigoInfluencia() {
		return codigoInfluencia;
	}

	/**
	 * @param codigoInfluencia the codigoInfluencia to set
	 */
	public void setCodigoInfluencia(final long codigoInfluencia) {
		this.codigoInfluencia = codigoInfluencia;
	}

	/**
	 * @return the codigoTipoNegocio
	 */
	public long getCodigoTipoNegocio() {
		return codigoTipoNegocio;
	}

	/**
	 * @param codigoTipoNegocio the codigoTipoNegocio to set
	 */
	public void setCodigoTipoNegocio(final long codigoTipoNegocio) {
		this.codigoTipoNegocio = codigoTipoNegocio;
	}

	/**
	 * @return the codigoEmpresaTrad
	 */
	public String getCodigoEmpresaTrad() {
		return codigoEmpresaTrad;
	}

	/**
	 * @param codigoEmpresaTrad the codigoEmpresaTrad to set
	 */
	public void setCodigoEmpresaTrad(final String codigoEmpresaTrad) {
		this.codigoEmpresaTrad = codigoEmpresaTrad;
	}

	/**
	 * @return the codigoTipoServicio
	 */
	public String getCodigoTipoServicio() {
		return codigoTipoServicio;
	}

	/**
	 * @param codigoTipoServicio the codigoTipoServicio to set
	 */
	public void setCodigoTipoServicio(final String codigoTipoServicio) {
		this.codigoTipoServicio = codigoTipoServicio;
	}

}
