package cl.bluex.listas.bean.request;

/**
 * @author eherrera
 *
 */
public class RequestObtieneTraduccionProducto {
	private String tipo;
	private long codigoEmpresa;
	
	/**
	 * crea instancia de RequestObtieneTraduccionProducto
	 *
	 */
	public RequestObtieneTraduccionProducto() {
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
