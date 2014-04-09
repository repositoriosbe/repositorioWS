package cl.bluex.listas.dao.listasDao;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import cl.bluex.digmodel.to.TraduccionTO;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * Test metodo {@link ListasDaoImpl#obtieneTraduccion}.
 * 
 * @author Edgardo Herrera
 * 
 */
public class ObtieneTraduccionTest extends DaoBaseTest {

	private static final String PAQUETE = "PAQUETE";
	private static final String SOB = "SOB";
	private static final String PRDT = "PRDT";
	private static final String SOBRE = "SOBRE";

	/**
	 * Crea instancia de {@link ObtieneTraduccionTest}.
	 * 
	 */
//	public ObtieneTraduccionTest() {
//		super();
//	}
//
//	@Test
//	public void testObtieneTraduccion() throws BluexException {
//		final List<TraduccionTO> traducciones = getDao().obtieneTraduccion(
//				PRDT, SOB, 2000);
//
//		final TraduccionTO traduccionTO = traducciones.get(0);
//
//		Assert.assertEquals(SOB, traduccionTO.getCodigoOrigen());
//		Assert.assertEquals(SOBRE, traduccionTO.getDescripcionOrigen());
//		Assert.assertEquals("2", traduccionTO.getCodigoTraducido());
//		Assert.assertEquals(SOBRE, traduccionTO.getDescripcionTraducido());
//	}
//
//	@Test
//	public void testObtieneTraduccionTodos() throws BluexException {
//		final List<TraduccionTO> traducciones = getDao().obtieneTraduccion(
//				PRDT, "0", 2000);
//
//		final TraduccionTO traduccionTO = traducciones.get(0);
//
//		Assert.assertEquals("P", traduccionTO.getCodigoOrigen());
//		Assert.assertEquals(PAQUETE, traduccionTO.getDescripcionOrigen());
//		Assert.assertEquals("3", traduccionTO.getCodigoTraducido());
//		Assert.assertEquals(PAQUETE, traduccionTO.getDescripcionTraducido());
//	}

}
