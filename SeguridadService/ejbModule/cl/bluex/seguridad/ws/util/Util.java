package cl.bluex.seguridad.ws.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import cl.bluex.ws.common.exceptions.BluexException;

/**
 * @author Edgardo Herrera
 *
 */
public final class Util {
	private static final char[] CONSTS_HEX = {'0', '1', '2', '3', '4', '5', '6', 
	    '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', };
  	
	private Util() {
		super();
	}
	public static String encriptaEnMD5(final String stringAEncriptar) throws BluexException
	{
		try {
		   final MessageDigest msgd = MessageDigest.getInstance("MD5");
		   final byte[] bytes = msgd.digest(stringAEncriptar.getBytes());
		   final StringBuilder strbCadenaMD5 = new StringBuilder(2 * bytes.length);
		   for (int i = 0; i < bytes.length; i++) {
		       final int bajo = bytes[i] & 0x0f;
		       final int alto = (bytes[i] & 0xf0) >> 4;
		       strbCadenaMD5.append(CONSTS_HEX[alto]);
		       strbCadenaMD5.append(CONSTS_HEX[bajo]);
		   }
		   return strbCadenaMD5.toString();
		} catch (final NoSuchAlgorithmException e) {
		    throw new BluexException("-1", "Error Servicio");
		}
	}
}
