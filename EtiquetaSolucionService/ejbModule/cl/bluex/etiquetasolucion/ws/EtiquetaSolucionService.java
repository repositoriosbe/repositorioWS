package cl.bluex.etiquetasolucion.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import cl.bluex.etiquetasolucion.bean.request.RequestEtiquetaSolucion;
import cl.bluex.etiquetasolucion.bean.response.ResponseEtiquetaSolucion;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

// TODO: Auto-generated Javadoc
/**
 * The Interface EtiquetaSolucionService.
 *
 * @author rmoscoso
 */
@WebService(
	targetNamespace = "http://EtiquetaSolucionWS/EtiquetaSolucion/EtiquetaSolucionPortType",
	name = "EtiquetaSolucion")
public interface EtiquetaSolucionService {

	/**
	 * Gets the solucion etiqueta.
	 *
	 * @param request the request
	 * @param cabecera the cabecera
	 * @return {@link ResponseEtiquetaSolucion}
	 * @throws BluexException the bluex exception
	 */
	@WebMethod(
		operationName = "getEtiquetaSolucion",
		action = "http://EtiquetaSolucionWS/EtiquetaSolucion/EtiquetaSolucionPortType/getEtiquetaSolucion")
	ResponseEtiquetaSolucion getEtiquetaSolucion(
			@WebParam(
				name = "requestEtiquetaSolucion",
				targetNamespace = "http://EtiquetaSolucionWS/EtiquetaSolucion/EtiquetaSolucionPortType",
				partName = "requestEtiquetaSolucion",
				header = false) RequestEtiquetaSolucion request,
			@WebParam(
				name = "Cabecera",
				partName = "Cabecera",
				targetNamespace = "http://EtiquetaSolucionWS/EtiquetaSolucion/EtiquetaSolucionPortType",
				header = true) Cabecera cabecera) throws BluexException;

	
}
