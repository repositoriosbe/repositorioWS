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
@XmlType(name = "clasePruebaAtributoLong")
public class ClasePruebaAtributoLong {
	@XmlElement(required = true)
	@Validate(required = true)
	private long campoLong;
	
	/**
	 * Crea instancia de {@link ClasePruebaAtributoLong}.
	 *
	 */
	public ClasePruebaAtributoLong() {
		super();
	}

	/**
	 * @return the campoLong
	 */
	public long getCampoLong() {
		return campoLong;
	}

	/**
	 * @param campoLong the campoLong to set
	 */
	public void setCampoLong(final long campoLong) {
		this.campoLong = campoLong;
	}
	
}
