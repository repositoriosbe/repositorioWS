package cl.bluex.listas.bean.request;

/**
 * Almacena datos del centro de costo.
 * 
 * @author Edgardo Herrera
 *
 */
public class RequestCentrosCosto {
    private long codigoEmpresa;
    private long codigoCliente;
    private long codigoSucursalCliente;
    private long codigoTipoCliente;
    private String codigoCentroCosto;

    /**
     * Constructor.
     */
    public RequestCentrosCosto() {
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
     * @return the codigoSucursalCliente
     */
    public long getCodigoSucursalCliente() {
        return codigoSucursalCliente;
    }

    /**
     * @param codigoSucursalCliente the codigoSucursalCliente to set
     */
    public void setCodigoSucursalCliente(final long codigoSucursalCliente) {
        this.codigoSucursalCliente = codigoSucursalCliente;
    }

    /**
     * @return the codigoTipoCliente
     */
    public long getCodigoTipoCliente() {
        return codigoTipoCliente;
    }

    /**
     * @param codigoTipoCliente the codigoTipoCliente to set
     */
    public void setCodigoTipoCliente(final long codigoTipoCliente) {
        this.codigoTipoCliente = codigoTipoCliente;
    }

    /**
     * @return the codigoCentroCosto
     */
    public String getCodigoCentroCosto() {
        return codigoCentroCosto;
    }

    /**
     * @param codigoCentroCosto the codigoCentroCosto to set
     */
    public void setCodigoCentroCosto(final String codigoCentroCosto) {
        this.codigoCentroCosto = codigoCentroCosto;
    }

}
