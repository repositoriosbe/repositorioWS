package cl.bluex.ws.common.util;

import static cl.bluex.ws.common.util.Constantes.ERROR_NRO;
import static cl.bluex.ws.common.util.Constantes.FORMATO_FECHA_INCORRECTO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import cl.bluex.ws.common.exceptions.BluexException;

/**
 * @author eherrera
 *
 */
public class UtilFecha {

	/**
	 * Metodo que formatea la fecha.
	 * 
	 * @param fecha
	 * @param formato
	 * @return
	 * @throws BluexException
	 */
	public static Date formateoFecha(final Date fecha, final String formato) throws BluexException {
		Date parse = null;
		try {
			if (fecha != null) {
				final SimpleDateFormat sdf = new SimpleDateFormat(formato);
				final String format = sdf.format(fecha);
				parse = sdf.parse(format);
			}
		} catch (final ParseException e) {
			throw new BluexException(ERROR_NRO, FORMATO_FECHA_INCORRECTO);
		}
		return parse;
	}
}
