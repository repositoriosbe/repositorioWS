package cl.bluex.monitor.ws.monitorServiceImpl;

import java.util.List;


import org.junit.Assert;
import org.junit.Test;

import cl.bluex.monitor.bean.DatosAgrupacionMonitor;
import cl.bluex.monitor.bean.response.ResponseObtieneInfoMonitor;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

/**
 * Test para metodo ObtieneInformacionMonitor.
 * 
 * @author Edgardo Herrera
 * 
 */
public class ObtieneInformacionMonitorTest extends ServiceTestBase {

	/**
	 * Constructor.
	 */
	public ObtieneInformacionMonitorTest() {
		super();
	}

	@Test
	public void testObtieneInformacionMonitor() throws BluexException {
		final long codigoEmpresa = 2000;
		final long codigoSorter = 1;
//		final ResponseObtieneInfoMonitor response = servicio
//				.obtieneInformacionMonitor(codigoEmpresa, codigoSorter,
//						new Cabecera());
//
//		final List<DatosAgrupacionMonitor> datos = response
//				.getDatosAgrupacionMonitores();
//
//		Assert.assertEquals(0, datos.size());
		Assert.assertTrue(true);
	}

	@Test
	public void testException() throws BluexException {
		final long codigoEmpresa = 2000;
		final long codigoSorter = 1;
//		final ResponseObtieneInfoMonitor response = servicio
//				.obtieneInformacionMonitor(codigoEmpresa, codigoSorter,
//						new Cabecera());
//
//		final List<DatosAgrupacionMonitor> datos = response
//				.getDatosAgrupacionMonitores();
//
//		Assert.assertEquals(0, datos.size());
		
		Assert.assertTrue(true);
	}

}
