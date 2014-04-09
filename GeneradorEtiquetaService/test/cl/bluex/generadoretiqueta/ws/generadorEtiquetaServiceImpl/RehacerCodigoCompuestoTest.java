package cl.bluex.generadoretiqueta.ws.generadorEtiquetaServiceImpl;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author eherrera
 *
 */
public class RehacerCodigoCompuestoTest {

	@Test
	public void test() {
		final String codigoCompuesto = "1234567890123450009012345678";
		final int cantidad = 2;
		
		final String inicio = codigoCompuesto.substring(0, 15);
		final String fin = codigoCompuesto.substring(18, codigoCompuesto.length());
		final String strCantidad = String.format("%03d", cantidad);
		
		final String codigo = inicio + strCantidad + fin;
		final String esperado = "1234567890123450029012345678";
		
		Assert.assertEquals(esperado, codigo);
	}
}
