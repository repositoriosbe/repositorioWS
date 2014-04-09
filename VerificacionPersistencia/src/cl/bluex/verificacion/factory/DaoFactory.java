package cl.bluex.verificacion.factory;

import cl.bluex.verificacion.VerificacionDao;
import cl.bluex.ws.common.dao.DaoTransaction;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * A factory for creating Dao objects.
 */
public interface DaoFactory extends DaoTransaction {

    
    /**
     * Obtiene dao de Verificacion.
     * 
     * @return {@link VerificacionDao}
     * @throws BluexException
     */
    VerificacionDao getVerificacionDao() throws BluexException;

}
