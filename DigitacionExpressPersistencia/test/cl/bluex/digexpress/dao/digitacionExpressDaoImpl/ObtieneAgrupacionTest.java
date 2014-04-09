package cl.bluex.digexpress.dao.digitacionExpressDaoImpl;

import junit.framework.Assert;

import org.junit.Test;

import cl.bluex.digmodel.to.CabeceraAgrupacionTO;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * Test metodo
 * {@link DigitacionExpressDaoImpl#obtieneAgrupacion(CabeceraAgrupacionTO)}.
 * 
 * @author Edgardo Herrera
 * 
 */
public class ObtieneAgrupacionTest extends DaoBaseTest {

	private static final String UNO = "1";

//	/**
//	 * Constructor Test.
//	 */
//	public ObtieneAgrupacionTest() {
//		super();
//	}
//
//	@Test
//	public void testObtieneAgrupacion() throws BluexException {
//		final CabeceraAgrupacionTO to = new CabeceraAgrupacionTO();
//		to.setCodigoRuta(21);
//		to.setCourier("FHERRERA");
//		to.setCodigoEmpresa(2000);
//		to.setDescripcion("PRUEBA POST INTEGRACION 1");
//		to.setCantidadDctosEstimados(3);
//		to.setTipoBulto("1");
//		to.setFolioHojaRuta("112233");
//		to.setMostrarMonitor(1);
//		to.setCodigoSorter(1);
//		to.setDigitacionOrigen("e");
//		to.setCodigoPosta("SCL");
//		to.setCodigoUsuario(6);
//		
//
//		final CabeceraAgrupacionTO agrupacion = getDao().obtieneAgrupacion(to);
//
//		final long id = agrupacion.getId();
//		final String codigoAgrupacion = agrupacion.getCodigoAgrupacion();
//		final String codigoEstado = agrupacion.getCodigoEstado();
//
//		Assert.assertEquals(209, id);
//		Assert.assertEquals("209-RVADISP", codigoAgrupacion);
//		Assert.assertEquals("S1", codigoEstado);
//	}
}
