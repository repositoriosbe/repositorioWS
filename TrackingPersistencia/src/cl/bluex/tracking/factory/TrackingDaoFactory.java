package cl.bluex.tracking.factory;

import cl.bluex.ws.common.spring.AbstractFactoryService;

/**
 * @author Edgardo Herrera
 * 
 */
public final class TrackingDaoFactory extends AbstractFactoryService {

	private static final TrackingDaoFactory INSTANCE = new TrackingDaoFactory();

	private TrackingDaoFactory() {
		super();
	}

	public static TrackingDaoFactory getInstance() {
		synchronized (TrackingDaoFactory.class) {
			return INSTANCE;
		}
	}

	@Override
	protected String getConfigBean() {
		return "cl/bluex/tracking/config/spring-context.xml";
	}

	public DaoFactory getDaoFactory() {
		return getBean(DaoFactory.class);
	}
}
