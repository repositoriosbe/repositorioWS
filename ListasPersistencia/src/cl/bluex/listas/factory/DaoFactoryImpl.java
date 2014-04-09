package cl.bluex.listas.factory;

import org.apache.ibatis.session.SqlSessionFactory;

import cl.bluex.listas.ListasDao;
import cl.bluex.listas.mybatis.ListasDaoImpl;
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
	public ListasDao getListasDao() throws BluexException {
		return (ListasDao) AbstractProxy.proxy(new ListasDaoImpl(getSession()),
				new DaoProxy());
	}
}
