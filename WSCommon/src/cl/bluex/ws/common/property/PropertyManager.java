package cl.bluex.ws.common.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;

import cl.bluex.ws.common.property.Key;
import cl.bluex.ws.common.property.PropertyManager;

/**
 * Property Manager. Clase que administra las propiedades del sistema.
 * 
 * @author Sebastian Navia Iturriaga
 */
public class PropertyManager {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger
			.getLogger(PropertyManager.class);

	/**
	 * Constant NULL. se utiliza para indicar en el propertie que el valor es
	 * null
	 */
	private static final String NULL = "[NULL]";

	/** The properties. */
	private final Properties properties = new Properties();

	/**
	 * Instantiates a new property manager.
	 */
	public PropertyManager() {
		super();
		try {
			final InputStream resourceAsStream = PropertyManager.class
					.getResourceAsStream("default.properties");
			if (resourceAsStream == null) {
				LOGGER.warn("Default Properties no pudo ser cargado");
			} else {
				this.properties.load(resourceAsStream);
			}
		} catch (final IOException exception) {
			throw new RuntimeException(
					"Architecture: Load Failed, Application Context Properties ",
					exception);
		}
	}

	/**
	 * Adds the properties.
	 * 
	 * @param map
	 *            the map
	 */
	public void addProperties(final Map<? extends Object, ? extends Object> map) {
		this.properties.putAll(map);
	}

	/**
	 * Adds the properties.
	 * 
	 * @param file
	 *            the file
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public void addProperties(final File file) throws IOException {
		final FileInputStream fis = new FileInputStream(file);
		if (fis != null) {
			final Properties properties = new Properties();
			properties.load(fis);
			this.addProperties(properties);
		}
	}

	/**
	 * Sets the property property Value..
	 * 
	 * @param key
	 *            the key
	 * @param value
	 *            the value
	 */
	public final void setProperty(final String key, final String value) {
		this.properties.setProperty(key, value);

	}

	/**
	 * Sets the property property Value..
	 * 
	 * @param key
	 *            the key
	 * @param value
	 *            the value
	 */
	public final void setProperty(final Key key, final String value) {
		this.properties.setProperty(key.getKey(), value);

	}

	/**
	 * Gets the property property Value..
	 * 
	 * @param key
	 *            the key
	 * @return the property
	 */
	@Deprecated
	public final String getProperty(final String key) {
		final String property = this.properties.getProperty(key);
		if (NULL.equals(property)) {
			return null;
		}
		return property;
	}

	public final String getProperty(final Key key) {
		final String property = this.properties.getProperty(key.getKey());
		if (NULL.equals(property)) {
			return null;
		}
		return property;
	}

	/**
	 * Gets the boolean property Value..
	 * 
	 * @param key
	 *            the key
	 * @return the boolean
	 */
	@Deprecated
	public final Boolean getBoolean(final String key) {
		if (this.getProperty(key) != null) {
			return Boolean.parseBoolean(this.getProperty(key));
		}
		return null;
	}

	/**
	 * Gets the boolean property Value..
	 * 
	 * @param key
	 *            the key
	 * @return the boolean
	 */
	public final Boolean getBoolean(final Key key) {
		if (this.getProperty(key) != null) {
			return Boolean.parseBoolean(this.getProperty(key));
		}
		return null;
	}

	/**
	 * Gets the double property Value..
	 * 
	 * @param key
	 *            the key
	 * @return the double
	 */
	@Deprecated
	public final Double getDouble(final String key) {
		if (this.getProperty(key) != null) {
			return Double.parseDouble(this.getProperty(key));
		}
		return null;
	}

	/**
	 * Gets the double property Value..
	 * 
	 * @param key
	 *            the key
	 * @return the double
	 */
	public final Double getDouble(final Key key) {
		if (this.getProperty(key) != null) {
			return Double.parseDouble(this.getProperty(key));
		}
		return null;
	}

	/**
	 * Gets the integer property Value..
	 * 
	 * @param key
	 *            the key
	 * @return the integer
	 */
	public final Integer getInteger(final String key) {
		if (this.getProperty(key) != null) {
			return Integer.parseInt(this.getProperty(key));
		}
		return null;
	}

	/**
	 * Gets the integer property Value..
	 * 
	 * @param key
	 *            the key
	 * @return the integer
	 */
	public final Integer getInteger(final Key key) {
		if (this.getProperty(key) != null) {
			return Integer.parseInt(this.getProperty(key));
		}
		return null;
	}

	/**
	 * Gets the float property Value..
	 * 
	 * @param key
	 *            the key
	 * @return the float
	 */
	@Deprecated
	public final Float getFloat(final String key) {
		if (this.getProperty(key) != null) {
			return Float.parseFloat(this.getProperty(key));
		}
		return null;
	}

	/**
	 * Gets the float property Value..
	 * 
	 * @param key
	 *            the key
	 * @return the float
	 */
	public final Float getFloat(final Key key) {
		if (this.getProperty(key) != null) {
			return Float.parseFloat(this.getProperty(key));
		}
		return null;
	}

	/**
	 * Gets the long property Value.
	 * 
	 * @param key
	 *            the key
	 * @return the long
	 */
	@Deprecated
	public final Long getLong(final String key) {
		if (this.getProperty(key) != null) {
			return Long.parseLong(this.getProperty(key));
		}
		return null;
	}

	/**
	 * Gets the long property Value.
	 * 
	 * @param key
	 *            the key
	 * @return the long
	 */
	public final Long getLong(final Key key) {
		if (this.getProperty(key) != null) {
			return Long.parseLong(this.getProperty(key));
		}
		return null;
	}

	/**
	 * Gets the big decimal property Value..
	 * 
	 * @param key
	 *            the key
	 * @return the big decimal
	 */
	@Deprecated
	public final BigDecimal getBigDecimal(final String key) {
		if (this.getProperty(key) != null) {
			return new BigDecimal(this.getProperty(key));
		}
		return null;
	}

	/**
	 * Gets the big decimal property Value..
	 * 
	 * @param key
	 *            the key
	 * @return the big decimal
	 */
	public final BigDecimal getBigDecimal(final Key key) {
		if (this.getProperty(key) != null) {
			return new BigDecimal(this.getProperty(key));
		}
		return null;
	}

}
