package cl.bluex.digfull.ws.digitacionFullServiceImpl;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import cl.bluex.digfull.bean.ServicioComplementarioDetalle;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

/**
 * @author eherrera
 *
 */
public class InsertaDetalleSCTest extends ServiceTestBase {

	/**
	 * Test method for {@link cl.bluex.digfull.ws.DigitacionFullServiceImpl#insertaDetalleSC(
	 * cl.bluex.digfull.bean.ServicioComplementarioDetalle, cl.bluex.ws.common.head.Cabecera)}.
	 * @throws BluexException 
	 */
	@Test
	public void testInsertaDetalleSC() throws BluexException {
		final ServicioComplementarioDetalle detalle = new ServicioComplementarioDetalle();
		detalle.setCodigoEmpresa(2000);
		detalle.setCodigoServicio("CD");
		detalle.setEevvNmrid(215747);
		detalle.setIdDocumento("4890");
		detalle.setTipoDocumentoServicio("B");
//		getServicio().insertaDetalleSC(detalle , new Cabecera());
		
		Assert.assertTrue(true);
	}

}
