package cl.bluex.listas.dao.listasDao;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import cl.bluex.digmodel.to.LocalidadTO;
import cl.bluex.ws.common.exceptions.BluexException;


/**
 * Test metodo {@link ListasDaoImpl#obtieneLocalidades(String, String, String, 
 * long, long, long)}.
 * 
 * @author Edgardo Herrera
 *
 */
public class ObtieneLocalidadesTest extends DaoBaseTest {

    private static final String PQS = "PQS";
    private static final String ARI = "ARI";

    /**
     * constructor.
     */
//    public ObtieneLocalidadesTest() {
//	super();
//    }
//    
//    @Test
//    public void obtieneTodasLocalidades() throws BluexException {
//	final List<LocalidadTO> localidades = getDao().obtieneLocalidades("CL", ARI, PQS, 1, 2, 15201);
//	final LocalidadTO localidadTO = localidades.get(0);
//	final String codigoPosta = localidadTO.getCodigoPosta();
//	final String codigo = localidadTO.getCodigo();
//	final String descripcion = localidadTO.getDescripcion();
//	final String codigoComuna = localidadTO.getCodigoComuna();
//	final String descripcionComuna = localidadTO.getDescripcionComuna();
//	final String codigoTipoRadioInfluencia = localidadTO.getCodigoTipoRadioInfluencia();
//	final String descripcionTipoRadioInfluencia = localidadTO.getDescripcionTipoRadioInfluencia();
//	
//	Assert.assertEquals(ARI, codigoPosta);
//	Assert.assertEquals(PQS, codigo);
//	Assert.assertEquals("PUQUISA", descripcion);
//	Assert.assertEquals("15201", codigoComuna);
//	Assert.assertEquals("PUTRE", descripcionComuna);
//	Assert.assertEquals("ME", codigoTipoRadioInfluencia);
//	Assert.assertEquals("MUY EXTREMA", descripcionTipoRadioInfluencia);
//    }
}
