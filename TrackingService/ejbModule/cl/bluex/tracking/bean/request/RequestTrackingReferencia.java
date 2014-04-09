package cl.bluex.tracking.bean.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.tracking.bean.ParametrosTrackingReferencia;

/**
 * @author eherrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestTrackingReferencia")
public class RequestTrackingReferencia {
	@XmlElement(required = true)
	private ParametrosTrackingReferencia parametrosTrackingReferencia;

	/**
	 * crea instancia de RequestTrackingReferencia
	 *
	 */
	public RequestTrackingReferencia() {
		super();
	}

	/**
	 * @return the parametrosTrackingReferencia
	 */
	public ParametrosTrackingReferencia getParametrosTrackingReferencia() {
		return parametrosTrackingReferencia;
	}

	/**
	 * @param parametrosTrackingReferencia the parametrosTrackingReferencia to set
	 */
	public void setParametrosTrackingReferencia(
			final ParametrosTrackingReferencia parametrosTrackingReferencia) {
		this.parametrosTrackingReferencia = parametrosTrackingReferencia;
	}

}
