/**
 * 
 */
package cl.bluex.seguridad.dao.seguridadDao;

import java.util.List;

import org.junit.Test;

import cl.bluex.seguridad.to.OpcionesMenuTo;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * @author eherrera
 *
 */
public class ObtieneOpcionesMenuTest extends DaoBaseTest {

	/**
	 * crea instancia de ObtieneOpcionesMenuTest
	 *
	 */
	public ObtieneOpcionesMenuTest() {
		super();
	}
	
	/**
	 * Test method for {@link cl.bluex.seguridad.mybatis.SeguridadDaoImpl#obtieneOpcionesMenu(long, java.lang.String)}.
	 * @throws BluexException 
	 */
//	@Test
	public void testObtieneOpcionesMenu() throws BluexException {
		final List<OpcionesMenuTo> values = getDao().obtieneOpcionesMenu(6, "bc7821849fe376f489094eff2927ff0e");
		
		values.size();
	}

}
