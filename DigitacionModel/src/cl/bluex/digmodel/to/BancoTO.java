package cl.bluex.digmodel.to;

import java.io.Serializable;

/**
 * Almacena datos del banco.
 * 
 * @author Edgardo Herrera
 *
 */
public class BancoTO implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private long codigo;
    private String descripcion;
    
    /**
     * Crea nueva instancia de {@link BancoTO}.
     */
    public BancoTO() {
	super();
    }

    /**
     * @return the codigo
     */
    public long getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(final long codigo) {
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
