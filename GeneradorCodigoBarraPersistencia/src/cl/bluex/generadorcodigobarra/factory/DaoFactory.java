package cl.bluex.generadorcodigobarra.factory;

import cl.bluex.generadorcodigobarra.GeneradorCodigoBarraDao;
import cl.bluex.ws.common.dao.DaoTransaction;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * A factory for creating Dao objects.
 */
public interface DaoFactory extends DaoTransaction {
    
    /**
     * @return {@link GeneradorCodigoBarraDao}
     * @throws BluexException
     */
    GeneradorCodigoBarraDao getGeneradorCodigoBarraDao() throws BluexException;

}
