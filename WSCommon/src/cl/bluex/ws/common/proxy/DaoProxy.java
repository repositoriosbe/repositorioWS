package cl.bluex.ws.common.proxy;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.log4j.Logger;

import cl.bluex.ws.common.exceptions.BluexException;

/**
 * DaoProxy proxy para dao que captura PersistenceException(mybatis) y lo
 * transforma en BlueException
 * 
 * @author Sebastian E. Navia Iturriaga
 */
public class DaoProxy extends LogProxy {

    /** The Constant LOGGER. */
    private static final Logger LOGGER = Logger.getLogger(DaoProxy.class);

    /**
     * Instantiates a new dao proxy.
     */
    public DaoProxy() {
	super();
    }

    /*
     * (non-Javadoc)
     * 
     * @see cl.bluex.common.proxy.LogProxy#inException(java.lang.Throwable)
     */
    @Override
    public Throwable inException(final Throwable throwable) {
	LOGGER.error("Execution exception", throwable);
	if (throwable instanceof PersistenceException) {
	    return new BluexException((PersistenceException) throwable);
	}
	return throwable;
    }
}