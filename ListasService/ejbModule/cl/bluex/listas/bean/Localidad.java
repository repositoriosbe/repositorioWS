package cl.bluex.listas.bean;

import cl.bluex.digmodel.to.LocalidadTO;

/**
 * Almacena datos de la localidad.
 * 
 * @author Edgardo Herrera
 *
 */
public class Localidad {
	private String codigoPosta;
	private String codigo;
	private String descripcion;
	private String codigoComuna;
	private String descripcionComuna;
	private String codigoTipoRadioInfluencia;
	private String descripcionTipoRadioInfluencia;

	/**
	 * crea instancia de Localidad
	 *
	 */
	public Localidad() {
		super();
	}

	/**
	 * crea instancia de Localidad
	 *
	 * @param localidadTO
	 */
	public Localidad(final LocalidadTO localidadTO) {
		if (localidadTO != null) {
			this.codigoPosta = localidadTO.getCodigoPosta();
			this.codigo = localidadTO.getCodigo();
			this.descripcion = localidadTO.getDescripcion();
			this.codigoComuna = localidadTO.getCodigoComuna();
			this.descripcionComuna = localidadTO.getDescripcionComuna();
			this.codigoTipoRadioInfluencia = localidadTO
					.getCodigoTipoRadioInfluencia();
			this.descripcionTipoRadioInfluencia = localidadTO
					.getDescripcionTipoRadioInfluencia();
		}
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
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(final String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the codigoComuna
	 */
	public String getCodigoComuna() {
		return codigoComuna;
	}

	/**
	 * @param codigoComuna the codigoComuna to set
	 */
	public void setCodigoComuna(final String codigoComuna) {
		this.codigoComuna = codigoComuna;
	}

	/**
	 * @return the descripcionComuna
	 */
	public String getDescripcionComuna() {
		return descripcionComuna;
	}

	/**
	 * @param descripcionComuna the descripcionComuna to set
	 */
	public void setDescripcionComuna(final String descripcionComuna) {
		this.descripcionComuna = descripcionComuna;
	}

	/**
	 * @return the codigoTipoRadioInfluencia
	 */
	public String getCodigoTipoRadioInfluencia() {
		return codigoTipoRadioInfluencia;
	}

	/**
	 * @param codigoTipoRadioInfluencia the codigoTipoRadioInfluencia to set
	 */
	public void setCodigoTipoRadioInfluencia(final String codigoTipoRadioInfluencia) {
		this.codigoTipoRadioInfluencia = codigoTipoRadioInfluencia;
	}

	/**
	 * @return the descripcionTipoRadioInfluencia
	 */
	public String getDescripcionTipoRadioInfluencia() {
		return descripcionTipoRadioInfluencia;
	}

	/**
	 * @param descripcionTipoRadioInfluencia the descripcionTipoRadioInfluencia to set
	 */
	public void setDescripcionTipoRadioInfluencia(
			final String descripcionTipoRadioInfluencia) {
		this.descripcionTipoRadioInfluencia = descripcionTipoRadioInfluencia;
	}

	
}
