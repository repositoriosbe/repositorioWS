package cl.bluex.digfull.bean.response;

import java.util.List;

import cl.bluex.digfull.bean.ServicioComplementario;

/**
 * @author Edgardo Herrera
 *
 */
public class ResponseServiciosComplementarios {
    private List<ServicioComplementario> serviciosComplementarios;
    
    /**
     * Crea instancia de {@link ResponseServiciosComplementarios}.
     *
     */
    public ResponseServiciosComplementarios() {
	super();
    }

    /**
     * Crea instancia de {@link ResponseServiciosComplementarios}.
     *
     * @param serviciosComplementarios
     */
    public ResponseServiciosComplementarios(
	    final List<ServicioComplementario> serviciosComplementarios) {
	super();
	this.serviciosComplementarios = serviciosComplementarios;
    }

    /**
     * @return the serviciosComplementarios
     */
    public List<ServicioComplementario> getServiciosComplementarios() {
        return serviciosComplementarios;
    }

    /**
     * @param serviciosComplementarios the serviciosComplementarios to set
     */
    public void setServiciosComplementarios(
    	final List<ServicioComplementario> serviciosComplementarios) {
        this.serviciosComplementarios = serviciosComplementarios;
    }
    
}
