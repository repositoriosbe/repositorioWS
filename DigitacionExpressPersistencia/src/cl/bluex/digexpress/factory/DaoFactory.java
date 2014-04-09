package cl.bluex.digexpress.factory;

import cl.bluex.digexpress.DigitacionExpressDao;
import cl.bluex.ws.common.dao.DaoTransaction;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * A factory for creating Dao objects.
 */
public interface DaoFactory extends DaoTransaction {

    /**
     * Gets the Listas dao.
     * 
     * @return the pre emision dao
     * @throws BluexException
     *             the bluex exception
     */
    DigitacionExpressDao getDigitacionExpressDao() throws BluexException;

}
