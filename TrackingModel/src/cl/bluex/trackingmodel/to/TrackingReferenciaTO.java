package cl.bluex.trackingmodel.to;

import java.util.Date;

/**
 * @author eherrera
 *
 */
public class TrackingReferenciaTO {
	private Date fechaCreacion;
	private String numeroGuia;
	private String codPostaOrigen;
	private String descPostaOrigen;
	private String codPostaDestino;
	private String descPostaDestino;
	private String codigoProducto;
	private String nombreProducto;
	private String codigoTipoServicio;
	private String descTipoServicio;
	private String codigoReferencia;
	private long codigoPiezas;
	private Date fechaMovimientoPiezas;
	private String codigoCargaTipoExcep;
	private String descCargaTipoExcep;
	private String codigoCargaTipoEvento;
	private String descCargaTipoEvento;
	private String codigoCargaPersonalizacion;
	private long cantidadPiezasMovimiento;
	private double pesoPiezasMovimiento;
	private String observPiezasMovimiento;
	
	/**
	 * crea instancia de TrackingReferenciaTO
	 *
	 */
	public TrackingReferenciaTO() {
		super();
	}

	/**
	 * @return the fechaCreacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(final Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * @return the numeroGuia
	 */
	public String getNumeroGuia() {
		return numeroGuia;
	}

	/**
	 * @param numeroGuia the numeroGuia to set
	 */
	public void setNumeroGuia(final String numeroGuia) {
		this.numeroGuia = numeroGuia;
	}

	/**
	 * @return the codPostaOrigen
	 */
	public String getCodPostaOrigen() {
		return codPostaOrigen;
	}

	/**
	 * @param codPostaOrigen the codPostaOrigen to set
	 */
	public void setCodPostaOrigen(final String codPostaOrigen) {
		this.codPostaOrigen = codPostaOrigen;
	}

	/**
	 * @return the descPostaOrigen
	 */
	public String getDescPostaOrigen() {
		return descPostaOrigen;
	}

	/**
	 * @param descPostaOrigen the descPostaOrigen to set
	 */
	public void setDescPostaOrigen(final String descPostaOrigen) {
		this.descPostaOrigen = descPostaOrigen;
	}

	/**
	 * @return the codPostaDestino
	 */
	public String getCodPostaDestino() {
		return codPostaDestino;
	}

	/**
	 * @param codPostaDestino the codPostaDestino to set
	 */
	public void setCodPostaDestino(final String codPostaDestino) {
		this.codPostaDestino = codPostaDestino;
	}

	/**
	 * @return the descPostaDestino
	 */
	public String getDescPostaDestino() {
		return descPostaDestino;
	}

	/**
	 * @param descPostaDestino the descPostaDestino to set
	 */
	public void setDescPostaDestino(final String descPostaDestino) {
		this.descPostaDestino = descPostaDestino;
	}

	/**
	 * @return the codigoProducto
	 */
	public String getCodigoProducto() {
		return codigoProducto;
	}

	/**
	 * @param codigoProducto the codigoProducto to set
	 */
	public void setCodigoProducto(final String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	/**
	 * @return the nombreProducto
	 */
	public String getNombreProducto() {
		return nombreProducto;
	}

	/**
	 * @param nombreProducto the nombreProducto to set
	 */
	public void setNombreProducto(final String nombreProducto) {
		this.nombreProducto = nombreProducto;
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

	/**
	 * @return the descTipoServicio
	 */
	public String getDescTipoServicio() {
		return descTipoServicio;
	}

	/**
	 * @param descTipoServicio the descTipoServicio to set
	 */
	public void setDescTipoServicio(final String descTipoServicio) {
		this.descTipoServicio = descTipoServicio;
	}

	/**
	 * @return the codigoReferencia
	 */
	public String getCodigoReferencia() {
		return codigoReferencia;
	}

	/**
	 * @param codigoReferencia the codigoReferencia to set
	 */
	public void setCodigoReferencia(final String codigoReferencia) {
		this.codigoReferencia = codigoReferencia;
	}

	/**
	 * @return the fechaMovimientoPiezas
	 */
	public Date getFechaMovimientoPiezas() {
		return fechaMovimientoPiezas;
	}

	/**
	 * @param fechaMovimientoPiezas the fechaMovimientoPiezas to set
	 */
	public void setFechaMovimientoPiezas(final Date fechaMovimientoPiezas) {
		this.fechaMovimientoPiezas = fechaMovimientoPiezas;
	}

	/**
	 * @return the codigoCargaTipoExcep
	 */
	public String getCodigoCargaTipoExcep() {
		return codigoCargaTipoExcep;
	}

	/**
	 * @param codigoCargaTipoExcep the codigoCargaTipoExcep to set
	 */
	public void setCodigoCargaTipoExcep(final String codigoCargaTipoExcep) {
		this.codigoCargaTipoExcep = codigoCargaTipoExcep;
	}

	/**
	 * @return the descCargaTipoExcep
	 */
	public String getDescCargaTipoExcep() {
		return descCargaTipoExcep;
	}

	/**
	 * @param descCargaTipoExcep the descCargaTipoExcep to set
	 */
	public void setDescCargaTipoExcep(final String descCargaTipoExcep) {
		this.descCargaTipoExcep = descCargaTipoExcep;
	}

	/**
	 * @return the codigoCargaTipoEvento
	 */
	public String getCodigoCargaTipoEvento() {
		return codigoCargaTipoEvento;
	}

	/**
	 * @param codigoCargaTipoEvento the codigoCargaTipoEvento to set
	 */
	public void setCodigoCargaTipoEvento(final String codigoCargaTipoEvento) {
		this.codigoCargaTipoEvento = codigoCargaTipoEvento;
	}

	/**
	 * @return the descCargaTipoEvento
	 */
	public String getDescCargaTipoEvento() {
		return descCargaTipoEvento;
	}

	/**
	 * @param descCargaTipoEvento the descCargaTipoEvento to set
	 */
	public void setDescCargaTipoEvento(final String descCargaTipoEvento) {
		this.descCargaTipoEvento = descCargaTipoEvento;
	}

	/**
	 * @return the codigoCargaPersonalizacion
	 */
	public String getCodigoCargaPersonalizacion() {
		return codigoCargaPersonalizacion;
	}

	/**
	 * @param codigoCargaPersonalizacion the codigoCargaPersonalizacion to set
	 */
	public void setCodigoCargaPersonalizacion(final String codigoCargaPersonalizacion) {
		this.codigoCargaPersonalizacion = codigoCargaPersonalizacion;
	}

	/**
	 * @return the cantidadPiezasMovimiento
	 */
	public long getCantidadPiezasMovimiento() {
		return cantidadPiezasMovimiento;
	}

	/**
	 * @param cantidadPiezasMovimiento the cantidadPiezasMovimiento to set
	 */
	public void setCantidadPiezasMovimiento(final long cantidadPiezasMovimiento) {
		this.cantidadPiezasMovimiento = cantidadPiezasMovimiento;
	}

	/**
	 * @return the pesoPiezasMovimiento
	 */
	public double getPesoPiezasMovimiento() {
		return pesoPiezasMovimiento;
	}

	/**
	 * @param pesoPiezasMovimiento the pesoPiezasMovimiento to set
	 */
	public void setPesoPiezasMovimiento(final double pesoPiezasMovimiento) {
		this.pesoPiezasMovimiento = pesoPiezasMovimiento;
	}

	/**
	 * @return the observPiezasMovimiento
	 */
	public String getObservPiezasMovimiento() {
		return observPiezasMovimiento;
	}

	/**
	 * @param observPiezasMovimiento the observPiezasMovimiento to set
	 */
	public void setObservPiezasMovimiento(final String observPiezasMovimiento) {
		this.observPiezasMovimiento = observPiezasMovimiento;
	}

	/**
	 * @return the codigoPiezas
	 */
	public long getCodigoPiezas() {
		return codigoPiezas;
	}

	/**
	 * @param codigoPiezas the codigoPiezas to set
	 */
	public void setCodigoPiezas(final long codigoPiezas) {
		this.codigoPiezas = codigoPiezas;
	}
	
}
