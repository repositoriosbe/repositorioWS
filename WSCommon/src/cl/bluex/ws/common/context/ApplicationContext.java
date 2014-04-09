package cl.bluex.ws.common.context;

import cl.bluex.ws.common.property.PropertyManager;

/**
 * The Class ApplicationContext.
 * 
 * @author Sebastian E. Navia Iturriaga
 */
public class ApplicationContext {

	/** The property manager. */
	private final PropertyManager propertyManager = new PropertyManager();

	/** The name context. */
	private String nameContext;

	/**
	 * Instantiates a new application context.
	 */
	protected ApplicationContext() {
		super();
	}

	/**
	 * Gets the current instance.
	 * 
	 * @return the current instance
	 */
	public static ApplicationContext getCurrentInstance() {
		return ApplicationContextWS.getCurrentInstance();
	}

	/**
	 * Gets the name context.
	 * 
	 * @return the name context
	 */
	public String getNameContext() {
		return this.nameContext;
	}

	/**
	 * Gets the property manager.
	 * 
	 * @return the property manager
	 */
	public PropertyManager getPropertyManager() {
		return this.propertyManager;
	}

	/**
	 * Sets the name context.
	 * 
	 * @param newNameContext
	 *            the new name context
	 */
	protected final void setNameContext(final String newNameContext) {
		this.nameContext = newNameContext;
	}

}
