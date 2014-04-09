package cl.bluex.listas.bean;

import cl.bluex.digmodel.to.OficinaTO;

/**
 * Almacena datos de la oficina.
 * 
 * @author Edgardo Herrera
 * 
 */
public class Oficina {

	private long codigoEmpresa;
	private String codigo;
	private String descripcion;
	private String codigoPosta;
	private long codigoCliente;
	private long codigoSucursal;
	private long codigoTipoCliente;

	/**
	 * Constructor.
	 */
	public Oficina() {
		super();
	}

	/**
	 * crea instancia de Oficina
	 *
	 * @param to
	 */
	public Oficina(final OficinaTO to) {
		if (to != null) {
			this.codigoEmpresa = to.getCodigoEmpresa();
			this.codigo = to.getCodigo();
			this.descripcion = to.getDescripcion();
			this.codigoPosta = to.getCodigoPosta();
			this.codigoCliente = to.getCodigoCliente();
			this.codigoSucursal = to.getCodigoSucursal();
			this.codigoTipoCliente = to.getCodigoTipoCliente();
		}
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

	/**
	 * @return the codigoPosta
	 */
	public String getCodigoPosta() {
		return codigoPosta;
	}

	/**
	 * @param codigoPosta the codigoPosta to set
	 */
	public void setCodigoPosta(final String codigoPosta) {
		this.codigoPosta = codigoPosta;
	}

	/**
	 * @return the codigoCliente
	 */
	public long getCodigoCliente() {
		return codigoCliente;
	}

	/**
	 * @param codigoCliente the codigoCliente to set
	 */
	public void setCodigoCliente(final long codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	/**
	 * @return the codigoSucursal
	 */
	public long getCodigoSucursal() {
		return codigoSucursal;
	}

	/**
	 * @param codigoSucursal the codigoSucursal to set
	 */
	public void setCodigoSucursal(final long codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}

	/**
	 * @return the codigoTipoCliente
	 */
	public long getCodigoTipoCliente() {
		return codigoTipoCliente;
	}

	/**
	 * @param codigoTipoCliente the codigoTipoCliente to set
	 */
	public void setCodigoTipoCliente(final long codigoTipoCliente) {
		this.codigoTipoCliente = codigoTipoCliente;
	}

}
