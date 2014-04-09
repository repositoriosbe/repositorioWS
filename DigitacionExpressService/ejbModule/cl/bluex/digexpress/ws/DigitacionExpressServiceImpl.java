package cl.bluex.digexpress.ws;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;

import org.apache.log4j.Logger;
import org.jboss.ws.api.annotation.WebContext;

import cl.bluex.digexpress.DigitacionExpressDao;
import cl.bluex.digexpress.bean.Agrupacion;
import cl.bluex.digexpress.bean.CabeceraAgrupacion;
import cl.bluex.digexpress.bean.Cliente;
import cl.bluex.digexpress.bean.DetalleDigitacionExpress;
import cl.bluex.digexpress.bean.EspecieValorada;
import cl.bluex.digexpress.bean.HojaRuta;
import cl.bluex.digexpress.bean.Valorado;
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
import cl.bluex.digexpress.factory.DaoFactory;
import cl.bluex.digexpress.factory.DigitacionExpressDaoFactory;
import cl.bluex.digexpress.tool.Mappers;
import cl.bluex.digexpress.ws.session.SessionInterceptor;
import cl.bluex.digmodel.to.AgrupacionTO;
import cl.bluex.digmodel.to.CabeceraAgrupacionTO;
import cl.bluex.digmodel.to.ClienteTO;
import cl.bluex.digmodel.to.DetalleDigitacionExpressTO;
import cl.bluex.digmodel.to.EspecieValoradaTO;
import cl.bluex.digmodel.to.HojaRutaTO;
import cl.bluex.digmodel.to.ValoradoTO;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

/**
 * @author Edgardo Herrera
 * 
 */
@WebService(
	endpointInterface = "cl.bluex.digexpress.ws.DigitacionExpressService",
	name = "BXDIG002_express",
	portName = "BXDIG002_expressPort",
	serviceName = "DigitacionExpressService",
	targetNamespace = "http://digitacionExpressWS/BXDIG002_express/DigitacionPortType")
@Remote(DigitacionExpressService.class)
@Stateless
@WebContext(
	contextRoot = "/digitacionExpressWS",
	urlPattern = "/BXDIG002_express")
@Interceptors(SessionInterceptor.class)
public class DigitacionExpressServiceImpl implements DigitacionExpressService {
	private static final Logger LOGGER = Logger.getLogger(DigitacionExpressServiceImpl.class);
	/**
	 * constructor por defecto.
	 */
	public DigitacionExpressServiceImpl() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.digexpress.ws.DigitacionExpressService#actualizaEncDigExpress(
	 * cl.bluex.digexpress.bean.CabeceraAgrupacion,
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	public ResponseCabeceraAgrupacion actualizaEncDigExpress(
			final CabeceraAgrupacion cabeceraAgrupacion, final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("Inicio actualizaEncDigExpress");
		
		final CabeceraAgrupacion value;
		final DaoFactory daoFactory = DigitacionExpressDaoFactory.getInstance().getDaoFactory();
		final DigitacionExpressDao digitacionExpressDao = daoFactory.getDigitacionExpressDao();
		try {
			CabeceraAgrupacionTO valueTO = Mappers.mapperTo(cabeceraAgrupacion);
			
			valueTO = digitacionExpressDao.actualizaEncDigExpress(valueTO);
			value = new CabeceraAgrupacion();
			value.setCodigoAgrupacion(valueTO.getCodigoAgrupacion());
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin actualizaEncDigExpress");
		return new ResponseCabeceraAgrupacion(value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digexpress.ws.DigitacionExpressService#insertaDigitExpress(
	 * cl.bluex.digexpress.bean.DetalleDigitacionExpress,
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	public ResponseAgrupacion insertaDigitExpress(
			final DetalleDigitacionExpress value, final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("Inicio insertaDigitExpress");
		
		final ResponseAgrupacion responseAgrupacion;
		final DaoFactory daoFactory = DigitacionExpressDaoFactory.getInstance().getDaoFactory();
		final DigitacionExpressDao digitacionExpressDao = daoFactory.getDigitacionExpressDao();
		try {
			final DetalleDigitacionExpressTO to = Mappers.mapperTO(value);
			final Long resultado = digitacionExpressDao
					.insertaDigitExpress(to);
			responseAgrupacion = new ResponseAgrupacion(new Agrupacion(
					resultado));
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin insertaDigitExpress");
		return responseAgrupacion;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digexpress.ws.DigitacionExpressService#obtieneDigitExpress(
	 * cl.bluex.digexpress.bean.DetalleDigitacionExpress,
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	public ResponseDetallesDigExp obtieneDigitExpress(
			final DetalleDigitacionExpress detalle, 
			final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("Inicio obtieneDigitExpress");
		
		ResponseDetallesDigExp responseDetallesDigExp;
		
		final DaoFactory daoFactory = DigitacionExpressDaoFactory.getInstance().getDaoFactory();
		final DigitacionExpressDao digitacionExpressDao = daoFactory.getDigitacionExpressDao();
		try {
			final List<DetalleDigitacionExpressTO> valuesTO = digitacionExpressDao.obtieneDigitExpress(
							detalle.getId(), detalle.getEevvNmrId());
			final List<DetalleDigitacionExpress> values = new ArrayList<DetalleDigitacionExpress>();
			for (final DetalleDigitacionExpressTO valueTO : valuesTO) {
				values.add(new DetalleDigitacionExpress(valueTO));
			}
			responseDetallesDigExp = new ResponseDetallesDigExp(values);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin obtieneDigitExpress");
		return responseDetallesDigExp;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digexpress.ws.DigitacionExpressService#eliminaDigitExpress(
	 * cl.bluex.digexpress.bean.DetalleDigitacionExpress,
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	public ResponseDetalleDigExpress eliminaDigitExpress(
			final DetalleDigitacionExpress value, final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("inicio eliminaDigitExpress");
		
		final DetalleDigitacionExpressTO valueTO = new DetalleDigitacionExpressTO();
		ResponseDetalleDigExpress responseDetalleDigExpress;
		final DaoFactory daoFactory = DigitacionExpressDaoFactory.getInstance()
				.getDaoFactory();
		final DigitacionExpressDao digitacionExpressDao = daoFactory.getDigitacionExpressDao();
		try {
			valueTO.setId(value.getId());
			valueTO.setEevvNmrId(value.getEevvNmrId());
			final Long resultado = digitacionExpressDao
					.eliminaDigitExpress(valueTO);

			final DetalleDigitacionExpress detalle = new DetalleDigitacionExpress();
			detalle.setId(resultado);
			responseDetalleDigExpress = new ResponseDetalleDigExpress(detalle);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin eliminaDigitExpress");
		return responseDetalleDigExpress;
	}

	/* (non-Javadoc)
	 * @see cl.bluex.digexpressprueba.ws.DigitacionExpressPruebaService#eliminarAgrupacion(
	 * cl.bluex.digexpressprueba.bean.Agrupacion, 
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	public ResponseAgrupacion eliminarAgrupacion(final Agrupacion agrupacion,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("Inicio eliminarAgrupacion");

		final ResponseAgrupacion responseAgrupacion;
		final DaoFactory daoFactory = DigitacionExpressDaoFactory.getInstance()
				.getDaoFactory();
		final DigitacionExpressDao digitacionExpressDao = daoFactory.getDigitacionExpressDao();
		try {
			final Long idCabeceraAgrupacion = agrupacion
					.getIdCabeceraAgrupacion();
			final Long resultado = digitacionExpressDao
					.eliminarAgrupacion(idCabeceraAgrupacion);
			responseAgrupacion = new ResponseAgrupacion(new Agrupacion(
					resultado));
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin eliminarAgrupacion");
		return responseAgrupacion;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digitacion.ws.DigitacionExpressService#cerrarAgrupacion(
	 * cl.bluex.digitacion.bean.Agrupacion, cl.bluex.digitacion.head.Cabecera)
	 */
	public ResponseAgrupacion cerrarAgrupacion(final Agrupacion agrupacion,
			final Cabecera cabecera) throws BluexException {
		
		final Long idCabeceraAgrupacion = agrupacion.getIdCabeceraAgrupacion();

		ResponseAgrupacion responseAgrupacion;
		final DaoFactory daoFactory = DigitacionExpressDaoFactory
				.getInstance().getDaoFactory();
		final DigitacionExpressDao digitacionExpressDao = daoFactory.getDigitacionExpressDao();
		try {
			final AgrupacionTO agrupacionTO = digitacionExpressDao.cerrarAgrupacion(
							idCabeceraAgrupacion);
			final String codigoEstado = agrupacionTO.getCodigoEstado();
			responseAgrupacion = new ResponseAgrupacion(new Agrupacion(
					codigoEstado));
		} finally {
			daoFactory.close();
		}
		
		return responseAgrupacion;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.digitacion.ws.DigitacionExpressService#abrirAgrupacion(long,
	 * cl.bluex.digitacion.head.Cabecera)
	 */
	public ResponseModificarEstadoAgrupacion modificarEstadoAgrupacion(
			final long idCabeceraAgrupacion, final String codigoEstado,
			final Cabecera cabecera) throws BluexException {
		ResponseModificarEstadoAgrupacion responseModificarEstadoAgrupacion;
		final DaoFactory daoFactory = DigitacionExpressDaoFactory
				.getInstance().getDaoFactory();
		final DigitacionExpressDao digitacionExpressDao = daoFactory.getDigitacionExpressDao();
		try {
			final AgrupacionTO agrupacionTO = digitacionExpressDao.modificarEstadoAgrupacion(
							idCabeceraAgrupacion, codigoEstado);

			final Agrupacion agrupacion = Mappers.mapperTO(agrupacionTO);
			responseModificarEstadoAgrupacion = new ResponseModificarEstadoAgrupacion(
					agrupacion);
		} finally {
			daoFactory.close();
		}
		
		return responseModificarEstadoAgrupacion;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digitacion.ws.DigitacionExpressService#obtieneAgrupacion(
	 * cl.bluex.digitacion.bean.CabeceraAgrupacion,
	 * cl.bluex.digitacion.head.Cabecera)
	 */
	public ResponseCabeceraAgrupacion obtieneAgrupacion(
			final CabeceraAgrupacion cabeceraAgrupacion, 
			final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("inicio obtieneAgrupacion");
		
		ResponseCabeceraAgrupacion responseCabeceraAgrupacion;
		final DaoFactory daoFactory = DigitacionExpressDaoFactory.getInstance().getDaoFactory();
		final DigitacionExpressDao digitacionExpressDao = daoFactory.getDigitacionExpressDao();
		try {
			CabeceraAgrupacionTO to = Mappers
					.mapperTo(cabeceraAgrupacion);
			to = digitacionExpressDao.obtieneAgrupacion(to);

			final CabeceraAgrupacion value = new CabeceraAgrupacion();
			value.setId(to.getId());
			value.setCodigoAgrupacion(to.getCodigoAgrupacion());
			value.setCodigoEstado(to.getCodigoEstado());
			value.setVoucher(to.getVoucher());
			responseCabeceraAgrupacion = new ResponseCabeceraAgrupacion(value);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("fin obtieneAgrupacion");
		return responseCabeceraAgrupacion;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.digexpress.ws.DigitacionExpressService#obtieneCabeceraAgrupacion
	 * (long, cl.bluex.ws.common.head.Cabecera)
	 */
	public ResponseCabeceraAgrupacion obtieneCabeceraAgrupacion(
			final long codigo, 
			final Cabecera cabecera) 
			throws BluexException {

		final ResponseCabeceraAgrupacion responseCabeceraAgrupacion;
		final DaoFactory daoFactory = DigitacionExpressDaoFactory
				.getInstance().getDaoFactory();
		final DigitacionExpressDao digitacionExpressDao = daoFactory.getDigitacionExpressDao();
		try {
			final CabeceraAgrupacionTO cabeceraTO = digitacionExpressDao.obtieneCabeceraAgrupacion(
							codigo);
			responseCabeceraAgrupacion = new ResponseCabeceraAgrupacion(
					new CabeceraAgrupacion(cabeceraTO));
		} finally {
			daoFactory.close();
		}
		
		return responseCabeceraAgrupacion;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.digexpress.ws.DigitacionExpressService#obtieneDatosHojaRuta(
	 * java.lang.String, cl.bluex.ws.common.head.Cabecera)
	 */
	public ResponseDatosHojaRuta obtieneDatosHojaRuta(final String folio,
			final Cabecera cabecera) throws BluexException {

		ResponseDatosHojaRuta responseDatosHojaRuta;
		final DaoFactory daoFactory = DigitacionExpressDaoFactory.getInstance().getDaoFactory();
		final DigitacionExpressDao digitacionExpressDao = daoFactory.getDigitacionExpressDao();
		try {
			final HojaRutaTO valueTO = digitacionExpressDao
					.obtieneDatosHojaRuta(folio);
			responseDatosHojaRuta = new ResponseDatosHojaRuta(new HojaRuta(
					valueTO));
		} finally {
			daoFactory.close();
		}
		return responseDatosHojaRuta;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.digexpress.ws.DigitacionExpressService#validaEspecieValorada
	 * (long, java.lang.String, long, cl.bluex.ws.common.head.Cabecera)
	 */
	public ResponseEspecieValorada validaEspecieValorada(
			final long codigoEmpresa, 
			final String codigoTipoDocumento,
			final long numeroDocumento, 
			final Cabecera cabecera)
			throws BluexException {

		ResponseEspecieValorada responseEspecieValorada;
		final DaoFactory daoFactory = DigitacionExpressDaoFactory
				.getInstance()
				.getDaoFactory();
		final DigitacionExpressDao digitacionExpressDao = daoFactory.getDigitacionExpressDao();
		try {
			final EspecieValoradaTO especieValoradaTO = digitacionExpressDao
					.validaEspecieValorada(codigoEmpresa, codigoTipoDocumento,
							numeroDocumento);
			final EspecieValorada especie = new EspecieValorada(
					especieValoradaTO);
			responseEspecieValorada = new ResponseEspecieValorada(especie);
		} finally {
			daoFactory.close();
		}
		
		return responseEspecieValorada;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.digexpress.ws.DigitacionExpressService#obtieneClientesValorados
	 * (long, cl.bluex.ws.common.head.Cabecera)
	 */
	public ResponseClientes obtieneClientesValorados(final long codigoEmpresa,
			final Cabecera cabecera) throws BluexException {
		ResponseClientes responseClientes;
		final DaoFactory daoFactory = DigitacionExpressDaoFactory
				.getInstance().getDaoFactory();
		final DigitacionExpressDao digitacionExpressDao = daoFactory.getDigitacionExpressDao();
		try {
			final List<ClienteTO> clientesTO = digitacionExpressDao.obtieneClientesValorados(
							codigoEmpresa);
			
			final List<Cliente> clientes = new ArrayList<Cliente>();
			for (final ClienteTO clienteTO : clientesTO) {
				clientes.add(new Cliente(clienteTO));
			}
			responseClientes = new ResponseClientes(clientes);
		} finally {
			daoFactory.close();
		}
		
		return responseClientes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.digexpress.ws.DigitacionExpressService#obtieneValorados(long,
	 * long, long, long, cl.bluex.ws.common.head.Cabecera)
	 */
	public ResponseValorados obtieneValorados(
			final long codigoCliente,
			final long codigoTipoCliente, 
			final long codigoEmpresa,
			final long codigoSucursalCliente, 
			final Cabecera cabecera)
			throws BluexException {
		
		final ResponseValorados responseValorados;
		final DaoFactory daoFactory = DigitacionExpressDaoFactory
				.getInstance()
				.getDaoFactory();
		final DigitacionExpressDao digitacionExpressDao = daoFactory.getDigitacionExpressDao();
		try {
			final List<ValoradoTO> valoradosTO = digitacionExpressDao.obtieneValorados(
							codigoCliente, codigoTipoCliente, codigoEmpresa,
							codigoSucursalCliente);
			final List<Valorado> valorados = new ArrayList<Valorado>();
			for (final ValoradoTO valoradoTO : valoradosTO) {
				valorados.add(new Valorado(valoradoTO));
			}
			responseValorados = new ResponseValorados(valorados);
		} finally {
			daoFactory.close();
		}
		
		return responseValorados;
	}
	
	
	public ResponseObtieneDatosCourier obtieneDatosCourier(final long codigoRuta, final long codigoEmpresa, final int codigoSorter,	final Cabecera cabecera) throws BluexException {

		ResponseObtieneDatosCourier responseObtieneDatosCourier;
		
		final DaoFactory daoFactory = DigitacionExpressDaoFactory.getInstance().getDaoFactory();
		final DigitacionExpressDao digitacionExpressDao = daoFactory.getDigitacionExpressDao();
		
		try {
			
			final HojaRutaTO valueTO = digitacionExpressDao.obtieneDatosCourier(codigoRuta,codigoEmpresa,codigoSorter);
			responseObtieneDatosCourier = new ResponseObtieneDatosCourier(new HojaRuta(valueTO));
			
		} finally {
			daoFactory.close();
		}
		return responseObtieneDatosCourier;
	}
	
	
	

}
