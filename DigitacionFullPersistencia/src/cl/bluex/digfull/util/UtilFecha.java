package cl.bluex.digfull.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import cl.bluex.ws.common.exceptions.BluexException;

/**
 * @author eherrera
 *
 */
public class UtilFecha {
	
	private static final String CODIGO_ERROR = "-1";
	
	
	/**
	 * Metodo que da formato a una fecha en string y la transforma a Date.
	 * 
	 * @param strFecha la fecha en string
	 * @param formato el formato de la fecha
	 * @return la fecha en Date
	 * @throws BluexException
	 */
	public static Date formatearFecha(final String strFecha, final String formato)
			throws BluexException {
		Date parse = null;
		try {
			if (strFecha != null && !strFecha.isEmpty()) {
				final SimpleDateFormat sdf = new SimpleDateFormat(formato);
				parse = sdf.parse(strFecha);
			}
		} catch (final ParseException e) {
			throw new BluexException(CODIGO_ERROR,
					Constante.FORMATO_DE_FECHA_INCORRECTO + " ("+ Constante.FECHA_DD_MM_YYY_HH_MM +")");
		}
		return parse;
	}
}
