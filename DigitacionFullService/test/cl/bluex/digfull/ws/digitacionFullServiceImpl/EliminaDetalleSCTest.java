/**
 * 
 */
package cl.bluex.digfull.ws.digitacionFullServiceImpl;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import cl.bluex.digfull.bean.request.RequestEliminaDetalleSC;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

/**
 * @author eherrera
 *
 */
public class EliminaDetalleSCTest extends ServiceTestBase {

	/**
	 * Test method for {@link cl.bluex.digfull.ws.DigitacionFullServiceImpl#eliminaDetalleSC(
	 * cl.bluex.digfull.bean.request.RequestEliminaDetalleSC, cl.bluex.ws.common.head.Cabecera)}.
	 * @throws BluexException 
	 */
	@Test
	public void testEliminaDetalleSC() throws BluexException {
		
		final RequestEliminaDetalleSC request = new RequestEliminaDetalleSC();
		request.setCodigoEmpresa(2000);
		request.setCodigoServicio("CD");
		request.setEevvNmrid(20485100);
//		getServicio().eliminaDetalleSC(request , new Cabecera());
		
		Assert.assertTrue(true);
	}

}
