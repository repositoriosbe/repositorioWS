package cl.bluex.digmodel.to;

import java.io.Serializable;

/**
 * @author Edgardo Herrera
 *
 */
public class ReferenciaTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -4171084780533984554L;
    private long eevvNmrid;
    private String codigoTipoReferencia;
    
    /**
     * Constructor.
     */
    public ReferenciaTO() {
	super();
    }

    /**
     * @return the eevvNmrid
     */
    public long getEevvNmrid() {
        return eevvNmrid;
    }

    /**
     * @param eevvNmrid the eevvNmrid to set
     */
    public void setEevvNmrid(final long eevvNmrid) {
        this.eevvNmrid = eevvNmrid;
    }

    /**
     * @return the codigoTipoReferencia
     */
    public String getCodigoTipoReferencia() {
        return codigoTipoReferencia;
    }

    /**
     * @param codigoTipoReferencia the codigoTipoReferencia to set
     */
    public void setCodigoTipoReferencia(final String codigoTipoReferencia) {
        this.codigoTipoReferencia = codigoTipoReferencia;
    }

}
