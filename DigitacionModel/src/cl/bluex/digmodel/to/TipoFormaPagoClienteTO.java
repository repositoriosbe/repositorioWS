package cl.bluex.digmodel.to;

import java.io.Serializable;

/**
 * Almacena datos de tipo de forma de pago del cliente.
 * 
 * @author Edgardo Herrera
 *
 */
public class TipoFormaPagoClienteTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -6082023557932204362L;
    private String codigo;
    private String descripcion;
    
    /**
     * nueva instancia de {@link TipoFormaPagoClienteTO}.
     */
    public TipoFormaPagoClienteTO() {
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
