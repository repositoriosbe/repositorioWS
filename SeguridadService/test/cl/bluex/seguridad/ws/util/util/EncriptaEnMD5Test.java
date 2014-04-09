/**
 * 
 */
package cl.bluex.seguridad.ws.util.util;


import junit.framework.Assert;
import cl.bluex.seguridad.ws.util.Util;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * @author eherrera
 *
 */
public class EncriptaEnMD5Test {
	
	

	/**
	 * Test method for {@link cl.bluex.seguridad.ws.util.Util#encriptaEnMD5(java.lang.String)}.
	 * @throws BluexException 
	 */
//	@Test
	public void testEncriptaEnMD5() throws BluexException {
		final String stringAEncriptar = "SNAVIA";
		final String encriptaEnMD5 = Util.encriptaEnMD5(stringAEncriptar);
		
		final String expected = "";
		Assert.assertEquals(expected, encriptaEnMD5);
	}

}
