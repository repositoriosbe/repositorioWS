package cl.bluex.tracking.factory;

import cl.bluex.tracking.TrackingDao;
import cl.bluex.ws.common.dao.DaoTransaction;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * A factory for creating Dao objects.
 */
public interface DaoFactory extends DaoTransaction {
    
    /**
     * @return {@link TrackingDao}
     * @throws BluexException
     */
    TrackingDao getTrackingDao() throws BluexException;

}
