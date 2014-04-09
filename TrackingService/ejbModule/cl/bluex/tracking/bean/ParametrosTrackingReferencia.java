package cl.bluex.tracking.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author eherrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrosTrackingReferencia",
		propOrder = {"codigoEmpresa",
		"codigoCliente",
		"codigoSucursal",
		"codigoTipoCliente",
		"codigoReferencia",
		"fechaInicio",
		"fechaFin"
		})
public class ParametrosTrackingReferencia {
	
	@XmlElement(required = true)
	private int codigoEmpresa;
	@XmlElement(required = true)
	private int codigoCliente;
	@XmlElement(required = true)
	private int codigoSucursal;
	@XmlElement(required = true)
	private int codigoTipoCliente;
	@XmlElement(required = true)
	private String fechaInicio;
	@XmlElement(required = true)
	private String fechaFin;
	@XmlElement(required = true)
	private String codigoReferencia;
	
	/**
	 * crea instancia de ParametrosTrackingReferencia
	 *
	 */
	public ParametrosTrackingReferencia() {
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
	 * @return the fechaInicio
	 */
	public String getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(final String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	/**
	 * @return the fechaFin
	 */
	public String getFechaFin() {
		return fechaFin;
	}

	/**
	 * @param fechaFin the fechaFin to set
	 */
	public void setFechaFin(final String fechaFin) {
		this.fechaFin = fechaFin;
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
	
}
