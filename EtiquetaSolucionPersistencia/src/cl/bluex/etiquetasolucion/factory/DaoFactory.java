package cl.bluex.etiquetasolucion.factory;

import cl.bluex.etiquetasolucion.EtiquetaSolucionDao;
import cl.bluex.ws.common.dao.DaoTransaction;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * A factory for creating Dao objects.
 */
public interface DaoFactory extends DaoTransaction {
    
    /**
     * @return {@link EtiquetaSolucionDao}
     * @throws BluexException
     */
    EtiquetaSolucionDao getEtiquetaSolucionDao() throws BluexException;

}
