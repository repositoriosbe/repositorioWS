package cl.bluex.digmodel.to;

/**
 * @author Edgardo Herrera
 * 
 */
public class ServicioComplementarioDetalleTO {
	private long eevvNmrid;
	private String codigoServicio;
	private String idDocumento;
	private String tipoDocumentoServicio;
	private String descripcionTipoDocumento;
	private long codigoEmpresa;

	/**
	 * nueva instancia de {@link ServicioComplementarioDetalleTO}.
	 */
	public ServicioComplementarioDetalleTO() {
		super();
	}

	/**
	 * @return the eevvNmrid
	 */
	public long getEevvNmrid() {
		return eevvNmrid;
	}

	/**
	 * @param eevvNmrid
	 *            the eevvNmrid to set
	 */
	public void setEevvNmrid(final long eevvNmrid) {
		this.eevvNmrid = eevvNmrid;
	}

	/**
	 * @return the codigoServicio
	 */
	public String getCodigoServicio() {
		return codigoServicio;
	}

	/**
	 * @param codigoServicio
	 *            the codigoServicio to set
	 */
	public void setCodigoServicio(final String codigoServicio) {
		this.codigoServicio = codigoServicio;
	}

	/**
	 * @return the idDocumento
	 */
	public String getIdDocumento() {
		return idDocumento;
	}

	/**
	 * @param idDocumento
	 *            the idDocumento to set
	 */
	public void setIdDocumento(final String idDocumento) {
		this.idDocumento = idDocumento;
	}

	/**
	 * @return the tipoDocumentoServicio
	 */
	public String getTipoDocumentoServicio() {
		return tipoDocumentoServicio;
	}

	/**
	 * @param tipoDocumentoServicio
	 *            the tipoDocumentoServicio to set
	 */
	public void setTipoDocumentoServicio(final String tipoDocumentoServicio) {
		this.tipoDocumentoServicio = tipoDocumentoServicio;
	}

	/**
	 * @return the codigoEmpresa
	 */
	public long getCodigoEmpresa() {
		return codigoEmpresa;
	}

	/**
	 * @param codigoEmpresa
	 *            the codigoEmpresa to set
	 */
	public void setCodigoEmpresa(final long codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	/**
	 * @return the descripcionTipoDocumento
	 */
	public String getDescripcionTipoDocumento() {
		return descripcionTipoDocumento;
	}

	/**
	 * @param descripcionTipoDocumento the descripcionTipoDocumento to set
	 */
	public void setDescripcionTipoDocumento(final String descripcionTipoDocumento) {
		this.descripcionTipoDocumento = descripcionTipoDocumento;
	}

}
