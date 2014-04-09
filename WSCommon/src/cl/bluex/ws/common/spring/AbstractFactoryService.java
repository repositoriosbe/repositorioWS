package cl.bluex.ws.common.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Clase Abstracta de configuración e inicialicacion de Spring Context.
 * 
 * @author Sebastian Navia I.
 * 
 */
public abstract class AbstractFactoryService {

	/** The factory. */
	private ApplicationContext factory;

	/**
	 * Gets the bean.
	 * 
	 * @param <T>
	 *            the generic type
	 * @param t
	 *            the t
	 * @return the bean
	 */
	public final <T> T getBean(final Class<T> t) {
		return this.getBean(t.getSimpleName(), t);
	}

	/**
	 * Gets the bean.
	 * 
	 * @param <T>
	 *            the generic type
	 * @param name
	 *            the name
	 * @param t
	 *            the t
	 * @return the bean
	 */
	public final <T> T getBean(final String name, final Class<T> t) {
		return getFactory().getBean(name, t);
	}

	/**
	 * Gets the bean.
	 * 
	 * @param <T>
	 *            the generic type
	 * @param t
	 *            the t
	 * @param arg
	 *            the arg
	 * @return the bean
	 */
	@SuppressWarnings("unchecked")
	public final <T> T getBean(final Class<T> t, final Object... arg) {
		return (T) getFactory().getBean(t.getSimpleName(), arg);
	}

	/**
	 * Gets the factory.
	 * 
	 * @return the factory
	 */
	private ApplicationContext getFactory() {
		synchronized (ApplicationContext.class) {
			if (this.factory == null) {
				this.factory = new ClassPathXmlApplicationContext(
						this.getConfigBean());
			}
		}
		return this.factory;
	}

	/**
	 * Path Archivo de configuracion Spring.
	 * 
	 * @return the config bean
	 */
	protected abstract String getConfigBean();
}
