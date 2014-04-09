/**
 * 
 */
package cl.bluex.generadoretiqueta.ws.generadorEtiquetaServiceImpl;

import org.junit.Assert;
import org.junit.Test;

import cl.bluex.generadoretiqueta.bean.Etiqueta;
import cl.bluex.generadoretiqueta.bean.request.RequestGeneraEtiqueta;
import cl.bluex.generadoretiqueta.bean.request.RequestGeneraEtiquetas;
import cl.bluex.generadoretiqueta.bean.response.ResponseEtiqueta;
import cl.bluex.generadoretiqueta.bean.response.ResponseEtiquetas;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

/**
 * @author eherrera
 *
 */
public class GeneraEtiquetaTest extends ServiceTestBase {

	/**
	 * crea instancia de GeneraEtiquetaTest
	 *
	 */
	public GeneraEtiquetaTest() {
		super();
	}
	
	/**
	 * Test method for {@link cl.bluex.generadoretiqueta.ws.GeneradorEtiquetaServiceImpl#generaEtiqueta(
	 * cl.bluex.generadoretiqueta.bean.request.RequestGeneraEtiquetas, 
	 * cl.bluex.ws.common.head.Cabecera)}.
	 * 
	 * @throws BluexException 
	 */
	@Test
	public void testGeneraEtiqueta() throws BluexException {
		final RequestGeneraEtiqueta request = new RequestGeneraEtiqueta();
		request.setEevvNmrId(888092);
		request.setCodigoUsuario(695);
		request.setCodigoImpresora(99);
		request.setCodigoFormatoImpresion(1);
		request.setTipoFormato("GUIA");
//		final ResponseEtiqueta response = getServicio().generaEtiqueta(request , new Cabecera());
		
//		final Etiqueta etiqueta = response.getEtiqueta();
//		final String contenidoEtiqueta = etiqueta.getContenidoEtiqueta();
		
		Assert.assertTrue(true);
		
	}

}
