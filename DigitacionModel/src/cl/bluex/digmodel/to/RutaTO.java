package cl.bluex.digmodel.to;

/**
 * Almacena datos de la ruta.
 * 
 * @author Edgardo Herrera
 *
 */
public class RutaTO {
    private String codigo;
    private String descripcion;
    
    /**
     * Crea nueva instancia de {@link RutaTO}.
     */
    public RutaTO() {
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
