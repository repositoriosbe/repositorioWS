package cl.bluex.generadoretiqueta.factory;

import org.apache.ibatis.session.SqlSessionFactory;

import cl.bluex.generadoretiqueta.GeneradorEtiquetaDao;
import cl.bluex.generadoretiqueta.mybatis.GeneradorEtiquetaDaoImpl;
import cl.bluex.ws.common.dao.AbstractDaoFactory;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.proxy.AbstractProxy;
import cl.bluex.ws.common.proxy.DaoProxy;

/**
 * @author Edgardo Herrera
 * 
 */
public class DaoFactoryImpl extends AbstractDaoFactory implements DaoFactory {

	public DaoFactoryImpl(final SqlSessionFactory sqlSessionFactory) {
		super(sqlSessionFactory);
	}

	@Override
	public GeneradorEtiquetaDao getGeneradorEtiquetaDao() throws BluexException {
		return (GeneradorEtiquetaDao) AbstractProxy.proxy(
				new GeneradorEtiquetaDaoImpl(getSession()), new DaoProxy());
	}
}
