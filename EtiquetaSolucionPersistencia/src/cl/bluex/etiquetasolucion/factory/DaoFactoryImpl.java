package cl.bluex.etiquetasolucion.factory;

import org.apache.ibatis.session.SqlSessionFactory;

import cl.bluex.etiquetasolucion.EtiquetaSolucionDao;
import cl.bluex.etiquetasolucion.mybatis.EtiquetaSolucionDaoImpl;
import cl.bluex.ws.common.dao.AbstractDaoFactory;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.proxy.AbstractProxy;
import cl.bluex.ws.common.proxy.DaoProxy;

/**
 * @author rmoscoso
 * 
 */
public class DaoFactoryImpl extends AbstractDaoFactory implements DaoFactory {

	public DaoFactoryImpl(final SqlSessionFactory sqlSessionFactory) {
		super(sqlSessionFactory);
	}

	@Override
	public EtiquetaSolucionDao getEtiquetaSolucionDao() throws BluexException {
		return (EtiquetaSolucionDao) AbstractProxy.proxy(new EtiquetaSolucionDaoImpl(getSession()),
				new DaoProxy());
	}
}
