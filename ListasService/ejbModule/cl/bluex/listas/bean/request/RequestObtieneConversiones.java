package cl.bluex.listas.bean.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * @author Edgardo Herrera
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
	name = "requestObtieneConversiones")
public class RequestObtieneConversiones {

	@XmlElement(
		required = true)
	private String tipo;
	@XmlElement(
			required = true)
	private long codigoEmpresa;

	/**
	 * Crea instancia {@link RequestObtieneConversiones}.
	 */
	public RequestObtieneConversiones() {
		super();
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo
	 *            the tipo to set
	 */
	public void setTipo(final String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the codigoEmpresa
	 */
	public long getCodigoEmpresa() {
		return codigoEmpresa;
	}

	/**
	 * @param codigoEmpresa
	 *            the codigoEmpresa to set
	 */
	public void setCodigoEmpresa(final long codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

}
