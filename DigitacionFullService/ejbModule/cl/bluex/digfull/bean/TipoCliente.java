package cl.bluex.digfull.bean;

import cl.bluex.digmodel.to.TipoClienteTO;

/**
 * Bean tipo de Cliente.
 * 
 * @author Edgardo Herrera
 *
 */
public class TipoCliente {
    private String descripcion;
    private long tipoEstado;
    
    /**
     * Constructor.
     */
    public TipoCliente() {
	super();
    }

    /**
     * Constructor.
     * 
     * @param tipoCliente
     * @param descripcion
     * @param tipoEstado
     */
    public TipoCliente(final TipoClienteTO valueTO) {
	if (valueTO != null) {
	    this.descripcion = valueTO.getDescripcion();
	    this.tipoEstado = valueTO.getTipoEstado();
	}
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
