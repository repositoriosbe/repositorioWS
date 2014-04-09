package cl.bluex.verificacion.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import cl.bluex.verificacion.bean.request.RequestAcronimos;
import cl.bluex.verificacion.bean.request.RequestBatch;
import cl.bluex.verificacion.bean.request.RequestDetalleBatch;
import cl.bluex.verificacion.bean.request.RequestOsBatch;
import cl.bluex.verificacion.bean.request.RequestOser;
import cl.bluex.verificacion.bean.response.ResponseAcronimos;
import cl.bluex.verificacion.bean.response.ResponseBatch;
import cl.bluex.verificacion.bean.response.ResponseBatches;
import cl.bluex.verificacion.bean.response.ResponseOser;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

/**
 * Interface ListasService.
 * 
 * @author Edgardo Herrera
 * 
 */
@WebService(
	targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
	name = "Verificacion")
public interface VerificacionService {

	/**
	 * Metodo que crea un batch
	 * 
	 * @param request
	 *            parametros de entrada
	 * @param cabecera
	 *            objeto que contiene el token
	 * @return {@link ResponseBatch} parametros de salida
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "crearBatch",
		action = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType/crearBatch")
	@WebResult(
		name = "responseBatch",
		targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
		partName = "responseBatch")
	ResponseBatch crearBatch(
			@WebParam(
				name = "requestBatch",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				partName = "requestBatch",
				header = false) RequestBatch request,
			@WebParam(
				name = "Cabecera",
				partName = "Cabecera",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que cambia el estado de un batch.
	 * 
	 * @param request
	 *            parametros de entrada
	 * @param cabecera
	 *            objeto que contiene el tokenprc_cerrarBatch
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "cambioEstadoBatch",
		action = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType/cambioEstadoBatch")
	void cambioEstadoBatch(
			@WebParam(
				name = "requestEstadoBatch",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				partName = "requestEstadoBatch",
				header = false) RequestBatch request,
			@WebParam(
				name = "Cabecera",
				partName = "Cabecera",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que cierra un batch.
	 * 
	 * @param request
	 *            parametros de entradaprc_cerrarBatch
	 * @param cabecera
	 *            objeto que contiene el token
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "cerrarBatch",
		action = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType/cerrarBatch")
	void cerrarBatch(
			@WebParam(
				name = "requestCerrarBatch",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				partName = "requestCerrarBatch",
				header = false) RequestBatch request,
			@WebParam(
				name = "Cabecera",
				partName = "Cabecera",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo para eliminar batch.
	 * 
	 * @param request
	 *            parametros de entrada
	 * @param cabecera
	 *            objeto que contiene el token
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "eliminarBatch",
		action = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType/eliminarBatch")
	void eliminarBatch(
			@WebParam(
				name = "requestEliminarBatch",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				partName = "requestEliminarBatch",
				header = false) RequestBatch request,
			@WebParam(
				name = "Cabecera",
				partName = "Cabecera",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo para insertar un detalle del batch.
	 * 
	 * @param request
	 *            parametros de entrada
	 * @param cabecera
	 *            objeto que contiene el token
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "insertarDetalleBatch",
		action = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType/insertarDetalleBatch")
	void insertarDetalleBatch(
			@WebParam(
				name = "requestInsertarDetalleBatch",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				partName = "requestInsertarDetalleBatch",
				header = false) RequestDetalleBatch request,
			@WebParam(
				name = "Cabecera",
				partName = "Cabecera",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo para eliminar un detalle del batch.
	 * 
	 * @param request
	 *            parametros de entrada
	 * @param cabecera
	 *            objeto que contiene el token
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "eliminarDetalleBatch",
		action = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType/eliminarDetalleBatch")
	void eliminarDetalleBatch(
			@WebParam(
				name = "requestEliminarDetalleBatch",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				partName = "requestEliminarDetalleBatch",
				header = false) RequestDetalleBatch request,
			@WebParam(
				name = "Cabecera",
				partName = "Cabecera",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo para validar un detalle batch.
	 * 
	 * @param request
	 *            parametros de entrada
	 * @param cabecera
	 *            objeto que contiene el token
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "validaDetalleBatch",
		action = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType/validaDetalleBatch")
	void validaDetalleBatch(
			@WebParam(
				name = "requestValidaDetalleBatch",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				partName = "requestValidaDetalleBatch",
				header = false) RequestDetalleBatch request,
			@WebParam(
				name = "Cabecera",
				partName = "Cabecera",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que cambia el estado de un detalle batch.
	 * 
	 * @param request
	 *            parametros de entrada
	 * @param cabecera
	 *            objeto que contiene el token
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "cambioEstadoDetalleBatch",
		action = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType/cambioEstadoDetalleBatch")
	void cambioEstadoDetalleBatch(
			@WebParam(
				name = "requestCambioEstadoDetalleBatch",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				partName = "requestCambioEstadoDetalleBatch",
				header = false) RequestDetalleBatch request,
			@WebParam(
				name = "Cabecera",
				partName = "Cabecera",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que ontiene los acronimos.
	 * 
	 * @param request
	 *            parametros de entrada
	 * @param cabecera
	 *            objeto que contiene el token
	 * @return {@link ResponseAcronimos}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneAcronimos",
		action = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType/obtieneAcronimos")
	ResponseAcronimos obtieneAcronimos(
			@WebParam(
				name = "requestAcronimos",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				partName = "requestAcronimos",
				header = false) RequestAcronimos request,
			@WebParam(
				name = "Cabecera",
				partName = "Cabecera",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que obtiene el batch de origen.
	 * 
	 * @param request
	 *            parametros
	 * @param cabecera
	 *            objeto que contiene el token
	 * @return {@link ResponseBatch}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneBatchOrigen",
		action = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType/obtieneBatchOrigen")
	@WebResult(
		name = "responseBatches",
		targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
		partName = "responseBatches")
	ResponseBatches obtieneBatchOrigen(
			@WebParam(
				name = "requestBatch",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				partName = "requestBatch",
				header = false) RequestBatch request,
			@WebParam(
				name = "Cabecera",
				partName = "Cabecera",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que obtiene la Oser.
	 * 
	 * @param request
	 *            parametros de entrada
	 * @param cabecera
	 *            objeto que contiene el token
	 * @return {@link ResponseOser}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneOsBatch",
		action = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType/obtieneOsBatch")
	@WebResult(
		name = "responseOser",
		targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
		partName = "responseOser")
	ResponseOser obtieneOsBatch(
			@WebParam(
				name = "requestOsBatch",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				partName = "requestOsBatch",
				header = false) RequestOsBatch request,
			@WebParam(
				name = "Cabecera",
				partName = "Cabecera",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que actualiza la oser batch.
	 * 
	 * @param request
	 *            parametros de entrada
	 * @param cabecera
	 *            objeto que contiene el token
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "actualizaOsBatch",
		action = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType/actualizaOsBatch")
	void actualizaOsBatch(
			@WebParam(
				name = "requestOser",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				partName = "requestOser",
				header = false) RequestOser request,
			@WebParam(
				name = "Cabecera",
				partName = "Cabecera",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que reversa un Batch.
	 * 
	 * @param request
	 *            parametros de entrada
	 * @param cabecera
	 *            objeto que contiene el token
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "reversaBatch",
		action = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType/reversaBatch")
	void reversaBatch(
			@WebParam(
				name = "requestReversaBatch",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				partName = "requestReversaBatch",
				header = false) RequestBatch request,
			@WebParam(
				name = "Cabecera",
				partName = "Cabecera",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que reasigna batch.
	 * 
	 * @param request
	 *            parametros de entrada
	 * @param cabecera
	 *            objeto que contiene el token
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "reasignaBatch",
		action = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType/reasignaBatch")
	void reasignaBatch(
			@WebParam(
				name = "requestReasignaBatch",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				partName = "requestReasignaBatch",
				header = false) RequestBatch request,
			@WebParam(
				name = "Cabecera",
				partName = "Cabecera",
				targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType",
				header = true) Cabecera cabecera) throws BluexException;
}
