package cl.bluex.ws.common.util;

import java.lang.reflect.Field;

import cl.bluex.ws.common.exceptions.BluexException;

public class Util {
	private static final double DOUBLE_CERO = 0;
	private static final long LONG_CERO = 0;
	private static final int INTEGER_CERO = 0;
	
	public Field[] obtenerFields(final Class<?> clazz) {
		return clazz.getFields();
	}

	/**
	 * Metodo que valida si un Long es null, lo pasa a cero.
	 * @param value
	 * @return
	 */
	public static long validaLong(final Long value) {
		return value != null ? value : LONG_CERO;
	}

	/**
	 * Metodo que valida si un Double es null, lo pasa a cero.
	 * @param value
	 * @return
	 */
	public static double validaDouble(final Double value) {
		return value != null ? value : DOUBLE_CERO;
	}

	/**
	 * @param integer
	 * @return
	 */
	public static int validaInteger(final Integer value) {
		return value != null ? value : INTEGER_CERO;
	}
	
	/**
	 * Metodo que valida si un campo es ingresado o es vacio.
	 * 
	 * @param value el valor del campo a evaluar
	 * @param nombreCampo el nombre del campo
	 * @throws BluexException
	 */
	public static void validaObligatorio(final String value, final String nombreCampo)
			throws BluexException {
		if (value == null || "".equals(value) ) {
			throw new BluexException(nombreCampo + " es un campo obligatorio");
		}
	}
	
	/**
	 * Metodo que valida si un campo es ingresado o es vacio.
	 * 
	 * @param value el valor del campo a evaluar
	 * @param nombreCampo el nombre del campo
	 * @throws BluexException
	 */
	public static void validaObligatorio(final int value, final String nombreCampo)
		throws BluexException {
		if (value == 0) {
			throw new BluexException(nombreCampo + " es un campo obligatorio y diferente de cero");
		}
	}
	
	/**
	 * Metodo que valida si un campo es ingresado o es vacio.
	 * 
	 * @param value el valor del campo a evaluar
	 * @param nombreCampo el nombre del campo
	 * @throws BluexException
	 */
	public static void validaObligatorio(final long value, final String nombreCampo)
		throws BluexException {
		if (value == 0) {
			throw new BluexException(nombreCampo + " es un campo obligatorio y diferente de cero");
		}
	}
}
