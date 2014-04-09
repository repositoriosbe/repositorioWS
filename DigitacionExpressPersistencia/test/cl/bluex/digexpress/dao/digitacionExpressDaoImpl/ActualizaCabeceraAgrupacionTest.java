package cl.bluex.digexpress.dao.digitacionExpressDaoImpl;

import junit.framework.Assert;

import org.junit.Test;

import cl.bluex.digmodel.to.CabeceraAgrupacionTO;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * Test metodo
 * {@link DigitacionExpressDaoImpl#actualizaEncDigExpress(CabeceraAgrupacionTO)}
 * .
 * 
 * @author Edgardo Herrera
 * 
 */
public class ActualizaCabeceraAgrupacionTest extends DaoBaseTest {

//	/**
//	 * constructor test.
//	 */
//	public ActualizaCabeceraAgrupacionTest() {
//		super();
//	}
//
//	@Test
//	public final void testActualizaCabeceraAgrupacion() throws BluexException {
//		final CabeceraAgrupacionTO to = new CabeceraAgrupacionTO();
//
//		to.setCantidadDctosEstimados(3);
//		to.setCantidadDoctosDigitados(2);
//		to.setCodigoAgrupacion("601-CHENRIQUEZ");
//		to.setCodigoEmpresa(2000);
//		to.setCodigoEstado("S2");
//		to.setCodigoPosta("SCL");
//		to.setCodigoRuta(131);
//		to.setCodigoSorter(1);
//		to.setCodigoUsuario(6);
//		to.setCourier("CHENRIQUEZ");
//		to.setDescripcion("INGRESO DE PRUEBA CON CAMBIOS");
//		to.setDescripcionEstado("DIGITANDO");
//		to.setDescripcionSorter("SORTER SANTIAGO");
//		to.setDigitacionOrigen("E");
//		to.setFolioHojaRuta("124124");
//		to.setId(601);
//		to.setMostrarMonitor(1);
//		to.setTipoBulto("1");
//		to.setVoucher(0);
//
//		final CabeceraAgrupacionTO agrupacion = getDao()
//				.actualizaEncDigExpress(to);
//
//		final String codigoAgrupacion = agrupacion.getCodigoAgrupacion();
//
//		Assert.assertEquals("601-CHENRIQUEZ", codigoAgrupacion);
//	}
//	
//	@Test
//	public final void actualizaCabeceraAgrupacion() throws BluexException {
//		final CabeceraAgrupacionTO to = new CabeceraAgrupacionTO();
//
//		to.setId(474);
//		to.setCodigoRuta(3);
//		to.setCourier("GAVILAEXPRESS");
//		to.setCodigoEmpresa(2020);
//		to.setDescripcion("PRUEBA CHENRIQUEZ EDICION");
//		to.setCantidadDctosEstimados(6);
//		to.setTipoBulto("1");
//		to.setFolioHojaRuta("252690");
//		to.setCodigoUsuario(6);
//		to.setCodigoPosta("LIM");
//		to.setMostrarMonitor(1);
//		to.setCodigoSorter(1);
//		to.setDigitacionOrigen("e");
//
//		final CabeceraAgrupacionTO agrupacion = getDao()
//				.actualizaEncDigExpress(to);
//
//		final String codigoAgrupacion = agrupacion.getCodigoAgrupacion();
//
//		Assert.assertEquals("119-DSC", codigoAgrupacion);
//	}

}
