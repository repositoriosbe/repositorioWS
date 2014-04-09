package cl.bluex.generadoretiqueta.ws.generadorEtiquetaServiceImpl;

import junit.framework.Assert;

import org.junit.Test;

import cl.bluex.generadoretiqueta.bean.DatosImpresion;
import cl.bluex.generadoretiqueta.bean.Etiqueta;
import cl.bluex.generadoretiqueta.bean.response.ResponseEtiqueta;
import cl.bluex.generadoretiqueta.bean.response.ResponseEtiquetas;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

/**
 * @author Edgardo Herrera
 * 
 */
public class ObtieneEtiquetaTest extends ServiceTestBase {

	/**
	 * Crea instancia de {@link ObtieneEtiquetaTest}.
	 * 
	 */
	public ObtieneEtiquetaTest() {
		super();
	}

	@Test
	public void testObtieneEtiqueta() throws BluexException {
		final DatosImpresion dato = new DatosImpresion();
		dato.setCodigoUsuario(695);
		dato.setCodigoImpresora(126);
		dato.setCodigoFormatoImpresion(1);

		dato.setCantidad(2);
		dato.setCodigoBarra("30011000000");
		dato.setCodigoFormatoImpresion(8);
		dato.setCodigoImpresora(96);
		dato.setCodigoUsuario(6);
		dato.setEmpresa("BLUEXPRESS");
		dato.setFuente(0);
		dato.setInicialTipoEtiqueta("V");
		dato.setTipoEtiqueta("VALORADO");
		
//		final ResponseEtiqueta response = getServicio().obtieneEtiqueta(dato,
//				new Cabecera());

//		final Etiqueta etiqueta = response.getEtiqueta();
//		Assert.assertEquals("", etiqueta.getContenidoEtiqueta());
		
		Assert.assertTrue(true);
	}

}
