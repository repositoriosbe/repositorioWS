package cl.bluex.digfull.bean.response;

import cl.bluex.digfull.bean.TipoCliente;

/**
 * Response Valida Tipo Cliente.
 * 
 * @author Edgardo Herrera
 *
 */
public class ResponseValidaTipoCliente {
    private TipoCliente tipoCliente;
    
    /**
     * Constructor.
     */
    public ResponseValidaTipoCliente() {
	super();
    }

    /**
     * Constructor.
     * 
     * @param {@link TipoCliente tipoCliente} 
     */
    public ResponseValidaTipoCliente(final TipoCliente tipoCliente) {
	this.tipoCliente = tipoCliente;
    }

    /**
     * @return the tipoCliente
     */
    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    /**
     * @param tipoCliente the tipoCliente to set
     */
    public void setTipoCliente(final TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

}
