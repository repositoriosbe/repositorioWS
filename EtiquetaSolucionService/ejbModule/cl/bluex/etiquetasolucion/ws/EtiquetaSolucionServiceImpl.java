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
import cl.bluex.etiquetasolucion.bean.ParametrosEntrada;
import cl.bluex.etiquetasolucion.bean.ParametrosSalida;
import cl.bluex.etiquetasolucion.bean.request.RequestEtiquetaSolucion;
import cl.bluex.etiquetasolucion.bean.response.ResponseEtiquetaSolucion;
import cl.bluex.etiquetasolucion.factory.DaoFactory;
import cl.bluex.etiquetasolucion.factory.EtiquetaSolucionDaoFactory;
import cl.bluex.etiquetasolucion.tool.Mappers;
import cl.bluex.etiquetasolucion.ws.session.SessionInterceptor;
import cl.bluex.etiquetasolucionmodel.to.ParametrosEntradaTO;
import cl.bluex.etiquetasolucionmodel.to.ParametrosSalidaTO;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;
import cl.bluex.ws.common.util.Util;

/**
 * @author rmoscoso
 * 
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
	public ResponseEtiquetaSolucion getSolucionEtiqueta(
			final RequestEtiquetaSolucion request,
			final Cabecera cabecera) 
			throws BluexException {
		
		LOGGER.info("[getSolucionEtiqueta] inicio getSolucionEtiqueta.");
		ResponseEtiquetaSolucion response;
		
		final DaoFactory daoFactory = EtiquetaSolucionDaoFactory.getInstance().getDaoFactory();
		final EtiquetaSolucionDao generadorDao = daoFactory.getEtiquetaSolucionDao();
		
		try {
			final ParametrosEntrada parametrosEntrada = request.getParametrosEntrada();
			validacion(parametrosEntrada);
			
			final ParametrosEntradaTO parametrosSalida = Mappers.mapeaTOentrada(parametrosEntrada);
			final List<ParametrosSalidaTO> outputTO = generadorDao.getSolucionEtiqueta(parametrosSalida);
			final List<ParametrosSalida> respuesta = Mappers.mapeaTOsalida(outputTO);
			
			response = new ResponseEtiquetaSolucion(respuesta);
			
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("[getSolucionEtiqueta] fin getSolucionEtiqueta.");
		return response;
	}
	
	
	/**
	 * @param parametro
	 * @throws BluexException
	 */
	private void validacion(final ParametrosEntrada parametro)
			throws BluexException {
		
		Util.validaObligatorio(parametro.getFechaInicio(), "fechaInicio");
		Util.validaObligatorio(parametro.getFechaFin(), "fechaFin");
		Util.validaObligatorio(parametro.getCodigoEmpresa(), "codigoEmpresa");
		Util.validaObligatorio(parametro.getCodigoTipoDocumento(), "codigoTipoDocumento");
		Util.validaObligatorio(parametro.getCodigoOficina(), "codigoOficina");
		
		
	}
	
}
