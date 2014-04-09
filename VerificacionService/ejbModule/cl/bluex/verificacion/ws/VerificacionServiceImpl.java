package cl.bluex.verificacion.ws;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.apache.log4j.Logger;
import org.jboss.ws.api.annotation.WebContext;

import cl.bluex.verificacion.VerificacionDao;
import cl.bluex.verificacion.bean.Acronimo;
import cl.bluex.verificacion.bean.Batch;
import cl.bluex.verificacion.bean.Oser;
import cl.bluex.verificacion.bean.request.RequestAcronimos;
import cl.bluex.verificacion.bean.request.RequestBatch;
import cl.bluex.verificacion.bean.request.RequestDetalleBatch;
import cl.bluex.verificacion.bean.request.RequestOsBatch;
import cl.bluex.verificacion.bean.request.RequestOser;
import cl.bluex.verificacion.bean.response.ResponseAcronimos;
import cl.bluex.verificacion.bean.response.ResponseBatch;
import cl.bluex.verificacion.bean.response.ResponseBatches;
import cl.bluex.verificacion.bean.response.ResponseOser;
import cl.bluex.verificacion.factory.DaoFactory;
import cl.bluex.verificacion.factory.VerificacionDaoFactory;
import cl.bluex.verificacion.tool.Mappers;
import cl.bluex.verificacion.ws.session.SessionInterceptor;
import cl.bluex.verificamodel.to.AcronimoTO;
import cl.bluex.verificamodel.to.BatchTO;
import cl.bluex.verificamodel.to.DetalleBatchTO;
import cl.bluex.verificamodel.to.OsBatchTO;
import cl.bluex.verificamodel.to.OserTO;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

/**
 * @author Edgardo Herrera
 * 
 */
@WebService(
	endpointInterface = "cl.bluex.verificacion.ws.VerificacionService",
	name = "BXVFC001_verificacion",
	portName = "BXVFC001_verificacionPort",
	serviceName = "VerificacionService",
	targetNamespace = "http://VerificacionWS/BXVFC001_verificacion/VerificacionPortType")
@SOAPBinding(
	parameterStyle = SOAPBinding.ParameterStyle.WRAPPED,
	style = SOAPBinding.Style.DOCUMENT,
	use = SOAPBinding.Use.ENCODED)
@Remote(VerificacionService.class)
@Stateless
@WebContext(
	contextRoot = "/VerificacionWS",
	urlPattern = "/BXVFC001_verificacion")
@Interceptors(SessionInterceptor.class)
public class VerificacionServiceImpl implements VerificacionService {
	private static final Logger LOGGER = Logger.getLogger(VerificacionServiceImpl.class);

	/**
	 * Crea instancia de {@link VerificacionServiceImpl}.
	 * 
	 */
	public VerificacionServiceImpl() {
		super();
	}

	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.ws.VerificacionService#crearBatch(cl.bluex.verificacion.bean.request.RequestBatch, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseBatch crearBatch(
			final RequestBatch request,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio crearBatch");
		
		final ResponseBatch response;
		
		final DaoFactory daoFactory = VerificacionDaoFactory.getInstance().getDaoFactory();
		final VerificacionDao verificacionDao = daoFactory.getVerificacionDao();
		try {
			final BatchTO batchTO = Mappers.mapeaBatch(request.getBatch());
			final long numeroSecuencia = verificacionDao.crearBatch(batchTO);
			
			response = new ResponseBatch(numeroSecuencia);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin crearBatch");
		return response;
	}

	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.ws.VerificacionService#cambioEstadoBatch(cl.bluex.verificacion.bean.request.RequestBatch, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public void cambioEstadoBatch(
			final RequestBatch request,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio cambioEstadoBatch");
		
		final DaoFactory daoFactory = VerificacionDaoFactory.getInstance().getDaoFactory();
		final VerificacionDao verificacionDao = daoFactory.getVerificacionDao();
		try {
			final BatchTO batchTO = Mappers.mapeaBatch(request.getBatch());
			verificacionDao.cambioEstadoBatch(batchTO);
		} finally {
			daoFactory.close();
		}
		LOGGER.info("fin cambioEstadoBatch");
	}

	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.ws.VerificacionService#cerrarBatch(cl.bluex.verificacion.bean.request.RequestBatch, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public void cerrarBatch(
			final RequestBatch request,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio cerrarBatch");
		
		final DaoFactory daoFactory = VerificacionDaoFactory.getInstance().getDaoFactory();
		final VerificacionDao verificacionDao = daoFactory.getVerificacionDao();
		try {
			final BatchTO batchTO = Mappers.mapeaBatch(request.getBatch());
			verificacionDao.cerrarBatch(batchTO);
		} finally {
			daoFactory.close();
		}
		LOGGER.info("fin cerrarBatch");
	}

	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.ws.VerificacionService#eliminarBatch(cl.bluex.verificacion.bean.request.RequestBatch, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public void eliminarBatch(
			final RequestBatch request,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio eliminarBatch");
		
		final DaoFactory daoFactory = VerificacionDaoFactory.getInstance().getDaoFactory();
		final VerificacionDao verificacionDao = daoFactory.getVerificacionDao();
		try {
			final BatchTO batchTO = Mappers.mapeaBatch(request.getBatch());
			verificacionDao.eliminarBatch(batchTO);
		} finally {
			daoFactory.close();
		}
		LOGGER.info("fin eliminarBatch");
		
	}

	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.ws.VerificacionService#insertarDetalleBatch(cl.bluex.verificacion.bean.request.RequestDetalleBatch, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public void insertarDetalleBatch(
			final RequestDetalleBatch request,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio insertarDetalleBatch");
		
		final DaoFactory daoFactory = VerificacionDaoFactory.getInstance().getDaoFactory();
		final VerificacionDao verificacionDao = daoFactory.getVerificacionDao();
		try {
			final DetalleBatchTO detalleBatchTO = Mappers.mapeaDetalleBatch(request.getDetalleBatch());
			verificacionDao.insertarDetalleBatch(detalleBatchTO);
		} finally {
			daoFactory.close();
		}
		LOGGER.info("fin insertarDetalleBatch");
		
	}

	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.ws.VerificacionSresponse = new ResponseBatch(numeroSecuencia);ervice#eliminarDetalleBatch(cl.bluex.verificacion.bean.request.RequestDetalleBatch, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public void eliminarDetalleBatch(
			final RequestDetalleBatch request,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio eliminarDetalleBatch");
		
		final DaoFactory daoFactory = VerificacionDaoFactory.getInstance().getDaoFactory();
		final VerificacionDao verificacionDao = daoFactory.getVerificacionDao();
		try {
			final DetalleBatchTO detalleBatchTO = Mappers.mapeaDetalleBatch(request.getDetalleBatch());
			verificacionDao.eliminarDetalleBatch(detalleBatchTO);
		} finally {
			daoFactory.close();
		}
		LOGGER.info("fin eliminarDetalleBatch");
	}

	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.ws.VerificacionService#validaDetalleBatch(cl.bluex.verificacion.bean.request.RequestDetalleBatch, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public void validaDetalleBatch(
			final RequestDetalleBatch request,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio validaDetalleBatch");
		
		final DaoFactory daoFactory = VerificacionDaoFactory.getInstance().getDaoFactory();
		final VerificacionDao verificacionDao = daoFactory.getVerificacionDao();
		try {
			final DetalleBatchTO detalleBatchTO = Mappers.mapeaDetalleBatch(request.getDetalleBatch());
			verificacionDao.validaDetalleBatch(detalleBatchTO);
		} finally {
			daoFactory.close();
		}
		LOGGER.info("fin validaDetalleBatch");
		
	}

	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.ws.VerificacionService#cambioEstadoDetalleBatch(cl.bluex.verificacion.bean.request.RequestDetalleBatch, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public void cambioEstadoDetalleBatch(
			final RequestDetalleBatch request,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio cambioEstadoDetalleBatch");
		
		final DaoFactory daoFactory = VerificacionDaoFactory.getInstance().getDaoFactory();
		final VerificacionDao verificacionDao = daoFactory.getVerificacionDao();
		try {
			final DetalleBatchTO detalleBatchTO = Mappers.mapeaDetalleBatch(request.getDetalleBatch());
			verificacionDao.cambioEstadoDetalleBatch(detalleBatchTO);
		} finally {
			daoFactory.close();
		}
		LOGGER.info("fin cambioEstadoDetalleBatch");
		
	}

	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.ws.VerificacionService#obtieneAcronimos(cl.bluex.verificacion.bean.request.RequestAcronimos, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseAcronimos obtieneAcronimos(
			final RequestAcronimos request,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio obtieneAcronimos");
		
		final ResponseAcronimos response;
		
		final DaoFactory daoFactory = VerificacionDaoFactory.getInstance().getDaoFactory();
		final VerificacionDao verificacionDao = daoFactory.getVerificacionDao();
		try {
			final List<AcronimoTO> acronimosTO = verificacionDao.obtieneAcronimos(request.getCodigoEmpresa(), request.getCodigoTipo());
			final List<Acronimo> acronimos = Mappers.mapeaAcronimos(acronimosTO);
			response = new ResponseAcronimos(acronimos);
		} finally {
			daoFactory.close();
		}
		LOGGER.info("fin obtieneAcronimos");
		return response;
	}

	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.ws.VerificacionService#obtieneBatchOrigen(cl.bluex.verificacion.bean.request.RequestBatch, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseBatches obtieneBatchOrigen(
			final RequestBatch request,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio obtieneBatchOrigen");
		
		final ResponseBatches response;
		
		final DaoFactory daoFactory = VerificacionDaoFactory.getInstance().getDaoFactory();
		final VerificacionDao verificacionDao = daoFactory.getVerificacionDao();
		try {
			final BatchTO batchTO = Mappers.mapeaBatch(request.getBatch());
			final List<BatchTO> batchesTO = verificacionDao.obtieneBatchOrigen(batchTO);
			final List<Batch> batches = Mappers.mapeaBatches(batchesTO);
			
			response = new ResponseBatches(batches);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin obtieneBatchOrigen");
		return response;
	}

	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.ws.VerificacionService#obtieneOsBatch(cl.bluex.verificacion.bean.request.RequestOser, 
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseOser obtieneOsBatch(
			final RequestOsBatch request,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio obtieneOsBatch");
		
		final ResponseOser response;
		
		final DaoFactory daoFactory = VerificacionDaoFactory.getInstance().getDaoFactory();
		final VerificacionDao verificacionDao = daoFactory.getVerificacionDao();
		try {
			final OsBatchTO osBatchTO = Mappers.mapeaOsBatch(request.getOsBatch());
			final List<OserTO> osersTO = verificacionDao.obtieneOsBatch(osBatchTO);
			final List<Oser> osers = Mappers.mapeaOsers(osersTO);
			
			response = new ResponseOser(osers);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin obtieneOsBatch");
		return response;
	}

	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.ws.VerificacionService#actualizaOsBatch(cl.bluex.verificacion.bean.request.RequestOser, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public void actualizaOsBatch(
			final RequestOser request,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio actualizaOsBatch");
		
		final DaoFactory daoFactory = VerificacionDaoFactory.getInstance().getDaoFactory();
		final VerificacionDao verificacionDao = daoFactory.getVerificacionDao();
		try {
			final OserTO oserTO = Mappers.mapeaOser(request.getOser());
			verificacionDao.actualizaOsBatch(oserTO);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin actualizaOsBatch");
	}

	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.ws.VerificacionService#reversaBatch(cl.bluex.verificacion.bean.request.RequestBatch, 
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public void reversaBatch(
			final RequestBatch request,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio reversaBatch");
		
		final DaoFactory daoFactory = VerificacionDaoFactory.getInstance().getDaoFactory();
		final VerificacionDao verificacionDao = daoFactory.getVerificacionDao();
		try {
			final BatchTO batchTO = Mappers.mapeaBatch(request.getBatch());
			verificacionDao.reversaBatch(batchTO);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("fin reversaBatch");
	}

	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.ws.VerificacionService#reasignaBatch(cl.bluex.verificacion.bean.request.RequestBatch, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public void reasignaBatch(
			final RequestBatch request,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio reasignaBatch");
		
		final DaoFactory daoFactory = VerificacionDaoFactory.getInstance().getDaoFactory();
		final VerificacionDao verificacionDao = daoFactory.getVerificacionDao();
		try {
			final BatchTO batchTO = Mappers.mapeaBatch(request.getBatch());
			verificacionDao.reasignaBatch(batchTO);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("fin reasignaBatch");
	}

}
