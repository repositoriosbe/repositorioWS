/**
 * 
 */
package cl.bluex.seguridad.dao.seguridadDao;

import java.util.List;

import org.junit.Test;

import cl.bluex.seguridad.to.UsuarioValido;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * @author eherrera
 *
 */
public class ValidarUsuarioTest extends DaoBaseTest {

	/**
	 * Test method for {@link cl.bluex.seguridad.mybatis.SeguridadDaoImpl#validarUsuario(java.util.Map)}.
	 * @throws BluexException 
	 */
//	@Test
	public void testValidarUsuario() throws BluexException {
		
		final List<UsuarioValido> validarUsuario = getDao().validarUsuario("snavia", "cd2c2f6c0c2f49153bae3520fd8c9b93");
		validarUsuario.get(0);
	}

}
