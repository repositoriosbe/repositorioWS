package cl.bluex.ws.common.util.validador;

import java.lang.reflect.InvocationTargetException;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import cl.bluex.ws.common.exceptions.ValidationException;
import cl.bluex.ws.common.util.Validador;

/**
 * @author Edgardo Herrera
 *
 */
public class EntradaEsValidaTest {

	private Validador validador;
	
	/**
	 * Crea instancia de {@link EntradaEsValidaTest}.
	 *
	 */
	public EntradaEsValidaTest() {
		super();
	}
	
	@Before
	public void setUp() {
		validador = new Validador();
	}
	
	// campo obligatorio, tipo String, valor no null
	@Test
	public void campoObligatorioTipoStringValorNoNull() throws NoSuchMethodException, 
		IllegalAccessException, InvocationTargetException, ValidationException {
		final ClasePruebaAtributoString clase = new ClasePruebaAtributoString();
		clase.setCampoString("prueba");
		
		validador.entradaEsValida(clase);
	}
	
	// campo obligatorio, tipo String, valor no null, largo 2
	@Test
	public void campoObligatorioTipoStringValorNoNullLargoPermitido() throws NoSuchMethodException, 
		IllegalAccessException, InvocationTargetException, ValidationException {
		final ClasePruebaAtributoStringLargo clase = new ClasePruebaAtributoStringLargo();
		clase.setCampoString("pr");
		
		validador.entradaEsValida(clase);
		
	}
	
	// campo obligatorio, tipo String, valor no null, largo 2
	@Test(expected = ValidationException.class)
	public void campoObligatorioTipoStringValorNoNullLargoNoPermitido() throws NoSuchMethodException, 
		IllegalAccessException, InvocationTargetException, ValidationException {
		final ClasePruebaAtributoStringLargo clase = new ClasePruebaAtributoStringLargo();
		clase.setCampoString("prueba");
		
		validador.entradaEsValida(clase);
		
	}
	
	
	// campo obligatorio, tipo String, valor null
	@Test(expected = ValidationException.class)
	public void campoObligatorioTipoStringValorNull() throws NoSuchMethodException, 
		IllegalAccessException, InvocationTargetException, ValidationException {
		final ClasePruebaAtributoString clase = new ClasePruebaAtributoString();
		clase.setCampoString(null);
		
		validador.entradaEsValida(clase);
	}
	
	// campo obligatorio, tipo String, valor vacio
	@Test(expected = ValidationException.class)
	public void campoObligatorioTipoStringValorVacio() throws NoSuchMethodException, 
		IllegalAccessException, InvocationTargetException, ValidationException {
		final ClasePruebaAtributoString clase = new ClasePruebaAtributoString();
		clase.setCampoString("");
		
		validador.entradaEsValida(clase);
	}
	
	// campo obligatorio, tipo long, valor no null
	@Test
	public void campoObligatorioTipoLongValorNoNull() throws NoSuchMethodException, 
		IllegalAccessException, InvocationTargetException, ValidationException {
		final ClasePruebaAtributoLong clase = new ClasePruebaAtributoLong();
		clase.setCampoLong(1);
		
		validador.entradaEsValida(clase);
	}
	
	// campo obligatorio, tipo long, valor null
	@Test(expected = ValidationException.class)
	public void campoObligatorioTipoLongValorNull() throws NoSuchMethodException, 
		IllegalAccessException, InvocationTargetException, ValidationException {
		final ClasePruebaAtributoLong clase = new ClasePruebaAtributoLong();
		clase.setCampoLong(0);
		
		validador.entradaEsValida(clase);
	}
	
	// campo no obligatorio, tipo String, valor no null
	@Test
	public void campoNoObligatorioTipoStringValorNoNull() throws NoSuchMethodException, 
		IllegalAccessException, InvocationTargetException, ValidationException {
		final ClaseNoObligaPruebaAtributoString clase = new ClaseNoObligaPruebaAtributoString();
		clase.setCampoString("hola");
		
		validador.entradaEsValida(clase);
	}
	
	// campo no obligatorio, tipo String, valor null
	@Test
	public void campoNoObligatorioTipoStringValorNull() throws NoSuchMethodException, 
		IllegalAccessException, InvocationTargetException, ValidationException {
		final ClaseNoObligaPruebaAtributoString clase = new ClaseNoObligaPruebaAtributoString();
		clase.setCampoString(null);
		
		validador.entradaEsValida(clase);
	}
	
	// campo no obligatorio, tipo String, valor vacio
	@Test
	public void campoNoObligatorioTipoStringValorVacio() throws NoSuchMethodException, 
		IllegalAccessException, InvocationTargetException, ValidationException {
		final ClaseNoObligaPruebaAtributoString clase = new ClaseNoObligaPruebaAtributoString();
		clase.setCampoString("");
		
		validador.entradaEsValida(clase);
	}
	

}
