package cl.bluex.digexpress.bean;

import java.util.Date;

import cl.bluex.digmodel.to.DetalleDigitacionExpressTO;

/**
 * Almacena datos de detalle digitacion express.
 * 
 * @author Edgardo Herrera
 * 
 */
public class DetalleDigitacionExpress {
	private long id;
	private long eevvNmrId;
	private Date fechaDigitacion;
	private long cantidadPiezas;
	private String codigoFamilia;
	private String codigoProducto;
	private String producto;
	private String codigoTipoServicio;
	private String tipoServicio;
	private String codigoMnpl;
	private String mnpl;
	private String codigoTipoDocumento;
	private String tipoDocumento;
	private String codigoPais;
	private String pais;
	private String codigoPsta;
	private String posta;
	private String codigoComuna;
	private String comuna;
	private String observacion;
	private long eevvNroSerie;
	private String codigoFamiliaProducto;
	private long codigoCliente;
	private long codigoSucursalCliente;
	private long codigoTipoCliente;
	private long codigoUsuario;
	

	/**
	 * crea instancia de DetalleDigitacionExpress
	 *
	 */
	public DetalleDigitacionExpress() {
		super();
	}

	public DetalleDigitacionExpress(final DetalleDigitacionExpressTO valueTO) {
		if (valueTO != null) {
			this.id = valueTO.getId();
			this.eevvNmrId = valueTO.getEevvNmrId();
			this.fechaDigitacion = valueTO.getFechaDigitacion();
			this.cantidadPiezas = valueTO.getCantidadPiezas();
			this.codigoFamilia = valueTO.getCodigoFamilia();
			this.codigoProducto = valueTO.getCodigoProducto();
			this.producto = valueTO.getProducto();
			this.codigoTipoServicio = valueTO.getCodigoTipoServicio();
			this.codigoMnpl = valueTO.getCodigoMnpl();
			this.mnpl = valueTO.getMnpl();
			this.tipoServicio = valueTO.getTipoServicio();
			this.codigoTipoDocumento = valueTO.getCodigoTipoDocumento();
			this.tipoDocumento = valueTO.getTipoDocumento();
			this.codigoPais = valueTO.getCodigoPais();
			this.pais = valueTO.getPais();
			this.codigoPsta = valueTO.getCodigoPsta();
			this.posta = valueTO.getPosta();
			this.codigoComuna = valueTO.getCodigoComuna();
			this.comuna = valueTO.getComuna();
			this.observacion = valueTO.getObservacion();
			this.eevvNroSerie = valueTO.getEevvNroSerie();
			this.codigoFamiliaProducto = valueTO.getCodigoFamiliaProducto();
			this.codigoCliente = valueTO.getCodigoCliente();
			this.codigoSucursalCliente = valueTO.getCodigoSucursalCliente();
			this.codigoTipoCliente = valueTO.getCodigoTipoCliente();
			this.codigoUsuario = valueTO.getCodigoUsuario();
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
	 * @return the fechaDigitacion
	 */
	public Date getFechaDigitacion() {
		return fechaDigitacion;
	}

	/**
	 * @param fechaDigitacion
	 *            the fechaDigitacion to set
	 */
	public void setFechaDigitacion(final Date fechaDigitacion) {
		this.fechaDigitacion = fechaDigitacion;
	}

	/**
	 * @return the cantidadPiezas
	 */
	public long getCantidadPiezas() {
		return cantidadPiezas;
	}

	/**
	 * @param cantidadPiezas
	 *            the cantidadPiezas to set
	 */
	public void setCantidadPiezas(final long cantidadPiezas) {
		this.cantidadPiezas = cantidadPiezas;
	}

	/**
	 * @return the codigoFamilia
	 */
	public String getCodigoFamilia() {
		return codigoFamilia;
	}

	/**
	 * @param codigoFamilia
	 *            the codigoFamilia to set
	 */
	public void setCodigoFamilia(final String codigoFamilia) {
		this.codigoFamilia = codigoFamilia;
	}

	/**
	 * @return the codigoProducto
	 */
	public String getCodigoProducto() {
		return codigoProducto;
	}

	/**
	 * @param codigoProducto
	 *            the codigoProducto to set
	 */
	public void setCodigoProducto(final String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	/**
	 * @return the producto
	 */
	public String getProducto() {
		return producto;
	}

	/**
	 * @param producto
	 *            the producto to set
	 */
	public void setProducto(final String producto) {
		this.producto = producto;
	}

	/**
	 * @return the codigoTipoServicio
	 */
	public String getCodigoTipoServicio() {
		return codigoTipoServicio;
	}

	/**
	 * @param codigoTipoServicio
	 *            the codigoTipoServicio to set
	 */
	public void setCodigoTipoServicio(final String codigoTipoServicio) {
		this.codigoTipoServicio = codigoTipoServicio;
	}

	/**
	 * @return the tipoServicio
	 */
	public String getTipoServicio() {
		return tipoServicio;
	}

	/**
	 * @param tipoServicio
	 *            the tipoServicio to set
	 */
	public void setTipoServicio(final String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	/**
	 * @return the codigoMnpl
	 */
	public String getCodigoMnpl() {
		return codigoMnpl;
	}

	/**
	 * @param codigoMnpl
	 *            the codigoMnpl to set
	 */
	public void setCodigoMnpl(final String codigoMnpl) {
		this.codigoMnpl = codigoMnpl;
	}

	/**
	 * @return the mnpl
	 */
	public String getMnpl() {
		return mnpl;
	}

	/**
	 * @param mnpl
	 *            the mnpl to set
	 */
	public void setMnpl(final String mnpl) {
		this.mnpl = mnpl;
	}

	/**
	 * @return the codigoTipoDocumento
	 */
	public String getCodigoTipoDocumento() {
		return codigoTipoDocumento;
	}

	/**
	 * @param codigoTipoDocumento
	 *            the codigoTipoDocumento to set
	 */
	public void setCodigoTipoDocumento(final String codigoTipoDocumento) {
		this.codigoTipoDocumento = codigoTipoDocumento;
	}

	/**
	 * @return the tipoDocumento
	 */
	public String getTipoDocumento() {
		return tipoDocumento;
	}

	/**
	 * @param tipoDocumento
	 *            the tipoDocumento to set
	 */
	public void setTipoDocumento(final String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	/**
	 * @return the codigoPais
	 */
	public String getCodigoPais() {
		return codigoPais;
	}

	/**
	 * @param codigoPais
	 *            the codigoPais to set
	 */
	public void setCodigoPais(final String codigoPais) {
		this.codigoPais = codigoPais;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais
	 *            the pais to set
	 */
	public void setPais(final String pais) {
		this.pais = pais;
	}

	/**
	 * @return the codigoPsta
	 */
	public String getCodigoPsta() {
		return codigoPsta;
	}

	/**
	 * @param codigoPsta
	 *            the codigoPsta to set
	 */
	public void setCodigoPsta(final String codigoPsta) {
		this.codigoPsta = codigoPsta;
	}

	/**
	 * @return the posta
	 */
	public String getPosta() {
		return posta;
	}

	/**
	 * @param posta
	 *            the posta to set
	 */
	public void setPosta(final String posta) {
		this.posta = posta;
	}

	/**
	 * @return the codigoComuna
	 */
	public String getCodigoComuna() {
		return codigoComuna;
	}

	/**
	 * @param codigoComuna
	 *            the codigoComuna to set
	 */
	public void setCodigoComuna(final String codigoComuna) {
		this.codigoComuna = codigoComuna;
	}

	/**
	 * @return the comuna
	 */
	public String getComuna() {
		return comuna;
	}

	/**
	 * @param comuna
	 *            the comuna to set
	 */
	public void setComuna(final String comuna) {
		this.comuna = comuna;
	}

	/**
	 * @return the observacion
	 */
	public String getObservacion() {
		return observacion;
	}

	/**
	 * @param observacion
	 *            the observacion to set
	 */
	public void setObservacion(final String observacion) {
		this.observacion = observacion;
	}

	/**
	 * @return the eevvNroSerie
	 */
	public long getEevvNroSerie() {
		return eevvNroSerie;
	}

	/**
	 * @param eevvNroSerie
	 *            the eevvNroSerie to set
	 */
	public void setEevvNroSerie(final long eevvNroSerie) {
		this.eevvNroSerie = eevvNroSerie;
	}

	/**
	 * @return the codigoFamiliaProducto
	 */
	public String getCodigoFamiliaProducto() {
		return codigoFamiliaProducto;
	}

	/**
	 * @param codigoFamiliaProducto
	 *            the codigoFamiliaProducto to set
	 */
	public void setCodigoFamiliaProducto(final String codigoFamiliaProducto) {
		this.codigoFamiliaProducto = codigoFamiliaProducto;
	}

	/**
	 * @return the codigoCliente
	 */
	public long getCodigoCliente() {
		return codigoCliente;
	}

	/**
	 * @param codigoCliente the codigoCliente to set
	 */
	public void setCodigoCliente(final long codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	/**
	 * @return the codigoSucursalCliente
	 */
	public long getCodigoSucursalCliente() {
		return codigoSucursalCliente;
	}

	/**
	 * @param codigoSucursalCliente the codigoSucursalCliente to set
	 */
	public void setCodigoSucursalCliente(final long codigoSucursalCliente) {
		this.codigoSucursalCliente = codigoSucursalCliente;
	}

	/**
	 * @return the codigoTipoCliente
	 */
	public long getCodigoTipoCliente() {
		return codigoTipoCliente;
	}

	/**
	 * @param codigoTipoCliente the codigoTipoCliente to set
	 */
	public void setCodigoTipoCliente(final long codigoTipoCliente) {
		this.codigoTipoCliente = codigoTipoCliente;
	}

	/**
	 * @return the codigoUsuario
	 */
	public long getCodigoUsuario() {
		return codigoUsuario;
	}

	/**
	 * @param codigoUsuario the codigoUsuario to set
	 */
	public void setCodigoUsuario(final long codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

}
