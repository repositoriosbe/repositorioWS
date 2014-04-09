package cl.bluex.listas.bean.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.listas.bean.DiaPago;

/**
 * 
 * @author Edgardo Herrera
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
	name = "diasPago")
public class ResponseDiasPago {

	@XmlElement(
		name = "diaPago")
	private List<DiaPago> diasPago;

	/**
	 * crea instancia de ResponseDiasPago
	 * 
	 */
	public ResponseDiasPago() {
		super();
	}

	/**
	 * crea instancia de ResponseDiasPago
	 *
	 * @param diasPago
	 */
	public ResponseDiasPago(final List<DiaPago> diasPago) {
		this.diasPago = diasPago;
	}

	/**
	 * @return the diasPago
	 */
	public List<DiaPago> getDiasPago() {
		return diasPago;
	}

	/**
	 * @param diasPago the diasPago to set
	 */
	public void setDiasPago(final List<DiaPago> diasPago) {
		this.diasPago = diasPago;
	}

}
