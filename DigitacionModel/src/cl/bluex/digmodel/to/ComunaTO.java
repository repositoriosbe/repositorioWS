package cl.bluex.digmodel.to;

import java.io.Serializable;

/**
 * Almacena datos de la comuna.
 * 
 * @author Edgardo Herrera
 *
 */
public class ComunaTO implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = -6041052760420005252L;
    private String codigo;
    private String descripcion;
    
    /**
     * crea nueva instancia de {@link ComunaTO}.
     */
    public ComunaTO() {
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

}
