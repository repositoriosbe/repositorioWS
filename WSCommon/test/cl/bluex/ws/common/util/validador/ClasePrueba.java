package cl.bluex.ws.common.util.validador;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.ws.common.util.Validate;

/**
 * @author Edgardo Herrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clasePrueba")
public class ClasePrueba {
	
	@XmlElement(required = true)
	@Validate(name = "campo1", required = true, length = 2)
	private long campo1;
	@XmlElement(required = true)
	@Validate(name = "campo2", required = true, length = 3)
	private String campo2;
	
	public ClasePrueba() {
		super();
	}

	/**
	 * @return the campo1
	 */
	public long getCampo1() {
		return campo1;
	}

	/**
	 * @param campo1 the campo1 to set
	 */
	public void setCampo1(final long campo1) {
		this.campo1 = campo1;
	}

	/**
	 * @return the campo2
	 */
	public String getCampo2() {
		return campo2;
	}

	/**
	 * @param campo2 the campo2 to set
	 */
	public void setCampo2(final String campo2) {
		this.campo2 = campo2;
	}
	
}
