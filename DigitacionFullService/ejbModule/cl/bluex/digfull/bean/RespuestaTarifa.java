package cl.bluex.digfull.bean;

import cl.bluex.digmodel.to.TarifaTO;

/**
 * @author Edgardo Herrera
 *
 */
public class RespuestaTarifa {
    private double tarifa;
    private double flete;
    private String codigoMetodoCalculo;
    private String unidadBase;
    private String indicadorUsaRi;
    private String indicadorUnidades;
    private long cargoPorcentual;
    private long cargoFijo;
    private long numeroAcuerdo;
    private String usaPuntoEntrega;
    private String swActivacion;
    private String impuesto;
    
    /**
     * Constructor.
     */
    public RespuestaTarifa() {
	super();
    }
    
    public RespuestaTarifa(final TarifaTO to) {
	if (to != null) {
	    this.tarifa = to.getTarifa();
	    this.flete = to.getFlete();
	    this.codigoMetodoCalculo = to.getCodigoMetodoCalculo();
	    this.unidadBase = to.getUnidadBase();
	    this.indicadorUsaRi = to.getIndicadorUsaRi();
	    this.indicadorUnidades = to.getIndicadorUnidades();
	    this.cargoPorcentual = to.getCargoPorcentual();
	    this.cargoFijo = to.getCargoFijo();
	    this.numeroAcuerdo = to.getNumeroAcuerdo();
	    this.usaPuntoEntrega = to.getUsaPuntoEntrega();
	    this.swActivacion = to.getSwActivacion();
	    this.impuesto = to.getImpuesto();
	}
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
    public long getCargoPorcentual() {
        return cargoPorcentual;
    }

    /**
     * @param cargoPorcentual the cargoPorcentual to set
     */
    public void setCargoPorcentual(final long cargoPorcentual) {
        this.cargoPorcentual = cargoPorcentual;
    }

    /**
     * @return the cargoFijo
     */
    public long getCargoFijo() {
        return cargoFijo;
    }

    /**
     * @param cargoFijo the cargoFijo to set
     */
    public void setCargoFijo(final long cargoFijo) {
        this.cargoFijo = cargoFijo;
    }

    /**
     * @return the numeroAcuerdo
     */
    public long getNumeroAcuerdo() {
        return numeroAcuerdo;
    }

    /**
     * @param numeroAcuerdo the numeroAcuerdo to set
     */
    public void setNumeroAcuerdo(final long numeroAcuerdo) {
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
    public double getTarifa() {
        return tarifa;
    }

    /**
     * @param tarifa the tarifa to set
     */
    public void setTarifa(final double tarifa) {
        this.tarifa = tarifa;
    }

    /**
     * @return the flete
     */
    public double getFlete() {
        return flete;
    }

    /**
     * @param flete the flete to set
     */
    public void setFlete(final double flete) {
        this.flete = flete;
    }

}
