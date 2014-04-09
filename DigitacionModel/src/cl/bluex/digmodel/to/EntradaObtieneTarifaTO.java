package cl.bluex.digmodel.to;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Edgardo Herrera
 *
 */
public class EntradaObtieneTarifaTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 8496742432001415197L;
    private long codigoEmpresa;
    private String codigoServicio;
    private String codigoProducto;
    private String codigoFamilia;
    private long codigoCliente;
    private long codigoSucursalCliente;
    private long codigoTipoCliente;
    private String codigoPostaOrigen;
    private String codigoPostaDestino;
    private String codigoMoneda;
    private Double pesovolumen;
    private Double pesofisico;
    private Date fecha;
    private long cantidadPiezas;
    private long valorApendice;
    
    /**
     * Crea nueva instancia de {@link EntradaObtieneTarifaTO}.
     */
    public EntradaObtieneTarifaTO() {
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
     * @return the codigoServicio
     */
    public String getCodigoServicio() {
        return codigoServicio;
    }

    /**
     * @param codigoServicio the codigoServicio to set
     */
    public void setCodigoServicio(final String codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    /**
     * @return the codigoProducto
     */
    public String getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * @param codigoProducto the codigoProducto to set
     */
    public void setCodigoProducto(final String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    /**
     * @return the codigoFamilia
     */
    public String getCodigoFamilia() {
        return codigoFamilia;
    }

    /**
     * @param codigoFamilia the codigoFamilia to set
     */
    public void setCodigoFamilia(final String codigoFamilia) {
        this.codigoFamilia = codigoFamilia;
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
     * @return the codigoPostaOrigen
     */
    public String getCodigoPostaOrigen() {
        return codigoPostaOrigen;
    }

    /**
     * @param codigoPostaOrigen the codigoPostaOrigen to set
     */
    public void setCodigoPostaOrigen(final String codigoPostaOrigen) {
        this.codigoPostaOrigen = codigoPostaOrigen;
    }

    /**
     * @return the codigoPostaDestino
     */
    public String getCodigoPostaDestino() {
        return codigoPostaDestino;
    }

    /**
     * @param codigoPostaDestino the codigoPostaDestino to set
     */
    public void setCodigoPostaDestino(final String codigoPostaDestino) {
        this.codigoPostaDestino = codigoPostaDestino;
    }

    /**
     * @return the codigoMoneda
     */
    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    /**
     * @param codigoMoneda the codigoMoneda to set
     */
    public void setCodigoMoneda(final String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(final Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the cantidadPiezas
     */
    public long getCantidadPiezas() {
        return cantidadPiezas;
    }

    /**
     * @param cantidadPiezas the cantidadPiezas to set
     */
    public void setCantidadPiezas(final long cantidadPiezas) {
        this.cantidadPiezas = cantidadPiezas;
    }

    /**
     * @return the valorApendice
     */
    public long getValorApendice() {
        return valorApendice;
    }

    /**
     * @param valorApendice the valorApendice to set
     */
    public void setValorApendice(final long valorApendice) {
        this.valorApendice = valorApendice;
    }

    /**
     * @return the pesovolumen
     */
    public Double getPesovolumen() {
        return pesovolumen;
    }

    /**
     * @param pesovolumen the pesovolumen to set
     */
    public void setPesovolumen(final Double pesovolumen) {
        this.pesovolumen = pesovolumen;
    }

    /**
     * @return the pesofisico
     */
    public Double getPesofisico() {
        return pesofisico;
    }

    /**
     * @param pesofisico the pesofisico to set
     */
    public void setPesofisico(final Double pesofisico) {
        this.pesofisico = pesofisico;
    }

}
