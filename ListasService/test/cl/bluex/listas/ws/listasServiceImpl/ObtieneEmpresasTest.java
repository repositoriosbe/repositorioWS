package cl.bluex.listas.ws.listasServiceImpl;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import cl.bluex.listas.bean.Empresa;
import cl.bluex.listas.bean.response.ResponseEmpresas;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

/**
 * Test metodo {@link ListasServiceImpl#obtieneEmpresas(cl.bluex.ws.common.head.Cabecera)}.
 * @author Edgardo Herrera
 *
 */
public class ObtieneEmpresasTest extends ServiceTestBase {
    
    /**
     * crea instancia de {@link ObtieneEmpresasTest}. 
     */
//    public ObtieneEmpresasTest() {
//	super();
//    }
//
//    @Test
//    public void testObtieneUnaEmpresa() throws BluexException {
//	final Cabecera cabecera = new Cabecera();
//	cabecera.setToken("a18e9393557e3693454dd92b97f3b93");
//	
//	final RequestObtieneEmpresas request = new RequestObtieneEmpresas();
//	final ResponseEmpresas response = getServicio().obtieneEmpresas(request, cabecera);
//	
//	final List<Empresa> empresas = response.getEmpresas();
//	
//	final Empresa empresa = empresas.get(0);
//	final long codigo = empresa.getCodigo();
//	final String descripcion = empresa.getDescripcion();
//	
//	Assert.assertEquals(45, codigo);
//	Assert.assertEquals("LAN CHILE S.A.", descripcion);
//    }
}
