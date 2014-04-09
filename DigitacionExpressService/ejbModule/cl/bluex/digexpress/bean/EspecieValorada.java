package cl.bluex.digexpress.bean;

import cl.bluex.digmodel.to.EspecieValoradaTO;

/**
 * Almacena datos de la especie valorada.
 * 
 * @author Edgardo Herrera
 *
 */
public class EspecieValorada {
    private long eevvNmrId;
    private long codigoCliente;
    private long sucursalCliente;
    
    public EspecieValorada() {
	super();
    }
    
    /**
     * @param valueTO
     */
    public EspecieValorada(final EspecieValoradaTO to) {
	if (to != null) {
	    this.eevvNmrId = to.getEevvNmrId();
	    this.codigoCliente = to.getCodigoCliente();
	    this.sucursalCliente = to.getSucursalCliente();
	}
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
