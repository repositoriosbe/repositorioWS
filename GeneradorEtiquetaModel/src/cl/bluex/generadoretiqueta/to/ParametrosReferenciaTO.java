package cl.bluex.generadoretiqueta.to;

/**
 * @author eherrera
 *
 */
public class ParametrosReferenciaTO {
	private String numeroReferencia;
	private int codigoCliente;
	private int codigoSucursalCliente;
	private int codigoTipoCliente;
	private int codigoEmpresa;
	
	/**
	 * crea instancia de ParametrosReferenciaTO
	 *
	 */
	public ParametrosReferenciaTO() {
		super();
	}

	/**
	 * @return the numeroReferencia
	 */
	public String getNumeroReferencia() {
		return numeroReferencia;
	}

	/**
	 * @param numeroReferencia the numeroReferencia to set
	 */
	public void setNumeroReferencia(final String numeroReferencia) {
		this.numeroReferencia = numeroReferencia;
	}

	/**
	 * @return the codigoCliente
	 */
	public int getCodigoCliente() {
		return codigoCliente;
	}

	/**
	 * @param codigoCliente the codigoCliente to set
	 */
	public void setCodigoCliente(final int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	/**
	 * @return the codigoSucursalCliente
	 */
	public int getCodigoSucursalCliente() {
		return codigoSucursalCliente;
	}

	/**
	 * @param codigoSucursalCliente the codigoSucursalCliente to set
	 */
	public void setCodigoSucursalCliente(final int codigoSucursalCliente) {
		this.codigoSucursalCliente = codigoSucursalCliente;
	}

	/**
	 * @return the codigoTipoCliente
	 */
	public int getCodigoTipoCliente() {
		return codigoTipoCliente;
	}

	/**
	 * @param codigoTipoCliente the codigoTipoCliente to set
	 */
	public void setCodigoTipoCliente(final int codigoTipoCliente) {
		this.codigoTipoCliente = codigoTipoCliente;
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
	
}
