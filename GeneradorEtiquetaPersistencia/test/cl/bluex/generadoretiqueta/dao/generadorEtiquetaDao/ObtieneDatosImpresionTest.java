/**
 * 
 */
package cl.bluex.generadoretiqueta.dao.generadorEtiquetaDao;

import org.junit.Assert;
import org.junit.Test;

import cl.bluex.generadoretiqueta.to.DatosGeneracionEtiquetaTO;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * @author eherrera
 *
 */
public class ObtieneDatosImpresionTest extends DaoBaseTest {

	/**
	 * crea instancia de ObtieneDatosImpresionTest
	 *
	 */
	public ObtieneDatosImpresionTest() {
		super();
	}
	
	/**
	 * Test method for {@link cl.bluex.generadoretiqueta.mybatis.GeneradorEtiquetaDaoImpl#obtieneDatosImpresion(long)}.
	 * @throws BluexException 
	 */
	@Test
	public void testObtieneDatosImpresion() throws BluexException {
		final int eevvNmrId = 13208343;
		final DatosGeneracionEtiquetaTO to = getDao().obtieneDatosImpresion(eevvNmrId);
		
		to.getBd();
		
		Assert.assertTrue(true);
	}

}
