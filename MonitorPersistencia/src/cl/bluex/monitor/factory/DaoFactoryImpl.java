package cl.bluex.monitor.factory;

import org.apache.ibatis.session.SqlSessionFactory;

import cl.bluex.monitor.MonitorDao;
import cl.bluex.monitor.mybatis.MonitorDaoImpl;
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
	public MonitorDao getMonitorDao() throws BluexException {
		return (MonitorDao) AbstractProxy.proxy(new MonitorDaoImpl(getSession()),
				new DaoProxy());
	}
}
