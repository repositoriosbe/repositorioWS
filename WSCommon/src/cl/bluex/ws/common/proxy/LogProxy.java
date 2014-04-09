package cl.bluex.ws.common.proxy;

import org.apache.log4j.Logger;

/**
 * Log proxy
 */
public class LogProxy extends AbstractProxy {

    /** The Constant DIVISOR_NANO. */
    private static final int DIVISOR_NANO = 10000000;

    /** The Constant LOGGER. */
    private static final Logger LOGGER = Logger.getLogger(LogProxy.class);

    /** The start. */
    private long start;

    /**
     * Instantiates a new log proxy.
     */
    public LogProxy() {
	super();
    }

    /*
     * (non-Javadoc)
     * 
     * @see cl.bluex.common.proxy.AbstractProxy#preInvoke(java.lang.String,
     * java.lang.String, java.lang.Object[])
     */
    @Override
    public void preInvoke(final String objectName, final String nameMethod, final Object[] args) {
	LOGGER.debug("Invocation Object : " + objectName);
	LOGGER.debug("Invocation Method : " + nameMethod);
	start = System.nanoTime();
    }

    /*
     * (non-Javadoc)
     * 
     * @see cl.bluex.common.proxy.AbstractProxy#postInvoke(java.lang.Object)
     */
    @Override
    public void postInvoke(final Object ret) {
	long end = System.nanoTime();
	LOGGER.debug("Return :" + ret);
	LOGGER.debug("Time Execution : " + ((end - start) / DIVISOR_NANO) + " ms.");
    }

    /*
     * (non-Javadoc)
     * 
     * @see cl.bluex.common.proxy.AbstractProxy#inException(java.lang.Throwable)
     */
    @Override
    public Throwable inException(final Throwable throwable) {
	LOGGER.error("Execution Exception", throwable);
	return throwable;
    }
}