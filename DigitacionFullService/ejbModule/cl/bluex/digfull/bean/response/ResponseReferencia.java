package cl.bluex.digfull.bean.response;

import java.util.List;

import cl.bluex.digfull.bean.Referencia;

/**
 * @author Edgardo Herrera
 *
 */
public class ResponseReferencia {
    private List<Referencia> referencias;
    
    /**
     * Crea instancia de {@link ResponseReferencia}.
     *
     */
    public ResponseReferencia() {
	super();
    }

    public ResponseReferencia(final List<Referencia> referencias) {
	super();
	this.referencias = referencias;
    }

    /**
     * @return the referencias
     */
    public List<Referencia> getReferencias() {
        return referencias;
    }

    /**
     * @param referencias the referencias to set
     */
    public void setReferencias(final List<Referencia> referencias) {
        this.referencias = referencias;
    }
    
    
}
