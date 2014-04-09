package cl.bluex.generadorcodigobarra.factory;

import org.apache.ibatis.session.SqlSessionFactory;

import cl.bluex.generadorcodigobarra.GeneradorCodigoBarraDao;
import cl.bluex.generadorcodigobarra.mybatis.GeneradorCodigoBarraDaoImpl;
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
	public GeneradorCodigoBarraDao getGeneradorCodigoBarraDao() throws BluexException {
		return (GeneradorCodigoBarraDao) AbstractProxy.proxy(new GeneradorCodigoBarraDaoImpl(getSession()),
				new DaoProxy());
	}
}
