package cl.bluex.digfull.factory;

import org.apache.ibatis.session.SqlSessionFactory;

import cl.bluex.digfull.DigitacionFullDao;
import cl.bluex.digfull.mybatis.DigitacionFullDaoImpl;
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
	public DigitacionFullDao getDigitacionFullDao() throws BluexException {
		return (DigitacionFullDao) AbstractProxy.proxy(
				new DigitacionFullDaoImpl(getSession()), new DaoProxy());
	}
}
