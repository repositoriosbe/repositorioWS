package cl.bluex.digfull.bean.response;

/**
 * Response validar indicador punto de entrega.
 * 
 * @author Edgardo Herrera
 *
 */
public class ResponseValidaIndicadorPtoEntrega {
    private String indicador;
    
    /**
     * Constructor.
     */
    public ResponseValidaIndicadorPtoEntrega() {
	super();
    }

    /**
     * Constructor.
     * 
     * @param indicador {@link String}
     */
    public ResponseValidaIndicadorPtoEntrega(final String indicador) {
	this.indicador = indicador;
    }

    /**
     * @return the indicador
     */
    public String getIndicador() {
        return indicador;
    }

    /**
     * @param indicador the indicador to set
     */
    public void setIndicador(final String indicador) {
        this.indicador = indicador;
    }
    
}
