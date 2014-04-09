package cl.bluex.listas.bean.request;

/**
 * Clase que almacena datos del producto.
 * 
 * @author Edgardo Herrera
 *
 */
public class RequestProducto {
    private String codigoFamilia;
    private long codigoEmpresa;
    
    /**
     * Constructor.
     */
    public RequestProducto() {
	super();
    }

    public String getCodigoFamilia() {
        return codigoFamilia;
    }

    public void setCodigoFamilia(final String codigoFamilia) {
        this.codigoFamilia = codigoFamilia;
    }

    public long getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(final long codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }
    
}
