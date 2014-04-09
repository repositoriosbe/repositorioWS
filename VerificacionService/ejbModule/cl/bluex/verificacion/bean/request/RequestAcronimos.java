package cl.bluex.verificacion.bean.request;

/**
 * @author eherrera
 *
 */
public class RequestAcronimos {
	private int codigoEmpresa;
	private String codigoTipo;
	
	/**
	 * crea instancia de RequestAcronimos
	 *
	 */
	public RequestAcronimos() {
		super();
	}

	/**
	 * @return the codigoEmpresa
	 */
	public int getCodigoEmpresa() {
		return codigoEmpresa;
	}

	/**
	 * @param codigoEmpresa the codigoEmpresa to set
	 */
	public void setCodigoEmpresa(final int codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	/**
	 * @return the codigoTipo
	 */
	public String getCodigoTipo() {
		return codigoTipo;
	}

	/**
	 * @param codigoTipo the codigoTipo to set
	 */
	public void setCodigoTipo(final String codigoTipo) {
		this.codigoTipo = codigoTipo;
	}
	
}
