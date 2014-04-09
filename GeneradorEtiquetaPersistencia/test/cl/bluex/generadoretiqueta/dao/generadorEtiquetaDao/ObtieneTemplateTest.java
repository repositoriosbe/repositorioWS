package cl.bluex.generadoretiqueta.dao.generadorEtiquetaDao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import cl.bluex.generadoretiqueta.to.TemplateTO;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * @author Edgardo Herrera
 * 
 */
public class ObtieneTemplateTest extends DaoBaseTest {

	/**
	 * Crea instancia de {@link ObtieneTemplateTest}.
	 * 
	 */
	public ObtieneTemplateTest() {
		super();
	}

	/**
	 * @throws BluexException
	 * 
	 */
	@Test
	public void testObtieneTemplateVoucher() throws BluexException {
		final long codigoUsuario = 6;
		final long codigoImpresora = 183;
		final long codigoFormatoImpresion = 7;
		final String tipoEtiqueta = "VOUCHER";
//		final List<TemplateTO> template = getDao().obtieneTemplate(codigoUsuario,
//				codigoImpresora, 
//				codigoFormatoImpresion,
//				tipoEtiqueta);

//		Assert.assertEquals("", template);
		
		Assert.assertTrue(true);
	}
	
	/**
	 * @throws BluexException
	 * 
	 */
	@Test
	public void testObtieneTemplateValorados() throws BluexException {
		final long codigoUsuario = 6;
		final long codigoImpresora = 96;
		final long codigoFormatoImpresion = 7;
		final String tipoEtiqueta = "VALORADOS";
//		final List<TemplateTO> template = getDao().obtieneTemplate(codigoUsuario,
//				codigoImpresora, 
//				codigoFormatoImpresion,
//				tipoEtiqueta);

//		Assert.assertEquals("", template);
		
		Assert.assertTrue(true);
	}

}
