package cl.bluex.listas.bean.response;

import java.util.List;

import cl.bluex.listas.bean.PersonalizacionUsuario;

/**
 * Almacena datos de respuesta de personalizacion de usuario.
 * 
 * @author Edgardo Herrera
 *
 */
public class ResponsePersonalizacionesUsuario {
    private List<PersonalizacionUsuario> personalizacionUsuario;
    
    public ResponsePersonalizacionesUsuario() {
	super();
    }
    
    public ResponsePersonalizacionesUsuario(final List<PersonalizacionUsuario> personalizacionUsuario) {
	this.personalizacionUsuario = personalizacionUsuario;
    }

    public List<PersonalizacionUsuario> getPersonalizacionUsuario() {
        return personalizacionUsuario;
    }

    public void setPersonalizacionUsuario(
    	final List<PersonalizacionUsuario> personalizacionUsuario) {
        this.personalizacionUsuario = personalizacionUsuario;
    }
    
    
}
