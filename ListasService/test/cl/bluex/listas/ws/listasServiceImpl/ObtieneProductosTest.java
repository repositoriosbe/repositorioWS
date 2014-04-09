package cl.bluex.listas.ws.listasServiceImpl;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.listas.bean.Producto;
import cl.bluex.listas.bean.response.ResponseProductos;

/**
 * Test de metodo {@link ListasServiceImpl#obtieneProductos(String, long, 
 * cl.bluex.ws.common.head.Cabecera)}.
 * @author Edgardo Herrera
 *
 */
public class ObtieneProductosTest extends ServiceTestBase {
    
    /**
     * crea instancia de {@link ObtieneProductosTest}.
     */
//    public ObtieneProductosTest() {
//	super();
//    }
//    
//    @Test
//    public void obtieneProductosFamiliaEspecifica() throws BluexException {
//	final ResponseProductos response = getServicio().obtieneProductos("REP", 45, getCabecera());
//	
//	final List<Producto> productos = response.getProducto();
//	final Producto producto = productos.get(0);
//	
//	final String codigo = producto.getCodigo();
//	final String descripcion = producto.getDescripcion();
//	
//	Assert.assertEquals("DEP", codigo);
//	Assert.assertEquals("ARTICULO DEPORTE N/R", descripcion);
//    }
//    
//    @Test
//    public void obtieneProductosCualquierFamilia() throws BluexException {
//	final ResponseProductos response = getServicio().obtieneProductos("0", 45, getCabecera());
//	
//	final List<Producto> productos = response.getProducto();
//	final Producto producto = productos.get(0);
//	
//	final String codigo = producto.getCodigo();
//	final String descripcion = producto.getDescripcion();
//	
//	Assert.assertEquals("ABA", codigo);
//	Assert.assertEquals("ABARROTES", descripcion);
//    }

}
