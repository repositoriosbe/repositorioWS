package cl.bluex.seguridad.factory;

import cl.bluex.ws.common.spring.AbstractFactoryService;

/**
 * @author Edgardo Herrera
 * 
 */
public final class SeguridadDaoFactory extends AbstractFactoryService {

	private static final SeguridadDaoFactory INSTANCE = new SeguridadDaoFactory();

	private SeguridadDaoFactory() {
		super();
	}

	public static SeguridadDaoFactory getInstance() {
		synchronized (SeguridadDaoFactory.class) {
			return INSTANCE;
		}
	}

	@Override
	protected String getConfigBean() {
		return "cl/bluex/seguridad/config/spring-context.xml";
	}

	public DaoFactory getDaoFactory() {
		return getBean(DaoFactory.class);
	}
}
