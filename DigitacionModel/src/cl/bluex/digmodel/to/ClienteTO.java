package cl.bluex.digmodel.to;

import java.io.Serializable;

/**
 * The Class ClienteTO.
 */
public class ClienteTO implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = -4273576908669080083L;
    private long codigoCliente;
    private long sucursalCliente;
    private long tipoCliente;
    
    
    /**
     * Crea nueva instancia de {@link ClienteTO}.
     */
    public ClienteTO() {
	super();
    }

    /**
     * Gets the codigo cliente.
     *
     * @return the codigo cliente
     */
    public long getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Sets the codigo cliente.
     *
     * @param codigoCliente the new codigo cliente
     */
    public void setCodigoCliente(final long codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    /**
     * Gets the sucursal cliente.
     *
     * @return the sucursal cliente
     */
    public long getSucursalCliente() {
        return sucursalCliente;
    }

    /**
     * Sets the sucursal cliente.
     *
     * @param sucursalCliente the new sucursal cliente
     */
    public void setSucursalCliente(final long sucursalCliente) {
        this.sucursalCliente = sucursalCliente;
    }

    /**
     * Gets the tipo cliente.
     *
     * @return the tipo cliente
     */
    public long getTipoCliente() {
        return tipoCliente;
    }

    /**
     * Sets the tipo cliente.
     *
     * @param tipoCliente the new tipo cliente
     */
    public void setTipoCliente(final long tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    
}
