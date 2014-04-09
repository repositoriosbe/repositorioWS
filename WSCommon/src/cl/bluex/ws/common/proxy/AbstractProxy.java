package cl.bluex.ws.common.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * The Class AbstractProxy.
 */
public abstract class AbstractProxy implements InvocationHandler {
    
    /** The object. */
    private Object object;

    /**
     * Instantiates a new abstract proxy.
     */
    public AbstractProxy() {
	super();
    }

    /**
     * Proxy.
     *
     * @param object the object
     * @param abstractProxy the abstract proxy
     * @return the object
     */
    public static Object proxy(final Object object, final AbstractProxy abstractProxy) {
	abstractProxy.object = object;
	return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), abstractProxy);
    }

    /* (non-Javadoc)
     * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
     */
    @Override
    public final Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable {
	try {
	    preInvoke(object.getClass().getName(), method.getName(), args);
	    Object objectResponse = method.invoke(this.object, args);
	    postInvoke(objectResponse);
	    return objectResponse;
	} catch (InvocationTargetException exception) {
	    throw inException(exception.getTargetException());
	} catch (RuntimeException e) {
	    throw inException(e);
	}
    }

    /**
     * Pre invoke.
     *
     * @param nameObject the name object
     * @param nameMethod the name method
     * @param args the args
     */
    public abstract void preInvoke(final String nameObject, final String nameMethod, final Object[] args);

    /**
     * Post invoke.
     *
     * @param response the response
     */
    public abstract void postInvoke(final Object response);

    /**
     * In exception.
     *
     * @param throwable the throwable
     * @return the throwable
     */
    public Throwable inException(final Throwable throwable) {
	return throwable;
    }

}
