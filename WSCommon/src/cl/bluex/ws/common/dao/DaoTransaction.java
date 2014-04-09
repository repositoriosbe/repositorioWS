package cl.bluex.ws.common.dao;

import cl.bluex.ws.common.exceptions.BluexException;

/**
 * The Interface DaoTransaction.
 */
public interface DaoTransaction {

    /**
     * Crear una transacción, el cual el uso del commit es necesario para
     * terminar esta.
     *
     * @throws BluexException the bluex exception
     */
    void createTransaction() throws BluexException;

    /**
     * Genera un commit de todas las ejecuciones en los Dao's.
     */
    void commit();

    /**
     * Cierra la transaccion.
     */
    void close();

    /**
     * Genera un rollback de toda ejecucion realizada.
     */
    void rollback();
}
