package cl.bluex.digfull.bean.request;

import cl.bluex.digfull.bean.EntradaObtieneTarifa;

/**
 * @author Edgardo Herrera
 *
 */
public class RequestObtieneTarifa {
    private EntradaObtieneTarifa entradaObtieneTarifa;
    
    /**
     * Crea instancia de {@link RequestObtieneTarifa}.
     *
     */
    public RequestObtieneTarifa() {
	super();
    }

    /**
     * @return the entradaObtieneTarifa
     */
    public EntradaObtieneTarifa getEntradaObtieneTarifa() {
        return entradaObtieneTarifa;
    }

    /**
     * @param entradaObtieneTarifa the entradaObtieneTarifa to set
     */
    public void setEntradaObtieneTarifa(final EntradaObtieneTarifa entradaObtieneTarifa) {
        this.entradaObtieneTarifa = entradaObtieneTarifa;
    }
    
}
