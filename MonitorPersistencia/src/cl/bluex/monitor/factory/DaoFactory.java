package cl.bluex.monitor.factory;

import cl.bluex.monitor.MonitorDao;
import cl.bluex.ws.common.dao.DaoTransaction;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * A factory for creating Dao objects.
 */
public interface DaoFactory extends DaoTransaction {

    
    /**
     * Obtiene dao del monitor.
     * 
     * @return {@link MonitorDao}
     * @throws BluexException
     */
    MonitorDao getMonitorDao() throws BluexException;

}
