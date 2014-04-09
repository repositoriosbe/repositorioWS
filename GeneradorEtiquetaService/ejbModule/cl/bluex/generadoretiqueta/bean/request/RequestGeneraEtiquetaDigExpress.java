package cl.bluex.generadoretiqueta.bean.request;

/**
 * @author eherrera
 *
 */
public class RequestGeneraEtiquetaDigExpress {
	
	private String empresa;
	private String courier;
	private long cantidad;
	private String fecha;
	private String codigoBarra;
	private String bulto;
	private String descripcion;
	private long codigoUsuario;
	private long codigoImpresora;
	private long codigoFormatoImpresion;
	private String codBodega;
	private String usuario;
	private String ruta;
	private String voucher;

	/**
	 * crea instancia de RequestGeneraEtiquetaDigExpress
	 *
	 */
	public RequestGeneraEtiquetaDigExpress() {
		super();
	}

	/**
	 * @return the empresa
	 */
	public String getEmpresa() {
		return empresa;
	}

	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(final String empresa) {
		this.empresa = empresa;
	}

	/**
	 * @return the courier
	 */
	public String getCourier() {
		return courier;
	}

	/**
	 * @param courier the courier to set
	 */
	public void setCourier(final String courier) {
		this.courier = courier;
	}

	/**
	 * @return the cantidad
	 */
	public long getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(final long cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(final String fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the bulto
	 */
	public String getBulto() {
		return bulto;
	}

	/**
	 * @param bulto the bulto to set
	 */
	public void setBulto(final String bulto) {
		this.bulto = bulto;
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

	/**
	 * @return the codigoImpresora
	 */
	public long getCodigoImpresora() {
		return codigoImpresora;
	}

	/**
	 * @param codigoImpresora the codigoImpresora to set
	 */
	public void setCodigoImpresora(final long codigoImpresora) {
		this.codigoImpresora = codigoImpresora;
	}

	/**
	 * @return the codigoFormatoImpresion
	 */
	public long getCodigoFormatoImpresion() {
		return codigoFormatoImpresion;
	}

	/**
	 * @param codigoFormatoImpresion the codigoFormatoImpresion to set
	 */
	public void setCodigoFormatoImpresion(final long codigoFormatoImpresion) {
		this.codigoFormatoImpresion = codigoFormatoImpresion;
	}

	/**
	 * @return the codigoBarra
	 */
	public String getCodigoBarra() {
		return codigoBarra;
	}

	/**
	 * @param codigoBarra the codigoBarra to set
	 */
	public void setCodigoBarra(final String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}


	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the ruta
	 */
	public String getRuta() {
		return ruta;
	}

	/**
	 * @param ruta the ruta to set
	 */
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	/**
	 * @return the codBodega
	 */
	public String getCodBodega() {
		return codBodega;
	}

	/**
	 * @param codBodega the codBodega to set
	 */
	public void setCodBodega(String codBodega) {
		this.codBodega = codBodega;
	}

	/**
	 * @return the voucher
	 */
	public String getVoucher() {
		return voucher;
	}

	/**
	 * @param voucher the voucher to set
	 */
	public void setVoucher(String voucher) {
		this.voucher = voucher;
	}
	
}
