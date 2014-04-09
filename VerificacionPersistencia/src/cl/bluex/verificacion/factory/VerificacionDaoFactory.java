package cl.bluex.verificacion.factory;

import cl.bluex.ws.common.spring.AbstractFactoryService;

/**
 * @author Edgardo Herrera
 * 
 */
public final class VerificacionDaoFactory extends AbstractFactoryService {

	private static final VerificacionDaoFactory INSTANCE = new VerificacionDaoFactory();

	private VerificacionDaoFactory() {
		super();
	}

	public static VerificacionDaoFactory getInstance() {
		synchronized (VerificacionDaoFactory.class) {
			return INSTANCE;
		}
	}

	@Override
	protected String getConfigBean() {
		return "cl/bluex/verificacion/config/spring-context.xml";
	}

	public DaoFactory getDaoFactory() {
		return getBean(DaoFactory.class);
	}
}
