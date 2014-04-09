package cl.bluex.ws.common.property.propertymanager;

import junit.framework.Assert;

import org.junit.Test;

import cl.bluex.ws.common.property.PropertyManager;

/**
 * @author eherrera
 *
 */
public class PropertyManagerTest {

	/**
	 * Test method for {@link cl.bluex.ws.common.property.PropertyManager#getProperty(java.lang.String)}.
	 */
	@Test
	public void testGetProperty() {
		final PropertyManager manager = new PropertyManager();
		
		final String property = manager.getProperty("general.error.bd.-20100");
		
		Assert.assertEquals("Usuario no se encuentra registrado", property);
	}

}
