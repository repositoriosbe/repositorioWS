package cl.bluex.digmodel.to;

import java.io.Serializable;

/**
 * Almacena datos de la empresa.
 * 
 * @author Edgardo Herrera
 *
 */
public class EmpresaTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -7935513315671620934L;
    private long codigo;
    private String descripcion;
    
    /**
     * nueva instancia de {@link EmpresaTO}.
     */
    public EmpresaTO() {
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
