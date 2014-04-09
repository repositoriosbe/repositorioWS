package cl.bluex.digexpress.factory;

import cl.bluex.ws.common.spring.AbstractFactoryService;

/**
 * @author Edgardo Herrera
 * 
 */
public final class DigitacionExpressDaoFactory extends AbstractFactoryService {

    private static final DigitacionExpressDaoFactory INSTANCE = new DigitacionExpressDaoFactory();

    private DigitacionExpressDaoFactory() {
	super();
    }

    public static DigitacionExpressDaoFactory getInstance() {
	synchronized (DigitacionExpressDaoFactory.class) {
	    return INSTANCE;
	}
    }

    @Override
    protected String getConfigBean() {
	return "cl/bluex/digexpress/config/spring-context.xml";
    }

    public DaoFactory getDaoFactory() {
	return getBean(DaoFactory.class);
    }
}
