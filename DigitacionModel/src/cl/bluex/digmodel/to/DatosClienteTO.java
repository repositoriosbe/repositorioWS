package cl.bluex.digmodel.to;

import java.io.Serializable;

/**
 * TO datos del Cliente.
 * 
 * @author Edgardo Herrera
 * 
 */
public class DatosClienteTO implements Serializable {
	/**
     * 
     */
	private static final long serialVersionUID = 1281431598827685994L;
	private long rut;
	private String digitoVerificador;
	private String nombre;
	private String codigoRegion;
	private String ciudad;
	private String calle;
	private long codigoComuna;
	private String comuna;
	private long numero;
	private String depto;
	private String block;
	private long piso;
	private String direccion;
	private String codigoPostal;
	private String prefijoFono;
	private String fono;
	private String extensionFono;
	private long swtValorado;
	private String swtCtaGratis;
	
	/**
	 * @return the rut
	 */
	public long getRut() {
		return rut;
	}
	/**
	 * @param rut the rut to set
	 */
	public void setRut(final long rut) {
		this.rut = rut;
	}
	/**
	 * @return the digitoVerificador
	 */
	public String getDigitoVerificador() {
		return digitoVerificador;
	}
	/**
	 * @param digitoVerificador the digitoVerificador to set
	 */
	public void setDigitoVerificador(final String digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the codigoRegion
	 */
	public String getCodigoRegion() {
		return codigoRegion;
	}
	/**
	 * @param codigoRegion the codigoRegion to set
	 */
	public void setCodigoRegion(final String codigoRegion) {
		this.codigoRegion = codigoRegion;
	}
	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}
	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(final String ciudad) {
		this.ciudad = ciudad;
	}
	/**
	 * @return the calle
	 */
	public String getCalle() {
		return calle;
	}
	/**
	 * @param calle the calle to set
	 */
	public void setCalle(final String calle) {
		this.calle = calle;
	}
	/**
	 * @return the codigoComuna
	 */
	public long getCodigoComuna() {
		return codigoComuna;
	}
	/**
	 * @param codigoComuna the codigoComuna to set
	 */
	public void setCodigoComuna(final long codigoComuna) {
		this.codigoComuna = codigoComuna;
	}
	/**
	 * @return the comuna
	 */
	public String getComuna() {
		return comuna;
	}
	/**
	 * @param comuna the comuna to set
	 */
	public void setComuna(final String comuna) {
		this.comuna = comuna;
	}
	/**
	 * @return the numero
	 */
	public long getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(final long numero) {
		this.numero = numero;
	}
	/**
	 * @return the depto
	 */
	public String getDepto() {
		return depto;
	}
	/**
	 * @param depto the depto to set
	 */
	public void setDepto(final String depto) {
		this.depto = depto;
	}
	/**
	 * @return the block
	 */
	public String getBlock() {
		return block;
	}
	/**
	 * @param block the block to set
	 */
	public void setBlock(final String block) {
		this.block = block;
	}
	/**
	 * @return the piso
	 */
	public long getPiso() {
		return piso;
	}
	/**
	 * @param piso the piso to set
	 */
	public void setPiso(final long piso) {
		this.piso = piso;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(final String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the codigoPostal
	 */
	public String getCodigoPostal() {
		return codigoPostal;
	}
	/**
	 * @param codigoPostal the codigoPostal to set
	 */
	public void setCodigoPostal(final String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	/**
	 * @return the prefijoFono
	 */
	public String getPrefijoFono() {
		return prefijoFono;
	}
	/**
	 * @param prefijoFono the prefijoFono to set
	 */
	public void setPrefijoFono(final String prefijoFono) {
		this.prefijoFono = prefijoFono;
	}
	/**
	 * @return the fono
	 */
	public String getFono() {
		return fono;
	}
	/**
	 * @param fono the fono to set
	 */
	public void setFono(final String fono) {
		this.fono = fono;
	}
	/**
	 * @return the extensionFono
	 */
	public String getExtensionFono() {
		return extensionFono;
	}
	/**
	 * @param extensionFono the extensionFono to set
	 */
	public void setExtensionFono(final String extensionFono) {
		this.extensionFono = extensionFono;
	}
	/**
	 * @return the swtValorado
	 */
	public long getSwtValorado() {
		return swtValorado;
	}
	/**
	 * @param swtValorado the swtValorado to set
	 */
	public void setSwtValorado(final long swtValorado) {
		this.swtValorado = swtValorado;
	}
	/**
	 * @return the swtCtaGratis
	 */
	public String getSwtCtaGratis() {
		return swtCtaGratis;
	}
	/**
	 * @param swtCtaGratis the swtCtaGratis to set
	 */
	public void setSwtCtaGratis(final String swtCtaGratis) {
		this.swtCtaGratis = swtCtaGratis;
	}

}
