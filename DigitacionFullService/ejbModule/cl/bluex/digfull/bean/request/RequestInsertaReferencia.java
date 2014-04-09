package cl.bluex.digfull.bean.request;

import cl.bluex.digfull.bean.Referencia;

/**
 * @author Edgardo Herrera
 *
 */
public class RequestInsertaReferencia {
    private Referencia referencia;
    
    /**
     * Crea instancia de {@link RequestInsertaReferencia}.
     *
     */
    public RequestInsertaReferencia() {
	super();
    }

    /**
     * @return the referencia
     */
    public Referencia getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(final Referencia referencia) {
        this.referencia = referencia;
    }
}
