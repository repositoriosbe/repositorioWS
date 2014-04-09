package cl.bluex.listas.bean.request;

/**
 * Request que almacena datos del tipo de servicio.
 * 
 * @author Edgardo Herrera
 *
 */
public class RequestTipoServicio {
    private long codigoEmpresa;
    private String tipo;
    
    /**
     * Constructor.
     */
    public RequestTipoServicio() {
	super();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(final String tipo) {
        this.tipo = tipo;
    }

    public long getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(final long codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }
    
    
}
