package cl.bluex.listas.bean;

import cl.bluex.digmodel.to.TipoInfluenciaTO;

/**
 * @author Edgardo Herrera
 * 
 */
public class TipoInfluencia {
	private long codigo;
	private String nombreTipoInfluencia;

	/**
	 * Crea instancia de {@link TipoInfluencia}.
	 */
	public TipoInfluencia() {
		super();
	}

	/**
	 * crea instancia de TipoInfluencia
	 *
	 * @param to
	 */
	public TipoInfluencia(final TipoInfluenciaTO to) {
		if (to != null) {
			this.codigo = to.getCodigo();
			this.nombreTipoInfluencia = to.getNombreTipoInfluencia();
		}
	}

	/**
	 * @return the codigo
	 */
	public long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *            the codigo to set
	 */
	public void setCodigo(final long codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nombreTipoInfluencia
	 */
	public String getNombreTipoInfluencia() {
		return nombreTipoInfluencia;
	}

	/**
	 * @param nombreTipoInfluencia
	 *            the nombreTipoInfluencia to set
	 */
	public void setNombreTipoInfluencia(final String nombreTipoInfluencia) {
		this.nombreTipoInfluencia = nombreTipoInfluencia;
	}

}
