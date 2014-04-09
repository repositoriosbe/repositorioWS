package cl.bluex.listas.dao.listasDao;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import cl.bluex.digmodel.to.PaisTO;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * Test metodo obtienePaises.
 * 
 * @author Edgardo Herrera
 *
 */
public class ObtienePaisesTest extends DaoBaseTest {
    
    private static final String CL = "CL";

    /**
     * Constructor.
     */
//    public ObtienePaisesTest() {
//	super();
//    }
//
//    /**
//     * Caso obtiene la lista con todos los paises.
//     * 
//     * @throws BluexException excepcion generica
//     */
//    @Test
//    public final void testObtieneListaPaises() throws BluexException {
//	final List<PaisTO> paises = getDao().obtienePaises(CL);
//
//	final PaisTO to = paises.get(0);
//	
//	Assert.assertEquals(CL, to.getCodigo());
//	Assert.assertEquals("CHILE", to.getDescripcion());
//	Assert.assertEquals("CLP", to.getCodigoMoneda());
//    }
//    
//    @Test
//    public final void testObtieneListaVacia() throws BluexException {
//	final List<PaisTO> paises = getDao().obtienePaises("CX");
//
//	Assert.assertEquals(0, paises.size());
//    }

}
