package cl.bluex.ws.common.spring;

import org.springframework.beans.factory.FactoryBean;

import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.proxy.AbstractProxy;

/**
 * genera un proxy para la instancia generada.
 * 
 * @author Sebastian E. Navia Iturriaga
 * 
 */
public class ProxyFactoryBean implements FactoryBean<Object> {

    /** The implementation. */
    private String implementation;

    /** The proxy. */
    private String proxy;

    /**
     * Instantiates a new proxy factory bean.
     */
    public ProxyFactoryBean() {
	super();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.beans.factory.FactoryBean#getObject()
     */
    @Override
    public final Object getObject() throws BluexException {
	try {
	    return AbstractProxy.proxy(Class.forName(this.implementation).newInstance(), (AbstractProxy) Class.forName(this.proxy).newInstance());
	} catch (InstantiationException e) {
	    throw new BluexException(e);
	} catch (IllegalAccessException e) {
	    throw new BluexException(e);
	} catch (ClassNotFoundException e) {
	    throw new BluexException(e);
	}
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.beans.factory.FactoryBean#getObjectType()
     */
    @Override
    public final Class<?> getObjectType() {
	return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.beans.factory.FactoryBean#isSingleton()
     */
    @Override
    public final boolean isSingleton() {
	return true;
    }

    /**
     * Sets the implementation.
     * 
     * @param newImplementation
     *            the new implementation
     */
    public void setImplementation(String newImplementation) {
	this.implementation = newImplementation;
    }

    /**
     * Sets the proxy.
     * 
     * @param newProxy
     *            the new proxy
     */
    public void setProxy(String newProxy) {
	this.proxy = newProxy;
    }
}
