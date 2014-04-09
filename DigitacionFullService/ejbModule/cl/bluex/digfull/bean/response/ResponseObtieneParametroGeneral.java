package cl.bluex.digfull.bean.response;

import java.io.Serializable;

/**
 * @author Edgardo Herrera
 *
 */
public class ResponseObtieneParametroGeneral implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -8680695007081428301L;
    private String valor;
    
    /**
     * Constructor.
     */
    public ResponseObtieneParametroGeneral() {
	super();
    }

    public ResponseObtieneParametroGeneral(final String valor) {
	this.valor = valor;
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(final String valor) {
        this.valor = valor;
    }
    
    
}
