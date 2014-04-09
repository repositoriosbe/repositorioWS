package cl.bluex.tracking.bean.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.tracking.bean.TrackingReferencia;

/**
 * @author eherrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseTrackingReferencia")
public class ResponseTrackingReferencia {
	List<TrackingReferencia> trackingReferencias;
	
	/**
	 * crea instancia de ResponseTrackingReferencia
	 *
	 */
	public ResponseTrackingReferencia() {
		super();
	}

	/**
	 * crea instancia de ResponseTrackingReferencia
	 *
	 * @param trackingReferencias
	 */
	public ResponseTrackingReferencia(final List<TrackingReferencia> trackingReferencias) {
		super();
		this.trackingReferencias = trackingReferencias;
	}

	/**
	 * @return the trackingReferencias
	 */
	public List<TrackingReferencia> getTrackingReferencias() {
		return trackingReferencias;
	}

	/**
	 * @param trackingReferencias the trackingReferencias to set
	 */
	public void setTrackingReferencias(final List<TrackingReferencia> trackingReferencias) {
		this.trackingReferencias = trackingReferencias;
	}
	
}
