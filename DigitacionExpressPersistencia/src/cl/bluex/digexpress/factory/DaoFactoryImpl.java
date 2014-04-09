package cl.bluex.digexpress.factory;

import org.apache.ibatis.session.SqlSessionFactory;

import cl.bluex.digexpress.DigitacionExpressDao;
import cl.bluex.digexpress.mybatis.DigitacionExpressDaoImpl;
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
	public DigitacionExpressDao getDigitacionExpressDao()
			throws BluexException {
		return (DigitacionExpressDao) AbstractProxy.proxy(
				new DigitacionExpressDaoImpl(getSession()), new DaoProxy());
	}
}
