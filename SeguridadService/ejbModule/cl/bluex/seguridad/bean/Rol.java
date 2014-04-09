package cl.bluex.seguridad.bean;

import cl.bluex.seguridad.to.RolTO;

/**
 * @author eherrera
 *
 */
public class Rol {
	private long codigo;
	private String descripcion;
	
	/**
	 * crea instancia de Rol
	 *
	 */
	public Rol() {
		super();
	}
	
	public Rol(final RolTO to) {
		super();
		if (to != null) {
			this.codigo = to.getCodigo();
			this.descripcion = to.getDescripcion();
		}
	}

	/**
	 * @return the codigo
	 */
	public long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(final long codigo) {
		this.codigo = codigo;
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
	
}
