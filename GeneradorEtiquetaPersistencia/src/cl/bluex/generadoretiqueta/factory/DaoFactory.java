package cl.bluex.generadoretiqueta.factory;

import cl.bluex.generadoretiqueta.GeneradorEtiquetaDao;
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
    GeneradorEtiquetaDao getGeneradorEtiquetaDao() throws BluexException;

}
