package cl.bluex.verificamodel.to;

/**
 * @author eherrera
 *
 */
public class AcronimoTO {
	private String codigo;
	private String descripcion;
	
	/**
	 * crea instancia de AcronimoTO
	 *
	 */
	public AcronimoTO() {
		super();
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(final String codigo) {
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
