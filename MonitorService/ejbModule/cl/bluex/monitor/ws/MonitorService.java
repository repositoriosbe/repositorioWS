package cl.bluex.monitor.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;

import cl.bluex.monitor.bean.response.ResponseObtieneInfoMonitor;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

/**
 * Interface MonitorService.
 * 
 * @author edgardo
 */
@WebService(
	targetNamespace = "http://monitorWS/BXMON001_monitor/MonitorPortType",
	name = "Monitor")
public interface MonitorService {

	@WebMethod(
		operationName = "obtieneInformacionMonitor",
		action = "http://monitorWS/BXMON001_monitor/obtieneInformacionMonitor")
	@WebResult(
		name = "responseObtieneInfoMonitor",
		targetNamespace = "http://monitorWS/BXMON001_monitor/MonitorPortType",
		partName = "ResponseObtieneInfoMonitor")
	@RequestWrapper(
		localName = "requestObtieneInfoMonitor",
		targetNamespace = "http://monitorWS/BXMON001_monitor/MonitorPortType",
		className = "cl.bluex.monitor.bean.request.RequestObtieneInfoMonitor")
	ResponseObtieneInfoMonitor obtieneInformacionMonitor(@WebParam(
		name = "codigoEmpresa",
		targetNamespace = "http://monitorWS/BXMON001_monitor/MonitorPortType",
		partName = "codigoEmpresa",
		header = false) long codigoEmpresa, @WebParam(
		name = "codigoSorter",
		targetNamespace = "http://monitorWS/BXMON001_monitor/MonitorPortType",
		partName = "codigoSorter",
		header = false) long codigoSorter, @WebParam(
		name = "Cabecera",
		targetNamespace = "http://monitorWS/BXMON001_monitor/MonitorPortType",
		partName = "Cabecera",
		header = true) Cabecera cabecera) throws BluexException;

}
