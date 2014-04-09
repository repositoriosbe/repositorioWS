package cl.bluex.generadorcodigobarra.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import cl.bluex.generadorcodigobarra.bean.request.RequestCodigoBarraL28;
import cl.bluex.generadorcodigobarra.bean.response.ResponseCodigoBarraL28;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

/**
 * @author eherrera
 * 
 */
@WebService(
	targetNamespace = "http://GeneradorCodigoBarraWS/BXGCB001_generadorCodigoBarra/generadorCodigoBarraPortType",
	name = "GeneradorCodigoBarra")
public interface GeneradorCodigoBarraService {

	/**
	 * @param request
	 *            parametros de entrada
	 * @param cabecera
	 *            objeto que contiene el token
	 * @return {@link ResponseCodigoBarraL28}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneCodigoBarraL28",
		action = "http://GeneradorCodigoBarraWS/BXGCB001_generadorCodigoBarra/generadorCodigoBarraPortType/obtieneCodigoBarraL28")
	ResponseCodigoBarraL28 obtieneCodigoBarraL28(
			@WebParam(
				name = "requestCodigoBarraL28",
				targetNamespace = "http://GeneradorCodigoBarraWS/BXGCB001_generadorCodigoBarra/generadorCodigoBarraPortType",
				partName = "requestCodigoBarraL28",
				header = false) RequestCodigoBarraL28 request,
			@WebParam(
				name = "Cabecera",
				partName = "Cabecera",
				targetNamespace = "http://GeneradorCodigoBarraWS/BXGCB001_generadorCodigoBarra/generadorCodigoBarraPortType",
				header = true) Cabecera cabecera) throws BluexException;
}
