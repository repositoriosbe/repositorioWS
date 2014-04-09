package cl.bluex.generadoretiqueta.factory;

import cl.bluex.ws.common.spring.AbstractFactoryService;

/**
 * @author Edgardo Herrera
 * 
 */
public final class GeneradorEtiquetaDaoFactory extends AbstractFactoryService {

	private static final GeneradorEtiquetaDaoFactory INSTANCE = new GeneradorEtiquetaDaoFactory();

	private GeneradorEtiquetaDaoFactory() {
		super();
	}

	public static GeneradorEtiquetaDaoFactory getInstance() {
		synchronized (GeneradorEtiquetaDaoFactory.class) {
			return INSTANCE;
		}
	}

	@Override
	protected String getConfigBean() {
		return "cl/bluex/generadoretiqueta/config/spring-context.xml";
	}

	public DaoFactory getDaoFactory() {
		return getBean(DaoFactory.class);
	}
}
