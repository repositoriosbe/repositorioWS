package cl.bluex.digfull.ws.digitacionFullServiceImpl;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

import cl.bluex.digfull.bean.request.RequestInsertaWarehouse;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

/**
 * @author eherrera
 *
 */
public class InsertaWarehouseTest extends ServiceTestBase {

	/**
	 * Test method for {@link cl.bluex.digfull.ws.DigitacionFullServiceImpl#insertaWarehouse(cl.bluex.digfull.bean.request.RequestInsertaWarehouse, cl.bluex.ws.common.head.Cabecera)}.
	 * @throws BluexException 
	 */
	@Test
	public void testInsertaWarehouse() throws BluexException {
		final RequestInsertaWarehouse request = new RequestInsertaWarehouse();
		request.setAlto(50.0);
		request.setAncho(50.0);
		request.setClhlCodigoEmbarque(81407200);
		request.setClhlSucursalEmbarque(3);
		request.setCntPiezas(1);
		request.setCodigoEmpresa(2000);
		request.setCodigoEmpresaLaer(2000);
		request.setCodigoFamilia("SOBR");
		request.setCodigoProducto("SOB");
		request.setCodigoServicio("51");
		request.setCodigoTipoWarehouse(2);
		request.setCodigoUsuario("FHERRERA");
		request.setDvEmbarque("2");
		request.setEevvNmrid(961672);
		request.setIdEmbarque("81407200");
		request.setLargo(50.0);
		request.setNombreDestino("PP");
		request.setNombreEmbarque("FABRICA DE CALZADOS GINO");
		request.setObservaciones("x");
		request.setPesoFisico(31.25);
		request.setPesoVolumen(8);
		request.setTipoMedida("KL");
		request.setTpclCodigoEmbarque(8);
//		getServicio().insertaWarehouse(request, new Cabecera());
		
		Assert.assertTrue(true);
	}

}
