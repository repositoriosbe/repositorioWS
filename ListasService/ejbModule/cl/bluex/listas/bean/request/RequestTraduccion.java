package cl.bluex.listas.bean.request;

/**
 * Almacena datos de entrada de la traduccion.
 * 
 * @author Edgardo Herrera
 * 
 */
public class RequestTraduccion {
	private String tipo;
	private String codigoOrigen;
	private long codigoEmpresa;

	/**
	 * crea instancia de RequestTraduccion
	 *
	 */
	public RequestTraduccion() {
		super();
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(final String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the codigoOrigen
	 */
	public String getCodigoOrigen() {
		return codigoOrigen;
	}

	/**
	 * @param codigoOrigen the codigoOrigen to set
	 */
	public void setCodigoOrigen(final String codigoOrigen) {
		this.codigoOrigen = codigoOrigen;
	}

	/**
	 * @return the codigoEmpresa
	 */
	public long getCodigoEmpresa() {
		return codigoEmpresa;
	}

	/**
	 * @param codigoEmpresa the codigoEmpresa to set
	 */
	public void setCodigoEmpresa(final long codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

}
