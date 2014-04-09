/**
 * 
 */
package cl.bluex.generadoretiqueta.to;

import java.io.Serializable;

/**
 * @author rmoscoso
 *
 */
public class ResponsableTO implements Serializable {

	private static final long serialVersionUID = -4107686554523353250L;
	
	private String rut;
	private String telefono;
	private String descripcion;
	private int motivo;
	private String nombre;
	
	/**
	 * Constructor de la clase.
	 */
	public ResponsableTO() {
		super();
	}

	/**
	 * @param rut
	 * @param telefono
	 * @param descripcion
	 * @param motivo
	 */
	public ResponsableTO(String rut, String telefono, String descripcion,
			int motivo, String nombre) {
		super();
		this.rut = rut;
		this.telefono = telefono;
		this.descripcion = descripcion;
		this.motivo = motivo;
		this.nombre = nombre;
	}

	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * @param rut the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the motivo
	 */
	public int getMotivo() {
		return motivo;
	}

	/**
	 * @param motivo the motivo to set
	 */
	public void setMotivo(int motivo) {
		this.motivo = motivo;
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
	
	

}
