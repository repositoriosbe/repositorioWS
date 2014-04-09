package cl.bluex.listas.bean.request;

/**
 * @author edgardo
 *
 */
public class RequestPosta {
    private String codigo;
    private long tipoNegocio;
    
    public RequestPosta() {
	super();
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(final String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the tipoNegocio
     */
    public long getTipoNegocio() {
        return tipoNegocio;
    }

    /**
     * @param tipoNegocio the tipoNegocio to set
     */
    public void setTipoNegocio(final long tipoNegocio) {
        this.tipoNegocio = tipoNegocio;
    }

}
