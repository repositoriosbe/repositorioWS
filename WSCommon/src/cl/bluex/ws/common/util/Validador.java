package cl.bluex.ws.common.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.ws.common.util.Validate;
import cl.bluex.ws.common.exceptions.ValidationException;

/**
 * @author Edgardo Herrera
 *
 */
public class Validador {
	
	private static final String ERROR_NUMERO = "-1";

	public Validador() {
		super();
	}
	
	@AroundInvoke
	public Object validarEntrada(final InvocationContext context) throws Exception {
		final Object[] parameters = context.getParameters();
		for (final Object obj : parameters) {
			if (obj.getClass().isAnnotationPresent(XmlType.class)) {
				this.entradaEsValida(obj);
			}
		}
		return context.proceed();
	}

	/**
	 * @param obj
	 * @return
	 * @throws NoSuchMethodException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws ValidationException 
	 */
	public void entradaEsValida(final Object obj) 
		throws ValidationException {
		final Class<? extends Object> clazz = obj.getClass();
		final Field[] declaredFields = clazz.getDeclaredFields();
		
		for (final Field field : declaredFields) {
			if (field.isAnnotationPresent(Validate.class)) {
				final String name = field.getName();
				final String nombreMetodo = "get" + name.substring(0, 1).toUpperCase() + name.substring(1);
				Object valor;
				try {
					valor = clazz.getMethod(nombreMetodo).invoke(obj);
				} catch (final IllegalArgumentException e) {
					throw new ValidationException(ERROR_NUMERO, null, e.getCause());
				} catch (final SecurityException e) {
					throw new ValidationException(ERROR_NUMERO, null, e.getCause());
				} catch (final IllegalAccessException e) {
					throw new ValidationException(ERROR_NUMERO, null, e.getCause());
				} catch (final InvocationTargetException e) {
					throw new ValidationException(ERROR_NUMERO, null, e.getCause());
				} catch (final NoSuchMethodException e) {
					throw new ValidationException(ERROR_NUMERO, null, e.getCause());
				}
				
				ejecutaValidacion(field, name, valor);
			}
		}
	}

	private void ejecutaValidacion(final Field field, final String name,
			final Object valor) throws ValidationException {
		final Validate annotation = field.getAnnotation(Validate.class);
		
		// anotacion obligatoria
		if (annotation.required()) {
			// String
			if (String.class.equals(field.getType())) {
				// validacion de valor
				if (valor == null || "".equals(valor)) {
					throw new ValidationException(ERROR_NUMERO, name + " es obligatorio");
				}
				// validacion de largo
				if (annotation.length() != -1 && annotation.length() < ((String) valor).length()) {
					throw new ValidationException(ERROR_NUMERO, name + " es demasiado largo");
				}
			}
			// long
			if ("long".equals(field.getType().getName())) {
				// validacion no permite cero
				if (annotation.length() != 0 && ((Long) valor) == 0) {
					throw new ValidationException(ERROR_NUMERO, name + " es invalido");
				}
			}
			
		}
	}
}
