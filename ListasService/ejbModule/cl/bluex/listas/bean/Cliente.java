package cl.bluex.listas.bean;

import cl.bluex.digmodel.to.ClienteTO;


/**
 * Almacena datos del cliente.
 * 
 * @author Edgardo Herrera
 *
 */
public class Cliente {
	private long codigoCliente;
	private long sucursalCliente;
	private long tipoCliente;

	/**
	 * Constructor.
	 */
	public Cliente() {
		super();
	}
	
	/**
	 * crea instancia de Cliente
	 *
	 * @param to
	 */
	public Cliente(final ClienteTO to) {
		if (to != null) {
			this.codigoCliente = to.getCodigoCliente();
			this.sucursalCliente = to.getSucursalCliente();
			this.tipoCliente = to.getTipoCliente();
		}
	}

	/**
	 * @return the codigoCliente
	 */
	public long getCodigoCliente() {
		return codigoCliente;
	}

	/**
	 * @param codigoCliente
	 *            the codigoCliente to set
	 */
	public void setCodigoCliente(final long codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	/**
	 * @return the sucursalCliente
	 */
	public long getSucursalCliente() {
		return sucursalCliente;
	}

    /**
     * @param sucursalCliente the sucursalCliente to set
     */
    public void setSucursalCliente(final long sucursalCliente) {
        this.sucursalCliente = sucursalCliente;
    }

    /**
     * @return the tipoCliente
     */
    public long getTipoCliente() {
        return tipoCliente;
    }

    /**
     * @param tipoCliente the tipoCliente to set
     */
    public void setTipoCliente(final long tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

}
