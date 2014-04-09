package cl.bluex.digfull.ws;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;

import cl.bluex.digfull.bean.EntradaObtieneTarifa;
import cl.bluex.digfull.bean.OrdenServicio;
import cl.bluex.digfull.bean.Referencia;
import cl.bluex.digfull.bean.ServicioComplementario;
import cl.bluex.digfull.bean.ServicioComplementarioDetalle;
import cl.bluex.digfull.bean.ServicioComplementarioPago;
import cl.bluex.digfull.bean.request.RequestEliminaDetalleSC;
import cl.bluex.digfull.bean.request.RequestEliminaFormaPagoSC;
import cl.bluex.digfull.bean.request.RequestEliminaReferencia;
import cl.bluex.digfull.bean.request.RequestEliminaServicioComplementario;
import cl.bluex.digfull.bean.request.RequestInsertaApendices;
import cl.bluex.digfull.bean.request.RequestInsertaWarehouse;
import cl.bluex.digfull.bean.request.RequestObtieneDetalleSC;
import cl.bluex.digfull.bean.request.RequestObtieneFormaPagoSC;
import cl.bluex.digfull.bean.request.RequestObtieneReferencias;
import cl.bluex.digfull.bean.request.RequestObtieneServiciosComplementarios;
import cl.bluex.digfull.bean.request.RequestObtieneTraduccionServicio;
import cl.bluex.digfull.bean.request.RequestObtieneTraduccionServicioReal;
import cl.bluex.digfull.bean.request.RequestValidaIndicadorUnidades;
import cl.bluex.digfull.bean.response.ResponseEspecieValoradaFull;
import cl.bluex.digfull.bean.response.ResponseFormaPagoSC;
import cl.bluex.digfull.bean.response.ResponseIndicador;
import cl.bluex.digfull.bean.response.ResponseObtieneDatosCliente;
import cl.bluex.digfull.bean.response.ResponseObtieneOrdenServicio;
import cl.bluex.digfull.bean.response.ResponseObtieneParametroGeneral;
import cl.bluex.digfull.bean.response.ResponseObtieneTarifa;
import cl.bluex.digfull.bean.response.ResponseReferencia;
import cl.bluex.digfull.bean.response.ResponseServicioComplementarioDetalle;
import cl.bluex.digfull.bean.response.ResponseServiciosComplementarios;
import cl.bluex.digfull.bean.response.ResponseTraduccionServicio;
import cl.bluex.digfull.bean.response.ResponseTraduccionServicioReal;
import cl.bluex.digfull.bean.response.ResponseValidaIndicadorPtoEntrega;
import cl.bluex.digfull.bean.response.ResponseValidaTipoCliente;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

/**
 * Interfaz de servicio Digitacion Full.
 * 
 * @author Edgardo Herrera
 * 
 */
@WebService(
	targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
	name = "Digitacion")
public interface DigitacionFullService {

	/**
	 * Valida especie valorada.
	 * 
	 * @param codigoEmpresa
	 *            the codigo empresa
	 * @param codigoTipoDocumento
	 *            the codigo tipo documento
	 * @param numeroDocumento
	 *            the numero documento
	 * @param {@link Cabecera}
	 * @return {@link ResponseEspecieValorada responseEspecieValorada}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "validaEspecieValoradaFull",
		action = "http://digitacionFullWS/BXDIG003_full/validaEspecieValoradaFull")
	@WebResult(
		name = "responseEspecieValoradaFull",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		partName = "ResponseEspecieValoradaFull")
	@RequestWrapper(
		localName = "requestEspecieValoradaFull",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		className = "cl.bluex.digfull.bean.request.RequestEspecieValoradaFull")
	ResponseEspecieValoradaFull validaEspecieValoradaFull(
			@WebParam(
				name = "codigoEmpresa",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "codigoEmpresa",
				header = false) long codigoEmpresa,
			@WebParam(
				name = "codigoTipoDocumento",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "codigoTipoDocumento",
				header = false) String codigoTipoDocumento,
			@WebParam(
				name = "numeroDocumento",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "numeroDocumento",
				header = false) long numeroDocumento,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que inserta Orden de servicio.
	 * 
	 * @param ordenServicio
	 * @param cabecera
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "insertaOrdenServicio",
		action = "http://digitacionFullWS/BXDIG003_full/insertaOrdenServicio")
	@RequestWrapper(
		localName = "requestInsertaOrdenServicio",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		className = "cl.bluex.digfull.bean.request.RequestInsertaOrdenServicio")
	void insertaOrdenServicio(
			@WebParam(
				name = "ordenServicio",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "ordenServicio",
				header = false) OrdenServicio ordenServicio,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que actualiza una orden de servicio.
	 * 
	 * @param ordenServicio
	 * @param cabecera
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "actualizaOrdenServicio",
		action = "http://digitacionFullWS/BXDIG003_full/actualizaOrdenServicio")
	@RequestWrapper(
		localName = "requestActualizaOrdenServicio",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		className = "cl.bluex.digfull.bean.request.RequestActualizaOrdenServicio")
	void actualizaOrdenServicio(
			@WebParam(
				name = "ordenServicio",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "ordenServicio",
				header = false) OrdenServicio ordenServicio,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * @param codigoCliente
	 * @param sucursalCliente
	 * @param tipoCliente
	 * @param fechaCreacionOser
	 * @param cabecera
	 * @return
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "validaIndicadorPtoEntrega",
		action = "http://digitacionFullWS/BXDIG003_full/validaIndicadorPtoEntrega")
	@WebResult(
		name = "responseValidaIndicadorPtoEntrega",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		partName = "ResponseValidaIndicadorPtoEntrega")
	@RequestWrapper(
		localName = "requestValidaIndicadorPtoEntrega",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		className = "cl.bluex.digfull.bean.request.RequestValidaIndicadorPtoEntrega")
	ResponseValidaIndicadorPtoEntrega validaIndicadorPtoEntrega(
			@WebParam(
				name = "codigoCliente",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "codigoCliente",
				header = false) long codigoCliente,
			@WebParam(
				name = "sucursalCliente",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "sucursalCliente",
				header = false) long sucursalCliente,
			@WebParam(
				name = "tipoCliente",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "tipoCliente",
				header = false) long tipoCliente,
			@WebParam(
				name = "fechaCreacionOser",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "fechaCreacionOser",
				header = false) Date fechaCreacionOser,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * @param codigoCliente
	 * @param sucursalCliente
	 * @param tipoCliente
	 * @param codigoEmpresa
	 * @param cabecera
	 * @return
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "validaTipoCliente",
		action = "http://digitacionFullWS/BXDIG003_full/validaTipoCliente")
	@WebResult(
		name = "responseValidaTipoCliente",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		partName = "ResponseValidaTipoCliente")
	@RequestWrapper(
		localName = "requestValidaTipoCliente",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		className = "cl.bluex.digfull.bean.request.RequestValidaTipoCliente")
	ResponseValidaTipoCliente validaTipoCliente(
			@WebParam(
				name = "codigoCliente",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "codigoCliente",
				header = false) long codigoCliente,
			@WebParam(
				name = "sucursalCliente",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "sucursalCliente",
				header = false) long sucursalCliente,
			@WebParam(
				name = "tipoCliente",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "tipoCliente",
				header = false) long tipoCliente,
			@WebParam(
				name = "codigoEmpresa",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "codigoEmpresa",
				header = false) long codigoEmpresa,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * @param codigoCliente
	 * @param sucursalCliente
	 * @param tipoCliente
	 * @param codigoEmpresa
	 * @param cabecera
	 * @return
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneDatosCliente",
		action = "http://digitacionFullWS/BXDIG003_full/obtieneDatosCliente")
	@WebResult(
		name = "responseObtieneDatosCliente",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		partName = "ResponseObtieneDatosCliente")
	@RequestWrapper(
		localName = "requestObtieneDatosCliente",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		className = "cl.bluex.digfull.bean.request.RequestObtieneDatosCliente")
	ResponseObtieneDatosCliente obtieneDatosCliente(
			@WebParam(
				name = "codigoCliente",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "codigoCliente",
				header = false) long codigoCliente,
			@WebParam(
				name = "sucursalCliente",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "sucursalCliente",
				header = false) long sucursalCliente,
			@WebParam(
				name = "tipoCliente",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "tipoCliente",
				header = false) long tipoCliente,
			@WebParam(
				name = "codigoEmpresa",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "codigoEmpresa",
				header = false) long codigoEmpresa,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * @param referencia
	 * @param cabecera
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "insertaReferencia",
		action = "http://digitacionFullWS/BXDIG003_full/insertaReferencia")
	@RequestWrapper(
		localName = "requestInsertaReferencia",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		className = "cl.bluex.digfull.bean.request.RequestInsertaReferencia")
	void insertaReferencia(
			@WebParam(
				name = "referencia",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "referencia",
				header = false) Referencia referencia,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * @param servicioComplementario
	 * @param cabecera
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "insertaServicioComplementario",
		action = "http://digitacionFullWS/BXDIG003_full/insertaServicioComplementario")
	@RequestWrapper(
		localName = "requestInsertaServicioComplementario",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		className = "cl.bluex.digfull.bean.request.RequestInsertaServicioComplementario")
	void insertaServicioComplementario(
			@WebParam(
				name = "servicioComplementario",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "servicioComplementario",
				header = false) ServicioComplementario servicioComplementario,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * @param servicioComplementarioDetalle
	 * @param cabecera
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "insertaDetalleSC",
		action = "http://digitacionFullWS/BXDIG003_full/insertaDetalleSC")
	@RequestWrapper(
		localName = "requestInsertaDetalleSC",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		className = "cl.bluex.digfull.bean.request.RequestDetalleSC")
	void insertaDetalleSC(
			@WebParam(
				name = "servicioComplementarioDetalle",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "servicioComplementarioDetalle",
				header = false) ServicioComplementarioDetalle servicioComplementarioDetalle,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * @param servicioComplementarioDetalle
	 * @param cabecera
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "actualizaDetalleSC",
		action = "http://digitacionFullWS/BXDIG003_full/actualizaDetalleSC")
	@RequestWrapper(
		localName = "requestActualizaDetalleSC",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		className = "cl.bluex.digfull.bean.request.RequestDetalleSC")
	void actualizaDetalleSC(
			@WebParam(
				name = "servicioComplementarioDetalle",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "servicioComplementarioDetalle",
				header = false) ServicioComplementarioDetalle servicioComplementarioDetalle,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * @param servicioComplementarioPago
	 * @param cabecera
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "insertaFormaPagoSC",
		action = "http://digitacionFullWS/BXDIG003_full/insertaFormaPagoSC")
	@RequestWrapper(
		localName = "requestInsertaFormaPagoSC",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		className = "cl.bluex.digfull.bean.request.RequestFormaPagoSC")
	void insertaFormaPagoSC(
			@WebParam(
				name = "servicioComplementarioPago",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "servicioComplementarioPago",
				header = false) ServicioComplementarioPago servicioComplementarioPago,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * @param servicioComplementarioPago
	 * @param cabecera
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "actualizaFormaPagoSC",
		action = "http://digitacionFullWS/BXDIG003_full/actualizaFormaPagoSC")
	@RequestWrapper(
		localName = "requestActualizaFormaPagoSC",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		className = "cl.bluex.digfull.bean.request.RequestFormaPagoSC")
	void actualizaFormaPagoSC(
			@WebParam(
				name = "servicioComplementarioPago",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "servicioComplementarioPago",
				header = false) ServicioComplementarioPago servicioComplementarioPago,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Obtiene parametro general.
	 * 
	 * @param idParametro
	 *            the id parametro
	 * @param nombreCampo
	 *            the nombre campo
	 * @param {@link Cabecera}
	 * @return {@link ResponseObtieneParametroGeneral
	 *         responseObtieneParametroGeneral}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneParametroGeneral",
		action = "http://digitacionFullWS/BXDIG003_full/obtieneParametroGeneral")
	@WebResult(
		name = "responseObtieneParametroGeneral",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		partName = "ResponseObtieneParametroGeneral")
	@RequestWrapper(
		localName = "requestObtieneParametroGeneral",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		className = "cl.bluex.digfull.bean.request.RequestObtieneParametroGeneral")
	ResponseObtieneParametroGeneral obtieneParametroGeneral(
			@WebParam(
				name = "idParametro",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "idParametro",
				header = false) String idParametro,
			@WebParam(
				name = "nombreCampo",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "nombreCampo",
				header = false) String nombreCampo,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * @param {@link EntradaObtieneTarifa}
	 * @param {@link Cabecera}
	 * @return {@link ResponseObtieneTarifa}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneTarifa",
		action = "http://digitacionFullWS/BXDIG003_full/obtieneTarifa")
	@WebResult(
		name = "responseObtieneTarifa",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		partName = "ResponseObtieneTarifa")
	@RequestWrapper(
		localName = "requestObtieneTarifa",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		className = "cl.bluex.digfull.bean.request.RequestObtieneTarifa")
	ResponseObtieneTarifa obtieneTarifa(
			@WebParam(
				name = "entradaObtieneTarifa",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "entradaObtieneTarifa",
				header = false) EntradaObtieneTarifa entradaObtieneTarifa,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * @param {@link OrdenServicio}
	 * @param {@link Cabecera}
	 * @return {@link ResponseObtieneOrdenServicio}
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneOrdenServicio",
		action = "http://digitacionFullWS/BXDIG003_full/obtieneOrdenServicio")
	@WebResult(
		name = "responseObtieneOrdenServicio",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		partName = "ResponseObtieneOrdenServicio")
	@RequestWrapper(
		localName = "requestObtieneOrdenServicio",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		className = "cl.bluex.digfull.bean.request.RequestObtieneOrdenServicio")
	ResponseObtieneOrdenServicio obtieneOrdenServicio(
			@WebParam(
				name = "codigoEmpresa",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "codigoEmpresa",
				header = false) long codigoEmpresa,
			@WebParam(
				name = "codigoTipoDocumento",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "codigoTipoDocumento",
				header = false) String codigoTipoDocumento,
			@WebParam(
				name = "numeroDocumento",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "numeroDocumento",
				header = false) long numeroDocumento,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que obtiene una lista de servicios complementarios.
	 * 
	 * @param requestObtieneServiciosComplementarios
	 * @param cabecera
	 * @return
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneServiciosComplementarios",
		action = "http://digitacionFullWS/BXDIG003_full/obtieneServiciosComplementarios")
	@WebResult(
		name = "responseServiciosComplementarios",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		partName = "ResponseServiciosComplementarios")
	ResponseServiciosComplementarios obtieneServiciosComplementarios(
			@WebParam(
				name = "requestObtieneServiciosComplementarios",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "requestObtieneServiciosComplementarios",
				header = false) RequestObtieneServiciosComplementarios requestObtieneServiciosComplementarios,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que obtiene el detalle del servicio complementario.
	 * 
	 * @param requestObtieneDetalleSC
	 * @param cabecera
	 * @return
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneDetalleSC",
		action = "http://digitacionFullWS/BXDIG003_full/obtieneDetalleSC")
	@WebResult(
		name = "responseServicioComplementarioDetalle",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		partName = "ResponseServicioComplementarioDetalle")
	ResponseServicioComplementarioDetalle obtieneDetalleSC(
			@WebParam(
				name = "requestObtieneDetalleSC",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "requestObtieneDetalleSC",
				header = false) RequestObtieneDetalleSC requestObtieneDetalleSC,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que obtiene una lista de Formas de pagos de servicios
	 * complementarios.
	 * 
	 * @param requestObtieneFormaPagoSC
	 * @param cabecera
	 * @return
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneFormaPagoSC",
		action = "http://digitacionFullWS/BXDIG003_full/obtieneFormaPagoSC")
	@WebResult(
		name = "responseFormaPagoSC",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		partName = "ResponseFormaPagoSC")
	ResponseFormaPagoSC obtieneFormaPagoSC(
			@WebParam(
				name = "requestObtieneFormaPagoSC",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "requestObtieneFormaPagoSC",
				header = false) RequestObtieneFormaPagoSC requestObtieneFormaPagoSC,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que obtiene una lista de referencias.
	 * 
	 * @param requestObtieneReferencias
	 * @param cabecera
	 * @return
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneReferencias",
		action = "http://digitacionFullWS/BXDIG003_full/obtieneReferencias")
	@WebResult(
		name = "responseReferencia",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		partName = "ResponseReferencia")
	ResponseReferencia obtieneReferencias(
			@WebParam(
				name = "requestObtieneReferencias",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "requestObtieneReferencias",
				header = false) RequestObtieneReferencias requestObtieneReferencias,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que elimina un servicio complementario.
	 * 
	 * @param requestEliminaServicioComplementario
	 * @param cabecera
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "eliminaServicioComplementario",
		action = "http://digitacionFullWS/BXDIG003_full/eliminaServicioComplementario")
	void eliminaServicioComplementario(
			@WebParam(
				name = "requestEliminaServicioComplementario",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "requestEliminaServicioComplementario",
				header = false) RequestEliminaServicioComplementario requestEliminaServicioComplementario,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que elimina una referencia.
	 * 
	 * @param requestEliminaReferencia
	 * @param cabecera
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "eliminaReferencia",
		action = "http://digitacionFullWS/BXDIG003_full/eliminaReferencia")
	void eliminaReferencia(
			@WebParam(
				name = "requestEliminaReferencia",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "requestEliminaReferencia",
				header = false) RequestEliminaReferencia requestEliminaReferencia,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que elimina un detalle de servicio complementario.
	 * 
	 * @param requestEliminaDetalleSC
	 * @param cabecera
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "eliminaDetalleSC",
		action = "http://digitacionFullWS/BXDIG003_full/eliminaDetalleSC")
	void eliminaDetalleSC(
			@WebParam(
				name = "requestEliminaDetalleSC",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "requestEliminaDetalleSC",
				header = false) RequestEliminaDetalleSC requestEliminaDetalleSC,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que elimina una forma de pago de servicio complementario.
	 * 
	 * @param requestEliminaFormaPagoSC
	 * @param cabecera
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "eliminaFormaPagoSC",
		action = "http://digitacionFullWS/BXDIG003_full/eliminaFormaPagoSC")
	void eliminaFormaPagoSC(
			@WebParam(
				name = "requestEliminaFormaPagoSC",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "requestEliminaFormaPagoSC",
				header = false) RequestEliminaFormaPagoSC requestEliminaFormaPagoSC,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que obtiene la traduccion de un servicio real.
	 * 
	 * @param requestObtieneTraduccionServicioReal
	 * @param cabecera
	 * @return
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneTraduccionServicioReal",
		action = "http://digitacionFullWS/BXDIG003_full/obtieneTraduccionServicioReal")
	@WebResult(
		name = "responseTraduccionServicioReal",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		partName = "responseTraduccionServicioReal")
	ResponseTraduccionServicioReal obtieneTraduccionServicioReal(
			@WebParam(
				name = "requestObtieneTraduccionServicioReal",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "requestObtieneTraduccionServicioReal",
				header = false) RequestObtieneTraduccionServicioReal requestObtieneTraduccionServicioReal,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que obtiene la traduccion de un servicio.
	 * 
	 * @param requestObtieneTraduccionServicio
	 * @param cabecera
	 * @return
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "obtieneTraduccionServicio",
		action = "http://digitacionFullWS/BXDIG003_full/obtieneTraduccionServicio")
	@WebResult(
		name = "responseTraduccionServicio",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		partName = "responseTraduccionServicio")
	ResponseTraduccionServicio obtieneTraduccionServicio(
			@WebParam(
				name = "requestObtieneTraduccionServicio",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "requestObtieneTraduccionServicio",
				header = false) RequestObtieneTraduccionServicio requestObtieneTraduccionServicio,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que inserta un apendice.
	 * 
	 * @param requestInsertaApendices
	 * @param cabecera
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "insertaApendices",
		action = "http://digitacionFullWS/BXDIG003_full/insertaApendices")
	void insertaApendices(
			@WebParam(
				name = "requestInsertaApendices",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "requestInsertaApendices",
				header = false) RequestInsertaApendices requestInsertaApendices,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo que valida el indicador de unidades.
	 * 
	 * @param requestValidaIndicadorUnidades
	 * @param cabecera
	 * @return
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "validaIndicadorUnidades",
		action = "http://digitacionFullWS/BXDIG003_full/validaIndicadorUnidades")
	@WebResult(
		name = "responseIndicador",
		targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
		partName = "responseIndicador")
	ResponseIndicador validaIndicadorUnidades(
			@WebParam(
				name = "requestValidaIndicadorUnidades",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "requestValidaIndicadorUnidades",
				header = false) RequestValidaIndicadorUnidades requestValidaIndicadorUnidades,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

	/**
	 * Metodo encargado de insertar warehouse.
	 * 
	 * @param request
	 *            el objeto de peticion del servicio
	 * @param cabecera
	 * @throws BluexException
	 */
	@WebMethod(
		operationName = "insertaWarehouse",
		action = "http://digitacionFullWS/BXDIG003_full/insertaWarehouse")
	void insertaWarehouse(
			@WebParam(
				name = "requestInsertaWarehouse",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "requestInsertaWarehouse",
				header = false) RequestInsertaWarehouse request,
			@WebParam(
				name = "Cabecera",
				targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType",
				partName = "Cabecera",
				header = true) Cabecera cabecera) throws BluexException;

}
