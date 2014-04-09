package cl.bluex.seguridad.dao.seguridadDao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import cl.bluex.seguridad.to.OpcionesMenuTo;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * @author eherrera
 *
 */
public class ObtieneOpcionesFrecuentesTest extends DaoBaseTest {

	/**
	 * Test method for {@link cl.bluex.seguridad.mybatis.SeguridadDaoImpl#obtieneOpcionesFrecuentes(java.lang.String)}.
	 * @throws BluexException 
	 */
//	@Test
	public void testObtieneOpcionesFrecuentes() throws BluexException {
		final List<OpcionesMenuTo> opciones = getDao().obtieneOpcionesFrecuentes(6, "91efe065ac300677febf0776faf10b46");
		
		final int size = opciones.size();
		Assert.assertTrue(size > 0);
	}

}
