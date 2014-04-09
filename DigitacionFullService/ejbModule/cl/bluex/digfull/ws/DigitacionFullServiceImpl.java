package cl.bluex.digfull.ws;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.jws.WebService;

import org.jboss.ws.api.annotation.WebContext;
import org.apache.log4j.Logger;

import cl.bluex.digfull.DigitacionFullDao;
import cl.bluex.digfull.bean.DatosCliente;
import cl.bluex.digfull.bean.EntradaObtieneTarifa;
import cl.bluex.digfull.bean.EspecieValorada;
import cl.bluex.digfull.bean.OrdenServicio;
import cl.bluex.digfull.bean.Referencia;
import cl.bluex.digfull.bean.ServicioComplementario;
import cl.bluex.digfull.bean.ServicioComplementarioDetalle;
import cl.bluex.digfull.bean.ServicioComplementarioPago;
import cl.bluex.digfull.bean.TipoCliente;
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
import cl.bluex.digfull.factory.DaoFactory;
import cl.bluex.digfull.factory.DigitacionFullDaoFactory;
import cl.bluex.digfull.tool.Mappers;
import cl.bluex.digfull.ws.session.SessionInterceptor;
import cl.bluex.digmodel.to.DatosClienteTO;
import cl.bluex.digmodel.to.EntradaObtieneTarifaTO;
import cl.bluex.digmodel.to.EspecieValoradaTO;
import cl.bluex.digmodel.to.OrdenServicioTO;
import cl.bluex.digmodel.to.ReferenciaTO;
import cl.bluex.digmodel.to.ServicioComplementarioDetalleTO;
import cl.bluex.digmodel.to.ServicioComplementarioPagoTO;
import cl.bluex.digmodel.to.ServicioComplementarioTO;
import cl.bluex.digmodel.to.TarifaTO;
import cl.bluex.digmodel.to.TipoClienteTO;
import cl.bluex.digmodel.to.WareHouseTO;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

/**
 * Clase concreta servicio DigitacionFull.
 * 
 * @author Edgardo Herrera
 * 
 */
@WebService(
	endpointInterface = "cl.bluex.digfull.ws.DigitacionFullService",
	name = "BXDIG003_full",
	portName = "BXDIG003_fullPort",
	serviceName = "DigitacionFullService",
	targetNamespace = "http://digitacionFullWS/BXDIG003_full/DigitacionPortType")
@Remote(DigitacionFullService.class)
@Stateless
@WebContext(
	contextRoot = "/digitacionFullWS",
	urlPattern = "/BXDIG003_full")
@Interceptors(SessionInterceptor.class)
public class DigitacionFullServiceImpl implements DigitacionFullService {

	private static final String NOMBRE_CAMPO_ES_CAMPO_OBLIGATORIO = "nombreCampo es campo obligatorio";
	private static final String ID_PARAMETRO_ES_CAMPO_OBLIGATORIO = "idParametro es campo obligatorio";
	private static final String TIPO_MEDIDA_ES_CAMPO_OBLIGATORIO = "tipoMedida es campo obligatorio";
	private static final String TIPO_PAGO_OTROS_ES_CAMPO_OBLIGATORIO = "tipoPagoOtros es campo obligatorio";
	private static final String TIPO_PAGO_ES_CAMPO_OBLIGATORIO = "tipoPago es campo obligatorio";
	private static final String TIPO_CLASE_TARIFA_ES_CAMPO_OBLIGATORIO = "tipoClaseTarifa es campo obligatorio";
	private static final String EEVV_NMR_ID_ES_CAMPO_OBLIGATORIO = "eevvNmrId es campo obligatorio";
	private static final String NRO_ERROR = "-1";
	
	private static final Logger LOGGER = Logger.getLogger(DigitacionFullServiceImpl.class);
	
	/**
	 * Crea instancia de {@link DigitacionFullServiceImpl}.
	 * 
	 */
	public DigitacionFullServiceImpl() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.digfull.ws.DigitacionFullService#validaEspecieValoradaFull(long,
	 * java.lang.String, long, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseEspecieValoradaFull validaEspecieValoradaFull(
			final long codigoEmpresa, 
			final String codigoTipoDocumento,
			final long numeroDocumento, 
			final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("inicio validaEspecieValoradaFull");
		
		ResponseEspecieValoradaFull response;
		
		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		try {
			LOGGER.info("Inicio llamada validaEspecieValoradaFull");
			
			final EspecieValoradaTO especieValoradaTO = digitacionFullDao
					.validaEspecieValoradaFull(
							codigoEmpresa,
							codigoTipoDocumento, 
							numeroDocumento);
			LOGGER.info("Fin llamada validaEspecieValoradaFull");
			final EspecieValorada especie = new EspecieValorada(especieValoradaTO);
			
			response = new ResponseEspecieValoradaFull(especie);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin validaEspecieValoradaFull");
		return response;
	}

	/* (non-Javadoc)
	 * @see cl.bluex.digfull.ws.DigitacionFullService#insertaOrdenServicio(
	 * cl.bluex.digfull.bean.OrdenServicio, 
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public void insertaOrdenServicio(final OrdenServicio ordenServicio,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio insertaOrdenServicio");
		
		validaOrdenServicio(ordenServicio);

		final OrdenServicioTO ordenServicioTO = Mappers.mapperTo(ordenServicio);
		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		try {
			LOGGER.info("Inicio llamada insertaOrdenServicio");
			digitacionFullDao
				.insertaOrdenServicio(
					ordenServicioTO);
			LOGGER.info("Fin llamada insertaOrdenServicio");
		} finally {
			daoFactory.close();
		}
		LOGGER.info("Fin insertaOrdenServicio");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.digfull.ws.DigitacionFullService#actualizaOrdenServicio(cl.bluex
	 * .digfull.bean.OrdenServicio, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public void actualizaOrdenServicio(final OrdenServicio ordenServicio,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio actualizaOrdenServicio");
		
		validaOrdenServicio(ordenServicio);

		final OrdenServicioTO ordenServicioTO = Mappers.mapperTo(ordenServicio);

		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		try {
			LOGGER.info("Inicio llamada actualizaOrdenServicio");
			digitacionFullDao
				.actualizaOrdenServicio(
					ordenServicioTO);
			LOGGER.info("Fin llamada actualizaOrdenServicio");
		} finally {
			daoFactory.close();
		}
		LOGGER.info("Fin actualizaOrdenServicio");
	}

	private void validaOrdenServicio(final OrdenServicio ordenServicio)
			throws BluexException {
		if (ordenServicio.getEevvNmrId() == 0) {
			throw new BluexException(NRO_ERROR,
					EEVV_NMR_ID_ES_CAMPO_OBLIGATORIO);
		}
		if (ordenServicio.getCodigoTipoClaseTarifa() == null) {
			throw new BluexException(NRO_ERROR,
					TIPO_CLASE_TARIFA_ES_CAMPO_OBLIGATORIO);
		}
		if (ordenServicio.getTipoPago() == null) {
			throw new BluexException(NRO_ERROR, TIPO_PAGO_ES_CAMPO_OBLIGATORIO);
		}
		if (ordenServicio.getTipoPagoOtros() == null) {
			throw new BluexException(NRO_ERROR,
					TIPO_PAGO_OTROS_ES_CAMPO_OBLIGATORIO);
		}
		if (ordenServicio.getTipoMedida() == null) {
			throw new BluexException(NRO_ERROR,
					TIPO_MEDIDA_ES_CAMPO_OBLIGATORIO);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.digfull.ws.DigitacionFullService#validaIndicadorPtoEntrega(long,
	 * long, long, java.util.Date, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseValidaIndicadorPtoEntrega validaIndicadorPtoEntrega(
			final long codigoCliente, 
			final long sucursalCliente,
			final long tipoCliente, 
			final Date fechaCreacionOser,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio validaIndicadorPtoEntrega");

		ResponseValidaIndicadorPtoEntrega response;
		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		try {
			LOGGER.info("Inicio llamada validaIndicadorPtoEntrega");
			final String indicador =digitacionFullDao
					.validaIndicadorPtoEntrega(
							codigoCliente, 
							sucursalCliente,
							tipoCliente, 
							fechaCreacionOser);
			LOGGER.info("Fin llamada validaIndicadorPtoEntrega");
			response = new ResponseValidaIndicadorPtoEntrega(indicador);
		} finally {
			daoFactory.close();
		}
		LOGGER.info("Fin validaIndicadorPtoEntrega");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.ws.DigitacionFullService#validaTipoCliente(long,
	 * long, long, long, cl.bluex.digitacion.head.Cabecera)
	 */
	@Override
	public ResponseValidaTipoCliente validaTipoCliente(
			final long codigoCliente, 
			final long sucursalCliente,
			final long tipoCliente, 
			final long codigoEmpresa,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("Inicio validaTipoCliente");
		
		ResponseValidaTipoCliente response;
		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		try {
			LOGGER.info("Inicio llamada validaTipoCliente");
			final TipoClienteTO tipoClienteTO = digitacionFullDao
					.validaTipoCliente(
							codigoCliente, 
							sucursalCliente, 
							tipoCliente,
							codigoEmpresa);
			LOGGER.info("Fin llamada validaTipoCliente");
			response = new ResponseValidaTipoCliente(
					new TipoCliente(tipoClienteTO));
		} finally {
			daoFactory.close();
		}
		LOGGER.info("Fin validaTipoCliente");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.ws.DigitacionFullService#obtieneDatosCliente(long,
	 * long, long, long, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseObtieneDatosCliente obtieneDatosCliente(
			final long codigoCliente, 
			final long sucursalCliente,
			final long tipoCliente, 
			final long codigoEmpresa,
			final Cabecera cabecera) 
			throws BluexException {
		LOGGER.info("Inicio obtieneDatosCliente");
		
		ResponseObtieneDatosCliente response;
		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		try {
			LOGGER.info("Inicio llamada obtieneDatosCliente");
			final DatosClienteTO to = digitacionFullDao
					.obtieneDatosCliente(
							codigoCliente, 
							sucursalCliente,
							tipoCliente, 
							codigoEmpresa);
			LOGGER.info("Fin llamada obtieneDatosCliente");
			response = new ResponseObtieneDatosCliente(new DatosCliente(to));
		} finally {
			daoFactory.close();
		}
		LOGGER.info("Fin obtieneDatosCliente");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.ws.DigitacionFullService#insertaReferencia(
	 * cl.bluex.digitacion.bean.Referencia, cl.bluex.digitacion.head.Cabecera)
	 */
	@Override
	public void insertaReferencia(final Referencia referencia,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("Inicio insertaReferencia");
		
		final ReferenciaTO to = Mappers.mapperTO(referencia);
		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		try {
			LOGGER.info("Inicio llamada insertaReferencia");
			digitacionFullDao
				.insertaReferencia(to);
			LOGGER.info("Fin llamada insertaReferencia");
		} finally {
			daoFactory.close();
		}
		LOGGER.info("Fin insertaReferencia");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.digfull.ws.DigitacionFullService#insertaServicioComplementario(
	 * cl.bluex.digitacion.bean.ServicioComplementario,
	 * cl.bluex.digitacion.head.Cabecera)
	 */
	@Override
	public void insertaServicioComplementario(
			final ServicioComplementario servicioComplementario,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("Inicio insertaServicioComplementario");
		
		final ServicioComplementarioTO to = Mappers
				.mapperTo(servicioComplementario);
		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		try {
			LOGGER.info("Inicio llamada insertaServicioComplementario");
			digitacionFullDao
					.insertaServicioComplementario(to);
			LOGGER.info("Fin llamada insertaServicioComplementario");
		} finally {
			daoFactory.close();
		}
		LOGGER.info("Fin insertaServicioComplementario");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.ws.DigitacionFullService#insertaDetalleSC(
	 * cl.bluex.digitacion.bean.ServicioComplementarioDetalle,
	 * cl.bluex.digitacion.head.Cabecera)
	 */
	@Override
	public void insertaDetalleSC(
			final ServicioComplementarioDetalle servicioComplementarioDetalle,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("Inicio insertaDetalleSC");
		
		final ServicioComplementarioDetalleTO to = Mappers
				.mapperTo(servicioComplementarioDetalle);
		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		try {
			LOGGER.info("Inicio llamada insertaDetalleSC");
			digitacionFullDao
				.insertaDetalleSC(to);
			LOGGER.info("Fin llamada insertaDetalleSC");
		} finally {
			daoFactory.close();
		}
		LOGGER.info("Fin insertaDetalleSC");
	}

	/* (non-Javadoc)
	 * @see cl.bluex.digfullprueba.ws.DigitacionFullPruebaService#actualizaDetalleSC(
	 * cl.bluex.digfullprueba.bean.ServicioComplementarioDetalle, 
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public void actualizaDetalleSC(
			final ServicioComplementarioDetalle servicioComplementarioDetalle,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("Inicio actualizaDetalleSC");
		
		final ServicioComplementarioDetalleTO to = Mappers
				.mapperTo(servicioComplementarioDetalle);

		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		try {
			LOGGER.info("Inicio llamada actualizaDetalleSC");
			digitacionFullDao.actualizaDetalleSC(to);
			LOGGER.info("Fin llamada actualizaDetalleSC");
		} finally {
			daoFactory.close();
		}
		LOGGER.info("Fin actualizaDetalleSC");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.ws.DigitacionFullService#insertaFormaPagoSC(
	 * cl.bluex.digitacion.bean.ServicioComplementarioPago,
	 * cl.bluex.digitacion.head.Cabecera)
	 */
	@Override
	public void insertaFormaPagoSC(
			final ServicioComplementarioPago servicioComplementarioPago,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("Inicio insertaFormaPagoSC");
		
		if (servicioComplementarioPago.getFechaPago() == null) {
			LOGGER.info("la fecha es null");
		} else {
			LOGGER.info("fecha pago: " + servicioComplementarioPago.getFechaPago());
		}
		final ServicioComplementarioPagoTO to = Mappers
				.mapperTo(servicioComplementarioPago);
		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		try {
			LOGGER.info("Inicio llamada insertaFormaPagoSC");
			digitacionFullDao
				.insertaFormaPagoSC(to);
			LOGGER.info("Fin llamada insertaFormaPagoSC");
		} finally {
			daoFactory.close();
		}
		LOGGER.info("Fin insertaFormaPagoSC");
	}

	/* (non-Javadoc)
	 * @see cl.bluex.digfull.ws.DigitacionFullService#actualizaFormaPagoSC(
	 * cl.bluex.digfull.bean.ServicioComplementarioPago, 
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public void actualizaFormaPagoSC(
			final ServicioComplementarioPago servicioComplementarioPago,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("Inicio actualizaFormaPagoSC");
		
		final ServicioComplementarioPagoTO to = Mappers
				.mapperTo(servicioComplementarioPago);
		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		try {
			LOGGER.info("Inicio llamada actualizaFormaPagoSC");
			digitacionFullDao
				.actualizaFormaPagoSC(to);
			LOGGER.info("Fin llamada actualizaFormaPagoSC");
		} finally {
			daoFactory.close();
		}
		LOGGER.info("Fin actualizaFormaPagoSC");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.digitacion.ws.DigitacionService#obtieneParametroGeneral(java
	 * .lang.String, java.lang.String, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseObtieneParametroGeneral obtieneParametroGeneral(
			final String idParametro, final String nombreCampo,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("Inicio obtieneParametroGeneral");
		
		if (idParametro == null) {
			throw new BluexException(NRO_ERROR,
					ID_PARAMETRO_ES_CAMPO_OBLIGATORIO);
		}
		if (nombreCampo == null) {
			throw new BluexException(NRO_ERROR,
					NOMBRE_CAMPO_ES_CAMPO_OBLIGATORIO);
		}

		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		ResponseObtieneParametroGeneral response;
		try {
			LOGGER.info("Inicio llamada obtieneParametroGeneral");
			final String valor = digitacionFullDao
					.obtieneParametroGeneral(
							idParametro, 
							nombreCampo);
			LOGGER.info("Fin llamada obtieneParametroGeneral");
			response = new ResponseObtieneParametroGeneral(valor);
		} finally {
			daoFactory.close();
		}
		LOGGER.info("Fin obtieneParametroGeneral");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digitacion.ws.DigitacionService#obtieneTarifa(
	 * cl.bluex.digitacion.bean.EntradaObtieneTarifa,
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseObtieneTarifa obtieneTarifa(
			final EntradaObtieneTarifa entradaObtieneTarifa,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("Inicio obtieneTarifa");
		
		final EntradaObtieneTarifaTO entradaTO = Mappers
				.mapperTo(entradaObtieneTarifa);

		ResponseObtieneTarifa response;
		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		try {
			LOGGER.info("Inicio llamada obtieneTarifa");
			final TarifaTO tarifaTO = digitacionFullDao
					.obtieneTarifa(entradaTO);
			LOGGER.info("Fin llamada obtieneTarifa");
			response = new ResponseObtieneTarifa(Mappers.mapperTo(tarifaTO));
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin obtieneTarifa");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.ws.DigitacionFullService#obtieneOrdenServicio(long,
	 * java.lang.String, long, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseObtieneOrdenServicio obtieneOrdenServicio(
			final long codigoEmpresa, final String codigoTipoDocumento,
			final long numeroDocumento, final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("Inicio obtieneOrdenServicio");
		
		ResponseObtieneOrdenServicio response;
		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		try {
			LOGGER.info("Inicio llamada Obtener Orden de servicio");
			final OrdenServicioTO to = digitacionFullDao
					.obtieneOrdenServicio(
							codigoEmpresa, 
							codigoTipoDocumento,
							numeroDocumento);
			LOGGER.info("Fin Llamada Obtener Orden de servicio ");
			response = new ResponseObtieneOrdenServicio(new OrdenServicio(to));
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin obtieneOrdenServicio");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.digfull.ws.DigitacionFullService#obtieneServiciosComplementarios
	 * ( cl.bluex.digfull.bean.request.RequestObtieneServiciosComplementarios,
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseServiciosComplementarios obtieneServiciosComplementarios(
			final RequestObtieneServiciosComplementarios request,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("Inicio obtieneServiciosComplementarios");
		
		ResponseServiciosComplementarios responseServiciosComplementarios;
		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		try {
			LOGGER.info("Inicio llamada obtieneServiciosComplementarios");
			final List<ServicioComplementarioTO> servicios = digitacionFullDao
					.obtieneServiciosComplementarios(request.getEevvNmrId());
			responseServiciosComplementarios = new ResponseServiciosComplementarios(
					Mappers.mapperToSC(servicios));
			LOGGER.info("Fin llamada obtieneServiciosComplementarios");
		} finally {
			daoFactory.close();
		}
		LOGGER.info("Fin obtieneServiciosComplementarios");
		return responseServiciosComplementarios;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.ws.DigitacionFullService#obtieneDetalleSC(
	 * cl.bluex.digfull.bean.request.RequestObtieneDetalleSC,
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseServicioComplementarioDetalle obtieneDetalleSC(
			final RequestObtieneDetalleSC request, final Cabecera cabecera)
			throws BluexException {
		ResponseServicioComplementarioDetalle responseServicioComplementarioDetalle;
		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		try {
			LOGGER.info("Inicio llamada obtieneDetalleSC");
			final List<ServicioComplementarioDetalleTO> detallesTO = digitacionFullDao
					.obtieneDetalleSC(
							request.getEevvNmrId(),
							request.getCodigoServicio());
			LOGGER.info("Fin llamada obtieneDetalleSC");
			responseServicioComplementarioDetalle = new ResponseServicioComplementarioDetalle(
					Mappers.mapperToDetalles(detallesTO));
		} finally {
			daoFactory.close();
		}
		return responseServicioComplementarioDetalle;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.ws.DigitacionFullService#obtieneFormaPagoSC(
	 * cl.bluex.digfull.bean.request.RequestObtieneFormaPagoSC,
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseFormaPagoSC obtieneFormaPagoSC(
			final RequestObtieneFormaPagoSC request, final Cabecera cabecera)
			throws BluexException {
		
		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		ResponseFormaPagoSC responseFormaPagoSC;
		try {
			LOGGER.info("Inicio llamada obtieneFormaPagoSC");
			final List<ServicioComplementarioPagoTO> pagosTO = digitacionFullDao
					.obtieneFormaPagoSC(
							request.getEevvNmrId(),
							request.getCodigoServicio());
			LOGGER.info("Fin llamada obtieneFormaPagoSC");
			responseFormaPagoSC = new ResponseFormaPagoSC(
					Mappers.mapperToPagos(pagosTO));
		} finally {
			daoFactory.close();
		}
		return responseFormaPagoSC;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.ws.DigitacionFullService#obtieneReferencias(
	 * cl.bluex.digfull.bean.request.RequestObtieneReferencias,
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseReferencia obtieneReferencias(
			final RequestObtieneReferencias request, 
			final Cabecera cabecera)
			throws BluexException {
		
		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		ResponseReferencia responseReferencia;
		try {
			LOGGER.info("inicio llamada obtieneReferencias");
			final List<ReferenciaTO> referenciasTO = digitacionFullDao
					.obtieneReferencias(
							request.getEevvNmrId());
			LOGGER.info("Fin llamada obtieneReferencias");
			
			responseReferencia = new ResponseReferencia(Mappers.mapperToReferencias(referenciasTO));
		} finally {
			daoFactory.close();
		}
		return responseReferencia;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.digfull.ws.DigitacionFullService#eliminaServicioComplementario(
	 * cl.bluex.digfull.bean.request.RequestEliminaServicioComplementario,
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public void eliminaServicioComplementario(
			final RequestEliminaServicioComplementario request,
			final Cabecera cabecera) throws BluexException {
		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		try {
			LOGGER.info("Inicio llamada eliminaServicioComplementario");
			digitacionFullDao
					.eliminaServicioComplementario(
							request.getEevvNmrId(),
							request.getCodigoServicio());
			LOGGER.info("Fin llamada eliminaServicioComplementario");
		} finally {
			daoFactory.close();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.ws.DigitacionFullService#eliminaReferencia(
	 * cl.bluex.digfull.bean.request.RequestEliminaReferencia,
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public void eliminaReferencia(final RequestEliminaReferencia request,
			final Cabecera cabecera) throws BluexException {
		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		try {
			LOGGER.info("Inicio llamada eliminaReferencia");
			digitacionFullDao
				.eliminaReferencia(
					request.getEevvNmrId(), 
					request.getCodigoTipoReferencia());
			LOGGER.info("Fin llamada eliminaReferencia");
		} finally {
			daoFactory.close();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.digfull.ws.DigitacionFullService#eliminaDetalleSC(cl.bluex.digfull
	 * .bean.request.RequestEliminaDetalleSC, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public void eliminaDetalleSC(final RequestEliminaDetalleSC request,
			final Cabecera cabecera) throws BluexException {

		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		try {
			LOGGER.info("Inicio llamada eliminaDetalleSC");
			digitacionFullDao
				.eliminaDetalleSC(
					request.getCodigoEmpresa(), 
					request.getCodigoServicio(),
					request.getEevvNmrid());
			LOGGER.info("Fin llamada eliminaDetalleSC");
		} finally {
			daoFactory.close();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.ws.DigitacionFullService#eliminaFormaPagoSC(
	 * cl.bluex.digfull.bean.request.RequestEliminaFormaPagoSC,
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public void eliminaFormaPagoSC(final RequestEliminaFormaPagoSC request,
			final Cabecera cabecera) throws BluexException {
		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		try {
			LOGGER.info("Inicio llamada eliminaFormaPagoSC");
			digitacionFullDao
				.eliminaFormaPagoSC(
					request.getEevvNmrId(), 
					request.getCodigoServicio());
			LOGGER.info("Fin llamada eliminaFormaPagoSC");
		} finally {
			daoFactory.close();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.digfull.ws.DigitacionFullService#obtieneTraduccionServicioReal(
	 * cl.bluex.digfull.bean.request.RequestObtieneTraduccionServicioReal,
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseTraduccionServicioReal obtieneTraduccionServicioReal(
			final RequestObtieneTraduccionServicioReal request,
			final Cabecera cabecera) throws BluexException {

		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		
		ResponseTraduccionServicioReal responseTraduccionServicioReal;
		try {
			LOGGER.info("Inicio llamada obtieneTraduccionServicioReal");
			final String codigoServicioReal = digitacionFullDao
					.obtieneTraduccionServicioReal(
							request.getCodigoEmpresa(),
							request.getCodigoServicio(),
							request.getCodigoProducto(),
							request.getCodigoRegion());
			LOGGER.info("Fin llamada obtieneTraduccionServicioReal");
			responseTraduccionServicioReal = new ResponseTraduccionServicioReal(
					codigoServicioReal);
		} finally {
			daoFactory.close();
		}
		return responseTraduccionServicioReal;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.ws.DigitacionFullService#obtieneTraduccionServicio(
	 * cl.bluex.digfull.bean.request.RequestObtieneTraduccionServicio,
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseTraduccionServicio obtieneTraduccionServicio(
			final RequestObtieneTraduccionServicio request,
			final Cabecera cabecera) throws BluexException {
		
		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		
		ResponseTraduccionServicio responseTraduccionServicio;
		try {
			LOGGER.info("Inicio llamada obtieneTraduccionServicio");
			final String codigoServicio = digitacionFullDao
					.obtieneTraduccionServicio(
							request.getCodigoEmpresa(),
							request.getCodigoServicioReal(),
							request.getCodigoRegion());
			LOGGER.info("Fin llamada obtieneTraduccionServicio");
			responseTraduccionServicio = new ResponseTraduccionServicio(
					codigoServicio);
		} finally {
			daoFactory.close();
		}
		return responseTraduccionServicio;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.ws.DigitacionFullService#insertaApendices(
	 * cl.bluex.digfull.bean.request.RequestInsertaApendices,
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public void insertaApendices(final RequestInsertaApendices request,
			final Cabecera cabecera) throws BluexException {
		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		try {
			LOGGER.info("Inicio llamada insertaApendices");
			digitacionFullDao
				.insertaApendices(
					request.getEevvNmrId(), 
					request.getCodigoTipoApendice(),
					request.getValor(), 
					request.getDescripcion());
			LOGGER.info("Fin llamada insertaApendices");
		} finally {
			daoFactory.close();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.ws.DigitacionFullService#validaIndicadorUnidades(
	 * cl.bluex.digfull.bean.request.RequestValidaIndicadorUnidades,
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseIndicador validaIndicadorUnidades(
			final RequestValidaIndicadorUnidades request,
			final Cabecera cabecera) throws BluexException {
		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		ResponseIndicador responseIndicador;
		try {
			LOGGER.info("Inicio llamada validaIndicadorUnidades");
			final String indicador = digitacionFullDao
					.validaIndicadorUnidades(
							request.getCodigoCliente(),
							request.getSucursalCliente(),
							request.getTipoCliente(),
							request.getFechaCreacionOser());
			LOGGER.info("Fin llamada validaIndicadorUnidades");
			responseIndicador = new ResponseIndicador(indicador);
		} finally {
			daoFactory.close();
		}
		return responseIndicador;
	}
	
	
	/* (non-Javadoc)
	 * @see cl.bluex.digfull.ws.DigitacionFullService#insertaWarehouse(cl.bluex.digfull.bean.request.RequestInsertaWrh, 
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public void insertaWarehouse(final RequestInsertaWarehouse request, 
			final Cabecera cabecera) throws BluexException {
		
		final WareHouseTO warehouseTO = Mappers.mapperTo(request);
		final DaoFactory daoFactory = DigitacionFullDaoFactory.getInstance().getDaoFactory();
		final DigitacionFullDao digitacionFullDao = daoFactory.getDigitacionFullDao();
		try {
			LOGGER.info("Inicio llamada insertaWarehouse");
			digitacionFullDao
				.insertaWarehouse(
					warehouseTO);
			LOGGER.info("Fin llamada insertaWarehouse");
		} finally {
			daoFactory.close();
		}
	}

}
