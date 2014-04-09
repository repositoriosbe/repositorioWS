package cl.bluex.ws.common.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation de validacion de campos de entrada al WS.
 * 
 * @author Edgardo Herrera
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Validate {
	String name() default "";
	boolean required() default false;
	int length() default -1;
}
