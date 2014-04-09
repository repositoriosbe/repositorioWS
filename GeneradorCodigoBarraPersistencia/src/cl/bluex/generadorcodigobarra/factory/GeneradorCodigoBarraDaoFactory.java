package cl.bluex.generadorcodigobarra.factory;

import cl.bluex.ws.common.spring.AbstractFactoryService;

/**
 * @author Edgardo Herrera
 * 
 */
public final class GeneradorCodigoBarraDaoFactory extends AbstractFactoryService {

	private static final GeneradorCodigoBarraDaoFactory INSTANCE = new GeneradorCodigoBarraDaoFactory();

	private GeneradorCodigoBarraDaoFactory() {
		super();
	}

	public static GeneradorCodigoBarraDaoFactory getInstance() {
		synchronized (GeneradorCodigoBarraDaoFactory.class) {
			return INSTANCE;
		}
	}

	@Override
	protected String getConfigBean() {
		return "cl/bluex/generadorcodigobarra/config/spring-context.xml";
	}

	public DaoFactory getDaoFactory() {
		return getBean(DaoFactory.class);
	}
}
