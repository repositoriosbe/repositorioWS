package cl.bluex.seguridad.factory;

import org.apache.ibatis.session.SqlSessionFactory;

import cl.bluex.seguridad.SeguridadDao;
import cl.bluex.seguridad.mybatis.SeguridadDaoImpl;
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
	public SeguridadDao getSeguridadDao() throws BluexException {
		return (SeguridadDao) AbstractProxy.proxy(new SeguridadDaoImpl(
				getSession()), new DaoProxy());
	}
}
