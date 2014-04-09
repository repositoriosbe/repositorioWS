package cl.bluex.digexpress.bean;

import java.util.Date;

import cl.bluex.digmodel.to.CabeceraAgrupacionTO;

/**
 * @author Edgardo Herrera
 * 
 */
public class CabeceraAgrupacion {
	private long id;
	private String codigoAgrupacion;
	private long codigoEmpresa;
	private long cantidadDctosEstimados;
	private long cantidadDoctosDigitados;
	private long codigoUsuario;
	private Date fechaCreacion;
	private Date fechaCierre;
	private String codigoEstado;
	private String descripcionEstado;
	private int codigoRuta;
	private String courier;
	private String descripcion;
	private String tipoBulto;
	private String folioHojaRuta;
	private String codigoPosta;
	private int mostrarMonitor;
	private long voucher;
	private long codigoSorter;
	private String descripcionSorter;
	private String digitacionOrigen;

	/**
	 * Constructor.
	 */
	public CabeceraAgrupacion() {
		super();
	}

	/**
	 * Constructor.
	 * 
	 * @param {@link CabeceraAgrupacionTO}
	 */
	public CabeceraAgrupacion(final CabeceraAgrupacionTO to) {
		if (to != null) {
			this.id = to.getId();
			this.codigoAgrupacion = to.getCodigoAgrupacion();
			this.codigoEmpresa = to.getCodigoEmpresa();
			this.cantidadDctosEstimados = to.getCantidadDctosEstimados();
			this.cantidadDoctosDigitados = to.getCantidadDoctosDigitados();
			this.codigoUsuario = to.getCodigoUsuario();
			this.fechaCreacion = to.getFechaCreacion();
			this.fechaCierre = to.getFechaCierre();
			this.codigoEstado = to.getCodigoEstado();
			this.descripcionEstado = to.getDescripcionEstado();
			this.codigoRuta = to.getCodigoRuta();
			this.courier = to.getCourier();
			this.descripcion = to.getDescripcion();
			this.tipoBulto = to.getTipoBulto();
			this.folioHojaRuta = to.getFolioHojaRuta();
			this.codigoPosta = to.getCodigoPosta();
			this.mostrarMonitor = to.getMostrarMonitor();
			this.voucher = to.getVoucher();
			this.codigoSorter = to.getCodigoSorter();
			this.descripcionSorter = to.getDescripcionSorter();
			this.digitacionOrigen = to.getDigitacionOrigen();
		}
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final long id) {
		this.id = id;
	}

	/**
	 * @return the codigoAgrupacion
	 */
	public String getCodigoAgrupacion() {
		return codigoAgrupacion;
	}

	/**
	 * @param codigoAgrupacion
	 *            the codigoAgrupacion to set
	 */
	public void setCodigoAgrupacion(final String codigoAgrupacion) {
		this.codigoAgrupacion = codigoAgrupacion;
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
	 * @return the cantidadDctosEstimados
	 */
	public long getCantidadDctosEstimados() {
		return cantidadDctosEstimados;
	}

	/**
	 * @param cantidadDctosEstimados
	 *            the cantidadDctosEstimados to set
	 */
	public void setCantidadDctosEstimados(final long cantidadDctosEstimados) {
		this.cantidadDctosEstimados = cantidadDctosEstimados;
	}

	/**
	 * @return the cantidadDoctosDigitados
	 */
	public long getCantidadDoctosDigitados() {
		return cantidadDoctosDigitados;
	}

	/**
	 * @param cantidadDoctosDigitados
	 *            the cantidadDoctosDigitados to set
	 */
	public void setCantidadDoctosDigitados(final long cantidadDoctosDigitados) {
		this.cantidadDoctosDigitados = cantidadDoctosDigitados;
	}

	/**
	 * @return the codigoUsuario
	 */
	public long getCodigoUsuario() {
		return codigoUsuario;
	}

	/**
	 * @param codigoUsuario
	 *            the codigoUsuario to set
	 */
	public void setCodigoUsuario(final long codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	/**
	 * @return the fechaCreacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion
	 *            the fechaCreacion to set
	 */
	public void setFechaCreacion(final Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * @return the fechaCierre
	 */
	public Date getFechaCierre() {
		return fechaCierre;
	}

	/**
	 * @param fechaCierre
	 *            the fechaCierre to set
	 */
	public void setFechaCierre(final Date fechaCierre) {
		this.fechaCierre = fechaCierre;
	}

	/**
	 * @return the codigoEstado
	 */
	public String getCodigoEstado() {
		return codigoEstado;
	}

	/**
	 * @param codigoEstado
	 *            the codigoEstado to set
	 */
	public void setCodigoEstado(final String codigoEstado) {
		this.codigoEstado = codigoEstado;
	}

	/**
	 * @return the descripcionEstado
	 */
	public String getDescripcionEstado() {
		return descripcionEstado;
	}

	/**
	 * @param descripcionEstado
	 *            the descripcionEstado to set
	 */
	public void setDescripcionEstado(final String descripcionEstado) {
		this.descripcionEstado = descripcionEstado;
	}

	/**
	 * @return the courier
	 */
	public String getCourier() {
		return courier;
	}

	/**
	 * @param courier
	 *            the courier to set
	 */
	public void setCourier(final String courier) {
		this.courier = courier;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion
	 *            the descripcion to set
	 */
	public void setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the tipoBulto
	 */
	public String getTipoBulto() {
		return tipoBulto;
	}

	/**
	 * @param tipoBulto
	 *            the tipoBulto to set
	 */
	public void setTipoBulto(final String tipoBulto) {
		this.tipoBulto = tipoBulto;
	}

	/**
	 * @return the folioHojaRuta
	 */
	public String getFolioHojaRuta() {
		return folioHojaRuta;
	}

	/**
	 * @param folioHojaRuta
	 *            the folioHojaRuta to set
	 */
	public void setFolioHojaRuta(final String folioHojaRuta) {
		this.folioHojaRuta = folioHojaRuta;
	}

	/**
	 * @return the codigoPosta
	 */
	public String getCodigoPosta() {
		return codigoPosta;
	}

	/**
	 * @param codigoPosta
	 *            the codigoPosta to set
	 */
	public void setCodigoPosta(final String codigoPosta) {
		this.codigoPosta = codigoPosta;
	}

	/**
	 * @return the mostrarMonitor
	 */
	public int getMostrarMonitor() {
		return mostrarMonitor;
	}

	/**
	 * @param mostrarMonitor
	 *            the mostrarMonitor to set
	 */
	public void setMostrarMonitor(final int mostrarMonitor) {
		this.mostrarMonitor = mostrarMonitor;
	}

	/**
	 * @return the voucher
	 */
	public long getVoucher() {
		return voucher;
	}

	/**
	 * @param voucher
	 *            the voucher to set
	 */
	public void setVoucher(final long voucher) {
		this.voucher = voucher;
	}

	

	/**
	 * @return the descripcionSorter
	 */
	public String getDescripcionSorter() {
		return descripcionSorter;
	}

	/**
	 * @param descripcionSorter
	 *            the descripcionSorter to set
	 */
	public void setDescripcionSorter(final String descripcionSorter) {
		this.descripcionSorter = descripcionSorter;
	}

	/**
	 * @return the digitacionOrigen
	 */
	public String getDigitacionOrigen() {
		return digitacionOrigen;
	}

	/**
	 * @param digitacionOrigen the digitacionOrigen to set
	 */
	public void setDigitacionOrigen(final String digitacionOrigen) {
		this.digitacionOrigen = digitacionOrigen;
	}

	/**
	 * @return the codigoSorter
	 */
	public long getCodigoSorter() {
		return codigoSorter;
	}

	/**
	 * @param codigoSorter the codigoSorter to set
	 */
	public void setCodigoSorter(final long codigoSorter) {
		this.codigoSorter = codigoSorter;
	}

	/**
	 * @return the codigoRuta
	 */
	public int getCodigoRuta() {
		return codigoRuta;
	}

	/**
	 * @param codigoRuta the codigoRuta to set
	 */
	public void setCodigoRuta(final int codigoRuta) {
		this.codigoRuta = codigoRuta;
	}

}
