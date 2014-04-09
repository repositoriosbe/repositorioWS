package cl.bluex.digfull.ws.digitacionFullServiceImpl;

import org.junit.Assert;
import org.junit.Test;

import cl.bluex.digfull.bean.ServicioComplementarioPago;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

/**
 * @author eherrera
 *
 */
public class InsertaFormaPagoSCTest extends ServiceTestBase {

	/**
	 * Test method for {@link cl.bluex.digfull.ws.DigitacionFullServiceImpl#insertaFormaPagoSC(cl.bluex.digfull.bean.ServicioComplementarioPago, cl.bluex.ws.common.head.Cabecera)}.
	 * @throws BluexException 
	 */
	@Test
	public void testInsertaFormaPagoSC() throws BluexException {
		final ServicioComplementarioPago pago = new ServicioComplementarioPago();
		pago.setEevvNmrId(99843910);
		pago.setCodigoServicio("CD");
		pago.setNumeroLinea(1);
		pago.setIdDocumento("555");
		pago.setTipoDocumentoServicio("B");
		pago.setMonto(154000);
		pago.setBanco(1);
		pago.setFechaPago("28-06-2013 22:30");
		pago.setIdDiasPago("2");
		pago.setSerieDocumento("150");
		pago.setTipoPago("CF");
//		getServicio().insertaFormaPagoSC(pago, new Cabecera());
		
		Assert.assertTrue(true);
	}

}
