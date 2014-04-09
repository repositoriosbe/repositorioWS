package cl.bluex.digexpress.bean.request;

/**
 * Almacena datos de las especies valoradas.
 * 
 * @author Edgardo Herrera
 *
 */
public class RequestEspecieValorada {
    private long codigoEmpresa;
    private String codigoTipoDocumento;
    private long numeroDocumento;
    
    public RequestEspecieValorada() {
	super();
    }

    public long getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(final long codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getCodigoTipoDocumento() {
        return codigoTipoDocumento;
    }

    public void setCodigoTipoDocumento(final String codigoTipoDocumento) {
        this.codigoTipoDocumento = codigoTipoDocumento;
    }

    public long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(final long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    
}
