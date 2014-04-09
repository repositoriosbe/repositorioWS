package cl.bluex.generadoretiqueta.bean.response;

import cl.bluex.generadoretiqueta.bean.Destino;

/**
 * @author Edgardo Herrera
 *
 */
public class ResponseDestino {
    private Destino destino;
    
    /**
     * Crea instancia de {@link ResponseDestino}.
     *
     */
    public ResponseDestino() {
	super();
    }

    /**
     * Crea instancia de {@link ResponseDestino}.
     *
     * @param destino
     */
    public ResponseDestino(final Destino destino) {
	super();
	this.destino = destino;
    }

    /**
     * @return the destino
     */
    public Destino getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(final Destino destino) {
        this.destino = destino;
    }
    
    
}
