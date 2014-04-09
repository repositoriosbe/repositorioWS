package cl.bluex.digfull.bean;

import java.io.Serializable;

import cl.bluex.digmodel.to.ServicioComplementarioPagoTO;

/**
 * Bean servicio complementario pago.
 * 
 * @author Edgardo Herrera
 * 
 */
public class ServicioComplementarioPago implements Serializable {
	/**
     * 
     */
	private static final long serialVersionUID = 7972041392618646670L;
	private long eevvNmrId;
	private String codigoServicio;
	private long numeroLinea;
	private String idDocumento;
	private String tipoPago;
	private String descripcionTipoPago;
	private String tipoDocumentoServicio;
	private long monto;
	private String serieDocumento;
	private long banco;
	private String descripcionBanco;
	private String fechaPago;
	private String idDiasPago;
	private String descripcionDiasPago;

	/**
	 * Constructor.
	 */
	public ServicioComplementarioPago() {
		super();
	}

	public ServicioComplementarioPago(final ServicioComplementarioPagoTO to) {
		if (to != null) {
			this.eevvNmrId = to.getEevvNmrId();
			this.codigoServicio = to.getCodigoServicio();
			this.numeroLinea = to.getNumeroLinea();
			this.idDocumento = to.getIdDocumento();
			this.tipoPago = to.getTipoPago();
			this.descripcionTipoPago = to.getDescripcionTipoPago();
			this.tipoDocumentoServicio = to.getTipoDocumentoServicio();
			this.monto = to.getMonto();
			this.serieDocumento = to.getSerieDocumento();
			this.banco = to.getBanco();
			this.descripcionBanco = to.getDescripcionBanco();
			this.fechaPago = to.getFechaPago();
			this.idDiasPago = to.getIdDiasPago();
			this.descripcionDiasPago = to.getDescripcionDiasPago();
		}
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
	 * @return the numeroLinea
	 */
	public long getNumeroLinea() {
		return numeroLinea;
	}

	/**
	 * @param numeroLinea
	 *            the numeroLinea to set
	 */
	public void setNumeroLinea(final long numeroLinea) {
		this.numeroLinea = numeroLinea;
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
	 * @return the tipoPago
	 */
	public String getTipoPago() {
		return tipoPago;
	}

	/**
	 * @param tipoPago
	 *            the tipoPago to set
	 */
	public void setTipoPago(final String tipoPago) {
		this.tipoPago = tipoPago;
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
	 * @return the monto
	 */
	public long getMonto() {
		return monto;
	}

	/**
	 * @param monto
	 *            the monto to set
	 */
	public void setMonto(final long monto) {
		this.monto = monto;
	}

	/**
	 * @return the serieDocumento
	 */
	public String getSerieDocumento() {
		return serieDocumento;
	}

	/**
	 * @param serieDocumento
	 *            the serieDocumento to set
	 */
	public void setSerieDocumento(final String serieDocumento) {
		this.serieDocumento = serieDocumento;
	}

	/**
	 * @return the banco
	 */
	public long getBanco() {
		return banco;
	}

	/**
	 * @param banco
	 *            the banco to set
	 */
	public void setBanco(final long banco) {
		this.banco = banco;
	}

	/**
	 * @return the idDiasPago
	 */
	public String getIdDiasPago() {
		return idDiasPago;
	}

	/**
	 * @param idDiasPago
	 *            the idDiasPago to set
	 */
	public void setIdDiasPago(final String idDiasPago) {
		this.idDiasPago = idDiasPago;
	}

	/**
	 * @return the eevvNmrId
	 */
	public long getEevvNmrId() {
		return eevvNmrId;
	}

	/**
	 * @param eevvNmrId
	 *            the eevvNmrId to set
	 */
	public void setEevvNmrId(final long eevvNmrId) {
		this.eevvNmrId = eevvNmrId;
	}

	/**
	 * @return the fechaPago
	 */
	public String getFechaPago() {
		return fechaPago;
	}

	/**
	 * @param fechaPago the fechaPago to set
	 */
	public void setFechaPago(final String fechaPago) {
		this.fechaPago = fechaPago;
	}

	/**
	 * @return the descripcionTipoPago
	 */
	public String getDescripcionTipoPago() {
		return descripcionTipoPago;
	}

	/**
	 * @param descripcionTipoPago the descripcionTipoPago to set
	 */
	public void setDescripcionTipoPago(final String descripcionTipoPago) {
		this.descripcionTipoPago = descripcionTipoPago;
	}

	/**
	 * @return the descripcionBanco
	 */
	public String getDescripcionBanco() {
		return descripcionBanco;
	}

	/**
	 * @param descripcionBanco the descripcionBanco to set
	 */
	public void setDescripcionBanco(final String descripcionBanco) {
		this.descripcionBanco = descripcionBanco;
	}

	/**
	 * @return the descripcionDiasPago
	 */
	public String getDescripcionDiasPago() {
		return descripcionDiasPago;
	}

	/**
	 * @param descripcionDiasPago the descripcionDiasPago to set
	 */
	public void setDescripcionDiasPago(final String descripcionDiasPago) {
		this.descripcionDiasPago = descripcionDiasPago;
	}

}
