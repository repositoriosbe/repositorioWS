package cl.bluex.digexpress.bean.request;

/**
 * Almacena datos de la hoja de ruta.
 * 
 * @author Edgardo Herrera
 *
 */
public class RequestDatosHojaRuta {
    private String folio;
    
    public RequestDatosHojaRuta() {
	super();
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(final String folio) {
        this.folio = folio;
    }
    
    
}
