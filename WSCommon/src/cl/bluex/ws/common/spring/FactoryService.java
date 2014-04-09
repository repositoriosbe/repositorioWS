package cl.bluex.ws.common.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Clase Abstracta de configuración e inicialicacion de Spring Context.
 * 
 * @author Sebastian Navia I.
 * 
 */
public abstract class FactoryService {
	private ApplicationContext factory;

	public final <T> T getBean(final Class<T> t) {
		return this.getBean(t.getSimpleName(), t);
	}

	public final <T> T getBean(final String name, final Class<T> t) {
		return getFactory().getBean(name, t);
	}

	@SuppressWarnings("unchecked")
	public final <T> T getBean(final Class<T> t, final Object... arg) {
		return (T) getFactory().getBean(t.getSimpleName(), arg);
	}

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
	 * Archivo de configuracion Spring.
	 */
	protected abstract String getConfigBean();
}
