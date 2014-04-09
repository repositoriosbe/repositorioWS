package cl.bluex.monitor.factory;

import cl.bluex.ws.common.spring.AbstractFactoryService;

/**
 * @author Edgardo Herrera
 * 
 */
public final class MonitorDaoFactory extends AbstractFactoryService {

	private static final MonitorDaoFactory INSTANCE = new MonitorDaoFactory();

	private MonitorDaoFactory() {
		super();
	}

	public static MonitorDaoFactory getInstance() {
		synchronized (MonitorDaoFactory.class) {
			return INSTANCE;
		}
	}

	@Override
	protected String getConfigBean() {
		return "cl/bluex/monitor/config/spring-context.xml";
	}

	public DaoFactory getDaoFactory() {
		return getBean(DaoFactory.class);
	}
}
