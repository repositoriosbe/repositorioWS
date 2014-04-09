package cl.bluex.ws.common.file;

import org.apache.commons.codec.binary.Base64;
import cl.bluex.ws.common.exceptions.BluexException;

public class EncoderBase64 {
    /**
     * Instantiates a new encoder base64.
     */
    private EncoderBase64() {
	super();
    }

    /**
     * Codifica un arreglo en un arreglo Base64.
     *
     * @param b the b
     * @return Arreglo Base 64
     * @throws Exception the exception
     */
    public static byte[] encode(final byte[] b) throws BluexException {
	return Base64.encodeBase64(b);
    }

    /**
     * Codifica un arreglo base64 en un arreglo binario.
     *
     * @param b the b
     * @return the byte[]
     * @throws Exception the exception
     */
    public static byte[] decode(final byte[] b) throws BluexException {
	return Base64.decodeBase64(b);
    }
}
