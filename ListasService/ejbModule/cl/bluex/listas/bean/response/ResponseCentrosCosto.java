package cl.bluex.listas.bean.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.listas.bean.CentroCosto;

/**
 * Respuesta para Centro de costo.
 * 
 * @author Edgardo Herrera
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
	name = "centrosCosto")
public class ResponseCentrosCosto {
	List<CentroCosto> centrosCosto;

	/**
	 * Constructor.
	 */
	public ResponseCentrosCosto() {
		super();
	}

	/**
	 * Constructor.
	 * @param centrosCosto 
	 * 
	 */
	public ResponseCentrosCosto(final List<CentroCosto> centrosCosto) {
		super();
		this.centrosCosto = centrosCosto;
	}

	/**
	 * @return the centrosCosto
	 */
	public List<CentroCosto> getCentrosCosto() {
		return centrosCosto;
	}

	/**
	 * @param centrosCosto the centrosCosto to set
	 */
	public void setCentrosCosto(final List<CentroCosto> centrosCosto) {
		this.centrosCosto = centrosCosto;
	}

}
