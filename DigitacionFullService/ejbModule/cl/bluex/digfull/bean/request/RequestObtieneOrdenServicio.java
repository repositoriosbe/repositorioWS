package cl.bluex.digfull.bean.request;

/**
 * @author Edgardo Herrera
 *
 */
public class RequestObtieneOrdenServicio {
    private long codigoEmpresa;
    private String codigoTipoDocumento;
    private long numeroDocumento;

    
    /**
     * Crea instancia de {@link RequestObtieneOrdenServicio}.
     *
     */
    public RequestObtieneOrdenServicio() {
	super();
    }


    /**
     * @return the codigoEmpresa
     */
    public long getCodigoEmpresa() {
        return codigoEmpresa;
    }


    /**
     * @param codigoEmpresa the codigoEmpresa to set
     */
    public void setCodigoEmpresa(final long codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }


    /**
     * @return the codigoTipoDocumento
     */
    public String getCodigoTipoDocumento() {
        return codigoTipoDocumento;
    }


    /**
     * @param codigoTipoDocumento the codigoTipoDocumento to set
     */
    public void setCodigoTipoDocumento(final String codigoTipoDocumento) {
        this.codigoTipoDocumento = codigoTipoDocumento;
    }


    /**
     * @return the numeroDocumento
     */
    public long getNumeroDocumento() {
        return numeroDocumento;
    }


    /**
     * @param numeroDocumento the numeroDocumento to set
     */
    public void setNumeroDocumento(final long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

}
