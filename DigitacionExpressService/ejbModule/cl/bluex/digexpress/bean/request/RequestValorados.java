package cl.bluex.digexpress.bean.request;

/**
 * Clase que obtiene los datos de Valorados.
 * 
 * @author Edgardo Herrera
 *
 */
public class RequestValorados {
    private long codigoCliente;
    private long codigoTipoCliente;
    private long codigoEmpresa;
    private long codigoSucursalCliente;
    
    /**
     * Constructor.
     */
    public RequestValorados() {
	super();
    }

    public long getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(final long codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public long getCodigoTipoCliente() {
        return codigoTipoCliente;
    }

    public void setCodigoTipoCliente(final long codigoTipoCliente) {
        this.codigoTipoCliente = codigoTipoCliente;
    }

    public long getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(final long codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public long getCodigoSucursalCliente() {
        return codigoSucursalCliente;
    }

    public void setCodigoSucursalCliente(final long codigoSucursalCliente) {
        this.codigoSucursalCliente = codigoSucursalCliente;
    }
    
}
