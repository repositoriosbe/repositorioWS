package cl.bluex.listas.factory;

import cl.bluex.listas.ListasDao;
import cl.bluex.ws.common.dao.DaoTransaction;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * A factory for creating Dao objects.
 */
public interface DaoFactory extends DaoTransaction {

    
    /**
     * Obtiene dao de listas.
     * 
     * @return {@link ListasDao}
     * @throws BluexException
     */
    ListasDao getListasDao() throws BluexException;

}
