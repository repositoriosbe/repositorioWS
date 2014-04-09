package cl.bluex.digexpress.bean.request;

import cl.bluex.digexpress.bean.CabeceraAgrupacion;

/**
 * Almacena datos de entrada para cabecera de la agrupacion.
 * 
 * @author Edgardo Herrera
 *
 */
public class RequestCabeceraAgrupacion {

    private CabeceraAgrupacion cabeceraAgrupacion;
    
    /**
     * crea instancia {@link RequestCabeceraAgrupacion}.
     */
    public RequestCabeceraAgrupacion() {
	super();
    }

    /**
     * @return the cabeceraAgrupacion
     */
    public CabeceraAgrupacion getCabeceraAgrupacion() {
        return cabeceraAgrupacion;
    }

    /**
     * @param cabeceraAgrupacion the cabeceraAgrupacion to set
     */
    public void setCabeceraAgrupacion(final CabeceraAgrupacion cabeceraAgrupacion) {
        this.cabeceraAgrupacion = cabeceraAgrupacion;
    }

}
