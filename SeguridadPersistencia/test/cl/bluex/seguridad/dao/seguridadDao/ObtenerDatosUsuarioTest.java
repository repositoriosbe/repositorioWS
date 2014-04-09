package cl.bluex.seguridad.dao.seguridadDao;

import java.util.List;

import org.junit.Test;

import cl.bluex.seguridad.to.UsuarioTo;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * @author Edgardo Herrera
 *
 */
public class ObtenerDatosUsuarioTest extends DaoBaseTest {
    
    /**
     * Constructor.
     */
    public ObtenerDatosUsuarioTest() {
	super();
    }
    
//    @Test
    public void testObtenerUsuario() throws BluexException {
	final List<UsuarioTo> datos = getDao().obtieneDatosUsuario("27c5cf466fe70f6ac8cfe60ed0f29b88");
	final UsuarioTo usuarioTo = datos.get(0);
	usuarioTo.getCodigoUsuario();
    }

}
