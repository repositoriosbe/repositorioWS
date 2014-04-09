package cl.bluex.tracking.tool.util;

import org.junit.Test;

import cl.bluex.generadorcodigobarra.tool.Util;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.util.Constantes;

/**
 * @author eherrera
 *
 */
public class ValidaFechasTest {

	/**
	 * Test method for {@link cl.bluex.generadorcodigobarra.tool.Util#validaFechas(java.lang.String, java.lang.String, java.lang.String)}.
	 * @throws BluexException 
	 */
	@Test
	public void fechaInicioCorrectaFechaFinCorrecta() throws BluexException {
		final String fechaInicio = "12/02/2013";
		final String fechaFin = "12/02/2013";
		
		Util.validaFechas(fechaInicio, fechaFin , Constantes.SLASH_DD_MM_YYYY);
	}
	
	/**
	 * Test method for {@link cl.bluex.generadorcodigobarra.tool.Util#validaFechas(java.lang.String, java.lang.String, java.lang.String)}.
	 * @throws BluexException 
	 */
	@Test(expected = BluexException.class)
	public void fechaInicioNull() throws BluexException {
		final String fechaFin = "12/02/2013";
		Util.validaFechas(null, fechaFin , Constantes.SLASH_DD_MM_YYYY);
	}
	
	/**
	 * Test method for {@link cl.bluex.generadorcodigobarra.tool.Util#validaFechas(java.lang.String, java.lang.String, java.lang.String)}.
	 * @throws BluexException
	 */
	@Test(expected = BluexException.class)
	public void fechaInicioVacio() throws BluexException {
		final String fechaFin = "12/02/2013";
		Util.validaFechas("", fechaFin , Constantes.SLASH_DD_MM_YYYY);
	}
	
	/**
	 * Test method for {@link cl.bluex.generadorcodigobarra.tool.Util#validaFechas(java.lang.String, java.lang.String, java.lang.String)}.
	 * @throws BluexException
	 */
	@Test(expected = BluexException.class)
	public void fechaFinNull() throws BluexException {
		final String fechaInicio = "12/02/2013";
		Util.validaFechas(fechaInicio, null , Constantes.SLASH_DD_MM_YYYY);
	}
	
	/**
	 * Test method for {@link cl.bluex.generadorcodigobarra.tool.Util#validaFechas(java.lang.String, java.lang.String, java.lang.String)}.
	 * @throws BluexException
	 */
	@Test(expected = BluexException.class)
	public void fechaFinVacio() throws BluexException {
		final String fechaInicio = "12/02/2013";
		Util.validaFechas(fechaInicio, "" , Constantes.SLASH_DD_MM_YYYY);
	}
	
	/**
	 * Test method for {@link cl.bluex.generadorcodigobarra.tool.Util#validaFechas(java.lang.String, java.lang.String, java.lang.String)}.
	 * @throws BluexException
	 */
	@Test(expected = BluexException.class)
	public void fechaInicioLargoIncorrecto() throws BluexException {
		final String fechaInicio = "12/02/201";
		final String fechaFin = "12/02/2012";
		Util.validaFechas(fechaInicio, fechaFin , Constantes.SLASH_DD_MM_YYYY);
	}
	
	/**
	 * Test method for {@link cl.bluex.generadorcodigobarra.tool.Util#validaFechas(java.lang.String, java.lang.String, java.lang.String)}.
	 * @throws BluexException
	 */
	@Test(expected = BluexException.class)
	public void fechaFinLargoIncorrecto() throws BluexException {
		final String fechaInicio = "12/02/2012";
		final String fechaFin = "12/02/201";
		Util.validaFechas(fechaInicio, fechaFin , Constantes.SLASH_DD_MM_YYYY);
	}
	
	/**
	 * Test method for {@link cl.bluex.generadorcodigobarra.tool.Util#validaFechas(java.lang.String, java.lang.String, java.lang.String)}.
	 * @throws BluexException
	 */
	@Test(expected = BluexException.class)
	public void fechaInicioMayorFechaFin() throws BluexException {
		final String fechaInicio = "13/02/2012";
		final String fechaFin = "12/02/2012";
		Util.validaFechas(fechaInicio, fechaFin , Constantes.SLASH_DD_MM_YYYY);
	}
	
	/**
	 * Test method for {@link cl.bluex.generadorcodigobarra.tool.Util#validaFechas(java.lang.String, java.lang.String, java.lang.String)}.
	 * @throws BluexException
	 */
	@Test(expected = BluexException.class)
	public void fechaInicioFormatoIncorrecto() throws BluexException {
		final String fechaInicio = "11-02-2012";
		final String fechaFin = "12/02/2012";
		Util.validaFechas(fechaInicio, fechaFin , Constantes.SLASH_DD_MM_YYYY);
	}
	
	/**
	 * Test method for {@link cl.bluex.generadorcodigobarra.tool.Util#validaFechas(java.lang.String, java.lang.String, java.lang.String)}.
	 * @throws BluexException
	 */
	@Test(expected = BluexException.class)
	public void fechaFinFormatoIncorrecto() throws BluexException {
		final String fechaInicio = "11/02/2012";
		final String fechaFin = "12-02-2012";
		Util.validaFechas(fechaInicio, fechaFin , Constantes.SLASH_DD_MM_YYYY);
	}

}
