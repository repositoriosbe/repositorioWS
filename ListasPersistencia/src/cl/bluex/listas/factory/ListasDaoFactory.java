package cl.bluex.listas.factory;

import cl.bluex.ws.common.spring.AbstractFactoryService;

/**
 * @author Edgardo Herrera
 * 
 */
public final class ListasDaoFactory extends AbstractFactoryService {

	private static final ListasDaoFactory INSTANCE = new ListasDaoFactory();

	private ListasDaoFactory() {
		super();
	}

	public static ListasDaoFactory getInstance() {
		synchronized (ListasDaoFactory.class) {
			return INSTANCE;
		}
	}

	@Override
	protected String getConfigBean() {
		return "cl/bluex/listas/config/spring-context.xml";
	}

	public DaoFactory getDaoFactory() {
		return getBean(DaoFactory.class);
	}
}
