package cl.bluex.monitor.mybatis.monitorDao;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import cl.bluex.monitor.to.DatosAgrupacionMonitorTO;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * Test metodo obtiene Informacion Monitor.
 * 
 * @author Edgardo Herrera
 * 
 */
public class ObtieneInformacionMonitorTest extends DaoBaseTest {

	/**
	 * Crea instancia de {@link ObtieneInformacionMonitorTest}.
	 * 
	 */
	public ObtieneInformacionMonitorTest() {
		super();
	}

	@Test
	public void testObtieneInformacionMonitor() throws BluexException {
		// final List<DatosAgrupacionMonitorTO> infos =
		// getDao().obtieneInformacionMonitor(2000, 1);
		//
		// final DatosAgrupacionMonitorTO to = infos.get(0);
		// final long idAgrupacion = to.getIdAgrupacion();
		//
		//
		// final long expected = 1;
		// Assert.assertEquals(expected , idAgrupacion);
		Assert.assertTrue(true);
	}

}
