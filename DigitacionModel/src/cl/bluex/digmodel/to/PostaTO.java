package cl.bluex.digmodel.to;

import java.io.Serializable;

/**
 * Almacena datos de la posta.
 * 
 * @author Edgardo Herrera
 *
 */
public class PostaTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -2595341290373048347L;
    private String codigo;
    private String descripcion;
    private String codigoComuna;
    private String comuna;
    private long codigoRegion;
    
    /**
     * Crea nueva instancia de {@link PostaTO}.
     */
    public PostaTO() {
	super();
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
     * @return the comuna
     */
    public String getComuna() {
        return comuna;
    }

    /**
     * @param comuna the comuna to set
     */
    public void setComuna(final String comuna) {
        this.comuna = comuna;
    }

    /**
     * @return the codigoRegion
     */
    public long getCodigoRegion() {
        return codigoRegion;
    }

    /**
     * @param codigoRegion the codigoRegion to set
     */
    public void setCodigoRegion(final long codigoRegion) {
        this.codigoRegion = codigoRegion;
    }

}
