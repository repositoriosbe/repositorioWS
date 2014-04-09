package cl.bluex.generadoretiqueta.bean;

/**
 * @author Edgardo Herrera
 *
 */
public enum PropGeneradorEtiquetaImpr {
    /**
     * Los parametros de enum son.
     * 
     * nombreParametro : Nombre del parametros que viene en el Template 
     * nombreCampo : Nombre del campo del objecto donde tiene la información
     * tipoCampo : Indica si el tipo de campo que se guarda es CAMPO o LISTA
     */
    P_CODIGOBARRA("P_CODIGOBARRA", "codigoBarra", "CAMPO"),
    P_TIPOETIQUETA("P_TIPOETIQUETA", "tipoEtiqueta", "CAMPO"),
    P_INICIALTIPOETIQUETA("P_INICIALTIPOETIQUETA", "inicialTipoEtiqueta", "CAMPO"),
    P_EMPRESA("P_EMPRESA", "empresa", "CAMPO"),
    P_CANTIDAD("P_CANTIDAD", "cantidad", "CAMPO"),
    P_FECHA("P_FECHA", "fecha", "CAMPO"),
    P_CODIGOPOSTA("P_CODIGOPOSTA", "codigoPosta", "CAMPO"),
    P_NOMBREPOSTA("P_NOMBREPOSTA", "nombrePosta", "CAMPO"),
    P_SERVICIO("P_SERVICIO", "p_servicio", "CAMPO"),
    P_FOLIO("P_FOLIO", "folio", "CAMPO");
    
    private String nombreParametro;
    private String nombreCampo;
    private String tipoCampo;
    
    /**
     * Crea instancia de {@link PropGeneradorEtiquetaImpr}.
     *
     * @param nombreParametro
     * @param nombreCampo
     * @param tipoCampo
     */
    private PropGeneradorEtiquetaImpr(final String nombreParametro,
	    final String nombreCampo, final String tipoCampo) {
	this.nombreParametro = nombreParametro;
	this.nombreCampo = nombreCampo;
	this.tipoCampo = tipoCampo;
    }

    /**
     * @return the nombreParametro
     */
    public String getNombreParametro() {
        return nombreParametro;
    }

    /**
     * @param nombreParametro the nombreParametro to set
     */
    public void setNombreParametro(final String nombreParametro) {
        this.nombreParametro = nombreParametro;
    }

    /**
     * @return the nombreCampo
     */
    public String getNombreCampo() {
        return nombreCampo;
    }

    /**
     * @param nombreCampo the nombreCampo to set
     */
    public void setNombreCampo(final String nombreCampo) {
        this.nombreCampo = nombreCampo;
    }

    /**
     * @return the tipoCampo
     */
    public String getTipoCampo() {
        return tipoCampo;
    }

    /**
     * @param tipoCampo the tipoCampo to set
     */
    public void setTipoCampo(final String tipoCampo) {
        this.tipoCampo = tipoCampo;
    }
}
