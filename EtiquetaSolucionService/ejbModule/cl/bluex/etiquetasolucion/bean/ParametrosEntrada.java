package cl.bluex.etiquetasolucion.bean;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.etiquetasolucionmodel.to.ParametrosEntradaTO;


/**
 * The Class ParametrosEntrada.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrosEntrada",	
	propOrder = {
		"fechaInicio",		
		"fechaFin",		
		"codigoEmpresa",	
		"codigoTipoDocumento",
		"codigoOficina",	
		"codigoPosta",		
		"codigoCliente",		
		"sucursalCliente",		
		"codigoTipoCliente",	
		})
public class ParametrosEntrada {

	/** The fecha inicio. */
	private String	fechaInicio;
	
	/** The fecha fin. */
	private String	fechaFin;
	
	/** The codigo empresa. */
	private String codigoEmpresa;	
	
	/** The codigo tipo documento. */
	private String	codigoTipoDocumento;	
	
	/** The codigo oficina. */
	private String	codigoOficina;	
	
	/** The codigo posta. */
	private String	codigoPosta;		
	
	/** The codigo cliente. */
	private Integer codigoCliente;	
	
	/** The sucursal cliente. */
	private Integer	sucursalCliente;	
	
	/** The codigo tipo cliente. */
	private Integer	codigoTipoCliente;

	/**
	 * Instantiates a new ParametrosEntrada.
	 */
	public ParametrosEntrada() {
		super();
	}
	
	/**
	 * Instantiates a new ParametrosEntrada.
	 *
	 * @param to the to
	 */
	public ParametrosEntrada(final ParametrosEntradaTO to) {
		if (to != null) {
			
			this.codigoCliente = to.getCodigoCliente();
			this.codigoEmpresa = to.getCodigoEmpresa();
			this.codigoOficina = to.getCodigoOficina();
			this.codigoPosta = to.getCodigoPosta();
			this.codigoTipoCliente = to.getCodigoTipoCliente();
			this.codigoTipoDocumento = to.getCodigoTipoDocumento();
			this.fechaFin = to.getFechaFin();
			this.fechaInicio = to.getFechaInicio();
			this.sucursalCliente = to.getSucursalCliente();
			
		}
		
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
	public void setFechaInicio(String fechaInicio) {
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
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	/**
	 * @return the codigoEmpresa
	 */
	public String getCodigoEmpresa() {
		return codigoEmpresa;
	}

	/**
	 * @param codigoEmpresa the codigoEmpresa to set
	 */
	public void setCodigoEmpresa(String codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	/**
	 * @return the codigoTipoDocumento
	 */
	public String getCodigoTipoDocumento() {
		return codigoTipoDocumento;
	}

	/**
	 * @param codigoTipoDocumento the codigoTipoDocumento to set
	 */
	public void setCodigoTipoDocumento(String codigoTipoDocumento) {
		this.codigoTipoDocumento = codigoTipoDocumento;
	}

	/**
	 * @return the codigoOficina
	 */
	public String getCodigoOficina() {
		return codigoOficina;
	}

	/**
	 * @param codigoOficina the codigoOficina to set
	 */
	public void setCodigoOficina(String codigoOficina) {
		this.codigoOficina = codigoOficina;
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
	public void setCodigoPosta(String codigoPosta) {
		this.codigoPosta = codigoPosta;
	}

	/**
	 * @return the codigoCliente
	 */
	public Integer getCodigoCliente() {
		return codigoCliente;
	}

	/**
	 * @param codigoCliente the codigoCliente to set
	 */
	public void setCodigoCliente(Integer codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	/**
	 * @return the sucursalCliente
	 */
	public Integer getSucursalCliente() {
		return sucursalCliente;
	}

	/**
	 * @param sucursalCliente the sucursalCliente to set
	 */
	public void setSucursalCliente(Integer sucursalCliente) {
		this.sucursalCliente = sucursalCliente;
	}

	/**
	 * @return the codigoTipoCliente
	 */
	public Integer getCodigoTipoCliente() {
		return codigoTipoCliente;
	}

	/**
	 * @param codigoTipoCliente the codigoTipoCliente to set
	 */
	public void setCodigoTipoCliente(Integer codigoTipoCliente) {
		this.codigoTipoCliente = codigoTipoCliente;
	}

	
}