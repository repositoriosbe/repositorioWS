package cl.bluex.verificacion.factory;

import org.apache.ibatis.session.SqlSessionFactory;

import cl.bluex.verificacion.VerificacionDao;
import cl.bluex.verificacion.mybatis.VerificacionDaoImpl;
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
	public VerificacionDao getVerificacionDao() throws BluexException {
		return (VerificacionDao) AbstractProxy.proxy(new VerificacionDaoImpl(getSession()),
				new DaoProxy());
	}
}
