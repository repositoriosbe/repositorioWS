package cl.bluex.digmodel.to;

import java.io.Serializable;

/**
 * Almacena datos del tipo de etiqueta.
 * 
 * @author Edgardo Herrera
 *
 */
public class TraduccionEmpresaTO implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = 513684315444796575L;
    private long codigo;
    private String descripcion;
    private long codigoOriginal;
    
    /**
     * Crea nueva instancia de {@link TraduccionEmpresaTO}.
     */
    public TraduccionEmpresaTO() {
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

    /**
     * @return the codigoOriginal
     */
    public long getCodigoOriginal() {
        return codigoOriginal;
    }

    /**
     * @param codigoOriginal the codigoOriginal to set
     */
    public void setCodigoOriginal(final long codigoOriginal) {
        this.codigoOriginal = codigoOriginal;
    }

}
