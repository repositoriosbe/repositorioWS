package cl.bluex.monitor.ws;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.jws.WebService;

import org.apache.log4j.Logger;
//import org.jboss.wsf.spi.annotation.WebContext;
import org.jboss.ws.api.annotation.WebContext;

import cl.bluex.monitor.MonitorDao;
import cl.bluex.monitor.bean.DatosAgrupacionMonitor;
import cl.bluex.monitor.bean.response.ResponseObtieneInfoMonitor;
import cl.bluex.monitor.factory.DaoFactory;
import cl.bluex.monitor.factory.MonitorDaoFactory;
import cl.bluex.monitor.to.DatosAgrupacionMonitorTO;
import cl.bluex.monitor.tool.Mappers;
import cl.bluex.monitor.ws.session.SessionInterceptor;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

/**
 * Implementacion de {@link MonitorService}.
 * 
 * @author Edgardo Herrera
 * 
 */
@WebService(
	endpointInterface = "cl.bluex.monitor.ws.MonitorService",
	name = "BXMON001_monitor",
	portName = "BXMON001_monitorPort",
	serviceName = "MonitorService",
	targetNamespace = "http://monitorWS/BXMON001_monitor/MonitorPortType")
@Remote(MonitorService.class)
@Stateless
@WebContext(
	contextRoot = "/monitorWS",
	urlPattern = "/BXMON001_monitor")
@Interceptors(SessionInterceptor.class)
public class MonitorServiceImpl implements MonitorService {
	private static final Logger LOGGER = Logger.getLogger(MonitorServiceImpl.class);

	/**
	 * Crea instancia de {@link MonitorServiceImpl}.
	 * 
	 */
	public MonitorServiceImpl() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.monitor.ws.MonitorService#obtieneInformacionMonitor(long,
	 * long, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseObtieneInfoMonitor obtieneInformacionMonitor(
			final long codigoEmpresa, final long codigoSorter,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio obtieneInformacionMonitor");
		
		final ResponseObtieneInfoMonitor response;
		
		final DaoFactory daoFactory = MonitorDaoFactory.getInstance().getDaoFactory();
		final MonitorDao monitorDao = daoFactory.getMonitorDao();
		try {
			final List<DatosAgrupacionMonitorTO> tos = monitorDao
					.obtieneInformacionMonitor(codigoEmpresa, codigoSorter);

			final List<DatosAgrupacionMonitor> infoMonitor = Mappers
					.mapperInformacionMonitor(tos);
			response = new ResponseObtieneInfoMonitor(infoMonitor);
		} finally {
			daoFactory.close();
		}

		LOGGER.info("Fin obtieneInformacionMonitor");
		return response;
	}

}
