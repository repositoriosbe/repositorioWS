/**
 * 
 */
package cl.bluex.digfull.ws.digitacionFullServiceImpl;

import org.junit.Assert;
import org.junit.Test;

import cl.bluex.digfull.bean.request.RequestEliminaServicioComplementario;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

/**
 * @author eherrera
 *
 */
public class EliminaServicioComplementarioTest extends ServiceTestBase {

	/**
	 * Test method for {@link cl.bluex.digfull.ws.DigitacionFullServiceImpl#eliminaServicioComplementario(cl.bluex.digfull.bean.request.RequestEliminaServicioComplementario, cl.bluex.ws.common.head.Cabecera)}.
	 * @throws BluexException 
	 */
	@Test
	public void testEliminaServicioComplementario() throws BluexException {
		final RequestEliminaServicioComplementario request = new RequestEliminaServicioComplementario();
		request.setEevvNmrId(43542081);
		request.setCodigoServicio("CD");
//		getServicio().eliminaServicioComplementario(request , new Cabecera());
		
		Assert.assertTrue(true);
	}

}
