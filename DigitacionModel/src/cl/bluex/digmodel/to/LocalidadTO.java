package cl.bluex.digmodel.to;

import java.io.Serializable;


/**
 * Almacena datos de la localidad.
 * 
 * @author Edgardo Herrera
 *
 */
public class LocalidadTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -1268709501120769857L;
    private String codigoPosta;
    private String codigo;
    private String descripcion;
    private String codigoComuna;
    private String descripcionComuna;
    private String codigoTipoRadioInfluencia;
    private String descripcionTipoRadioInfluencia;

    /**
     * crea nueva instancia de {@link LocalidadTO}.
     */
    public LocalidadTO() {
	super();
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
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(final String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(final String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the codigoComuna
     */
    public String getCodigoComuna() {
        return codigoComuna;
    }

    /**
     * @param codigoComuna the codigoComuna to set
     */
    public void setCodigoComuna(final String codigoComuna) {
        this.codigoComuna = codigoComuna;
    }

    /**
     * @return the descripcionComuna
     */
    public String getDescripcionComuna() {
        return descripcionComuna;
    }

    /**
     * @param descripcionComuna the descripcionComuna to set
     */
    public void setDescripcionComuna(final String descripcionComuna) {
        this.descripcionComuna = descripcionComuna;
    }

    /**
     * @return the codigoTipoRadioInfluencia
     */
    public String getCodigoTipoRadioInfluencia() {
        return codigoTipoRadioInfluencia;
    }

    /**
     * @param codigoTipoRadioInfluencia the codigoTipoRadioInfluencia to set
     */
    public void setCodigoTipoRadioInfluencia(final String codigoTipoRadioInfluencia) {
        this.codigoTipoRadioInfluencia = codigoTipoRadioInfluencia;
    }

    /**
     * @return the descripcionTipoRadioInfluencia
     */
    public String getDescripcionTipoRadioInfluencia() {
        return descripcionTipoRadioInfluencia;
    }

    /**
     * @param descripcionTipoRadioInfluencia the descripcionTipoRadioInfluencia to set
     */
    public void setDescripcionTipoRadioInfluencia(
    	final String descripcionTipoRadioInfluencia) {
        this.descripcionTipoRadioInfluencia = descripcionTipoRadioInfluencia;
    }
    
    
}
