package cl.bluex.generadoretiqueta.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;

import cl.bluex.generadoretiqueta.bean.DatosImpresion;
import cl.bluex.generadoretiqueta.bean.request.RequestCodigoBulto;
import cl.bluex.generadoretiqueta.bean.request.RequestEntradaDatosOperacionales;
import cl.bluex.generadoretiqueta.bean.request.RequestGeneraEtiqueta;
import cl.bluex.generadoretiqueta.bean.request.RequestGeneraEtiquetaDigExpress;
import cl.bluex.generadoretiqueta.bean.request.RequestGeneraEtiquetaHub;
import cl.bluex.generadoretiqueta.bean.request.RequestGeneraEtiquetas;
import cl.bluex.generadoretiqueta.bean.request.RequestGuiasPorPieza;
import cl.bluex.generadoretiqueta.bean.request.RequestGuiasPorReferencia;
import cl.bluex.generadoretiqueta.bean.request.RequestInsertaPiezaMovimiento;
import cl.bluex.generadoretiqueta.bean.request.RequestObtieneDestino;
import cl.bluex.generadoretiqueta.bean.request.RequestObtieneGuiasPorFolio;
import cl.bluex.generadoretiqueta.bean.request.RequestObtieneOrdenesServicio;
import cl.bluex.generadoretiqueta.bean.request.RequestValidaOficinaBodega;
import cl.bluex.generadoretiqueta.bean.response.ResponseCodigoBulto;
import cl.bluex.generadoretiqueta.bean.response.ResponseDatosOperacionales;
import cl.bluex.generadoretiqueta.bean.response.ResponseDestino;
import cl.bluex.generadoretiqueta.bean.response.ResponseEtiqueta;
import cl.bluex.generadoretiqueta.bean.response.ResponseEtiquetaHub;
import cl.bluex.generadoretiqueta.bean.response.ResponseEtiquetas;
import cl.bluex.generadoretiqueta.bean.response.ResponseGuias;
import cl.bluex.generadoretiqueta.bean.response.ResponseInsertaPiezaMovimiento;
import cl.bluex.generadoretiqueta.bean.response.ResponseObtieneOrdenesServicio;
import cl.bluex.generadoretiqueta.bean.response.ResponseValidaOficinaBodega;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

/**
 * Interface ListasService.
 * 
 * @author Edgardo Herrera
 * 
 */
@WebService(
	targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
	name = "GeneradorEtiqueta")
public interface GeneradorEtiquetaService {

	/**
	 * Servicio que se encarga de obtener el destino de una etiqueta.
	 * 
	 * @param request
	 *            los datos de entrada
	 * @param cabecera
	 *            el objeto que contiene el token
	 * @return {@link ResponseDestino}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneDestino",
		action = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType/obtieneDestino")
	@WebResult(
		name = "responseDestino",
		targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
		partName = "ResponseDestino")
	ResponseDestino obtieneDestino(
			@WebParam(
				name = "requestObtieneDestino",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				header = false) RequestObtieneDestino request,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que obtiene la etiqueta fija a partir de los datos de entrada.
	 * 
	 * @param datosImpresion
	 *            los datos que contendra el template
	 * @param cabecera
	 *            objeto que contiene el token
	 * @return {@link ResponseEtiqueta}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneEtiqueta",
		action = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType/obtieneEtiqueta")
	@WebResult(
		name = "responseEtiqueta",
		targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
		partName = "ResponseEtiqueta")
	@RequestWrapper(
		localName = "requestObtieneEtiqueta",
		targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
		className = "cl.bluex.generadoretiqueta.bean.request.RequestObtieneEtiqueta")
	ResponseEtiqueta obtieneEtiqueta(
			@WebParam(
				name = "datosImpresion",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				header = false) DatosImpresion datosImpresion,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que obtiene etiqueta digitacion express.
	 * 
	 * @param request
	 *            los datos de la peticion
	 * @param cabecera
	 *            objeto que contiene el token
	 * @return {@link ResponseEtiquetas}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "generaEtiquetaDigExpress",
		action = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType/generaEtiquetaDigExpress")
	@WebResult(
		name = "responseEtiquetas",
		targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
		partName = "ResponseEtiquetas")
	ResponseEtiquetas generaEtiquetaDigExpress(
			@WebParam(
				name = "requestGeneraEtiquetaDigExpress",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				header = false) RequestGeneraEtiquetaDigExpress request,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que genera las etiquetas.
	 * 
	 * @param requestGeneraEtiquetas
	 *            los datos necesarios para la peticion
	 * @param cabecera
	 *            objeto que contiene el token
	 * @return {@link ResponseEtiquetas}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "generaEtiquetas",
		action = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType/generaEtiquetas")
	@WebResult(
		name = "responseEtiquetas",
		targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
		partName = "ResponseEtiquetas")
	ResponseEtiquetas generaEtiquetas(
			@WebParam(
				name = "requestGeneraEtiquetas",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				header = false) RequestGeneraEtiquetas request,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que genera una etiqueta a partir de datos de BD.
	 * 
	 * @param request
	 * @param cabecera
	 * @return la etiqueta
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "generaEtiqueta",
		action = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType/generaEtiqueta")
	@WebResult(
		name = "responseEtiqueta",
		targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
		partName = "ResponseEtiqueta")
	ResponseEtiqueta generaEtiqueta(
			@WebParam(
				name = "requestGeneraEtiqueta",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				header = false) RequestGeneraEtiqueta request,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que obtiene las guias por su encabezado.
	 * 
	 * @param idEncabezado
	 * @param cabecera
	 * @return
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneGuiasPorEncabezado",
		action = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType/obtieneGuiasPorEncabezado")
	@WebResult(
		name = "responseGuiasPorEncabezado",
		targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
		partName = "ResponseGuias")
	@RequestWrapper(
		localName = "requestObtieneGuiasPorEncabezado",
		targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
		className = "cl.bluex.generadoretiqueta.bean.request.RequestObtieneGuiasPorEncabezado")
	ResponseGuias obtieneGuiasPorEncabezado(
			@WebParam(
				name = "idEncabezado",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				header = false) int idEncabezado,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que obtiene las guías a traves del numero de folio.
	 * 
	 * @param tipoDocumento
	 * @param numeroFolio
	 * @param cabecera
	 * @return
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneGuiasPorFolio",
		action = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType/obtieneGuiasPorFolio")
	@WebResult(
		name = "responseGuiasPorFolio",
		targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
		partName = "ResponseGuias")
	ResponseGuias obtieneGuiasPorFolio(
			@WebParam(
				name = "requestObtieneGuiasPorFolio",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				partName = "requestObtieneGuiasPorFolio",
				header = false) RequestObtieneGuiasPorFolio request,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que obtiene las guias por referencia.
	 * 
	 * @param request
	 *            parametros de entrada
	 * @param cabecera
	 *            objeto que contiene el token
	 * @return {@link ResponseGuias}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneGuiasPorReferencia",
		action = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType/obtieneGuiasPorReferencia")
	@WebResult(
		name = "responseGuiasPorReferencia",
		targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
		partName = "ResponseGuias")
	ResponseGuias obtieneGuiasPorReferencia(
			@WebParam(
				name = "requestGuiasPorReferencia",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				partName = "requestGuiasPorReferencia",
				header = false) RequestGuiasPorReferencia request,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que obtiene las guias por pieza.
	 * 
	 * @param request
	 *            parametros de entrada
	 * @param cabecera
	 *            objeto que contiene el token
	 * @return {@link ResponseGuias}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneGuiasPorPieza",
		action = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType/obtieneGuiasPorPieza")
	@WebResult(
		name = "responseGuiasPorPieza",
		targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
		partName = "ResponseGuias")
	ResponseGuias obtieneGuiasPorPieza(
			@WebParam(
				name = "requestGuiasPorPieza",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				partName = "requestGuiasPorPieza",
				header = false) RequestGuiasPorPieza request,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que genera la etiqueta Hub.
	 * 
	 * @param request
	 *            parametros de entrada
	 * @param cabecera
	 *            objeto que contiene el token
	 * @return {@link ResponseEtiquetaHub}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneEtiquetasHub",
		action = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType/obtieneGuiasPorReferencia")
	@WebResult(
		name = "responseEtiquetasHub",
		targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
		partName = "ResponseEtiquetasHub")
	ResponseEtiquetaHub generaEtiquetaHub(
			@WebParam(
				name = "requestGeneraEtiquetaHub",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				header = false) RequestGeneraEtiquetaHub request,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que obtiene la orden de servicio.
	 * 
	 * @param request parametros de entrada
	 * @param cabecera objeto que contiene el token
	 * @return {@link ResponseObtieneOrdenesServicio}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneOrdenesServicio",
		action = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType/obtieneOrdenesServicio")
	@WebResult(
		name = "responseObtieneOrdenesServicio",
		targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
		partName = "ResponseObtieneOrdenesServicio")
	ResponseObtieneOrdenesServicio obtieneOrdenesServicio(
			@WebParam(
				name = "requestObtieneOrdenesServicio",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				partName = "requestObtieneOrdenesServicio",
				header = false) RequestObtieneOrdenesServicio request,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				header = true) Cabecera cabecera) throws BluexException;
	
	@WebMethod(
		operationName = "obtieneCodigoBultoL28",
		action = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType/obtieneCodigoBultoL28")
	@WebResult(
		name = "responseCodigoBulto",
		targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
		partName = "responseCodigoBulto")
	ResponseCodigoBulto obtieneCodigoBultoL28(
			@WebParam(
				name = "requestCodigoBulto",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				partName = "requestCodigoBulto",
				header = false) RequestCodigoBulto request,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				header = true) Cabecera cabecera) throws BluexException;

	
	/**
	 * Metodo 
	 * 
	 * @param request
	 *            parametros de entrada
	 * @param cabecera
	 *            objeto
	 * @return {@link ResponseDatosOperacionales}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneDatosOperacionales",
		action = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType/obtieneDatosOperacionales")
	@WebResult(
		name = "responseDatosOperacionales",
		targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
		partName = "ResponseDatosOperacionales")
	ResponseDatosOperacionales obtieneDatosOperacionales(
			@WebParam(
				name = "requestEntradaDatosOperacionales",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				header = false) RequestEntradaDatosOperacionales request,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				header = true) Cabecera cabecera) throws BluexException;
	
	
	/**
	 * Metodo 
	 * 
	 * @param request
	 *            parametros de entrada
	 * @param cabecera
	 *            objeto
	 * @return {@link ResponseDatosOperacionales}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "validaOficinaBodega",
		action = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType/validaOficinaBodega")
	@WebResult(
		name = "responseDatosOperacionales",
		targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
		partName = "ResponseDatosOperacionales")
	ResponseValidaOficinaBodega validaOficinaBodega(
			@WebParam(
				name = "requestEntradaDatosOperacionales",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				header = false) RequestValidaOficinaBodega request,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				header = true) Cabecera cabecera) throws BluexException;
	
	
	
	/**
	 * Metodo Graba un registro en la tabla de movimientos para tracking.
	 * 
	 * @param request
	 *            parametros de entrada
	 * @param cabecera
	 *            objeto
	 * @return {@link ResponseInsertaPiezaMovimiento}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "insertaPiezaMovimiento",
		action = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType/insertaPiezaMovimiento")
	@WebResult(
		name = "responseInsertaPiezaMovimiento",
		targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
		partName = "ResponseInsertaPiezaMovimiento")
	ResponseInsertaPiezaMovimiento insertaPiezaMovimiento(
			@WebParam(
				name = "requestInsertaPiezaMovimiento",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				header = false) RequestInsertaPiezaMovimiento request,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType",
				header = true) Cabecera cabecera) throws BluexException;
	
	
}
