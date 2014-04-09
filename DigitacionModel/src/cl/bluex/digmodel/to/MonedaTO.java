package cl.bluex.digmodel.to;

import java.io.Serializable;

/**
 * Almacena datos de la moneda.
 * 
 * @author Edgardo Herrera
 *
 */
public class MonedaTO implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = 3512034253285550470L;
    private String codigo;
    private String descripcion;
    
    /**
     * Crea nueva instancia de {@link MonedaTO}.
     */
    public MonedaTO() {
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
