package cl.bluex.tracking.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import cl.bluex.tracking.bean.request.RequestTrackingReferencia;
import cl.bluex.tracking.bean.response.ResponseTrackingReferencia;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

/**
 * @author eherrera
 *
 */
@WebService(
	targetNamespace = "http://TrackingWS/BXTRK001_tracking/TrackingPortType",
	name = "Tracking")
public interface TrackingService {

	/**
	 * Metodo que obtiene el tracking de referencia.
	 * 
	 * @param request datos de entrada
	 * @param cabecera objeto que contiene el token
	 * @return {@link ResponseTrackingReferencia}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneTrackingReferencia",
		action = "http://TrackingWS/BXTRK001_tracking/TrackingPortType/obtieneTrackingReferencia")
	ResponseTrackingReferencia obtieneTrackingReferencia(
			@WebParam(
				name = "requestTrackingReferencia",
				partName = "requestTrackingReferencia")
			RequestTrackingReferencia request,
			@WebParam(
				name = "Cabecera",
				partName = "Cabecera",
				targetNamespace = "http://TrackingWS/BXTRK001_tracking/TrackingPortType",
				header = true) Cabecera cabecera) throws BluexException;
}
