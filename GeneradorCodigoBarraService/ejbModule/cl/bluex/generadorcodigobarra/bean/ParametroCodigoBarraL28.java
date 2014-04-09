package cl.bluex.generadorcodigobarra.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author eherrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametroCodigoBarraL28",
		propOrder = {
		"codigoEmpresa",
		"codigoCliente",
		"codigoSucursal",
		"codigoTipoCliente",
		"numeroSerie",
		"numeroPiezas",
		"tipoServicio",
		"tipoProducto",
		"codigoPosta",
		"tipoDocumento",
		"tipoNegocio",
		"codigoEmpresaDocumento"
		})
public class ParametroCodigoBarraL28 {
	@XmlElement(required = true)
	private int codigoEmpresa;
	@XmlElement(required = true)
	private int codigoCliente;
	@XmlElement(required = true)
	private int codigoSucursal;
	@XmlElement(required = true)
	private int codigoTipoCliente;
	@XmlElement(required = true)
	private long numeroSerie;
	@XmlElement(required = true)
	private int numeroPiezas;
	@XmlElement(required = true)
	private String tipoServicio;
	@XmlElement(required = true)
	private String tipoProducto;
	@XmlElement(required = true)
	private String codigoPosta;
	@XmlElement(required = true)
	private int tipoDocumento;
	@XmlElement(required = true)
	private int tipoNegocio;
	@XmlElement(required = true)
	private int codigoEmpresaDocumento;
	
	
	/**
	 * crea instancia de ParametroCodigoBarraL28
	 *
	 */
	public ParametroCodigoBarraL28() {
		super();
	}

	/**
	 * @return the codigoEmpresa
	 */
	public int getCodigoEmpresa() {
		return codigoEmpresa;
	}

	/**
	 * @param codigoEmpresa the codigoEmpresa to set
	 */
	public void setCodigoEmpresa(final int codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	/**
	 * @return the codigoCliente
	 */
	public int getCodigoCliente() {
		return codigoCliente;
	}

	/**
	 * @param codigoCliente the codigoCliente to set
	 */
	public void setCodigoCliente(final int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	/**
	 * @return the codigoSucursal
	 */
	public int getCodigoSucursal() {
		return codigoSucursal;
	}

	/**
	 * @param codigoSucursal the codigoSucursal to set
	 */
	public void setCodigoSucursal(final int codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}

	/**
	 * @return the codigoTipoCliente
	 */
	public int getCodigoTipoCliente() {
		return codigoTipoCliente;
	}

	/**
	 * @param codigoTipoCliente the codigoTipoCliente to set
	 */
	public void setCodigoTipoCliente(final int codigoTipoCliente) {
		this.codigoTipoCliente = codigoTipoCliente;
	}

	/**
	 * @return the numeroSerie
	 */
	public long getNumeroSerie() {
		return numeroSerie;
	}

	/**
	 * @param numeroSerie the numeroSerie to set
	 */
	public void setNumeroSerie(final long numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	/**
	 * @return the numeroPiezas
	 */
	public int getNumeroPiezas() {
		return numeroPiezas;
	}

	/**
	 * @param numeroPiezas the numeroPiezas to set
	 */
	public void setNumeroPiezas(final int numeroPiezas) {
		this.numeroPiezas = numeroPiezas;
	}

	/**
	 * @return the tipoServicio
	 */
	public String getTipoServicio() {
		return tipoServicio;
	}

	/**
	 * @param tipoServicio the tipoServicio to set
	 */
	public void setTipoServicio(final String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	/**
	 * @return the tipoProducto
	 */
	public String getTipoProducto() {
		return tipoProducto;
	}

	/**
	 * @param tipoProducto the tipoProducto to set
	 */
	public void setTipoProducto(final String tipoProducto) {
		this.tipoProducto = tipoProducto;
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
	 * @return the tipoDocumento
	 */
	public int getTipoDocumento() {
		return tipoDocumento;
	}

	/**
	 * @param tipoDocumento the tipoDocumento to set
	 */
	public void setTipoDocumento(final int tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	/**
	 * @return the tipoNegocio
	 */
	public int getTipoNegocio() {
		return tipoNegocio;
	}

	/**
	 * @param tipoNegocio the tipoNegocio to set
	 */
	public void setTipoNegocio(final int tipoNegocio) {
		this.tipoNegocio = tipoNegocio;
	}

	/**
	 * @return the codigoEmpresaDocumento
	 */
	public int getCodigoEmpresaDocumento() {
		return codigoEmpresaDocumento;
	}

	/**
	 * @param codigoEmpresaDocumento the codigoEmpresaDocumento to set
	 */
	public void setCodigoEmpresaDocumento(int codigoEmpresaDocumento) {
		this.codigoEmpresaDocumento = codigoEmpresaDocumento;
	}


	
	
}
