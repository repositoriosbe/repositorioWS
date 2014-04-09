package cl.bluex.digexpress.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;

import cl.bluex.digexpress.bean.Agrupacion;
import cl.bluex.digexpress.bean.CabeceraAgrupacion;
import cl.bluex.digexpress.bean.DetalleDigitacionExpress;
import cl.bluex.digexpress.bean.response.ResponseAgrupacion;
import cl.bluex.digexpress.bean.response.ResponseCabeceraAgrupacion;
import cl.bluex.digexpress.bean.response.ResponseClientes;
import cl.bluex.digexpress.bean.response.ResponseDatosHojaRuta;
import cl.bluex.digexpress.bean.response.ResponseDetalleDigExpress;
import cl.bluex.digexpress.bean.response.ResponseDetallesDigExp;
import cl.bluex.digexpress.bean.response.ResponseEspecieValorada;
import cl.bluex.digexpress.bean.response.ResponseModificarEstadoAgrupacion;
import cl.bluex.digexpress.bean.response.ResponseObtieneDatosCourier;
import cl.bluex.digexpress.bean.response.ResponseValorados;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

/**
 * Interfaz de servicio Digitacion.
 * 
 * @author Edgardo Herrera
 * 
 */
@WebService(
	targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
	name = "DigitacionExpress")
public interface DigitacionExpressService {

	/**
	 * Metodo que aactualiza el encabezado de una agrupacion.
	 * 
	 * @param cabeceraAgrupacion
	 *            la cabecera de la agrupacion
	 * @param cabecera
	 *            del servicio
	 * @return {@link ResponseCabeceraAgrupacion}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "actualizaEncDigExpress",
		action = "http://digitacionExpressWS/BXDIG002_express/actualizaEncDigExpress")
	@WebResult(
		name = "responseCabeceraAgrupacion",
		targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
		partName = "ResponseCabeceraAgrupacion")
	@RequestWrapper(
		localName = "requestCabeceraAgrupacion",
		targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
		className = "cl.bluex.digexpress.bean.request.RequestCabeceraAgrupacion")
	ResponseCabeceraAgrupacion actualizaEncDigExpress(
			@WebParam(
				name = "cabeceraAgrupacion",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "cabeceraAgrupacion",
				header = false) CabeceraAgrupacion cabeceraAgrupacion,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que inserta una nueva digitacion express.
	 * 
	 * @param detalleDigitacionExpress
	 *            datos del detalle a insertar
	 * @param cabecera
	 *            del servicio
	 * @return {@link ResponseAgrupacion}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "insertaDigitExpress",
		action = "http://digitacionExpressWS/BXDIG002_express/insertaDigitExpress")
	@WebResult(
		name = "responseAgrupacion",
		targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
		partName = "ResponseAgrupacion")
	@RequestWrapper(
		localName = "requestDetalleDigExpress",
		targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
		className = "cl.bluex.digexpress.bean.request.RequestDetalleDigExpress")
	ResponseAgrupacion insertaDigitExpress(
			@WebParam(
				name = "detalleDigitacionExpress",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "detalleDigitacionExpress",
				header = false) DetalleDigitacionExpress detalleDigitacionExpress,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que obtiene una digitacion express.
	 * 
	 * @param detalleDigitacionExpress
	 *            los datos de la digitacion que se desea obtener
	 * @param cabecera
	 *            del servicio
	 * @return {@link ResponseDetalleDigExpress}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneDigitExpress",
		action = "http://digitacionExpressWS/BXDIG002_express/obtieneDigitExpress")
	@WebResult(
		name = "responseDetallesDigExp",
		targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
		partName = "ResponseDetallesDigExp")
	@RequestWrapper(
		localName = "requestObtieneDetalleDig",
		targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
		className = "cl.bluex.digexpress.bean.request.RequestDetalleDigExpress")
	ResponseDetallesDigExp obtieneDigitExpress(
			@WebParam(
				name = "detalleDigitacionExpress",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "detalleDigitacionExpress",
				header = false) DetalleDigitacionExpress detalleDigitacionExpress,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que elimina una digitacion express.
	 * 
	 * @param detalleDigitacionExpress
	 *            datos de la digitacion a eliminar
	 * @param cabecera
	 *            del servicio
	 * @return {@link ResponseDetalleDigExpress}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "eliminaDigitExpress",
		action = "http://digitacionExpressWS/BXDIG002_express/eliminaDigitExpress")
	@WebResult(
		name = "responseDetalleDigExpress",
		targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
		partName = "ResponseDetalleDigExpress")
	@RequestWrapper(
		localName = "requestEliminaDigExpress",
		targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
		className = "cl.bluex.digexpress.bean.request.RequestDetalleDigExpress")
	ResponseDetalleDigExpress eliminaDigitExpress(
			@WebParam(
				name = "detalleDigitacionExpress",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "detalleDigitacionExpress",
				header = false) DetalleDigitacionExpress detalleDigitacionExpress,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que elimina una agrupacion.
	 * 
	 * @param agrupacion
	 *            datos de la agrupacion a eliminar
	 * @param cabecera
	 *            del servicio
	 * @return {@link ResponseAgrupacion}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "eliminarAgrupacion",
		action = "http://digitacionExpressWS/BXDIG002_express/eliminarAgrupacion")
	@WebResult(
		name = "responseAgrupacion",
		targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
		partName = "ResponseAgrupacion")
	ResponseAgrupacion eliminarAgrupacion(
			@WebParam(
				name = "agrupacion",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "agrupacion",
				header = false) Agrupacion agrupacion,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo para cerrar una agrupacion.
	 * 
	 * @param agrupacion
	 *            datos de la agrupacion a cerrar
	 * @param cabecera
	 *            del servicio
	 * @return {@link ResponseAgrupacion}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "cerrarAgrupacion",
		action = "http://digitacionExpressWS/BXDIG002_express/cerrarAgrupacion")
	@WebResult(
		name = "responseAgrupacion",
		targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
		partName = "ResponseAgrupacion")
	ResponseAgrupacion cerrarAgrupacion(
			@WebParam(
				name = "agrupacion",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "agrupacion",
				header = false) Agrupacion agrupacion,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que modifica el estado de una agrupacion.
	 * 
	 * @param idCabeceraAgrupacion
	 *            id de la cabecera de la agrupacion a modificar
	 * @param codigoEstado
	 *            el codigo de estado
	 * @param cabecera
	 *            del servicio
	 * @return {@link ResponseModificarEstadoAgrupacion}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "modificarEstadoAgrupacion",
		action = "http://digitacionExpressWS/BXDIG002_express/modificarEstadoAgrupacion")
	@WebResult(
		name = "responseModificarEstadoAgrupacion",
		targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
		partName = "ResponseModificarEstadoAgrupacion")
	@RequestWrapper(
		localName = "requestModificarEstadoAgrupacion",
		targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
		className = "cl.bluex.digexpress.bean.request.RequestModificarEstadoAgrupacion")
	ResponseModificarEstadoAgrupacion modificarEstadoAgrupacion(
			@WebParam(
				name = "idCabeceraAgrupacion",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "idCabeceraAgrupacion",
				header = false) long idCabeceraAgrupacion,
			@WebParam(
				name = "codigoEstado",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "codigoEstado",
				header = false) String codigoEstado,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que obtiene una agrupacion.
	 * 
	 * @param cabeceraAgrupacion
	 *            datos de la cabecera de la agrupacion a obtener
	 * @param cabecera
	 *            del servicio
	 * @return {@link ResponseCabeceraAgrupacion}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneAgrupacion",
		action = "http://digitacionExpressWS/BXDIG002_express/obtieneAgrupacion")
	@WebResult(
		name = "responseCabeceraAgrupacion",
		targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
		partName = "ResponseCabeceraAgrupacion")
	@RequestWrapper(
		localName = "requestObtieneAgrupacion",
		targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
		className = "cl.bluex.digexpress.bean.request.RequestCabeceraAgrupacion")
	ResponseCabeceraAgrupacion obtieneAgrupacion(
			@WebParam(
				name = "cabeceraAgrupacion",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "cabeceraAgrupacion",
				header = false) CabeceraAgrupacion cabeceraAgrupacion,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que obtiene una cabecera de agrupacion.
	 * 
	 * @param codigo
	 *            codigo de la cabecera de agrupacion
	 * @param cabecera
	 *            del servicio
	 * @return {@link ResponseCabeceraAgrupacion}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneCabeceraAgrupacion",
		action = "http://digitacionExpressWS/BXDIG002_express/obtieneCabeceraAgrupacion")
	@WebResult(
		name = "responseCabeceraAgrupacion",
		targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
		partName = "ResponseCabeceraAgrupacion")
	ResponseCabeceraAgrupacion obtieneCabeceraAgrupacion(
			@WebParam(
				name = "codigo",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "codigo",
				header = false) long codigo,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que obtiene los datos de la hoja de ruta.
	 * 
	 * @param folio
	 *            de la hoja de ruta
	 * @param cabecera
	 *            del servicio
	 * @return {@link ResponseDatosHojaRuta}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneDatosHojaRuta",
		action = "http://digitacionExpressWS/BXDIG002_express/obtieneDatosHojaRuta")
	@WebResult(
		name = "responseDatosHojaRuta",
		targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
		partName = "ResponseDatosHojaRuta")
	@RequestWrapper(
		localName = "requestDatosHojaRuta",
		targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
		className = "cl.bluex.digexpress.bean.request.RequestDatosHojaRuta")
	ResponseDatosHojaRuta obtieneDatosHojaRuta(
			@WebParam(
				name = "folio",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "folio",
				header = false) String folio,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	
	/**
	 * Metodo que valida una especie valorada.
	 * 
	 * @param codigoEmpresa
	 *            el codigo de la empresa
	 * @param codigoTipoDocumento
	 *            el codigo del tipo de documento
	 * @param numeroDocumento
	 *            el numero de documento
	 * @param cabecera
	 *            del servicio
	 * @return {@link ResponseEspecieValorada}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "validaEspecieValorada",
		action = "http://digitacionExpressWS/BXDIG002_express/validaEspecieValorada")
	@WebResult(
		name = "responseEspecieValorada",
		targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
		partName = "ResponseEspecieValorada")
	@RequestWrapper(
		localName = "requestEspecieValorada",
		targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
		className = "cl.bluex.digexpress.bean.request.RequestEspecieValorada")
	ResponseEspecieValorada validaEspecieValorada(
			@WebParam(
				name = "codigoEmpresa",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "codigoEmpresa",
				header = false) long codigoEmpresa,
			@WebParam(
				name = "codigoTipoDocumento",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "codigoTipoDocumento",
				header = false) String codigoTipoDocumento,
			@WebParam(
				name = "numeroDocumento",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "numeroDocumento",
				header = false) long numeroDocumento,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que obtiene los clientes valorados.
	 * 
	 * @param codigoEmpresa
	 *            codigo de la empresa
	 * @param cabecera
	 *            del servicio
	 * @return {@link ResponseClientes}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneClientesValorados",
		action = "http://digitacionExpressWS/BXDIG002_express/obtieneClientesValorados")
	@WebResult(
		name = "responseClientes",
		targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
		partName = "ResponseClientes")
	ResponseClientes obtieneClientesValorados(
			@WebParam(
				name = "codigoEmpresa",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "codigoEmpresa",
				header = false) long codigoEmpresa,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que obtiene valorados.
	 * 
	 * @param codigoCliente
	 *            codigo del cliente
	 * @param codigoTipoCliente
	 *            codigo del tipo de cliente
	 * @param codigoEmpresa
	 *            codigo de la empresa
	 * @param codigoSucursalCliente
	 *            codigo de la sucursal del cliente
	 * @param cabecera
	 *            del servicio
	 * @return {@link ResponseValorados}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneValorados",
		action = "http://digitacionExpressWS/BXDIG002_express/obtieneValorados")
	@WebResult(
		name = "responseValorados",
		targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
		partName = "ResponseValorados")
	@RequestWrapper(
		localName = "requestValorados",
		targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
		className = "cl.bluex.digexpress.bean.request.RequestValorados")
	ResponseValorados obtieneValorados(
			@WebParam(
				name = "codigoCliente",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "codigoCliente",
				header = false) long codigoCliente,
			@WebParam(
				name = "codigoTipoCliente",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "codigoTipoCliente",
				header = false) long codigoTipoCliente,
			@WebParam(
				name = "codigoEmpresa",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "codigoEmpresa",
				header = false) long codigoEmpresa,
			@WebParam(
				name = "codigoSucursalCliente",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "codigoSucursalCliente",
				header = false) long codigoSucursalCliente,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;
	
	
	@WebMethod(
			operationName = "obtieneDatosCourier",
			action = "http://digitacionExpressWS/BXDIG002_express/obtieneDatosCourier")
		@WebResult(
			name = "responseObtieneDatosCourier",
			targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
			partName = "ResponseObtieneDatosCourier")
		@RequestWrapper(
			localName = "requestObtieneDatosCourier",
			targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
			className = "cl.bluex.digexpress.bean.request.ResponseObtieneDatosCourier")
		ResponseObtieneDatosCourier obtieneDatosCourier(
				@WebParam(
					name = "codigoRuta",
					targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
					partName = "codigoRuta",
					header = false)  long codigoRuta,
				@WebParam(
					name = "codigoEmpresa",
					targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
					partName = "codigoEmpresa",
					header = false)  long codigoEmpresa,
				@WebParam(
					name = "codigoSorter",
					targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
					partName = "codigoSorter",	
					header = false)  int codigoSorter,
				@WebParam(
					name = "Cabecera",
					targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType",
					partName = "Cabecera",
					header = true) Cabecera cabecera) throws BluexException;

	

}
