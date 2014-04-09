package cl.bluex.digmodel.to;

import java.io.Serializable;

/**
 * TO tipo de cliente.
 * 
 * @author Edgardo Herrera
 *
 */
public class TipoClienteTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -6467297341419108144L;
    private String descripcion;
    private long tipoEstado;
    
    /**
     * Crea una nueva instancia de {@link TipoClienteTO}.
     */
    public TipoClienteTO() {
	super();
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
     * @return the tipoEstado
     */
    public long getTipoEstado() {
        return tipoEstado;
    }

    /**
     * @param tipoEstado the tipoEstado to set
     */
    public void setTipoEstado(final long tipoEstado) {
        this.tipoEstado = tipoEstado;
    }
    
    
}
