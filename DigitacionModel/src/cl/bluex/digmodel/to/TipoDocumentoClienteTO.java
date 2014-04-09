package cl.bluex.digmodel.to;

import java.io.Serializable;

/**
 * Almacena datos de tipo de documento del cliente.
 * 
 * @author Edgardo Herrera
 *
 */
public class TipoDocumentoClienteTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 2948520501401912220L;
    private String codigo;
    private String descripcion;
    
    /**
     * Crea nueva instancia {@link TipoDocumentoClienteTO}.
     */
    public TipoDocumentoClienteTO() {
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
