package cl.bluex.digmodel.to;

import java.io.Serializable;

/**
 * Almacena datos de la especie valorada.
 * 
 * @author Edgardo Herrera
 *
 */
public class EspecieValoradaTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1113421254220436003L;
    private long eevvNmrId;
    private long codigoCliente;
    private long sucursalCliente;
    
    /**
     * Crea una nueva instancia de {@link EspecieValoradaTO}.
     */
    public EspecieValoradaTO() {
	super();
    }

    /**
     * @return the eevvNmrId
     */
    public long getEevvNmrId() {
        return eevvNmrId;
    }

    /**
     * @param eevvNmrId the eevvNmrId to set
     */
    public void setEevvNmrId(final long eevvNmrId) {
        this.eevvNmrId = eevvNmrId;
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

}
