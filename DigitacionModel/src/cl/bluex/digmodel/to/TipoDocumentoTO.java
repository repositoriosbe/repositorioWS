package cl.bluex.digmodel.to;

/**
 * TO para tipo de documento.
 *
 * @author Edgardo Herrera
 *
 */
public class TipoDocumentoTO {
    private String codigo;
    private String descripcion;
    
    /**
     * Crea nueva instancia {@link TipoDocumentoTO}.
     */
    public TipoDocumentoTO() {
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
