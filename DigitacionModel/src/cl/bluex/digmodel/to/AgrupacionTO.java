package cl.bluex.digmodel.to;

import java.io.Serializable;

/**
 * Transfer Object agrupacion.
 * 
 * @author Edgardo Herrera
 *
 */
public class AgrupacionTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -7105900532999838306L;
    private long idCabeceraAgrupacion;
    private String codigoAgrupacion;
    private String codigoEstado;
    
    /**
     * Constructor.
     */
    public AgrupacionTO() {
	super();
    }

    /**
     * @return the codigoEstado
     */
    public String getCodigoEstado() {
        return codigoEstado;
    }

    /**
     * @param codigoEstado the codigoEstado to set
     */
    public void setCodigoEstado(final String codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    /**
     * @return the codigoAgrupacion
     */
    public String getCodigoAgrupacion() {
        return codigoAgrupacion;
    }

    /**
     * @param codigoAgrupacion the codigoAgrupacion to set
     */
    public void setCodigoAgrupacion(final String codigoAgrupacion) {
        this.codigoAgrupacion = codigoAgrupacion;
    }

    /**
     * @return the idCabeceraAgrupacion
     */
    public long getIdCabeceraAgrupacion() {
        return idCabeceraAgrupacion;
    }

    /**
     * @param idCabeceraAgrupacion the idCabeceraAgrupacion to set
     */
    public void setIdCabeceraAgrupacion(final long idCabeceraAgrupacion) {
        this.idCabeceraAgrupacion = idCabeceraAgrupacion;
    }

}
