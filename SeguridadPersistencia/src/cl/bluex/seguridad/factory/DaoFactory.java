package cl.bluex.seguridad.factory;

import cl.bluex.seguridad.SeguridadDao;
import cl.bluex.ws.common.dao.DaoTransaction;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * A factory for creating Dao objects.
 */
public interface DaoFactory extends DaoTransaction {

    
    /**
     * @return {@link SeguridadDao}
     * @throws BluexException
     */
    SeguridadDao getSeguridadDao() throws BluexException;

}
