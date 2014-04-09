package cl.bluex.seguridad.to;

/**
 * @author eherrera
 *
 */
public class RolTO {
	private long codigo;
	private String descripcion;
	
	/**
	 * crea instancia de RolTO
	 *
	 */
	public RolTO() {
		super();
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
