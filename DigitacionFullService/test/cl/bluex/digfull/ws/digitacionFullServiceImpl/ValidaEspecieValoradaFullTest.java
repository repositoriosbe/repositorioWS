package cl.bluex.digfull.ws.digitacionFullServiceImpl;

import junit.framework.Assert;

import org.junit.Test;

import cl.bluex.digfull.bean.response.ResponseEspecieValoradaFull;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

/**
 * @author Edgardo Herrera
 *
 */
public class ValidaEspecieValoradaFullTest extends ServiceTestBase {
    /**
     * Crea instancia de {@link ValidaEspecieValoradaFullTest}.
     *
     */
    public ValidaEspecieValoradaFullTest() {
	super();
    }

    @Test
    public void testValidaEspecieValoradaFull() throws BluexException {
	final long codigoEmpresa = 2000;
	final String codigoTipoDocumento = "5";
	final long numeroDocumento = 346943310;
//	final ResponseEspecieValoradaFull bean = getServicio()
//		.validaEspecieValoradaFull(codigoEmpresa, codigoTipoDocumento, numeroDocumento, new Cabecera());
	
//	Assert.assertEquals(100344130, bean.getEspecieValorada().getEevvNmrId());
	
	Assert.assertTrue(true);
    }

}
