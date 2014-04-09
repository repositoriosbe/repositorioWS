package cl.bluex.listas.ws.listasServiceImpl;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import cl.bluex.listas.bean.Posta;
import cl.bluex.listas.bean.response.ResponsePostas;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * Test metodo {@link ListasServiceImpl#obtienePostasComunas(String, long, long, 
 * cl.bluex.ws.common.head.Cabecera)}.
 * @author Edgardo Herrera
 *
 */
public class ObtienePostasComunasTest extends ServiceTestBase {

    private static final String CL = "CL";
    
    /**
     * crea instancia de {@link ObtienePostasComunasTest}.
     */
//    public ObtienePostasComunasTest() {
//	super();
//    }
//
//    @Test
//    public void testObtienePostasPorComuna() throws BluexException {
//	final RequestObtienePostasComunas request = new RequestObtienePostasComunas();
//	request.setCodigo(CL);
//	request.setTipoNegocio(1);
//	request.setComuna(4304);
//	final ResponsePostas response = getServicio().obtienePostasComunas(request, getCabecera());
//	final List<Posta> postas = response.getPostas();
//	final Posta posta = postas.get(0);
//	
//	Assert.assertEquals("LZP", posta.getCodigo());
//	Assert.assertEquals("LOS PERALES", posta.getDescripcion());
//	Assert.assertEquals("4304", posta.getCodigoComuna());
//	Assert.assertEquals("PUNITAQUI", posta.getComuna());
//    }
//    
//    @Test
//    public void testObtieneTodasPostas() throws BluexException {
//	final RequestObtienePostasComunas request = new RequestObtienePostasComunas();
//	request.setCodigo(CL);
//	request.setTipoNegocio(1);
//	request.setComuna(0);
//	final ResponsePostas response = getServicio().obtienePostasComunas(request, getCabecera());
//	final List<Posta> postas = response.getPostas();
//	final Posta posta = postas.get(0);
//	
//	Assert.assertEquals("AAN", posta.getCodigo());
//	Assert.assertEquals("CHOCALAN ", posta.getDescripcion());
//	Assert.assertEquals("13501", posta.getCodigoComuna());
//	Assert.assertEquals("MELIPILLA", posta.getComuna());
//    }

}
