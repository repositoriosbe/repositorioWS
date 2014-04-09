package cl.bluex.listas.dao.listasDao;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import cl.bluex.digmodel.to.PostaTO;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * Test metodo {@link ListasDaoImpl#obtienePostas}.
 * 
 * @author Edgardo Herrera
 * 
 */
public class ObtienePostasTest extends DaoBaseTest {

	private static final String CL = "CL";

	/**
	 * Crea instancia de {@link ObtienePostasTest}.
	 * 
	 */
//	public ObtienePostasTest() {
//		super();
//	}
//
//	@Test
//	public final void testObtienePostas() throws BluexException {
//		final List<PostaTO> postas = getDao().obtienePostas(CL, 1, -1);
//
//		final PostaTO to = postas.get(0);
//
//		Assert.assertEquals("PAB", to.getCodigo());
//		Assert.assertEquals("ABTAO", to.getDescripcion());
//		Assert.assertEquals(10, to.getCodigoRegion());
//	}
//
//	@Test
//	public final void testObtieneListaVacia() throws BluexException {
//		final List<PostaTO> postas = getDao().obtienePostas("CX", 1, -1);
//
//		Assert.assertEquals(0, postas.size());
//	}

}
