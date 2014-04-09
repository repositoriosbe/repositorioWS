package cl.bluex.digmodel.to;

import java.io.Serializable;

/**
 * Almacena datos de la familia del producto.
 * 
 * @author Edgardo Herrera
 *
 */
public class FamiliaProductoTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1560391269744566127L;
    private String codigo;
    private String descripcion;
    
    /**
     * nueva instancia de {@link FamiliaProductoTO}.
     */
    public FamiliaProductoTO() {
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
