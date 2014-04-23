package cl.bluex.etiquetasolucion.ws;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.apache.log4j.Logger;
import org.jboss.ws.api.annotation.WebContext;

import cl.bluex.etiquetasolucion.EtiquetaSolucionDao;
import cl.bluex.etiquetasolucion.bean.ImpresionSolucion;
import cl.bluex.etiquetasolucion.bean.SolicitudImpresion;
import cl.bluex.etiquetasolucion.bean.Inquietud;
import cl.bluex.etiquetasolucion.bean.Solucion;
import cl.bluex.etiquetasolucion.bean.request.RequestEtiquetaSolucion;
import cl.bluex.etiquetasolucion.bean.request.RequestImpresionSolucion;
import cl.bluex.etiquetasolucion.bean.response.ResponseEtiquetaSolucion;
import cl.bluex.etiquetasolucion.bean.response.ResponseImpresionSolucion;
import cl.bluex.etiquetasolucion.factory.DaoFactory;
import cl.bluex.etiquetasolucion.factory.EtiquetaSolucionDaoFactory;
import cl.bluex.etiquetasolucion.tool.Mappers;
import cl.bluex.etiquetasolucion.ws.session.SessionInterceptor;
import cl.bluex.etiquetasolucionmodel.to.ImpresionSolucionTO;
import cl.bluex.etiquetasolucionmodel.to.SolicitudImpresionTO;
import cl.bluex.etiquetasolucionmodel.to.InquietudTO;
import cl.bluex.etiquetasolucionmodel.to.SolucionTO;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;
import cl.bluex.ws.common.util.Util;

/**
 * The Class EtiquetaSolucionServiceImpl.
 *
 * @author rmoscoso
 */
@WebService(
	endpointInterface = "cl.bluex.etiquetasolucion.ws.EtiquetaSolucionService",
	name = "EtiquetaSolucion",
	portName = "EtiquetaSolucionPort",
	serviceName = "EtiquetaSolucionService",
	targetNamespace = "http://EtiquetaSolucionWS/EtiquetaSolucion/EtiquetaSolucionPortType")
@SOAPBinding(
	parameterStyle = SOAPBinding.ParameterStyle.WRAPPED,
	style = SOAPBinding.Style.DOCUMENT,
	use = SOAPBinding.Use.ENCODED)
@Remote(EtiquetaSolucionService.class)
@Stateless
@WebContext(
	contextRoot = "/EtiquetaSolucionWS",
	urlPattern = "/EtiquetaSolucion")
@Interceptors(SessionInterceptor.class)
public class EtiquetaSolucionServiceImpl implements EtiquetaSolucionService {
	
	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(EtiquetaSolucionServiceImpl.class);

	/**
	 * Crea instancia de {@link EtiquetaSolucionServiceImpl}.
	 * 
	 */
	public EtiquetaSolucionServiceImpl() {
		super();
	}


	/* (non-Javadoc)
	 * @see cl.bluex.etiquetasolucion.ws.EtiquetaSolucionService#getSolucionEtiqueta(cl.bluex.etiquetasolucion.bean.request.RequestEtiquetaSolucion, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseEtiquetaSolucion getEtiquetaSolucion(
			final RequestEtiquetaSolucion request,
			final Cabecera cabecera) 
			throws BluexException {
		
		LOGGER.info("[getSolucionEtiqueta] inicio getSolucionEtiqueta.");
		ResponseEtiquetaSolucion response;
		
		final DaoFactory daoFactory = EtiquetaSolucionDaoFactory.getInstance().getDaoFactory();
		final EtiquetaSolucionDao generadorDao = daoFactory.getEtiquetaSolucionDao();
		
		try {
			final Inquietud entrada = request.getInquietud();
			validacionEtiquetaSolucion(entrada);
			
			final InquietudTO entradaTO = Mappers.mapeaTOentradaEtiqueta(entrada);
			final List<SolucionTO> salidaTO = generadorDao.getSolucionEtiqueta(entradaTO);
			final List<Solucion> respuesta = Mappers.mapeaTOsalidaEtiqueta(salidaTO);
			
			response = new ResponseEtiquetaSolucion(respuesta);
			
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("[getSolucionEtiqueta] fin getSolucionEtiqueta.");
		return response;
	}
	
	
	/* (non-Javadoc)
	 * @see cl.bluex.etiquetasolucion.ws.EtiquetaSolucionService#getImpresionSolucion(cl.bluex.etiquetasolucion.bean.request.RequestImpresionSolucion, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseImpresionSolucion getImpresionSolucion(
			final RequestImpresionSolucion request,
			final Cabecera cabecera) 
			throws BluexException {
		
		LOGGER.info("[getImpresionSolucion] inicio getImpresionSolucion.");
		ResponseImpresionSolucion response;
		
		final DaoFactory daoFactory = EtiquetaSolucionDaoFactory.getInstance().getDaoFactory();
		final EtiquetaSolucionDao generadorDao = daoFactory.getEtiquetaSolucionDao();
		
		try {
			final SolicitudImpresion entrada = request.getImpresion();
			
			final SolicitudImpresionTO entradaTO = Mappers.mapeaTOentradaImpresion(entrada);
			final ImpresionSolucionTO salidaTO = generadorDao.getImpresionSolucion(entradaTO);
			final ImpresionSolucion respuesta = Mappers.mapeaTOsalidaImpresion(salidaTO);
			
			response = new ResponseImpresionSolucion(respuesta);
			
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("[getImpresionSolucion] fin getImpresionSolucion.");
		return response;
	}
	
	
	
	/**
	 * Validacion etiqueta solucion.
	 *
	 * @param parametro the parametro
	 * @throws BluexException the bluex exception
	 */
	private void validacionEtiquetaSolucion(final Inquietud parametro)
			throws BluexException {
		
		Util.validaObligatorio(parametro.getFechaInicio(), "fechaInicio");
		Util.validaObligatorio(parametro.getFechaFin(), "fechaFin");
		Util.validaObligatorio(parametro.getCodigoEmpresa(), "codigoEmpresa");
		Util.validaObligatorio(parametro.getCodigoTipoDocumento(), "codigoTipoDocumento");
		Util.validaObligatorio(parametro.getCodigoOficina(), "codigoOficina");
		
		
	}
	
}
