package cl.bluex.digfull.factory;

import cl.bluex.ws.common.spring.AbstractFactoryService;

/**
 * @author Edgardo Herrera
 * 
 */
public final class DigitacionFullDaoFactory extends AbstractFactoryService {

    private static final DigitacionFullDaoFactory INSTANCE = new DigitacionFullDaoFactory();

	/**
	 * crea instancia de DigitacionFullDaoFactory
	 *
	 */
	private DigitacionFullDaoFactory() {
		super();
	}

	/**
	 * @return
	 */
	public static DigitacionFullDaoFactory getInstance() {
		synchronized (DigitacionFullDaoFactory.class) {
			return INSTANCE;
		}
	}

	/* (non-Javadoc)
	 * @see cl.bluex.ws.common.spring.AbstractFactoryService#getConfigBean()
	 */
	@Override
	protected String getConfigBean() {
		return "cl/bluex/digfull/config/spring-context.xml";
	}

	/**
	 * @return
	 */
	public DaoFactory getDaoFactory() {
		return getBean(DaoFactory.class);
	}
}
