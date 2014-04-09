package cl.bluex.tracking.factory;

import org.apache.ibatis.session.SqlSessionFactory;

import cl.bluex.tracking.TrackingDao;
import cl.bluex.tracking.mybatis.TrackingDaoImpl;
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
	public TrackingDao getTrackingDao() throws BluexException {
		return (TrackingDao) AbstractProxy.proxy(new TrackingDaoImpl(getSession()),
				new DaoProxy());
	}
}
