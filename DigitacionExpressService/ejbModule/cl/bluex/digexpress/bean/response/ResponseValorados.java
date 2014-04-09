package cl.bluex.digexpress.bean.response;

import java.util.ArrayList;
import java.util.List;

import cl.bluex.digexpress.bean.Valorado;

/**
 * Almacena datos de respuesta de valorados.
 * 
 * @author Edgardo Herrera
 *
 */
public class ResponseValorados {
    private List<Valorado> valorados = new ArrayList<Valorado>();
    
    public ResponseValorados() {
	super();
    }

    public ResponseValorados(final List<Valorado> valorados) {
	super();
	this.valorados = valorados;
    }

    public List<Valorado> getValorados() {
        return valorados;
    }

    public void setValorados(final List<Valorado> valorados) {
        this.valorados = valorados;
    }
    
}
