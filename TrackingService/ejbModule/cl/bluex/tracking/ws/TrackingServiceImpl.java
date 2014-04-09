package cl.bluex.tracking.ws;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlElement;

import org.apache.log4j.Logger;
import org.jboss.ws.api.annotation.WebContext;

import cl.bluex.trackingmodel.to.ParametrosTrackingReferenciaTO;
import cl.bluex.trackingmodel.to.TrackingReferenciaTO;
import cl.bluex.tracking.TrackingDao;
import cl.bluex.tracking.bean.ParametrosTrackingReferencia;
import cl.bluex.tracking.bean.TrackingReferencia;
import cl.bluex.tracking.bean.request.RequestTrackingReferencia;
import cl.bluex.tracking.bean.response.ResponseTrackingReferencia;
import cl.bluex.tracking.factory.DaoFactory;
import cl.bluex.tracking.factory.TrackingDaoFactory;
import cl.bluex.tracking.tool.Mappers;
import cl.bluex.tracking.tool.Util;
import cl.bluex.tracking.ws.session.SessionInterceptor;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;
import cl.bluex.ws.common.util.Constantes;

/**
 * @author Edgardo Herrera
 * 
 */
@WebService(
	endpointInterface = "cl.bluex.tracking.ws.TrackingService",
	name = "BXTRK001_tracking",
	portName = "BXTRK001_trackingPort",
	serviceName = "TrackingService",
	targetNamespace = "http://TrackingWS/BXTRK001_tracking/TrackingPortType")
@SOAPBinding(
	parameterStyle = SOAPBinding.ParameterStyle.WRAPPED,
	style = SOAPBinding.Style.DOCUMENT,
	use = SOAPBinding.Use.ENCODED)
@Remote(TrackingService.class)
@Stateless
@WebContext(
	contextRoot = "/TrackingWS",
	urlPattern = "/BXTRK001_tracking")
//@Interceptors(SessionInterceptor.class)
public class TrackingServiceImpl implements TrackingService {
	private static final Logger LOGGER = Logger.getLogger(TrackingServiceImpl.class);

	/**
	 * Crea instancia de {@link TrackingServiceImpl}.
	 * 
	 */
	public TrackingServiceImpl() {
		super();
	}

	/* (non-Javadoc)
	 * @see cl.bluex.tracking.ws.TrackingService#
	 * 	obtieneTrackingReferencia(cl.bluex.tracking.bean.request.RequestTrackingReferencia, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseTrackingReferencia obtieneTrackingReferencia(
			final RequestTrackingReferencia request,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio obtieneTrackingReferencia");
		
		final ParametrosTrackingReferencia paramTrack = request.getParametrosTrackingReferencia();
		
		this.validacionTrackingReferencia(paramTrack);
		
		final ResponseTrackingReferencia response;

		final DaoFactory daoFactory = TrackingDaoFactory.getInstance().getDaoFactory();
		final TrackingDao trackingDao = daoFactory.getTrackingDao();
		try {
			final ParametrosTrackingReferenciaTO to = Mappers.mapeaTO(paramTrack);
			final List<TrackingReferenciaTO> tracksTO = trackingDao.obtieneTrackingReferencia(to);
			final List<TrackingReferencia> tracks = Mappers.mapeaTrackings(tracksTO);
			
			response = new ResponseTrackingReferencia(tracks);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin obtieneTrackingReferencia");
		return response;
	}

	/**
	 * @param paramTrack
	 * @throws BluexException 
	 */
	private void validacionTrackingReferencia(
			final ParametrosTrackingReferencia paramTrack) throws BluexException {
		Util.validaFechas(paramTrack.getFechaInicio(), paramTrack.getFechaFin(), Constantes.SLASH_DD_MM_YYYY);
		Util.validaObligatorio(paramTrack.getCodigoEmpresa(), "codigoEmpresa");
		Util.validaObligatorio(paramTrack.getCodigoCliente(), "codigoCliente");
		Util.validaObligatorio(paramTrack.getCodigoSucursal(), "codigoSucursal");
		Util.validaObligatorio(paramTrack.getCodigoTipoCliente(), "codigoTipoCliente");
		Util.validaObligatorio(paramTrack.getCodigoReferencia(), "codigoReferencia");
	}
}
