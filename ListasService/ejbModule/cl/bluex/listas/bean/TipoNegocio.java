package cl.bluex.listas.bean;

import cl.bluex.digmodel.to.TipoNegocioTO;

/**
 * @author Edgardo Herrera
 * 
 */
public class TipoNegocio {
	private long codigo;
	private String nombreTipoNegocio;

	/**
	 * Crea instancia de {@link TipoNegocio}.
	 */
	public TipoNegocio() {
		super();
	}

	
	/**
	 * crea instancia de TipoNegocio
	 *
	 * @param to
	 */
	public TipoNegocio(final TipoNegocioTO to) {
		if (to != null) {
			this.codigo = to.getCodigo();
			this.nombreTipoNegocio = to.getNombreTipoNegocio();
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
	 * @return the nombreTipoNegocio
	 */
	public String getNombreTipoNegocio() {
		return nombreTipoNegocio;
	}

	/**
	 * @param nombreTipoNegocio
	 *            the nombreTipoNegocio to set
	 */
	public void setNombreTipoNegocio(final String nombreTipoNegocio) {
		this.nombreTipoNegocio = nombreTipoNegocio;
	}

}
