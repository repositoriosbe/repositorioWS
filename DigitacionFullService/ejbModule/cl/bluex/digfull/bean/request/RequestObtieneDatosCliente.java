package cl.bluex.digfull.bean.request;

/**
 * Request metodo obtiene datos cliente.
 * 
 * @author Edgardo Herrera
 *
 */
public class RequestObtieneDatosCliente {
    private long codigoCliente;
    private long sucursalCliente;
    private long tipoCliente;
    private long codigoEmpresa;
    
    /**
     * Constructor.
     */
    public RequestObtieneDatosCliente() {
	super();
    }

    /**
     * @return the codigoCliente
     */
    public long getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * @param codigoCliente the codigoCliente to set
     */
    public void setCodigoCliente(final long codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    /**
     * @return the sucursalCliente
     */
    public long getSucursalCliente() {
        return sucursalCliente;
    }

    /**
     * @param sucursalCliente the sucursalCliente to set
     */
    public void setSucursalCliente(final long sucursalCliente) {
        this.sucursalCliente = sucursalCliente;
    }

    /**
     * @return the tipoCliente
     */
    public long getTipoCliente() {
        return tipoCliente;
    }

    /**
     * @param tipoCliente the tipoCliente to set
     */
    public void setTipoCliente(final long tipoCliente) {
        this.tipoCliente = tipoCliente;
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
    
}
