package cl.bluex.listas.bean.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.listas.bean.Conversion;

/**
 * @author Edgardo Herrera
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
	name = "conversiones")
public class ResponseObtieneConversiones {

	@XmlElement(
		name = "conversion")
	private List<Conversion> conversiones;

	/**
	 * Crea instancia {@link ResponseObtieneConversiones}.
	 */
	public ResponseObtieneConversiones() {
		super();
	}

	/**
	 * crea instancia de ResponseObtieneConversiones
	 *
	 * @param conversiones
	 */
	public ResponseObtieneConversiones(final List<Conversion> conversiones) {
		this.conversiones = conversiones;
	}

	/**
	 * @return the conversiones
	 */
	public List<Conversion> getConversiones() {
		return conversiones;
	}

	/**
	 * @param conversiones
	 *            the conversiones to set
	 */
	public void setConversiones(final List<Conversion> conversiones) {
		this.conversiones = conversiones;
	}

}
