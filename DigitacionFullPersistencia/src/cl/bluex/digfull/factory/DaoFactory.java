package cl.bluex.digfull.factory;

import cl.bluex.digfull.DigitacionFullDao;
import cl.bluex.ws.common.dao.DaoTransaction;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * A factory for creating Dao objects.
 */
public interface DaoFactory extends DaoTransaction {

    /**
     * Gets the digitacion full dao.
     * 
     * @return {@link DigitacionFullDao}
     * @throws BluexException
     *             the bluex exception
     */
    DigitacionFullDao getDigitacionFullDao() throws BluexException;

}
