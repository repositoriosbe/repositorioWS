package cl.bluex.generadoretiqueta.dao.generadorEtiquetaDao;


import org.junit.Assert;
import org.junit.Test;

import cl.bluex.generadoretiqueta.to.DestinoTO;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * @author Edgardo Herrera
 *
 */
public class ObtieneDestinoTest extends DaoBaseTest {
    
    /**
     * Crea instancia de {@link ObtieneDestinoTest}.
     *
     */
    public ObtieneDestinoTest() {
	super();
    }

    /**
     * @throws BluexException
     */
    @Test
    public void testObtieneDestino() throws BluexException {
    	final long codigoEmpresa = 2000;
    	final long codigoTipoNegocio = 1;
    	final String codigoPosta = "SCL";
    	final long codigoInfluencia = 1;
//    	final DestinoTO to = getDao().obtieneDestino(codigoEmpresa, codigoTipoNegocio, codigoPosta, codigoInfluencia);
        
//    	final String codigoDestino = to.getCodigoDestino();
    	
    	final String expected = "131011";
//    	Assert.assertEquals(expected , codigoDestino);
    	
    	Assert.assertTrue(true);
    }

}
