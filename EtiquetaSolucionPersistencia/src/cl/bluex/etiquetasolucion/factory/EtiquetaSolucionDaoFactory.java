package cl.bluex.etiquetasolucion.factory;

import cl.bluex.ws.common.spring.AbstractFactoryService;

/**
 * @author rmoscoso
 * 
 */
public final class EtiquetaSolucionDaoFactory extends AbstractFactoryService {

	private static final EtiquetaSolucionDaoFactory INSTANCE = new EtiquetaSolucionDaoFactory();

	private EtiquetaSolucionDaoFactory() {
		super();
	}

	public static EtiquetaSolucionDaoFactory getInstance() {
		synchronized (EtiquetaSolucionDaoFactory.class) {
			return INSTANCE;
		}
	}

	@Override
	protected String getConfigBean() {
		return "cl/bluex/etiquetasolucion/config/spring-context.xml";
	}

	public DaoFactory getDaoFactory() {
		return getBean(DaoFactory.class);
	}
}
