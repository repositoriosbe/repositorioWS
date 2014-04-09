package cl.bluex.listas.dao.listasDao;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import cl.bluex.digmodel.to.ComunaTO;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * Test para probar método obtieneComunas.
 * 
 * @author edgardo
 * 
 */
public class ObtieneComunasTest extends DaoBaseTest {

//	private static final String CL = "CL";
//
//	/**
//	 * Crea instancia de {@link ObtieneComunasTest}.
//	 * 
//	 */
//	public ObtieneComunasTest() {
//		super();
//	}
//
//	/**
//	 * Test para probar la obtencion de todas las comunas.
//	 * 
//	 * @throws BluexException
//	 *             excepcion de servicio
//	 */
//	@Test
//	public final void testObtieneComunas() throws BluexException {
//		final List<ComunaTO> comunas = getDao().obtieneComunas(CL, "0");
//
//		final ComunaTO comunaTO = comunas.get(1);
//		final String codigo = comunaTO.getCodigo();
//		final String descripcion = comunaTO.getDescripcion();
//
//		final String codigoEsperado = "5602";
//		final String descEsperado = "ALGARROBO";
//
//		Assert.assertEquals(codigoEsperado, codigo);
//		Assert.assertEquals(descEsperado, descripcion);
//	}
//
//	/**
//	 * Test para probar la obtencion de una comuna.
//	 * 
//	 * @throws BluexException
//	 *             excepcion de servicio
//	 */
//	@Test
//	public final void testObtieneComunasUnaComuna() throws BluexException {
//		final List<ComunaTO> comunas = getDao().obtieneComunas(CL, "6000000");
//
//		final ComunaTO comunaTO = comunas.get(0);
//		final String codigo = comunaTO.getCodigo();
//		final String descripcion = comunaTO.getDescripcion();
//
//		final String codigoEsperado = "11201";
//		final String descEsperado = "AISEN";
//
//		Assert.assertEquals(codigoEsperado, codigo);
//		Assert.assertEquals(descEsperado, descripcion);
//	}

}
