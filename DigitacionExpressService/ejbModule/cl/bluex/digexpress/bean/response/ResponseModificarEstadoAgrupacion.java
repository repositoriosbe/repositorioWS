package cl.bluex.digexpress.bean.response;

import cl.bluex.digexpress.bean.Agrupacion;

/**
 * @author Edgardo Herrera
 *
 */
public class ResponseModificarEstadoAgrupacion {
    private Agrupacion agrupacion;
    
    /**
     * Constructor.
     */
    public ResponseModificarEstadoAgrupacion() {
	super();
    }
    
    /**
     * Constructor.
     * 
     * @param idCabeceraAgrupacion el id de la cabecera de la agrupacion
     */
    public ResponseModificarEstadoAgrupacion(final Agrupacion agrupacion) {
	this.agrupacion = agrupacion;
    }

    /**
     * @return the agrupacion
     */
    public Agrupacion getAgrupacion() {
        return agrupacion;
    }

    /**
     * @param agrupacion the agrupacion to set
     */
    public void setAgrupacion(final Agrupacion agrupacion) {
        this.agrupacion = agrupacion;
    }

}
