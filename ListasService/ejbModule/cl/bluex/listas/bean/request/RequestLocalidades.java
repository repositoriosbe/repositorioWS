package cl.bluex.listas.bean.request;

/**
 * Almacena datos de las localidades.
 * @author Edgardo Herrera
 *
 */
public class RequestLocalidades {
    private String codigoPais;
    private String codigoPostaPadre;
    private String codigoPosta;
    private long codigoTipoNegocio;
    private long codigoTipoInfluencia;
    private long codigoComuna;
    
    /**
     * Constructor por defecto.
     */
    public RequestLocalidades() {
	super();
    }

    /**
     * @return the codigoPais
     */
    public String getCodigoPais() {
        return codigoPais;
    }

    /**
     * @param codigoPais the codigoPais to set
     */
    public void setCodigoPais(final String codigoPais) {
        this.codigoPais = codigoPais;
    }

    /**
     * @return the codigoPostaPadre
     */
    public String getCodigoPostaPadre() {
        return codigoPostaPadre;
    }

    /**
     * @param codigoPostaPadre the codigoPostaPadre to set
     */
    public void setCodigoPostaPadre(final String codigoPostaPadre) {
        this.codigoPostaPadre = codigoPostaPadre;
    }

    /**
     * @return the codigoPosta
     */
    public String getCodigoPosta() {
        return codigoPosta;
    }

    /**
     * @param codigoPosta the codigoPosta to set
     */
    public void setCodigoPosta(final String codigoPosta) {
        this.codigoPosta = codigoPosta;
    }

    /**
     * @return the codigoTipoNegocio
     */
    public long getCodigoTipoNegocio() {
        return codigoTipoNegocio;
    }

    /**
     * @param codigoTipoNegocio the codigoTipoNegocio to set
     */
    public void setCodigoTipoNegocio(final long codigoTipoNegocio) {
        this.codigoTipoNegocio = codigoTipoNegocio;
    }

    /**
     * @return the codigoTipoInfluencia
     */
    public long getCodigoTipoInfluencia() {
        return codigoTipoInfluencia;
    }

    /**
     * @param codigoTipoInfluencia the codigoTipoInfluencia to set
     */
    public void setCodigoTipoInfluencia(final long codigoTipoInfluencia) {
        this.codigoTipoInfluencia = codigoTipoInfluencia;
    }

    /**
     * @return the codigoComuna
     */
    public long getCodigoComuna() {
        return codigoComuna;
    }

    /**
     * @param codigoComuna the codigoComuna to set
     */
    public void setCodigoComuna(final long codigoComuna) {
        this.codigoComuna = codigoComuna;
    }

}
