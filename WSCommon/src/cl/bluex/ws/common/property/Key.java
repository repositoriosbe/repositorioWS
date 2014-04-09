package cl.bluex.ws.common.property;

import java.math.BigDecimal;

import cl.bluex.ws.common.context.ApplicationContext;

/**
 * Constantes de Sistema
 * 
 * @author Sebastian E. Navia Iturriaga
 * 
 */
public enum Key {

    /**
     * ARCHIVOS
     */
    ARCHIVOS_RUTA(""),
    
    /**
     * CONTEXT
     */
    CONTEXT_NAME("cl.bluex.NAME_CONTEXT"), 
    WEB_SERVICES_URL("cl.bluex.ws.URL"), 
    NUEVA_WEB_SISTEMA("cl.bluex.SISTEMA"), 
    NUEVA_WEB_APLICACION("cl.bluex.APLICACION");

	private String key;

	Key(final String key) {
		this.key = key;
	}

	public String getKey() {
		return this.key;
	}

	public String getString() {
		return getPropertyManager().getProperty(this);
	}

	public Boolean getBoolean() {
		return getPropertyManager().getBoolean(this);
	}

	public Double getDouble() {
		return getPropertyManager().getDouble(this);
	}

	public Integer getInteger() {
		return getPropertyManager().getInteger(this);
	}

	public Float getFloat() {
		return getPropertyManager().getFloat(this);
	}

	public Long getLong() {
		return getPropertyManager().getLong(this);
	}

	public BigDecimal getBigDecimal() {
		return getPropertyManager().getBigDecimal(this);
	}

	private PropertyManager getPropertyManager() {
		return ApplicationContext.getCurrentInstance().getPropertyManager();
	}
}
