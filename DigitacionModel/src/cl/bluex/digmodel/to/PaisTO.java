package cl.bluex.digmodel.to;

import java.io.Serializable;

/**
 * Almacena datos del Pais.
 * 
 * @author Edgardo Herrera
 *
 */
public class PaisTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 5949475283217205776L;
    private String codigo;
    private String descripcion;
    private String codigoMoneda;
    
    /**
     * Crea una nueva instancia de {@link PaisTO}.
     */
    public PaisTO() {
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

    /**
     * @return the codigoMoneda
     */
    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    /**
     * @param codigoMoneda the codigoMoneda to set
     */
    public void setCodigoMoneda(final String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }
}
