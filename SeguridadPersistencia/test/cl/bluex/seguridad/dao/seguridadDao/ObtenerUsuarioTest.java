package cl.bluex.seguridad.dao.seguridadDao;

import junit.framework.Assert;

import org.junit.Test;

import cl.bluex.seguridad.mybatis.SeguridadDaoImpl;
import cl.bluex.seguridad.to.UsuarioTo;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * @author Edgardo Herrera
 * 
 */
public class ObtenerUsuarioTest extends DaoBaseTest {
	private SeguridadDaoImpl dao;

	/**
	 * Constructor.
	 */
	public ObtenerUsuarioTest() {
		super();
	}

//	@Test
	public void testObtenerUsuario() throws BluexException {
		final UsuarioTo obtenerUsuario = dao
				.obtenerUsuario("27c5cf466fe70f6ac8cfe60ed0f29b88");

		final Long codigoUsuario = obtenerUsuario.getCodigoUsuario();
		
		final Long esperado = 1L;
		Assert.assertEquals(esperado, codigoUsuario);
	}

}
