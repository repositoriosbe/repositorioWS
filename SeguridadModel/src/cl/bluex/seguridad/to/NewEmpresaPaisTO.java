package cl.bluex.seguridad.to;

import java.io.Serializable;

/**
 * The Class EmpresaPais.
 */
public class NewEmpresaPaisTO implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 616008127843649189L;
	
	/** The codigo sistema. */
	private Integer codigoSistema;
	
	/** The codigo aplicacion. */
	private Integer codigoAplicacion;
	
	/** The codigo rol. */
	private Integer codigoRol;
	
	/** The nombre rol. */
	private String nombreRol;
	
	/** The codigo empresa. */
	private Integer codigoEmpresa;
	
	/** The codigo pais. */
	private String codigoPais;
	
	
	/**
	 * Instantiates a new empresa pais.
	 */
	public NewEmpresaPaisTO(){
		super();
	}


	/**
	 * Gets the codigo empresa.
	 *
	 * @return the codigo empresa
	 */
	public Integer getCodigoEmpresa() {
		return codigoEmpresa;
	}


	/**
	 * Sets the codigo empresa.
	 *
	 * @param codigoEmpresa the new codigo empresa
	 */
	public void setCodigoEmpresa(Integer codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}


	/**
	 * Gets the codigo pais.
	 *
	 * @return the codigo pais
	 */
	public String getCodigoPais() {
		return codigoPais;
	}


	/**
	 * Sets the codigo pais.
	 *
	 * @param codigoPais the new codigo pais
	 */
	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}


	/**
	 * Gets the codigo sistema.
	 *
	 * @return the codigo sistema
	 */
	public Integer getCodigoSistema() {
		return codigoSistema;
	}


	/**
	 * Sets the codigo sistema.
	 *
	 * @param codigoSistema the new codigo sistema
	 */
	public void setCodigoSistema(Integer codigoSistema) {
		this.codigoSistema = codigoSistema;
	}


	/**
	 * Gets the codigo aplicacion.
	 *
	 * @return the codigo aplicacion
	 */
	public Integer getCodigoAplicacion() {
		return codigoAplicacion;
	}


	/**
	 * Sets the codigo aplicacion.
	 *
	 * @param codigoAplicacion the new codigo aplicacion
	 */
	public void setCodigoAplicacion(Integer codigoAplicacion) {
		this.codigoAplicacion = codigoAplicacion;
	}


	/**
	 * Gets the codigo rol.
	 *
	 * @return the codigo rol
	 */
	public Integer getCodigoRol() {
		return codigoRol;
	}


	/**
	 * Sets the codigo rol.
	 *
	 * @param codigoRol the new codigo rol
	 */
	public void setCodigoRol(Integer codigoRol) {
		this.codigoRol = codigoRol;
	}


	/**
	 * Gets the nombre rol.
	 *
	 * @return the nombre rol
	 */
	public String getNombreRol() {
		return nombreRol;
	}


	/**
	 * Sets the nombre rol.
	 *
	 * @param nombreRol the new nombre rol
	 */
	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}

}
