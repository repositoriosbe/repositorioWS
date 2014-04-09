package cl.bluex.listas.ws.listasServiceImpl;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import cl.bluex.listas.bean.Pais;
import cl.bluex.listas.bean.response.ResponsePaises;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * Test para metodo {@link ListasServiceImpl#obtienePaises(String, cl.bluex.ws.common.head.Cabecera)}.
 * @author edgardo
 *
 */
public class ObtienePaisesTest extends ServiceTestBase {

    private static final String CL = "CL";
    
    /**
     * crea instancia de {@link ObtienePaisesTest}. 
     */
//    public ObtienePaisesTest() {
//	super();
//    }
//
//    /**
//     * Caso exitoso en que se obtiene la lista de los paises.
//     *
//     * @throws BluexException excepcion de servicio
//     */
//    @Test
//    public final void testObtieneUnPais() throws BluexException {
//	final ResponsePaises response = getServicio().obtienePaises(CL, getCabecera());
//
//	final List<Pais> paises = response.getPaises();
//	final Pais pais = paises.get(0);
//	final String codigo = pais.getCodigo();
//	final String descripcion = pais.getDescripcion();
//
//	Assert.assertEquals(CL, codigo);
//	Assert.assertEquals("CHILE", descripcion);
//    }
//    
//    /**
//     * Caso exitoso en que se obtiene la lista de los paises.
//     *
//     * @throws BluexException excepcion de servicio
//     */
//    @Test
//    public final void testObtieneTodosPais() throws BluexException {
//	final ResponsePaises response = getServicio().obtienePaises("0", getCabecera());
//
//	final List<Pais> paises = response.getPaises();
//	final Pais pais = paises.get(0);
//	final String codigo = pais.getCodigo();
//	final String descripcion = pais.getDescripcion();
//
//	Assert.assertEquals("DE", codigo);
//	Assert.assertEquals("ALEMANIA", descripcion);
//    }

}
