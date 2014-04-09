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
@XmlType(name = "clasePruebaAtributoStringLargo")
public class ClasePruebaAtributoStringLargo {

	@XmlElement(required = true)
	@Validate(required = true, length = 2)
	private String campoString;

	/**
	 * Crea instancia de {@link ClasePruebaAtributoStringLargo}.
	 *
	 */
	public ClasePruebaAtributoStringLargo() {
		super();
	}
	
	/**
	 * @return the campoString
	 */
	public String getCampoString() {
		return campoString;
	}

	/**
	 * @param campoString the campoString to set
	 */
	public void setCampoString(final String campoString) {
		this.campoString = campoString;
	}
	
	
}
