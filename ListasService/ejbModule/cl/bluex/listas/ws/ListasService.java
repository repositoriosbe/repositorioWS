package cl.bluex.listas.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;

import cl.bluex.listas.bean.request.RequestObtieneEmpresas;
import cl.bluex.listas.bean.request.RequestObtieneParametrosGenerales;
import cl.bluex.listas.bean.request.RequestObtienePostasComunas;
import cl.bluex.listas.bean.request.RequestObtieneTraduccionEmpresas;
import cl.bluex.listas.bean.request.RequestObtieneTraduccionProducto;
import cl.bluex.listas.bean.request.RequestPosta;
import cl.bluex.listas.bean.response.ResponseBancos;
import cl.bluex.listas.bean.response.ResponseCentrosCosto;
import cl.bluex.listas.bean.response.ResponseComunas;
import cl.bluex.listas.bean.response.ResponseDiasPago;
import cl.bluex.listas.bean.response.ResponseEmpresas;
import cl.bluex.listas.bean.response.ResponseFamiliaProductos;
import cl.bluex.listas.bean.response.ResponseLocalidades;
import cl.bluex.listas.bean.response.ResponseMonedas;
import cl.bluex.listas.bean.response.ResponseObtieneConversiones;
import cl.bluex.listas.bean.response.ResponseObtieneParametrosGenerales;
import cl.bluex.listas.bean.response.ResponseObtieneSorter;
import cl.bluex.listas.bean.response.ResponseObtieneTipoInfluencias;
import cl.bluex.listas.bean.response.ResponseObtieneTipoNegocios;
import cl.bluex.listas.bean.response.ResponseOficinas;
import cl.bluex.listas.bean.response.ResponsePaises;
import cl.bluex.listas.bean.response.ResponsePersonalizacionesUsuario;
import cl.bluex.listas.bean.response.ResponsePostas;
import cl.bluex.listas.bean.response.ResponseProductos;
import cl.bluex.listas.bean.response.ResponseProductosServicios;
import cl.bluex.listas.bean.response.ResponseRutas;
import cl.bluex.listas.bean.response.ResponseTipoDocumentos;
import cl.bluex.listas.bean.response.ResponseTipoDocumentosCliente;
import cl.bluex.listas.bean.response.ResponseTipoFormasPagoCliente;
import cl.bluex.listas.bean.response.ResponseTipoServicios;
import cl.bluex.listas.bean.response.ResponseTraduccionEmpresa;
import cl.bluex.listas.bean.response.ResponseTraducciones;
import cl.bluex.listas.bean.response.ResponseTraduccionesProducto;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

/**
 * Interface ListasService.
 * 
 * @author Edgardo Herrera
 * 
 */
@WebService(
	targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
	name = "Listas")
public interface ListasService {

	/**
	 * Metodo que obtiene una lista de empresas.
	 * 
	 * @param requestObtieneEmpresas
	 * @param cabecera
	 *            contiene el token {@link Cabecera cabecera}
	 * @return {@link ResponseEmpresas responseEmpresas}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneEmpresas",
		action = "http://ListasWS/BXLST001_listas/ListaPortType/obtieneEmpresas")
	@WebResult(
		name = "responseEmpresas",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponseEmpresas")
	ResponseEmpresas obtieneEmpresas(
			@WebParam(
				name = "requestObtieneEmpresas",
				targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
				partName = "requestObtieneEmpresas",
				header = false) RequestObtieneEmpresas requestObtieneEmpresas,
			@WebParam(
				name = "Cabecera",
				partName = "Cabecera",
				targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Obtiene tipo documentos.
	 * 
	 * @param cabecera
	 *            contiene el token {@link Cabecera cabecera}
	 * @return {@link ResponseTipoDocumentos responseTipoDocumentos}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneTipoDocumentos",
		action = "http://ListasWS/BXLST001_listas/obtieneTipoDocumentos")
	@WebResult(
		name = "responseTipoDocumentos",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponseTipoDocumentos")
	ResponseTipoDocumentos obtieneTipoDocumentos(@WebParam(
		name = "Cabecera",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "Cabecera",
		header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Obtiene paises.
	 * 
	 * @param codigo
	 *            the codigo
	 * @param cabecera
	 *            contiene el token {@link Cabecera cabecera}
	 * @return {@link ResponsePaises responsePaises}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtienePaises",
		action = "http://ListasWS/BXLST001_listas/obtienePaises")
	@WebResult(
		name = "responsePaises",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponsePaises")
	@RequestWrapper(
		localName = "RequestObtienePaises",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		className = "cl.bluex.listas.bean.request.RequestObtienePaises")
	ResponsePaises obtienePaises(@WebParam(
		name = "codigo",
		header = false) String codigo, @WebParam(
		name = "Cabecera",
		header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Obtiene comunas.
	 * 
	 * @param codigoPais
	 *            the codigo pais
	 * @param codigoPosta
	 *            the codigo posta
	 * @param cabecera
	 *            contiene el token {@link Cabecera cabecera}
	 * @return {@link ResponseComunas responseComunas}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneComunas",
		action = "http://ListasWS/BXLST001_listas/obtieneComunas")
	@WebResult(
		name = "responseComunas",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponseComunas")
	@RequestWrapper(
		localName = "requestObtieneComunas",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		className = "cl.bluex.listas.bean.request.RequestObtieneComunas")
	ResponseComunas obtieneComunas(@WebParam(
		name = "codigoPais",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = false) String codigoPais, @WebParam(
		name = "codigoPosta",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = false) String codigoPosta, @WebParam(
		name = "Cabecera",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Obtiene postas.
	 * 
	 * @param request
	 *            {@link RequestPosta}
	 * @param cabecera
	 *            contiene el token {@link Cabecera cabecera}
	 * @return {@link ResponsePostas responsePostas}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtienePostas",
		action = "http://ListasWS/BXLST001_listas/obtienePostas")
	@WebResult(
		name = "responsePostas",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponsePostas")
	ResponsePostas obtienePostas(@WebParam(
		name = "requestPosta",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = false) RequestPosta request, @WebParam(
		name = "Cabecera",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Obtiene postas comunas.
	 * 
	 * @param requestObtienePostasComunas
	 *            {@link RequestObtienePostasComunas}
	 * @param cabecera
	 *            contiene el token {@link Cabecera cabecera}
	 * @return {@link ResponsePostas responsePostas}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtienePostasComunas",
		action = "http://ListasWS/BXLST001_listas/obtienePostasComunas")
	@WebResult(
		name = "responsePostas",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponsePostas")
	ResponsePostas obtienePostasComunas(
			@WebParam(
				name = "requestObtienePostasComunas",
				targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
				header = false) RequestObtienePostasComunas requestObtienePostasComunas,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Obtiene rutas.
	 * 
	 * @param codigo
	 *            the codigo
	 * @param cabecera
	 *            contiene el token {@link Cabecera cabecera}
	 * @return {@link ResponseRutas responseRutas}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneRutas",
		action = "http://ListasWS/BXLST001_listas/obtieneRutas")
	@WebResult(
		name = "responseRutas",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponseRutas")
	@RequestWrapper(
		localName = "requestObtieneRutas",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		className = "cl.bluex.listas.bean.request.RequestObtieneRutas")
	ResponseRutas obtieneRutas(@WebParam(
		name = "codigo",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = false) String codigo, @WebParam(
		name = "Cabecera",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Obtiene localidades.
	 * 
	 * @param codigoPais
	 *            the codigo pais
	 * @param codigoPostaPadre
	 *            the codigo posta padre
	 * @param codigoPosta
	 *            the codigo posta
	 * @param codigoTipoNegocio
	 *            the codigo tipo negocio
	 * @param codigoTipoInfluencia
	 *            the codigo tipo influencia
	 * @param codigoComuna
	 *            the codigo comuna
	 * @param cabecera
	 *            contiene el token {@link Cabecera cabecera}
	 * @return {@link ResponseLocalidades responseLocalidades}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneLocalidades",
		action = "http://ListasWS/BXLST001_listas/obtieneLocalidades")
	@WebResult(
		name = "responseLocalidades",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponseLocalidades")
	@RequestWrapper(
		localName = "requestLocalidades",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		className = "cl.bluex.listas.bean.request.RequestLocalidades")
	ResponseLocalidades obtieneLocalidades(@WebParam(
		name = "codigoPais",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = false) String codigoPais, @WebParam(
		name = "codigoPostaPadre",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = false) String codigoPostaPadre, @WebParam(
		name = "codigoPosta",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = false) String codigoPosta, @WebParam(
		name = "codigoTipoNegocio",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = false) long codigoTipoNegocio, @WebParam(
		name = "codigoTipoInfluencia",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = false) long codigoTipoInfluencia, @WebParam(
		name = "codigoComuna",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = false) long codigoComuna, @WebParam(
		name = "Cabecera",
		header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Obtiene traduccion.
	 * 
	 * @param tipo
	 *            the tipo
	 * @param codigoOrigen
	 *            the codigo origen
	 * @param codigoEmpresa
	 *            el codigo de la empresa
	 * @param cabecera
	 *            contiene el token {@link Cabecera cabecera}
	 * @return {@link ResponseTraducciones responseTraducciones}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneTraduccion",
		action = "http://ListasWS/BXLST001_listas/obtieneTraduccion")
	@WebResult(
		name = "responseTraducciones",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponseTraducciones")
	@RequestWrapper(
		localName = "requestTraduccion",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		className = "cl.bluex.listas.bean.request.RequestTraduccion")
	ResponseTraducciones obtieneTraduccion(@WebParam(
		name = "tipo",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = false) String tipo, @WebParam(
		name = "codigoOrigen",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = false) String codigoOrigen, @WebParam(
		name = "codigoEmpresa",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "codigoEmpresa",
		header = false) long codigoEmpresa, @WebParam(
		name = "Cabecera",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo obtiene una lista de Traducciones del productos.
	 * 
	 * @param request
	 *            {@link RequestObtieneTraduccionProducto request}
	 * @param cabecera
	 *            contiene el token {@link Cabecera cabecera}
	 * @return {@link ResponseTraduccionesProducto}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneTraduccionProducto",
		action = "http://ListasWS/BXLST001_listas/obtieneTraduccionProducto")
	@WebResult(
		name = "responseTraduccionesProducto",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponseTraduccionesProducto")
	ResponseTraduccionesProducto obtieneTraduccionProducto(@WebParam(
		name = "tipo",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = false) RequestObtieneTraduccionProducto request, @WebParam(
		name = "Cabecera",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Obtiene familia productos.
	 * 
	 * @param cabecera
	 *            contiene el token {@link Cabecera cabecera}
	 * @return {@link ResponseFamiliaProductos responseFamiliaProductos}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneFamiliaProductos",
		action = "http://ListasWS/BXLST001_listas/ListaPortType/obtieneFamiliaProductos")
	@WebResult(
		name = "responseFamiliaProductos",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponseFamiliaProductos")
	ResponseFamiliaProductos obtieneFamiliaProductos(@WebParam(
		name = "Cabecera",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "Cabecera",
		header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Obtiene productos.
	 * 
	 * @param codigoFamilia
	 *            the codigo familia
	 * @param codigoEmpresa
	 *            the codigo empresa
	 * @param cabecera
	 *            contiene el token {@link Cabecera cabecera}
	 * @return {@link ResponseProductos responseProductos}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneProductos",
		action = "http://ListasWS/BXLST001_listas/ListaPortType/obtieneProductos")
	@WebResult(
		name = "responseProductos",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponseProductos")
	@RequestWrapper(
		localName = "requestProducto",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		className = "cl.bluex.listas.bean.request.RequestProducto")
	ResponseProductos obtieneProductos(@WebParam(
		name = "codigoFamilia",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = false) String codigoFamilia, @WebParam(
		name = "codigoEmpresa",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = false) long codigoEmpresa, @WebParam(
		name = "Cabecera",
		partName = "Cabecera",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Obtiene tipo servicios.
	 * 
	 * @param codigoEmpresa
	 *            the codigo empresa
	 * @param tipo
	 *            the tipo
	 * @param cabecera
	 *            contiene el token {@link Cabecera cabecera}
	 * @return {@link ResponseTipoServicios responseTipoServicios}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneTipoServicios",
		action = "http://ListasWS/BXLST001_listas/ListaPortType/obtieneTipoServicios")
	@WebResult(
		name = "responseTipoServicios",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponseTipoServicios")
	@RequestWrapper(
		localName = "requestTipoServicio",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		className = "cl.bluex.listas.bean.request.RequestTipoServicio")
	ResponseTipoServicios obtieneTipoServicios(@WebParam(
		name = "codigoEmpresa",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = false) long codigoEmpresa, @WebParam(
		name = "tipo",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = false) String tipo, @WebParam(
		name = "Cabecera",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "Cabecera",
		header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Obtiene personalizaciones usuario.
	 * 
	 * @param codigoUsuario
	 *            the codigo usuario
	 * @param cabecera
	 *            contiene el token {@link Cabecera cabecera}
	 * @return {@link ResponsePersonalizacionesUsuario
	 *         responsePersonalizacionesUsuario}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtienePersonalizacionesUsuario",
		action = "http://ListasWS/BXLST001_listas/obtienePersonalizacionesUsuario")
	@WebResult(
		name = "responsePersonalizacionesUsuario",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponsePersonalizacionesUsuario")
	@RequestWrapper(
		localName = "requestPersonalizacionUsuario",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		className = "cl.bluex.listas.bean.request.RequestPersonalizacionUsuario")
	ResponsePersonalizacionesUsuario obtienePersonalizacionesUsuario(@WebParam(
		name = "codigoUsuario",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = false) long codigoUsuario, @WebParam(
		name = "Cabecera",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Obtiene tipo documento cliente.
	 * 
	 * @param cabecera
	 *            contiene el token {@link Cabecera cabecera}
	 * @return {@link ResponseTipoDocumentosCliente
	 *         responseTipoDocumentosCliente}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneTipoDocumentoCliente",
		action = "http://ListasWS/BXLST001_listas/obtieneTipoDocumentoCliente")
	@WebResult(
		name = "responseTipoDocumentosCliente",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponseTipoDocumentosCliente")
	ResponseTipoDocumentosCliente obtieneTipoDocumentoCliente(@WebParam(
		name = "Cabecera",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Obtiene tipo forma pago cliente.
	 * 
	 * @param cabecera
	 *            contiene el token {@link Cabecera cabecera}
	 * @return {@link ResponseTipoFormasPagoCliente
	 *         responseTipoFormasPagoCliente}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneTipoFormaPagoCliente",
		action = "http://ListasWS/BXLST001_listas/obtieneTipoFormaPagoCliente")
	@WebResult(
		name = "responseTipoFormasPagoCliente",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponseTipoFormasPagoCliente")
	ResponseTipoFormasPagoCliente obtieneTipoFormaPagoCliente(@WebParam(
		name = "Cabecera",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Obtiene bancos.
	 * 
	 * @param cabecera
	 *            contiene el token {@link Cabecera cabecera}
	 * @return {@link ResponseBancos responseBancos}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneBancos",
		action = "http://ListasWS/BXLST001_listas/obtieneBancos")
	@WebResult(
		name = "responseBancos",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponseBancos")
	ResponseBancos obtieneBancos(@WebParam(
		name = "Cabecera",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Obtiene dias pago.
	 * 
	 * @param cabecera
	 *            contiene el token {@link Cabecera cabecera}
	 * @return {@link ResponseDiasPago responseDiasPago}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneDiasPago",
		action = "http://ListasWS/BXLST001_listas/obtieneDiasPago")
	@WebResult(
		name = "responseDiasPago",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponseDiasPago")
	ResponseDiasPago obtieneDiasPago(@WebParam(
		name = "Cabecera",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Obtiene monedas.
	 * 
	 * @param cabecera
	 *            contiene el token {@link Cabecera cabecera}
	 * @return {@link ResponseMonedas responseMonedas}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneMonedas",
		action = "http://ListasWS/BXLST001_listas/obtieneMonedas")
	@WebResult(
		name = "responseMonedas",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponseMonedas")
	ResponseMonedas obtieneMonedas(@WebParam(
		name = "Cabecera",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "Cabecera",
		header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Obtiene oficinas.
	 * 
	 * @param codigoEmpresa
	 *            the codigo empresa
	 * @param codigoPosta
	 *            the codigo posta
	 * @param cabecera
	 *            contiene el token {@link Cabecera cabecera}
	 * @return {@link ResponseOficinas responseOficinas}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneOficinas",
		action = "http://ListasWS/BXLST001_listas/obtieneOficinas")
	@WebResult(
		name = "responseOficinas",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponseOficinas")
	@RequestWrapper(
		localName = "requestOficinas",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		className = "cl.bluex.listas.bean.request.RequestOficinas")
	ResponseOficinas obtieneOficinas(@WebParam(
		name = "codigoEmpresa",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "codigoEmpresa",
		header = false) long codigoEmpresa, @WebParam(
		name = "codigoPosta",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "codigoPosta",
		header = false) String codigoPosta, @WebParam(
		name = "Cabecera",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "Cabecera",
		header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Obtiene centros costo.
	 * 
	 * @param codigoEmpresa
	 *            the codigo empresa
	 * @param codigoCliente
	 *            the codigo cliente
	 * @param codigoSucursalCliente
	 *            the codigo sucursal cliente
	 * @param codigoTipoCliente
	 *            the codigo tipo cliente
	 * @param codigoCentroCosto
	 *            el codigo del centro de costo
	 * @param cabecera
	 *            contiene el token {@link Cabecera cabecera}
	 * @return {@link ResponseCentrosCosto responseCentrosCosto}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneCentrosCosto",
		action = "http://ListasWS/BXLST001_listas/obtieneCentrosCosto")
	@WebResult(
		name = "responseCentrosCosto",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponseCentrosCosto")
	@RequestWrapper(
		localName = "requestCentrosCosto",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		className = "cl.bluex.listas.bean.request.RequestCentrosCosto")
	ResponseCentrosCosto obtieneCentrosCosto(@WebParam(
		name = "codigoEmpresa",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "codigoEmpresa",
		header = false) long codigoEmpresa, @WebParam(
		name = "codigoCliente",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "codigoCliente",
		header = false) long codigoCliente, @WebParam(
		name = "codigoSucursalCliente",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "codigoSucursalCliente",
		header = false) long codigoSucursalCliente, @WebParam(
		name = "codigoTipoCliente",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "codigoTipoCliente",
		header = false) long codigoTipoCliente, @WebParam(
		name = "codigoCentroCosto",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "codigoCentroCosto",
		header = false) String codigoCentroCosto, @WebParam(
		name = "Cabecera",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "Cabecera",
		header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que obtiene Conversiones.
	 * 
	 * @param tipo
	 *            el tipo de conversion
	 * @param codigoEmpresa
	 *            el codigo de la empresa
	 * @param cabecera
	 *            contiene el token {@link Cabecera cabecera}
	 * @return {@link ResponseObtieneConversiones responseObtieneConversiones}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneConversiones",
		action = "http://ListasWS/BXLST001_listas/ListaPortType/obtieneConversiones")
	@WebResult(
		name = "responseObtieneConversiones",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponseObtieneConversiones")
	@RequestWrapper(
		localName = "requestObtieneConversiones",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		className = "cl.bluex.listas.bean.request.RequestObtieneConversiones")
	ResponseObtieneConversiones obtieneConversiones(@WebParam(
		name = "tipo",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "tipo",
		header = false) String tipo, @WebParam(
		name = "codigoEmpresa",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "codigoEmpresa",
		header = false) long codigoEmpresa, @WebParam(
		name = "Cabecera",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "Cabecera",
		header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que obtiene tipo influencias.
	 * 
	 * @param cabecera
	 *            contiene el token {@link Cabecera cabecera}
	 * @return {@link ResponseObtieneTipoInfluencias
	 *         responseObtieneTipoInfluencias}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneTipoInfluencias",
		action = "http://ListasWS/BXLST001_listas/ListaPortType/obtieneTipoInfluencias")
	@WebResult(
		name = "responseObtieneTipoInfluencias",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponseObtieneTipoInfluencias")
	ResponseObtieneTipoInfluencias obtieneTipoInfluencias(@WebParam(
		name = "Cabecera",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "Cabecera",
		header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que obtiene servicios primarios.
	 * 
	 * @param cabecera
	 *            contiene el token {@link Cabecera cabecera}
	 * @return {@link ResponseObtieneTipoNegocios
	 *         responseObtieneServiciosPrimarios}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneTipoNegocios",
		action = "http://ListasWS/BXLST001_listas/ListaPortType/obtieneTipoNegocios")
	@WebResult(
		name = "responseObtieneTipoNegocios",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponseObtieneTipoNegocios")
	ResponseObtieneTipoNegocios obtieneTipoNegocios(@WebParam(
		name = "Cabecera",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "Cabecera",
		header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que obtiene sorter.
	 * 
	 * @param cabecera
	 *            contiene el token {@link Cabecera cabecera}
	 * @return {@link ResponseObtieneSorter responseObtieneSorter}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneSorter",
		action = "http://ListasWS/BXLST001_listas/ListaPortType/obtieneSorter")
	@WebResult(
		name = "responseObtieneSorter",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponseObtieneSorter")
	ResponseObtieneSorter obtieneSorter(@WebParam(
		name = "Cabecera",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "Cabecera",
		header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Obtiene Traduccion empresas.
	 * 
	 * @param request
	 *            {@link RequestObtieneTraduccionEmpresas}
	 * @param cabecera
	 *            contiene el token {@link Cabecera cabecera}
	 * @return {@link ResponseTraduccionEmpresa responseTraduccionEmpresa}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneTraduccionEmpresa",
		action = "http://ListasWS/BXLST001_listas/obtieneTraduccionEmpresa")
	@WebResult(
		name = "responseTraduccionEmpresa",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponseTraduccionEmpresa")
	ResponseTraduccionEmpresa obtieneTraduccionEmpresa(@WebParam(
		name = "requestObtieneTraduccionEmpresas",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "requestObtieneTraduccionEmpresas",
		header = false) RequestObtieneTraduccionEmpresas request, @WebParam(
		name = "Cabecera",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Obtiene productos Servicios.
	 * 
	 * @param codigoEmpresa
	 *            the codigo
	 * @param codigoOrigen
	 *            si es cero los trae todos.
	 * @param tipo
	 *            el tipo
	 * @param codigo
	 *            the codigo
	 * @param cabecera
	 *            contiene el token {@link Cabecera cabecera}
	 * @return {@link ResponseTraduccionEmpresa responseTraduccionEmpresa}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneProductosServicios",
		action = "http://ListasWS/BXLST001_listas/obtieneProductosServicios")
	@WebResult(
		name = "responseProductosServicios",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponseProductosServicios")
	@RequestWrapper(
		localName = "requestObtieneProductosServicios",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		className = "cl.bluex.listas.bean.request.RequestObtieneProductosServicios")
	ResponseProductosServicios obtieneProductosServicios(@WebParam(
		name = "codigoEmpresa",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = false) long codigoEmpresa, @WebParam(
		name = "codigoOrigen",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = false) String codigoOrigen, @WebParam(
		name = "tipo",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = false) String tipo, @WebParam(
		name = "Cabecera",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		header = true) Cabecera cabecera) throws BluexException;

	/**
	 * @param request datos de entrada al servicio
	 * @param cabecera objeto que contiene el token
	 * @return {@link ResponseObtieneParametrosGenerales}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneParametrosGenerales",
		action = "http://ListasWS/BXLST001_listas/obtieneParametrosGenerales")
	@WebResult(
		name = "responseObtieneParametrosGenerales",
		targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
		partName = "ResponseObtieneParametrosGenerales")
	ResponseObtieneParametrosGenerales obtieneParametrosGenerales(
			@WebParam(
				name = "requestObtieneParametrosGenerales",
				targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
				partName = "requestObtieneParametrosGenerales",
				header = false) RequestObtieneParametrosGenerales request,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

}
