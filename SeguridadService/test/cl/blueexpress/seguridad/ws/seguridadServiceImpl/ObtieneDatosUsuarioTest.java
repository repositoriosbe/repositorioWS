package cl.blueexpress.seguridad.ws.seguridadServiceImpl;

import cl.bluex.seguridad.to.UsuarioTo;
import cl.bluex.seguridad.ws.SeguridadServiceImpl;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

/**
 * @author Edgardo Herrera
 *
 */
public class ObtieneDatosUsuarioTest {
    
    private SeguridadServiceImpl service = new SeguridadServiceImpl();
    
    /**
     * Constructor.
     */
    public ObtieneDatosUsuarioTest() {
	super();
    }

//    @Test
//    public void testObtieneDatosUsuario() throws BluexException {
//	final Cabecera cabecera = new Cabecera();
//	cabecera.setToken("2e9f978fd19e6fd6dc252a1c67faae82");
//	final UsuarioTo datos = service.obtieneDatosUsuario(cabecera );
//	
//	datos.getUsername();
//    }

}
