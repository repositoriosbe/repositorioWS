package cl.bluex.generadorcodigobarra.tool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import cl.bluex.ws.common.exceptions.BluexException;


/**
 * @author Edgardo Herrera
 * 
 */
public final class Util {

	private Util() {
		super();
	}
	
	/**
	 * Valida el formato de la fecha.
	 * 
	 * @param fecha la fecha a validar
	 * @param formato el formato de la fecha
	 * @param nombreCampo nombre del campo
	 * @return {@link Date}
	 * @throws BluexException
	 */
	private static final Date validaFormatoFecha(final String fecha, final String formato, final String nombreCampo) throws BluexException {
		final SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
		Date parse;
		try {
			parse = dateFormat.parse(fecha);
		} catch (final ParseException e) {
			throw new BluexException("Formato de "+ nombreCampo +" incorrecto (" + formato + ")");
		}
		
		return parse;
	}

	/**
	 * Metodo que valida las fechas ingresadas.
	 * 
	 * @param fechaInicio la fecha de inicio
	 * @param fechaFin la fecha final
	 * @param formato el formato de la fecha
	 * @throws BluexException 
	 */
	public static void validaFechas(final String fechaInicio, final String fechaFin, final String formato) throws BluexException {
		
		validaObligatorio(fechaInicio, "fechaInicio");
		validaObligatorio(fechaFin, "fechaFin");
		
		validaLargoCampo(fechaInicio, "fechaInicio", 10);
		validaLargoCampo(fechaFin, "fechaFin", 10);
		
		final Date dateInicio = validaFormatoFecha(fechaInicio, formato, "fechaInicio");
		final Date dateFin = validaFormatoFecha(fechaFin, formato, "fechaFin");
		
		comparaFechas(dateInicio, dateFin);
	}

	/**
	 * Metodo compara que fecha inicio sea menor a fecha fin.
	 * 
	 * @param dateInicio la fecha de inicio
	 * @param dateFin la fecha de fin
	 * @throws BluexException
	 */
	private static void comparaFechas(final Date dateInicio, final Date dateFin)
			throws BluexException {
		final Calendar calInicio = Calendar.getInstance();
		calInicio.setTime(dateInicio);
		
		final Calendar calFin = Calendar.getInstance();
		calFin.setTime(dateFin);
		
		if (calInicio.after(calFin)) {
			throw new BluexException("Fecha inicio debe ser menor a fecha Fin");
		}
	}

	/**
	 * @param value
	 * @throws BluexException
	 */
	private static void validaLargoCampo(final String value, final String nombreCampo, final int largo)
			throws BluexException {
		if (value.length() != largo) {
			throw new BluexException(nombreCampo + " debe tener largo " + String.valueOf(largo));
		}
	}

	/**
	 * Metodo que valida si un campo es ingresado o es vacio.
	 * 
	 * @param value el valor del campo a evaluar
	 * @param nombreCampo el nombre del campo
	 * @throws BluexException
	 */
	private static void validaObligatorio(final String value, final String nombreCampo)
			throws BluexException {
		if (value == null || "".equals(value) ) {
			throw new BluexException(nombreCampo + " es un campo obligatorio");
		}
	}

}
