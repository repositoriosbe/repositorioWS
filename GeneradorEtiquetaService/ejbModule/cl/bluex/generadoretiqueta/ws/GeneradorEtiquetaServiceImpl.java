package cl.bluex.generadoretiqueta.ws;

import static cl.bluex.generadoretiqueta.tool.Mensaje.ERROR_CDG_00001;
import static cl.bluex.generadoretiqueta.tool.Mensaje.ERROR_CDG_00002;
import static cl.bluex.generadoretiqueta.tool.Mensaje.ERROR_MSJ_00001;
import static cl.bluex.generadoretiqueta.tool.Mensaje.ERROR_MSJ_00002;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.jws.WebService;

import org.apache.log4j.Logger;
import org.jboss.ws.api.annotation.WebContext;

import cl.bluex.generadoretiqueta.GeneradorEtiquetaDao;
import cl.bluex.generadoretiqueta.bean.CodigoBulto;
import cl.bluex.generadoretiqueta.bean.DatosImpresion;
import cl.bluex.generadoretiqueta.bean.DatosOperacionales;
import cl.bluex.generadoretiqueta.bean.DatosRespuesta;
import cl.bluex.generadoretiqueta.bean.Etiqueta;
import cl.bluex.generadoretiqueta.bean.Guia;
import cl.bluex.generadoretiqueta.bean.OrdenServicio;
import cl.bluex.generadoretiqueta.bean.request.RequestCodigoBulto;
import cl.bluex.generadoretiqueta.bean.request.RequestEntradaDatosOperacionales;
import cl.bluex.generadoretiqueta.bean.request.RequestInsertaPiezaMovimiento;
import cl.bluex.generadoretiqueta.bean.request.RequestGeneraEtiqueta;
import cl.bluex.generadoretiqueta.bean.request.RequestGeneraEtiquetaDigExpress;
import cl.bluex.generadoretiqueta.bean.request.RequestGeneraEtiquetaHub;
import cl.bluex.generadoretiqueta.bean.request.RequestGeneraEtiquetas;
import cl.bluex.generadoretiqueta.bean.request.RequestGuiasPorPieza;
import cl.bluex.generadoretiqueta.bean.request.RequestGuiasPorReferencia;
import cl.bluex.generadoretiqueta.bean.request.RequestObtieneDestino;
import cl.bluex.generadoretiqueta.bean.request.RequestObtieneGuiasPorFolio;
import cl.bluex.generadoretiqueta.bean.request.RequestObtieneOrdenesServicio;
import cl.bluex.generadoretiqueta.bean.request.RequestValidaOficinaBodega;
import cl.bluex.generadoretiqueta.bean.response.ResponseCodigoBulto;
import cl.bluex.generadoretiqueta.bean.response.ResponseDatosOperacionales;
import cl.bluex.generadoretiqueta.bean.response.ResponseDestino;
import cl.bluex.generadoretiqueta.bean.response.ResponseInsertaPiezaMovimiento;
import cl.bluex.generadoretiqueta.bean.response.ResponseEtiqueta;
import cl.bluex.generadoretiqueta.bean.response.ResponseEtiquetaHub;
import cl.bluex.generadoretiqueta.bean.response.ResponseEtiquetas;
import cl.bluex.generadoretiqueta.bean.response.ResponseGuias;
import cl.bluex.generadoretiqueta.bean.response.ResponseObtieneOrdenesServicio;
import cl.bluex.generadoretiqueta.bean.response.ResponseValidaOficinaBodega;
import cl.bluex.generadoretiqueta.factory.DaoFactory;
import cl.bluex.generadoretiqueta.factory.GeneradorEtiquetaDaoFactory;
import cl.bluex.generadoretiqueta.to.CodigoBultoTO;
import cl.bluex.generadoretiqueta.to.DatosGeneracionEtiquetaHubTO;
import cl.bluex.generadoretiqueta.to.DatosGeneracionEtiquetaTO;
import cl.bluex.generadoretiqueta.to.DatosImpresionTO;
import cl.bluex.generadoretiqueta.to.DatosOperacionalesTO;
import cl.bluex.generadoretiqueta.to.DatosRespuestaTO;
import cl.bluex.generadoretiqueta.to.DestinoTO;
import cl.bluex.generadoretiqueta.to.EntradaDatosOperacionalesTO;
import cl.bluex.generadoretiqueta.to.GuiaTO;
import cl.bluex.generadoretiqueta.to.OrdenServicioTO;
import cl.bluex.generadoretiqueta.to.ParamOrdenServicioTO;
import cl.bluex.generadoretiqueta.to.ParametroDestinoTO;
import cl.bluex.generadoretiqueta.to.ParametrosCodigoBultoTO;
import cl.bluex.generadoretiqueta.to.ParametrosGuiaPiezaTO;
import cl.bluex.generadoretiqueta.to.ParametrosGuiaTO;
import cl.bluex.generadoretiqueta.to.ParametrosReferenciaTO;
import cl.bluex.generadoretiqueta.to.PiezaMovimientoTO;
import cl.bluex.generadoretiqueta.to.TemplateTO;
import cl.bluex.generadoretiqueta.tool.Mappers;
import cl.bluex.generadoretiqueta.ws.session.SessionInterceptor;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.file.EncoderBase64;
import cl.bluex.ws.common.head.Cabecera;

/**
 * @author Edgardo Herrera
 * 
 * 
 */
@WebService(
	endpointInterface = "cl.bluex.generadoretiqueta.ws.GeneradorEtiquetaService",
	name = "BXGET001_generadorEtiqueta",
	portName = "BXGET001_generadorEtiquetaPort",
	serviceName = "GeneradorEtiquetaService",
	targetNamespace = "http://GeneradorEtiquetaWS/BXGET001_generadorEtiqueta/GeneradorEtiquetaPortType")
@Remote(GeneradorEtiquetaService.class)
@Stateless
@WebContext(
	contextRoot = "/GeneradorEtiquetaWS",
	urlPattern = "/BXGET001_generadorEtiqueta")
@Interceptors(SessionInterceptor.class)
public class GeneradorEtiquetaServiceImpl implements GeneradorEtiquetaService {
	private static final Logger LOGGER = Logger.getLogger(GeneradorEtiquetaServiceImpl.class);
	private static final String TEMPLATE_NO_ENCONTRADO = "Template no encontrado";

	/**
	 * Crea instancia de {@link GeneradorEtiquetaServiceImpl}.
	 * 
	 */
	public GeneradorEtiquetaServiceImpl() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.generadoretiqueta.ws.GeneradorEtiquetaService#obtieneDestino
	 * (java.lang.String, java.lang.String, java.lang.String, java.lang.String,
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseDestino obtieneDestino(final RequestObtieneDestino request, final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("Inicio obtieneDestino");
		
		final ResponseDestino response;
		
		final DaoFactory daoFactory = GeneradorEtiquetaDaoFactory.getInstance().getDaoFactory();
		final GeneradorEtiquetaDao generadorDao = daoFactory.getGeneradorEtiquetaDao();
		try {
			final ParametroDestinoTO parametroDestinoTO = Mappers.mapperTo(request.getParametroDestino());
			final DestinoTO to = generadorDao.obtieneDestino(parametroDestinoTO);
			response = new ResponseDestino(Mappers.mapperTo(to));
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin obtieneDestino");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.generadoretiqueta.ws.GeneradorEtiquetaService#obtieneEtiqueta(
	 * cl.bluex.generadoretiqueta.bean.DatosImpresion,
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseEtiqueta obtieneEtiqueta(
			final DatosImpresion datosImpresion, final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("Inicio obtieneEtiqueta");
		List<TemplateTO> templatesTO;
		final DatosImpresionTO datosImpresionTO;
		
		final DaoFactory daoFactory = GeneradorEtiquetaDaoFactory.getInstance().getDaoFactory();
		final GeneradorEtiquetaDao generadorDao = daoFactory.getGeneradorEtiquetaDao();
		try {
    		datosImpresionTO = Mappers.mapperTo(datosImpresion);
    		
    		templatesTO = generadorDao.obtieneTemplate(
    				datosImpresionTO.getCodigoUsuario(),
    				datosImpresionTO.getCodigoImpresora(),
    				datosImpresionTO.getCodigoFormatoImpresion(),
    				"VALORADO");
		
		} finally {
			daoFactory.close();
		}

		validaTemplate(templatesTO);
		
		final String etiqueta = reemplazarValoresTemplate(templatesTO.get(0).getContenidoTemplate(), datosImpresionTO);
		
		final byte[] encode = EncoderBase64.encode(etiqueta.toString().getBytes());
		
		LOGGER.info("Fin obtieneEtiqueta");
		return new ResponseEtiqueta(new Etiqueta(new String(encode)));
	}

	/**
	 * @param templatesTO
	 * @throws BluexException
	 */
	private void validaTemplate(final List<TemplateTO> templatesTO)
			throws BluexException {
		if (templatesTO == null || templatesTO.isEmpty()) {
			throw new BluexException(TEMPLATE_NO_ENCONTRADO);
		}
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.ws.GeneradorEtiquetaService#generaEtiquetaDigExpress(
	 * cl.bluex.generadoretiqueta.bean.request.RequestGeneraEtiquetaDigExpress, 
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseEtiquetas generaEtiquetaDigExpress(
			final RequestGeneraEtiquetaDigExpress request, 
			final Cabecera cabecera) 
			throws BluexException {
		LOGGER.info("Inicio generaEtiquetaDigExpress");
		List<TemplateTO> templatesTO;
		
		final DatosImpresionTO datosTO = Mappers.mapperTo(request);
		
		final DaoFactory daoFactory = GeneradorEtiquetaDaoFactory.getInstance().getDaoFactory();
		final GeneradorEtiquetaDao generadorDao = daoFactory.getGeneradorEtiquetaDao();
		try {
			templatesTO = generadorDao.obtieneTemplate(request.getCodigoUsuario(), 
					request.getCodigoImpresora(), 
					request.getCodigoFormatoImpresion(),
					"VOUCHER");
		} finally {
			daoFactory.close();
		}
		
		validaTemplate(templatesTO);
		
		final List<Etiqueta> etiquetas = new ArrayList<Etiqueta>();
		for (final TemplateTO templateTO : templatesTO) {
			final String etiqueta = reemplazarValoresTemplate(templateTO.getContenidoTemplate(), datosTO);
			final byte[] encode = EncoderBase64.encode(etiqueta.toString().getBytes());
			etiquetas.add(new Etiqueta(new String(encode)));
		}
		
		LOGGER.info("Fin generaEtiquetaDigExpress");
		return new ResponseEtiquetas(etiquetas);
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.ws.GeneradorEtiquetaService#generaEtiqueta(
	 * cl.bluex.generadoretiqueta.bean.request.RequestGeneraEtiqueta, 
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseEtiquetas generaEtiquetas(final RequestGeneraEtiquetas request, 
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("Inicio generaEtiquetas");
		
		DatosGeneracionEtiquetaTO datosTO;
		final List<TemplateTO> templatesTO;
		
		final DaoFactory daoFactory = GeneradorEtiquetaDaoFactory.getInstance().getDaoFactory();
		final GeneradorEtiquetaDao generadorDao = daoFactory.getGeneradorEtiquetaDao();
		try {
			datosTO = generadorDao
					.obtieneDatosImpresion(request.getEevvNmrId());
			datosTO = procesarCodigos2D(datosTO);
			templatesTO = generadorDao.obtieneTemplate(
					request.getCodigoUsuario(), request.getCodigoImpresora(),
					request.getCodigoFormatoImpresion(),
					request.getTipoFormato());
		} finally {
			daoFactory.close();
		}
		
		if (templatesTO == null || templatesTO.isEmpty()) {
			LOGGER.debug(TEMPLATE_NO_ENCONTRADO);
			throw new BluexException(TEMPLATE_NO_ENCONTRADO);
		}
		
		final List<Etiqueta> etiquetas = new ArrayList<Etiqueta>();
		for (final TemplateTO templateTO : templatesTO) {
			final String etiqueta = reemplazarValoresTemplate(templateTO.getContenidoTemplate(), datosTO);
			final byte[] encode = EncoderBase64.encode(etiqueta.toString().getBytes());
			etiquetas.add(new Etiqueta(new String(encode)));
		}
		
		LOGGER.info("Fin generaEtiquetas");
		return new ResponseEtiquetas(etiquetas);
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.ws.GeneradorEtiquetaService#generaEtiqueta(
	 * cl.bluex.generadoretiqueta.bean.request.RequestGeneraEtiqueta, 
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseEtiqueta generaEtiqueta(final RequestGeneraEtiqueta request
			, final Cabecera cabecera) throws BluexException {
		LOGGER.info("Inicio generaEtiqueta");
		
		DatosGeneracionEtiquetaTO datosTO;
		final List<TemplateTO> templatesTO;
		
		final DaoFactory daoFactory = GeneradorEtiquetaDaoFactory.getInstance().getDaoFactory();
		final GeneradorEtiquetaDao generadorDao = daoFactory.getGeneradorEtiquetaDao();
		try {
			datosTO = generadorDao
					.obtieneDatosImpresion(request.getEevvNmrId());
			datosTO = procesarCodigos2D(datosTO);
			templatesTO = generadorDao.obtieneTemplate(
					request.getCodigoUsuario(), request.getCodigoImpresora(),
					request.getCodigoFormatoImpresion(),
					request.getTipoFormato());
		} finally {
			daoFactory.close();
		}
		
		if (templatesTO == null || templatesTO.isEmpty()) {
			LOGGER.debug(TEMPLATE_NO_ENCONTRADO);
			throw new BluexException(TEMPLATE_NO_ENCONTRADO);
		}
		
		final String etiqueta = reemplazarValoresTemplate(templatesTO.get(0).getContenidoTemplate(), datosTO);
		final byte[] encode = EncoderBase64.encode(etiqueta.toString().getBytes());
		
		return new ResponseEtiqueta(new Etiqueta(new String(encode)));
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.ws.GeneradorEtiquetaService#obtieneGuiasPorEncabezado(int, int, 
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseGuias obtieneGuiasPorEncabezado(
			final int idEncabezado, 
			final Cabecera cabecera) 
			throws BluexException {
		LOGGER.info("Inicio obtieneGuiasPorEncabezado");
		
		ResponseGuias response;
		
		final DaoFactory daoFactory = GeneradorEtiquetaDaoFactory.getInstance().getDaoFactory();
		final GeneradorEtiquetaDao generadorDao = daoFactory.getGeneradorEtiquetaDao();
		try {
			final List<GuiaTO> guiasTO = generadorDao.obtieneGuiasPorEncabezado(idEncabezado);
			final List<Guia> guias = Mappers.mapperGuias(guiasTO);
			response = new ResponseGuias(guias);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin obtieneGuiasPorEncabezado");
		return response;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.ws.GeneradorEtiquetaService#obtieneGuiasPorFolio(int, int, 
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseGuias obtieneGuiasPorFolio(
			final RequestObtieneGuiasPorFolio request, 
			final Cabecera cabecera) 
			throws BluexException {
		LOGGER.info("Inicio obtieneGuiasPorFolio");
		
		ResponseGuias response;
		
		final DaoFactory daoFactory = GeneradorEtiquetaDaoFactory.getInstance().getDaoFactory();
		final GeneradorEtiquetaDao generadorDao = daoFactory.getGeneradorEtiquetaDao();
		try {
			final ParametrosGuiaTO parametrosTO = Mappers.mapperParametrosGuia(request.getParametrosGuia());
			final List<GuiaTO> guiasTO = generadorDao.obtieneGuiasPorFolio(parametrosTO);
			final List<Guia> guias = Mappers.mapperGuias(guiasTO);
			response = new ResponseGuias(guias);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin obtieneGuiasPorFolio");
		return response;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.ws.GeneradorEtiquetaService#obtieneGuiasPorReferencia(int, 
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseGuias obtieneGuiasPorReferencia(
			final RequestGuiasPorReferencia request,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("Inicio obtieneGuiasPorReferencia");
		
		final ResponseGuias response;
		
		final DaoFactory daoFactory = GeneradorEtiquetaDaoFactory.getInstance().getDaoFactory();
		final GeneradorEtiquetaDao generadorDao = daoFactory.getGeneradorEtiquetaDao();
		try {
			final ParametrosReferenciaTO parametrosTO = Mappers.mapperParametrosReferencia(request.getParametrosReferencia());
			final List<GuiaTO> guiasTO = generadorDao.obtieneGuiasPorReferencia(parametrosTO);
			final List<Guia> guias = Mappers.mapperGuias(guiasTO);
			response = new ResponseGuias(guias);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin obtieneGuiasPorReferencia");
		return response;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.ws.GeneradorEtiquetaService
	 * #obtieneGuiasPorPieza(cl.bluex.generadoretiqueta.bean.request.RequestGuiasPorPieza, 
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseGuias obtieneGuiasPorPieza(
			final RequestGuiasPorPieza request,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("Inicio obtieneGuiasPorReferencia");
		
		final ResponseGuias response;
		
		final DaoFactory daoFactory = GeneradorEtiquetaDaoFactory.getInstance().getDaoFactory();
		final GeneradorEtiquetaDao generadorDao = daoFactory.getGeneradorEtiquetaDao();
		try {
			final ParametrosGuiaPiezaTO parametrosTO = Mappers.mapperParametrosGuiaPieza(request.getParametrosGuiaPieza());
			final List<GuiaTO> guiasTO = generadorDao.obtieneGuiasPorPieza(parametrosTO);
			final List<Guia> guias = Mappers.mapperGuias(guiasTO);
			response = new ResponseGuias(guias);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin obtieneGuiasPorReferencia");
		return response;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.ws.GeneradorEtiquetaService#generaEtiquetaHub(cl.bluex.generadoretiqueta.bean.request.RequestGeneraEtiquetaHub, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseEtiquetaHub generaEtiquetaHub(
			final RequestGeneraEtiquetaHub request,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("Inicio generaEtiquetaHub");
		
		DatosGeneracionEtiquetaHubTO datosTO;
		final ResponseEtiquetaHub response;
		final List<TemplateTO> templatesTO;
		
		final DaoFactory daoFactory = GeneradorEtiquetaDaoFactory.getInstance().getDaoFactory();
		final GeneradorEtiquetaDao generadorDao = daoFactory.getGeneradorEtiquetaDao();
		try {
			datosTO = generadorDao.obtieneDatosImpresionHub(request.getEevvNroId());
			templatesTO = generadorDao.obtieneTemplate(
					request.getCodigoUsuario(), 
					request.getCodigoImpresora(),
					request.getCodigoFormatoImpresion(),
					request.getTipoFormato());
		} finally {
			daoFactory.close();
		}
		
		if (templatesTO == null || templatesTO.isEmpty()) {
			LOGGER.debug(TEMPLATE_NO_ENCONTRADO);
			throw new BluexException(TEMPLATE_NO_ENCONTRADO);
		}
		
		final String contenidoTemplate = templatesTO.get(0).getContenidoTemplate();
		final List<Etiqueta> etiquetas = new ArrayList<Etiqueta>();
		final int nroBulto = request.getNroBulto();
		final String strTotal = datosTO.getTotal();
		int total = 0;
		LOGGER.info("total ["+strTotal+"]");
		if (strTotal == null || "null".equals(strTotal) || "".equals(strTotal)) {
			throw new BluexException(ERROR_CDG_00002, String.format(ERROR_MSJ_00002));
		}
		total = Integer.parseInt(strTotal);
		
		if (nroBulto < 0 || nroBulto > total) {
			throw new BluexException(ERROR_CDG_00001, String.format(ERROR_MSJ_00001, total)); 
		}
		
		if (nroBulto == 0) {
			for (int i = 1; i <= total; i++) {
				datosTO.setCantidad(String.valueOf(i));

				final String codigoCompuesto = this.rehacerCodigoCompuesto(datosTO.getCodigocomp(), i);
				datosTO.setCodigocomp(codigoCompuesto);
				this.reemplazarValoresEtiquetaHub(datosTO, contenidoTemplate, etiquetas);
			}
		} else {
			if (nroBulto > 0 && nroBulto <= total) {
				datosTO.setCantidad(String.valueOf(nroBulto));
				final String codigoCompuesto = this.rehacerCodigoCompuesto(datosTO.getCodigocomp(), nroBulto);
				datosTO.setCodigocomp(codigoCompuesto);
				this.reemplazarValoresEtiquetaHub(datosTO, contenidoTemplate, etiquetas);
			}
		}
		
		response = new ResponseEtiquetaHub(etiquetas, datosTO.getCodigocomp());
		
		LOGGER.info("Fin generaEtiquetaHub");
		return response;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.ws.GeneradorEtiquetaService#obtieneOrdenesServicio(cl.bluex.generadoretiqueta.bean.request.RequestObtieneOrdenesServicio, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseObtieneOrdenesServicio obtieneOrdenesServicio(
			final RequestObtieneOrdenesServicio request,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("Inicio obtieneOrdenesServicio");
		
		final ResponseObtieneOrdenesServicio response;
		
		final DaoFactory daoFactory = GeneradorEtiquetaDaoFactory.getInstance().getDaoFactory();
		final GeneradorEtiquetaDao generadorDao = daoFactory.getGeneradorEtiquetaDao();
		try {
			final ParamOrdenServicioTO parametrosTO = Mappers.mapperParametrosOser(request.getParamatros());
			final List<OrdenServicioTO> osersTO = generadorDao.obtieneOrdenesServicio(parametrosTO);
			final List<OrdenServicio> osers = Mappers.mapperOsers(osersTO);
			response = new ResponseObtieneOrdenesServicio(osers);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin obtieneOrdenesServicio");
		return response;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.ws.GeneradorEtiquetaService#obtieneDatosOperacionales(cl.bluex.generadoretiqueta.bean.request.RequestEntradaDatosOperacionales, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseDatosOperacionales obtieneDatosOperacionales(
			final RequestEntradaDatosOperacionales request,
			final Cabecera cabecera) throws BluexException {
		
		LOGGER.info("[GeneradorEtiquetaServiceImpl] Inicio obtieneDatosOperacionales.");
		
		ResponseDatosOperacionales response = null;
		
		final DaoFactory daoFactory = GeneradorEtiquetaDaoFactory.getInstance().getDaoFactory();
		final GeneradorEtiquetaDao generadorDao = daoFactory.getGeneradorEtiquetaDao();
		
		try {
			final EntradaDatosOperacionalesTO parametrosTO = Mappers.mapperParametrosDatosOperacionales(request.getParametros());
			final DatosOperacionalesTO datosOperacionalesTO = generadorDao.obtieneDatosOperacionales(parametrosTO);
			final DatosOperacionales datosOperacionales = Mappers.mapperDatosOperacionales(datosOperacionalesTO);
			response = new ResponseDatosOperacionales(datosOperacionales);
		
		} catch(BluexException bex){
			
			LOGGER.info("[GeneradorEtiquetaServiceImpl] Error obtieneDatosOperacionales :" + bex.getMessage());
			
		}finally {
			daoFactory.close();
		}
		
		LOGGER.info("[GeneradorEtiquetaServiceImpl] Fin obtieneDatosOperacionales.");
		return response;
	}
	
	
	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.ws.GeneradorEtiquetaService#validaOficinaBodega(cl.bluex.generadoretiqueta.bean.request.RequestEntradaDatosOperacionales, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseValidaOficinaBodega validaOficinaBodega(
			final RequestValidaOficinaBodega request,
			final Cabecera cabecera) throws BluexException {
		
		LOGGER.info("[GeneradorEtiquetaServiceImpl][validaOficinaBodega] Inicio.");
		
		ResponseValidaOficinaBodega response = null;
		
		final DaoFactory daoFactory = GeneradorEtiquetaDaoFactory.getInstance().getDaoFactory();
		final GeneradorEtiquetaDao generadorDao = daoFactory.getGeneradorEtiquetaDao();
		
		try {
			final EntradaDatosOperacionalesTO parametrosTO = Mappers.mapperParametrosDatosOperacionales(request.getParametros());
			final DatosRespuestaTO datosRespuestaTO =  generadorDao.validaOficinaBodega(parametrosTO);
			final DatosRespuesta datosRespuesta = Mappers.mapperDatosRespuesta(datosRespuestaTO);
			response = new ResponseValidaOficinaBodega(datosRespuesta);
		
		} catch(BluexException bex){
			
			LOGGER.info("[GeneradorEtiquetaServiceImpl][validaOficinaBodega] Error validaOficinaBodega :" + bex.getMessage());
			
		}finally {
			daoFactory.close();
		}
		
		LOGGER.info("[GeneradorEtiquetaServiceImpl][validaOficinaBodega] Fin validaOficinaBodega.");
		return response;
	}
	
	
	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.ws.GeneradorEtiquetaService#insertaPiezaMovimiento(cl.bluex.generadoretiqueta.bean.request.RequestInsertaPiezaMovimiento, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseInsertaPiezaMovimiento insertaPiezaMovimiento(
			final RequestInsertaPiezaMovimiento request,
			final Cabecera cabecera) throws BluexException {
		
		LOGGER.info("[GeneradorEtiquetaServiceImpl] Inicio insertaPiezaMovimiento.");
		
		ResponseInsertaPiezaMovimiento response = null;
		
		final DaoFactory daoFactory = GeneradorEtiquetaDaoFactory.getInstance().getDaoFactory();
		final GeneradorEtiquetaDao generadorDao = daoFactory.getGeneradorEtiquetaDao();
		
		try {
			final PiezaMovimientoTO parametrosTO = Mappers.mapperInsertaPiezaMovimiento(request.getPiezaMovimiento());
			final DatosRespuestaTO datosRespuestaTO = generadorDao.insertaPiezaMovimiento(parametrosTO);
			final DatosRespuesta datosRespuesta = Mappers.mapperDatosRespuesta(datosRespuestaTO);

			response = new ResponseInsertaPiezaMovimiento(datosRespuesta);
		
		} catch(BluexException bex){
			
			LOGGER.info("[GeneradorEtiquetaServiceImpl] Error insertaPiezaMovimiento :" + bex.getMessage());
			
		}finally {
			daoFactory.close();
		}
		
		LOGGER.info("[GeneradorEtiquetaServiceImpl] Fin insertaPiezaMovimiento.");
		return response;
	}
	
	

	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.ws.GeneradorEtiquetaService#obtieneCodigoBultoL28(cl.bluex.generadoretiqueta.bean.request.RequestCodigoBulto, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseCodigoBulto obtieneCodigoBultoL28(
			final RequestCodigoBulto request,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("Inicio obtieneCodigoBultoL28");
		
		ResponseCodigoBulto response;
		
		final DaoFactory daoFactory = GeneradorEtiquetaDaoFactory.getInstance().getDaoFactory();
		final GeneradorEtiquetaDao generadorDao = daoFactory.getGeneradorEtiquetaDao();
		try {
			final ParametrosCodigoBultoTO parametrosTO = Mappers.mapperParametrosCodigoBulto(request.getParametrosCodigoBulto());
			final CodigoBultoTO codigoBultoTO = generadorDao.obtieneCodigoBultoL28(parametrosTO);
			response = new ResponseCodigoBulto(new CodigoBulto(codigoBultoTO));
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin obtieneCodigoBultoL28");
		return response;
	}

	/**
	 * @param template el template a reemplazar
	 * @param t el objeto con la data
	 * @return la etiqueta
	 */
	public <T> String reemplazarValoresTemplate(final String template, final T t) {
		String returnTemplate = template;
		try {
			for ( final PropertyDescriptor  prop : Introspector.getBeanInfo(t.getClass()).getPropertyDescriptors()){
				final String fieldToReplace = getNameOfFieldToReplace(prop);
				Object valorCampo;
				try {
					valorCampo = prop.getReadMethod().invoke(t);
					if ( valorCampo != null ){
						returnTemplate = returnTemplate.replaceAll(fieldToReplace, valorCampo.toString());
					} else {
						returnTemplate = returnTemplate.replaceAll(fieldToReplace, "");
					}
				} catch (final Exception ex) {
					LOGGER.error("Error al obtener el valor del campo" + ex.getMessage(), ex);
				} 
			}
		} catch (final IntrospectionException e) {
			LOGGER.error("Error al obtener las propiedades del bean: " + e.getMessage(), e);
		}
		return returnTemplate;
	}
	
	private String getNameOfFieldToReplace(final PropertyDescriptor prop) {
		return "P_" + prop.getName().toUpperCase();
	}

	
	/**
	 * Metodo que devuelve los codigos 2D formateados para el paso entre capas
	 * 
	 * @param datosImpresion
	 * @return
	 */
	private DatosGeneracionEtiquetaTO procesarCodigos2D(final DatosGeneracionEtiquetaTO datosTO) {
		datosTO.setPdf417_cb2d_os(procesarCodigo2D(datosTO.getPdf417_cb2d_os()));
		datosTO.setPdf417_cb2d_cod(procesarCodigo2D(datosTO.getPdf417_cb2d_cod()));
		datosTO.setPdf417_cb2d_dd(procesarCodigo2D(datosTO.getPdf417_cb2d_dd()));
		return datosTO;
	}
	
	/**
	 * Metodo que formatea el String 2D reemplazando los caracteres de control por string válidos en XML
	 * 
	 * @param codigo2D
	 * @return
	 */
	private String procesarCodigo2D(final String codigo2D) {
		String codigoProcesado = codigo2D;
		if (codigoProcesado != null && !codigoProcesado.isEmpty()) {
			codigoProcesado = codigoProcesado.replace(String.valueOf((char) 30), "<RS>");
			codigoProcesado = codigoProcesado.replace(String.valueOf((char) 29), "<GS>");
			codigoProcesado = codigoProcesado.replace(String.valueOf((char) 4), "<EOT>");
		}
		return codigoProcesado;
	}

	

	/**
	 * @param codigocompuesto
	 * @param cantidad
	 * @return String
	 */
	private String rehacerCodigoCompuesto(final String codigoCompuesto, final int cantidad) {
		LOGGER.info("Codigo compuesto: " + codigoCompuesto);
		final String inicio = codigoCompuesto.substring(0, 15);
		final String fin = codigoCompuesto.substring(18, codigoCompuesto.length());
		final String strCantidad = String.format("%03d", cantidad);
		
		return inicio + strCantidad + fin;
	}

	/**
	 * @param datosTO
	 * @param contenidoTemplate
	 * @param etiquetas
	 * @throws BluexException
	 */
	private void reemplazarValoresEtiquetaHub(
			final DatosGeneracionEtiquetaHubTO datosTO,
			final String contenidoTemplate, final List<Etiqueta> etiquetas)
			throws BluexException {
		LOGGER.info("cantidad: " + datosTO.getCantidad());
		final String etiqueta = reemplazarValoresTemplate(contenidoTemplate, datosTO);
		LOGGER.info("etiqueta: ["+ etiqueta +"]");
		final byte[] encode = EncoderBase64.encode(etiqueta.toString().getBytes());
		etiquetas.add(new Etiqueta(new String(encode)));
	}

	

}
