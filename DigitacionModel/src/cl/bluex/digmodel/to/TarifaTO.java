package cl.bluex.digmodel.to;

import java.io.Serializable;

/**
 * @author Edgardo Herrera
 *
 */
public class TarifaTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 6002318779762812568L;
    private Double tarifa;
    private Double flete;
    private String codigoMetodoCalculo;
    private String unidadBase;
    private String indicadorUsaRi;
    private String indicadorUnidades;
    private Long cargoPorcentual;
    private Long cargoFijo;
    private Long numeroAcuerdo;
    private String usaPuntoEntrega;
    private String swActivacion;
    private String impuesto;
    
    /**
     * Crea nueva instancia de {@link TarifaTO}.
     */
    public TarifaTO() {
	super();
    }

    /**
     * @return the codigoMetodoCalculo
     */
    public String getCodigoMetodoCalculo() {
        return codigoMetodoCalculo;
    }

    /**
     * @param codigoMetodoCalculo the codigoMetodoCalculo to set
     */
    public void setCodigoMetodoCalculo(final String codigoMetodoCalculo) {
        this.codigoMetodoCalculo = codigoMetodoCalculo;
    }

    /**
     * @return the unidadBase
     */
    public String getUnidadBase() {
        return unidadBase;
    }

    /**
     * @param unidadBase the unidadBase to set
     */
    public void setUnidadBase(final String unidadBase) {
        this.unidadBase = unidadBase;
    }

    /**
     * @return the indicadorUsaRi
     */
    public String getIndicadorUsaRi() {
        return indicadorUsaRi;
    }

    /**
     * @param indicadorUsaRi the indicadorUsaRi to set
     */
    public void setIndicadorUsaRi(final String indicadorUsaRi) {
        this.indicadorUsaRi = indicadorUsaRi;
    }

    /**
     * @return the indicadorUnidades
     */
    public String getIndicadorUnidades() {
        return indicadorUnidades;
    }

    /**
     * @param indicadorUnidades the indicadorUnidades to set
     */
    public void setIndicadorUnidades(final String indicadorUnidades) {
        this.indicadorUnidades = indicadorUnidades;
    }

    /**
     * @return the cargoPorcentual
     */
    public Long getCargoPorcentual() {
        return cargoPorcentual;
    }

    /**
     * @param cargoPorcentual the cargoPorcentual to set
     */
    public void setCargoPorcentual(final Long cargoPorcentual) {
        this.cargoPorcentual = cargoPorcentual;
    }

    /**
     * @return the cargoFijo
     */
    public Long getCargoFijo() {
        return cargoFijo;
    }

    /**
     * @param cargoFijo the cargoFijo to set
     */
    public void setCargoFijo(final Long cargoFijo) {
        this.cargoFijo = cargoFijo;
    }

    /**
     * @return the numeroAcuerdo
     */
    public Long getNumeroAcuerdo() {
        return numeroAcuerdo;
    }

    /**
     * @param numeroAcuerdo the numeroAcuerdo to set
     */
    public void setNumeroAcuerdo(final Long numeroAcuerdo) {
        this.numeroAcuerdo = numeroAcuerdo;
    }

    /**
     * @return the usaPuntoEntrega
     */
    public String getUsaPuntoEntrega() {
        return usaPuntoEntrega;
    }

    /**
     * @param usaPuntoEntrega the usaPuntoEntrega to set
     */
    public void setUsaPuntoEntrega(final String usaPuntoEntrega) {
        this.usaPuntoEntrega = usaPuntoEntrega;
    }

    /**
     * @return the swActivacion
     */
    public String getSwActivacion() {
        return swActivacion;
    }

    /**
     * @param swActivacion the swActivacion to set
     */
    public void setSwActivacion(final String swActivacion) {
        this.swActivacion = swActivacion;
    }

    /**
     * @return the impuesto
     */
    public String getImpuesto() {
        return impuesto;
    }

    /**
     * @param impuesto the impuesto to set
     */
    public void setImpuesto(final String impuesto) {
        this.impuesto = impuesto;
    }



    /**
     * @return the tarifa
     */
    public Double getTarifa() {
        return tarifa;
    }



    /**
     * @param tarifa the tarifa to set
     */
    public void setTarifa(final Double tarifa) {
        this.tarifa = tarifa;
    }



    /**
     * @return the flete
     */
    public Double getFlete() {
        return flete;
    }



    /**
     * @param flete the flete to set
     */
    public void setFlete(final Double flete) {
        this.flete = flete;
    }

}
