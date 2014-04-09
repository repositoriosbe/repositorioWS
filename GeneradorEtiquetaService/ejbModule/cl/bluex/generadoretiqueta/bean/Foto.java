package cl.bluex.generadoretiqueta.bean;

import java.io.Serializable;

public class Foto implements Serializable {

	private static final long serialVersionUID = -2961247575765812175L;
	private String nombre;
	private String fechaEnvio;
	
	/**
	 * Crea instancia de {@link Foto}.
	 * 
	 */
	public Foto() {
		super();
	}
	
	/**
	 * @param nombre
	 * @param fechaEnvio
	 */
	public Foto(String nombre, String fechaEnvio) {
		super();
		this.nombre = nombre;
		this.fechaEnvio = fechaEnvio;
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
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return the fechaEnvio
	 */
	public String getFechaEnvio() {
		return fechaEnvio;
	}
	
	/**
	 * @param fechaEnvio the fechaEnvio to set
	 */
	public void setFechaEnvio(String fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}
	
	
	
	
}
