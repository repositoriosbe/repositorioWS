package cl.bluex.digfull.bean.request;

/**
 * @author Edgardo Herrera
 *
 */
public class RequestObtieneParametroGeneral {
    private String idParametro;
    private String nombreCampo;
    
    /**
     * Crea instancia de {@link RequestObtieneParametroGeneral}.
     *
     */
    public RequestObtieneParametroGeneral() {
	super();
    }

    /**
     * @return the idParametro
     */
    public String getIdParametro() {
        return idParametro;
    }

    /**
     * @param idParametro the idParametro to set
     */
    public void setIdParametro(final String idParametro) {
        this.idParametro = idParametro;
    }

    /**
     * @return the nombreCampo
     */
    public String getNombreCampo() {
        return nombreCampo;
    }

    /**
     * @param nombreCampo the nombreCampo to set
     */
    public void setNombreCampo(final String nombreCampo) {
        this.nombreCampo = nombreCampo;
    }
    
}
