package cl.bluex.digexpress.bean.request;

/**
 * @author Edgardo Herrera
 *
 */
public class RequestModificarEstadoAgrupacion {
    private long idCabeceraAgrupacion;
    private String codigoEstado;
    
    /**
     * Crea instancia {@link RequestModificarEstadoAgrupacion}.
     */
    public RequestModificarEstadoAgrupacion() {
	super();
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
    
}
