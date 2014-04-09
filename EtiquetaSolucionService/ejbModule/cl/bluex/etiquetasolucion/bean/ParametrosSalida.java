package cl.bluex.etiquetasolucion.bean;

import java.math.BigInteger;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.etiquetasolucionmodel.to.ParametrosSalidaTO;


// TODO: Auto-generated Javadoc
/**
 * The Class ParametrosSalida.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrosSalida",	
	propOrder = {
		"codigoInquietud",			
		"codEspecieValorada",		
		"solucionTxt",		
		"codigoCliente",			
		"sucursalCliente",			
		"codTipoCliente",			
		"fechaTerminoInquietud",			
		"codigoOficina",			
		"codigoPostaLocalidad",			
		"codigoExcepcion",			
		"cantidadPiezas",		
		"observacionSolucion",			
		"fechaPiezaTS",			
		"fechaPiezaER",			
		"cantidadImpresion",	
		})
public class ParametrosSalida {

	/** The codigo inquietud. */
	private Integer codigoInquietud;			
	
	/** The cod especie valorada. */
	private BigInteger codEspecieValorada;		
	
	/** The solucion txt. */
	private String solucionTxt;		
	
	/** The codigo cliente. */
	private Integer codigoCliente;			
	
	/** The sucursal cliente. */
	private Integer sucursalCliente;			
	
	/** The cod tipo cliente. */
	private Integer codTipoCliente;			
	
	/** The fecha termino inquietud. */
	private Date fechaTerminoInquietud;			
	
	/** The codigo oficina. */
	private String codigoOficina;			
	
	/** The codigo posta localidad. */
	private String codigoPostaLocalidad;			
	
	/** The codigo excepcion. */
	private String codigoExcepcion;			
	
	/** The cantidad piezas. */
	private Integer cantidadPiezas;		
	
	/** The observacion solucion. */
	private String observacionSolucion;	
	
	/** The fecha pieza ts. */
	private Date fechaPiezaTS;			
	
	/** The fecha pieza er. */
	private Date fechaPiezaER;			
	
	/** The cantidad impresion. */
	private Integer cantidadImpresion;		

	/**
	 * Instantiates a new out_ etiqueta solucion.
	 */
	public ParametrosSalida() {
		super();
	}
	
	
	/**
	 * Instantiates a new parametros salida.
	 *
	 * @param to the to
	 */
	public ParametrosSalida(final ParametrosSalidaTO to) {
		if (to != null) {
			
			this.cantidadImpresion = to.getCantidadImpresion();
			this.cantidadPiezas = to.getCantidadPiezas();
			this.codEspecieValorada = to.getCodEspecieValorada();
			this.codigoCliente = to.getCodigoCliente();
			this.codigoExcepcion = to.getCodigoExcepcion();
			this.codigoInquietud = to.getCodigoInquietud();
			this.codigoOficina = to.getCodigoOficina();
			this.codigoPostaLocalidad = to.getCodigoPostaLocalidad();
			this.codTipoCliente = to.getCodTipoCliente();
			this.fechaPiezaER = to.getFechaPiezaER();
			this.fechaPiezaTS = to.getFechaPiezaTS();
			this.fechaTerminoInquietud = to.getFechaTerminoInquietud();
			this.observacionSolucion = to.getObservacionSolucion();
			this.solucionTxt = to.getSolucionTxt();
			this.sucursalCliente = to.getSucursalCliente();
			
		}
		
	}

	/**
	 * Gets the codigo inquietud.
	 *
	 * @return the codigoInquietud
	 */
	public Integer getCodigoInquietud() {
		return codigoInquietud;
	}

	/**
	 * Sets the codigo inquietud.
	 *
	 * @param codigoInquietud the codigoInquietud to set
	 */
	public void setCodigoInquietud(Integer codigoInquietud) {
		this.codigoInquietud = codigoInquietud;
	}

	/**
	 * Gets the cod especie valorada.
	 *
	 * @return the codEspecieValorada
	 */
	public BigInteger getCodEspecieValorada() {
		return codEspecieValorada;
	}

	/**
	 * Sets the cod especie valorada.
	 *
	 * @param codEspecieValorada the codEspecieValorada to set
	 */
	public void setCodEspecieValorada(BigInteger codEspecieValorada) {
		this.codEspecieValorada = codEspecieValorada;
	}

	/**
	 * Gets the solucion txt.
	 *
	 * @return the solucionTxt
	 */
	public String getSolucionTxt() {
		return solucionTxt;
	}

	/**
	 * Sets the solucion txt.
	 *
	 * @param solucionTxt the solucionTxt to set
	 */
	public void setSolucionTxt(String solucionTxt) {
		this.solucionTxt = solucionTxt;
	}

	/**
	 * Gets the codigo cliente.
	 *
	 * @return the codigoCliente
	 */
	public Integer getCodigoCliente() {
		return codigoCliente;
	}

	/**
	 * Sets the codigo cliente.
	 *
	 * @param codigoCliente the codigoCliente to set
	 */
	public void setCodigoCliente(Integer codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	/**
	 * Gets the sucursal cliente.
	 *
	 * @return the sucursalCliente
	 */
	public Integer getSucursalCliente() {
		return sucursalCliente;
	}

	/**
	 * Sets the sucursal cliente.
	 *
	 * @param sucursalCliente the sucursalCliente to set
	 */
	public void setSucursalCliente(Integer sucursalCliente) {
		this.sucursalCliente = sucursalCliente;
	}

	/**
	 * Gets the cod tipo cliente.
	 *
	 * @return the codTipoCliente
	 */
	public Integer getCodTipoCliente() {
		return codTipoCliente;
	}

	/**
	 * Sets the cod tipo cliente.
	 *
	 * @param codTipoCliente the codTipoCliente to set
	 */
	public void setCodTipoCliente(Integer codTipoCliente) {
		this.codTipoCliente = codTipoCliente;
	}

	/**
	 * Gets the fecha termino inquietud.
	 *
	 * @return the fechaTerminoInquietud
	 */
	public Date getFechaTerminoInquietud() {
		return fechaTerminoInquietud;
	}

	/**
	 * Sets the fecha termino inquietud.
	 *
	 * @param fechaTerminoInquietud the fechaTerminoInquietud to set
	 */
	public void setFechaTerminoInquietud(Date fechaTerminoInquietud) {
		this.fechaTerminoInquietud = fechaTerminoInquietud;
	}

	/**
	 * Gets the codigo oficina.
	 *
	 * @return the codigoOficina
	 */
	public String getCodigoOficina() {
		return codigoOficina;
	}

	/**
	 * Sets the codigo oficina.
	 *
	 * @param codigoOficina the codigoOficina to set
	 */
	public void setCodigoOficina(String codigoOficina) {
		this.codigoOficina = codigoOficina;
	}

	/**
	 * Gets the codigo posta localidad.
	 *
	 * @return the codigoPostaLocalidad
	 */
	public String getCodigoPostaLocalidad() {
		return codigoPostaLocalidad;
	}

	/**
	 * Sets the codigo posta localidad.
	 *
	 * @param codigoPostaLocalidad the codigoPostaLocalidad to set
	 */
	public void setCodigoPostaLocalidad(String codigoPostaLocalidad) {
		this.codigoPostaLocalidad = codigoPostaLocalidad;
	}

	/**
	 * Gets the codigo excepcion.
	 *
	 * @return the codigoExcepcion
	 */
	public String getCodigoExcepcion() {
		return codigoExcepcion;
	}

	/**
	 * Sets the codigo excepcion.
	 *
	 * @param codigoExcepcion the codigoExcepcion to set
	 */
	public void setCodigoExcepcion(String codigoExcepcion) {
		this.codigoExcepcion = codigoExcepcion;
	}

	/**
	 * Gets the cantidad piezas.
	 *
	 * @return the cantidadPiezas
	 */
	public Integer getCantidadPiezas() {
		return cantidadPiezas;
	}

	/**
	 * Sets the cantidad piezas.
	 *
	 * @param cantidadPiezas the cantidadPiezas to set
	 */
	public void setCantidadPiezas(Integer cantidadPiezas) {
		this.cantidadPiezas = cantidadPiezas;
	}

	/**
	 * Gets the observacion solucion.
	 *
	 * @return the observacionSolucion
	 */
	public String getObservacionSolucion() {
		return observacionSolucion;
	}

	/**
	 * Sets the observacion solucion.
	 *
	 * @param observacionSolucion the observacionSolucion to set
	 */
	public void setObservacionSolucion(String observacionSolucion) {
		this.observacionSolucion = observacionSolucion;
	}

	/**
	 * Gets the fecha pieza ts.
	 *
	 * @return the fechaPiezaTS
	 */
	public Date getFechaPiezaTS() {
		return fechaPiezaTS;
	}

	/**
	 * Sets the fecha pieza ts.
	 *
	 * @param fechaPiezaTS the fechaPiezaTS to set
	 */
	public void setFechaPiezaTS(Date fechaPiezaTS) {
		this.fechaPiezaTS = fechaPiezaTS;
	}

	/**
	 * Gets the fecha pieza er.
	 *
	 * @return the fechaPiezaER
	 */
	public Date getFechaPiezaER() {
		return fechaPiezaER;
	}

	/**
	 * Sets the fecha pieza er.
	 *
	 * @param fechaPiezaER the fechaPiezaER to set
	 */
	public void setFechaPiezaER(Date fechaPiezaER) {
		this.fechaPiezaER = fechaPiezaER;
	}

	/**
	 * Gets the cantidad impresion.
	 *
	 * @return the cantidadImpresion
	 */
	public Integer getCantidadImpresion() {
		return cantidadImpresion;
	}

	/**
	 * Sets the cantidad impresion.
	 *
	 * @param cantidadImpresion the cantidadImpresion to set
	 */
	public void setCantidadImpresion(Integer cantidadImpresion) {
		this.cantidadImpresion = cantidadImpresion;
	}

	
}