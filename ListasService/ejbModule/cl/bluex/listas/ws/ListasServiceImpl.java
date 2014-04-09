package cl.bluex.listas.ws;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.apache.log4j.Logger;
import org.jboss.ws.api.annotation.WebContext;

import cl.bluex.digmodel.to.BancoTO;
import cl.bluex.digmodel.to.CentroCostoTO;
import cl.bluex.digmodel.to.ComunaTO;
import cl.bluex.digmodel.to.ConversionTO;
import cl.bluex.digmodel.to.DiaPagoTO;
import cl.bluex.digmodel.to.EmpresaTO;
import cl.bluex.digmodel.to.FamiliaProductoTO;
import cl.bluex.digmodel.to.LocalidadTO;
import cl.bluex.digmodel.to.MonedaTO;
import cl.bluex.digmodel.to.OficinaTO;
import cl.bluex.digmodel.to.PaisTO;
import cl.bluex.digmodel.to.ParametroGeneralTO;
import cl.bluex.digmodel.to.PersonalizacionUsuarioTO;
import cl.bluex.digmodel.to.PostaTO;
import cl.bluex.digmodel.to.ProductoServicioTO;
import cl.bluex.digmodel.to.ProductoTO;
import cl.bluex.digmodel.to.RutaTO;
import cl.bluex.digmodel.to.SorterTO;
import cl.bluex.digmodel.to.TipoDocumentoClienteTO;
import cl.bluex.digmodel.to.TipoDocumentoTO;
import cl.bluex.digmodel.to.TipoFormaPagoClienteTO;
import cl.bluex.digmodel.to.TipoInfluenciaTO;
import cl.bluex.digmodel.to.TipoNegocioTO;
import cl.bluex.digmodel.to.TipoServicioTO;
import cl.bluex.digmodel.to.TraduccionEmpresaTO;
import cl.bluex.digmodel.to.TraduccionProductoTO;
import cl.bluex.digmodel.to.TraduccionTO;
import cl.bluex.listas.ListasDao;
import cl.bluex.listas.bean.Banco;
import cl.bluex.listas.bean.Comuna;
import cl.bluex.listas.bean.Conversion;
import cl.bluex.listas.bean.DiaPago;
import cl.bluex.listas.bean.Empresa;
import cl.bluex.listas.bean.FamiliaProducto;
import cl.bluex.listas.bean.Localidad;
import cl.bluex.listas.bean.Moneda;
import cl.bluex.listas.bean.Oficina;
import cl.bluex.listas.bean.Pais;
import cl.bluex.listas.bean.ParametroGeneral;
import cl.bluex.listas.bean.PersonalizacionUsuario;
import cl.bluex.listas.bean.Posta;
import cl.bluex.listas.bean.Producto;
import cl.bluex.listas.bean.ProductoServicio;
import cl.bluex.listas.bean.Ruta;
import cl.bluex.listas.bean.Sorter;
import cl.bluex.listas.bean.TipoDocumento;
import cl.bluex.listas.bean.TipoDocumentoCliente;
import cl.bluex.listas.bean.TipoFormaPagoCliente;
import cl.bluex.listas.bean.TipoInfluencia;
import cl.bluex.listas.bean.TipoNegocio;
import cl.bluex.listas.bean.TipoServicio;
import cl.bluex.listas.bean.Traduccion;
import cl.bluex.listas.bean.TraduccionEmpresa;
import cl.bluex.listas.bean.TraduccionProducto;
import cl.bluex.listas.bean.request.RequestObtieneEmpresas;
import cl.bluex.listas.bean.request.RequestObtieneParametrosGenerales;
import cl.bluex.listas.bean.request.RequestObtienePostasComunas;
import cl.bluex.listas.bean.request.RequestObtieneTraduccionEmpresas;
import cl.bluex.listas.bean.request.RequestObtieneTraduccionProducto;
import cl.bluex.listas.bean.request.RequestPosta;
import cl.bluex.listas.bean.response.ResponseBancos;
import cl.bluex.listas.bean.response.ResponseCentrosCosto;
import cl.bluex.listas.bean.response.ResponseComunas;
import cl.bluex.listas.bean.response.ResponseDiasPago;
import cl.bluex.listas.bean.response.ResponseEmpresas;
import cl.bluex.listas.bean.response.ResponseFamiliaProductos;
import cl.bluex.listas.bean.response.ResponseLocalidades;
import cl.bluex.listas.bean.response.ResponseMonedas;
import cl.bluex.listas.bean.response.ResponseObtieneConversiones;
import cl.bluex.listas.bean.response.ResponseObtieneParametrosGenerales;
import cl.bluex.listas.bean.response.ResponseObtieneSorter;
import cl.bluex.listas.bean.response.ResponseObtieneTipoInfluencias;
import cl.bluex.listas.bean.response.ResponseObtieneTipoNegocios;
import cl.bluex.listas.bean.response.ResponseOficinas;
import cl.bluex.listas.bean.response.ResponsePaises;
import cl.bluex.listas.bean.response.ResponsePersonalizacionesUsuario;
import cl.bluex.listas.bean.response.ResponsePostas;
import cl.bluex.listas.bean.response.ResponseProductos;
import cl.bluex.listas.bean.response.ResponseProductosServicios;
import cl.bluex.listas.bean.response.ResponseRutas;
import cl.bluex.listas.bean.response.ResponseTipoDocumentos;
import cl.bluex.listas.bean.response.ResponseTipoDocumentosCliente;
import cl.bluex.listas.bean.response.ResponseTipoFormasPagoCliente;
import cl.bluex.listas.bean.response.ResponseTipoServicios;
import cl.bluex.listas.bean.response.ResponseTraduccionEmpresa;
import cl.bluex.listas.bean.response.ResponseTraducciones;
import cl.bluex.listas.bean.response.ResponseTraduccionesProducto;
import cl.bluex.listas.factory.DaoFactory;
import cl.bluex.listas.factory.ListasDaoFactory;
import cl.bluex.listas.tool.Mappers;
import cl.bluex.listas.ws.session.SessionInterceptor;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

/**
 * @author Edgardo Herrera
 * 
 */
@WebService(
	endpointInterface = "cl.bluex.listas.ws.ListasService",
	name = "BXLST001_listas",
	portName = "BXLST001_listasPort",
	serviceName = "ListasService",
	targetNamespace = "http://ListasWS/BXLST001_listas/ListaPortType")
@SOAPBinding(
	parameterStyle = SOAPBinding.ParameterStyle.WRAPPED,
	style = SOAPBinding.Style.DOCUMENT,
	use = SOAPBinding.Use.ENCODED)
@Remote(ListasService.class)
@Stateless
@WebContext(
	contextRoot = "/ListasWS",
	urlPattern = "/BXLST001_listas")
@Interceptors(SessionInterceptor.class)
public class ListasServiceImpl implements ListasService {
	private static final Logger LOGGER = Logger.getLogger(ListasServiceImpl.class);

	/**
	 * Crea instancia de {@link ListasServiceImpl}.
	 * 
	 */
	public ListasServiceImpl() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.listas.ws.ListasService#obtieneEmpresas(cl.bluex.ws.common.head
	 * .Cabecera)
	 */
	@Override
	public ResponseEmpresas obtieneEmpresas(
			final RequestObtieneEmpresas request, final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("inicio obtieneEmpresas");
		
		final ResponseEmpresas response;
		
		final DaoFactory daoFactory = ListasDaoFactory.getInstance().getDaoFactory();
		final ListasDao listasDao = daoFactory.getListasDao();
		try {
			final List<EmpresaTO> empresasTO = listasDao
					.obtieneEmpresas(request.getCodigoUsuario(),
							request.getCodigoSistema(),
							request.getCodigoAplicacion());
			final List<Empresa> empresas = Mappers.mapperEmpresas(empresasTO);
			response = new ResponseEmpresas(empresas);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("fin obtieneEmpresas");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.listas.ws.ListasService#obtieneTipoDocumentos(cl.bluex.ws.common
	 * .head.Cabecera)
	 */
	@Override
	public ResponseTipoDocumentos obtieneTipoDocumentos(final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("inicio obtieneTipoDocumentos");
		
		
		final ResponseTipoDocumentos response;
		
		final DaoFactory daoFactory = ListasDaoFactory.getInstance().getDaoFactory();
		final ListasDao listasDao = daoFactory.getListasDao();
		try {
			final List<TipoDocumentoTO> tipoDocumentosTO = listasDao.obtieneTipoDocumentos();
			final List<TipoDocumento> tipoDocumentos = Mappers
					.mapperTipoDocumentos(tipoDocumentosTO);
			response = new ResponseTipoDocumentos(tipoDocumentos);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("fin obtieneTipoDocumentos");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.ws.ListasService#obtienePaises(java.lang.String,
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponsePaises obtienePaises(final String codigo,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio obtienePaises");
		
		ResponsePaises response;
		
		final DaoFactory daoFactory = ListasDaoFactory.getInstance().getDaoFactory();
		final ListasDao listasDao = daoFactory.getListasDao();
		try {
			final List<PaisTO> paisesTO = listasDao.obtienePaises(codigo);
			final List<Pais> paises = Mappers.mapperPaises(paisesTO);
			response = new ResponsePaises(paises);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("fin obtienePaises");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.ws.ListasService#obtieneComunas(java.lang.String,
	 * java.lang.String, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseComunas obtieneComunas(
			final String codigoPais,
			final String codigoPosta, 
			final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("inicio obtieneComunas");
		
		
		ResponseComunas response;
		final DaoFactory daoFactory = ListasDaoFactory.getInstance().getDaoFactory();
		final ListasDao listasDao = daoFactory.getListasDao();
		try {
			final List<ComunaTO> comunasTO = listasDao
					.obtieneComunas(codigoPais, codigoPosta);
			final List<Comuna> comunas = Mappers.mapperComunas(comunasTO);
			response = new ResponseComunas(comunas);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("fin obtieneComunas");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.ws.ListasService#obtienePostas(java.lang.String,
	 * long, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponsePostas obtienePostas(final RequestPosta request,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio obtienePostas");
		
		final ResponsePostas response = obtPostas(request.getCodigo(), request.getTipoNegocio(), -1);
		
		LOGGER.info("Fin obtienePostas");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.listas.ws.ListasService#obtienePostasComunas(java.lang.String,
	 * long, long, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponsePostas obtienePostasComunas(
			final RequestObtienePostasComunas request, 
			final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("inicio obtienePostasComunas");
		
		final ResponsePostas response = obtPostas(request.getCodigo(), request.getTipoNegocio(),
				request.getComuna());
		
		LOGGER.info("Fin obtienePostasComunas");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.ws.ListasService#obtieneRutas(java.lang.String,
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseRutas obtieneRutas(
			final String codigo,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio obtieneRutas");
		
		
		ResponseRutas response;
		final DaoFactory daoFactory = ListasDaoFactory.getInstance().getDaoFactory();
		final ListasDao listasDao = daoFactory.getListasDao();
		try {
			final List<RutaTO> rutasTO = listasDao
					.obtieneRutas(codigo);
			final List<Ruta> rutas = Mappers.mapperRutas(rutasTO);
			response = new ResponseRutas(rutas);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("fin obtieneRutas");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.listas.ws.ListasService#obtieneLocalidades(java.lang.String,
	 * java.lang.String, java.lang.String, long, long, long,
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseLocalidades obtieneLocalidades(final String codigoPais,
			final String codigoPostaPadre, 
			final String codigoPosta,
			final long codigoTipoNegocio, 
			final long codigoTipoInfluencia,
			final long codigoComuna, 
			final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("inicio obtieneLocalidades"); 
		
		ResponseLocalidades response;
		final DaoFactory daoFactory = ListasDaoFactory.getInstance().getDaoFactory();
		final ListasDao listasDao = daoFactory.getListasDao();
		try {
			final List<LocalidadTO> localidadesTO = listasDao.obtieneLocalidades(codigoPais,
							codigoPostaPadre, codigoPosta, codigoTipoNegocio,
							codigoTipoInfluencia, codigoComuna);
			final List<Localidad> localidades = Mappers
					.mapperLocalidades(localidadesTO);
			response = new ResponseLocalidades(localidades);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("fin obtieneLocalidades"); 
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.ws.ListasService#obtieneTraduccion(java.lang.String,
	 * java.lang.String, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseTraducciones obtieneTraduccion(
			final String tipo,
			final String codigoOrigen,
			final long codigoEmpresa,
			final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("inicio obtieneTraduccion"); 
		
		ResponseTraducciones response;
		final DaoFactory daoFactory = ListasDaoFactory.getInstance().getDaoFactory();
		final ListasDao listasDao = daoFactory.getListasDao();
		try {
			final List<TraduccionTO> traduccionesTO = listasDao.obtieneTraduccion(tipo, codigoOrigen, codigoEmpresa);
			final List<Traduccion> traducciones = Mappers
					.mapperTraducciones(traduccionesTO);
			response = new ResponseTraducciones(traducciones);
		} finally {
			LOGGER.info("cierre connection");
			daoFactory.close();
		}
		
		LOGGER.info("fin obtieneTraduccion");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.ws.ListasService#obtieneProductos(java.lang.String,
	 * long, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseProductos obtieneProductos(
			final String codigoFamilia,
			final long codigoEmpresa, 
			final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("inicio obtieneProductos"); 
		
		ResponseProductos response;
		final DaoFactory daoFactory = ListasDaoFactory.getInstance().getDaoFactory();
		final ListasDao listasDao = daoFactory.getListasDao();
		try {
			final List<ProductoTO> productosTO = 
					listasDao.obtieneProductos(codigoFamilia,
							codigoEmpresa);
			final List<Producto> productos = Mappers
					.mapperProductos(productosTO);
			response = new ResponseProductos(productos);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("fin obtieneProductos");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.listas.ws.ListasService#obtieneFamiliaProductos(cl.bluex.ws.
	 * common.head.Cabecera)
	 */
	@Override
	public ResponseFamiliaProductos obtieneFamiliaProductos(
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio obtieneFamiliaProductos");
		
		ResponseFamiliaProductos response;
		final DaoFactory daoFactory = ListasDaoFactory.getInstance().getDaoFactory();
		final ListasDao listasDao = daoFactory.getListasDao();
		try {
			final List<FamiliaProductoTO> familiaProductosTO = listasDao.obtieneFamiliaProductos();
			final List<FamiliaProducto> familiaProductos = Mappers
					.mapperFamiliaProductos(familiaProductosTO);
			response = new ResponseFamiliaProductos(
					familiaProductos);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("fin obtieneFamiliaProductos");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.ws.ListasService#obtieneTipoServicios(long,
	 * java.lang.String, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseTipoServicios obtieneTipoServicios(
			final long codigoEmpresa,
			final String tipo, 
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio obtieneTipoServicios");
		
		ResponseTipoServicios response;
		final DaoFactory daoFactory = ListasDaoFactory.getInstance().getDaoFactory();
		final ListasDao listasDao = daoFactory.getListasDao();
		try {
			final List<TipoServicioTO> tipoServiciosTO = listasDao.obtieneTipoServicios(codigoEmpresa,
							tipo);
			final List<TipoServicio> tipoServicios = Mappers
					.mapperTipoServicios(tipoServiciosTO);
			response = new ResponseTipoServicios(tipoServicios);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("fin obtieneTipoServicios");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.listas.ws.ListasService#obtienePersonalizacionesUsuario(long,
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponsePersonalizacionesUsuario obtienePersonalizacionesUsuario(
			final long codigoUsuario, 
			final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("inicio obtienePersonalizacionesUsuario");
		
		ResponsePersonalizacionesUsuario response;
		final DaoFactory daoFactory = ListasDaoFactory.getInstance().getDaoFactory();
		final ListasDao listasDao = daoFactory.getListasDao();
		try {
			final List<PersonalizacionUsuarioTO> personalizacionesTO = listasDao.obtienePersonalizacionesUsuario(
							codigoUsuario);
			final List<PersonalizacionUsuario> personalizaciones = Mappers
					.mapperPersonalizaciones(personalizacionesTO);
			response = new ResponsePersonalizacionesUsuario(
					personalizaciones);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("fin obtienePersonalizacionesUsuario");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.ws.ListasService#obtieneTipoDocumentoCliente(
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseTipoDocumentosCliente obtieneTipoDocumentoCliente(
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio obtieneTipoDocumentoCliente");
		
		ResponseTipoDocumentosCliente response;
		final DaoFactory daoFactory = ListasDaoFactory.getInstance().getDaoFactory();
		final ListasDao listasDao = daoFactory.getListasDao();
		try {
			final List<TipoDocumentoClienteTO> tipoDocumentosClienteTO = listasDao.obtieneTipoDocumentosCliente();
			final List<TipoDocumentoCliente> tipoDocumentosCliente = Mappers
					.mapperTipoDocumentoCliente(tipoDocumentosClienteTO);
			response = new ResponseTipoDocumentosCliente(
					tipoDocumentosCliente);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("fin obtieneTipoDocumentoCliente");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.ws.ListasService#obtieneTipoFormaPagoCliente(
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseTipoFormasPagoCliente obtieneTipoFormaPagoCliente(
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio obtieneTipoFormaPagoCliente");
		
		ResponseTipoFormasPagoCliente response;
		final DaoFactory daoFactory = ListasDaoFactory.getInstance().getDaoFactory();
		final ListasDao listasDao = daoFactory.getListasDao();
		try {
			final List<TipoFormaPagoClienteTO> valuesTO = listasDao.obtieneTipoFormaPagoCliente();
			final List<TipoFormaPagoCliente> values = Mappers
					.mapperTipoFormaPagoCliente(valuesTO);
			response = new ResponseTipoFormasPagoCliente(
					values);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("fin obtieneTipoFormaPagoCliente");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.listas.ws.ListasService#obtieneBancos(cl.bluex.ws.common.head
	 * .Cabecera)
	 */
	@Override
	public ResponseBancos obtieneBancos(final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("inicio obtieneBancos");
		
		ResponseBancos response;
		final DaoFactory daoFactory = ListasDaoFactory.getInstance().getDaoFactory();
		final ListasDao listasDao = daoFactory.getListasDao();
		try {
			final List<BancoTO> valuesTO = listasDao
					.obtieneBancos();
			final List<Banco> values = Mappers.mapperBancos(valuesTO);
			response = new ResponseBancos(values);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("fin obtieneBancos");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.listas.ws.ListasService#obtieneDiasPago(cl.bluex.ws.common.head
	 * .Cabecera)
	 */
	@Override
	public ResponseDiasPago obtieneDiasPago(final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("inicio obtieneDiasPago");
		
		ResponseDiasPago response;
		final DaoFactory daoFactory = ListasDaoFactory.getInstance().getDaoFactory();
		final ListasDao listasDao = daoFactory.getListasDao();
		try {
			final List<DiaPagoTO> valuesTO = listasDao
					.obtieneDiasPago();
			final List<DiaPago> values = Mappers.mapperDiasPago(valuesTO);
			response = new ResponseDiasPago(values);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("fin obtieneDiasPago");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.listas.ws.ListasService#obtieneMonedas(cl.bluex.ws.common.head
	 * .Cabecera)
	 */
	@Override
	public ResponseMonedas obtieneMonedas(final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("inicio obtieneMonedas");
		
		ResponseMonedas response;
		final DaoFactory daoFactory = ListasDaoFactory.getInstance().getDaoFactory();
		final ListasDao listasDao = daoFactory.getListasDao();
		try {
			final List<MonedaTO> valuesTO = listasDao
					.obtieneMonedas();
			final List<Moneda> values = Mappers.mapperMonedas(valuesTO);
			response = new ResponseMonedas(values);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("fin obtieneMonedas");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.ws.ListasService#obtieneOficinas(long,
	 * java.lang.String, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseOficinas obtieneOficinas(final long codigoEmpresa,
			final String codigoPosta, final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("inicio obtieneOficinas");
		
		ResponseOficinas response;
		final DaoFactory daoFactory = ListasDaoFactory.getInstance().getDaoFactory();
		final ListasDao listasDao = daoFactory.getListasDao();
		try {
			final List<OficinaTO> oficinasTO = listasDao
					.obtieneOficinas(codigoEmpresa, codigoPosta);
			final List<Oficina> oficinas = Mappers.mapperOficinas(oficinasTO);
			response = new ResponseOficinas(oficinas);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("fin obtieneOficinas");
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.ws.ListasService#obtieneCentrosCosto(long, long,
	 * long, long, java.lang.String, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseCentrosCosto obtieneCentrosCosto(
			final long codigoEmpresa,
			final long codigoCliente, 
			final long codigoSucursalCliente,
			final long codigoTipoCliente, 
			final String codigoCentroCosto,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio obtieneCentrosCosto");
		
		ResponseCentrosCosto response;
		final DaoFactory daoFactory = ListasDaoFactory.getInstance().getDaoFactory();
		final ListasDao listasDao = daoFactory.getListasDao();
		try {
			final List<CentroCostoTO> centros = listasDao
					.obtieneCentrosCosto(codigoEmpresa, codigoCliente,
							codigoSucursalCliente, codigoTipoCliente,
							codigoCentroCosto);
			response = new ResponseCentrosCosto(Mappers.mapperCentroCosto(centros));
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("fin obtieneCentrosCosto");
		return response;
	}

	private ResponsePostas obtPostas(final String codigo,
			final long tipoNegocio, final long comuna) throws BluexException {
		
		ResponsePostas response;
		final DaoFactory daoFactory = ListasDaoFactory.getInstance().getDaoFactory();
		final ListasDao listasDao = daoFactory.getListasDao();
		try {
			final List<PostaTO> postasTO = listasDao
					.obtienePostas(codigo, tipoNegocio, comuna);
			final List<Posta> postas = Mappers.mapperPostas(postasTO);
			response = new ResponsePostas(postas);
		} finally {
			daoFactory.close();
		}
		
		return response;
	}

	
	/* (non-Javadoc)
	 * @see cl.bluex.listas.ws.ListasService#obtieneConversiones(java.lang.String, 
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseObtieneConversiones obtieneConversiones(
			final String tipo,
			final long codigoEmpresa,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio obtieneConversiones");
		
		ResponseObtieneConversiones response;
		final DaoFactory daoFactory = ListasDaoFactory.getInstance().getDaoFactory();
		final ListasDao listasDao = daoFactory.getListasDao();
		try {
			final List<ConversionTO> conversionesTO = listasDao.obtieneConversiones(tipo, codigoEmpresa);
			final List<Conversion> conversiones = Mappers
					.mapperConversion(conversionesTO);
			response = new ResponseObtieneConversiones(
					conversiones);
		} finally {
			daoFactory.close();
		}
		
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.listas.ws.ListasService#obtieneTipoInfluencias(cl.bluex.ws.common
	 * .head.Cabecera)
	 */
	@Override
	public ResponseObtieneTipoInfluencias obtieneTipoInfluencias(
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio obtieneTipoInfluencias");
		
		ResponseObtieneTipoInfluencias response;
		final DaoFactory daoFactory = ListasDaoFactory.getInstance().getDaoFactory();
		final ListasDao listasDao = daoFactory.getListasDao();
		try {
			final List<TipoInfluenciaTO> tipoInfluenciaTO = listasDao.obtieneTipoInfluencias();
			final List<TipoInfluencia> tiposInfluencias = Mappers
					.mapperTipoInfluencia(tipoInfluenciaTO);
			response = new ResponseObtieneTipoInfluencias(
					tiposInfluencias);
		} finally {
			daoFactory.close();
		}
		
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.listas.ws.ListasService#obtieneTipoNegocios(cl.bluex.ws.common
	 * .head.Cabecera)
	 */
	@Override
	public ResponseObtieneTipoNegocios obtieneTipoNegocios(
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio obtieneTipoNegocios");
		
		ResponseObtieneTipoNegocios response;
		final DaoFactory daoFactory = ListasDaoFactory.getInstance().getDaoFactory();
		final ListasDao listasDao = daoFactory.getListasDao();
		try {
			final List<TipoNegocioTO> tiposNegociosTO = listasDao.obtieneTipoNegocios();
			final List<TipoNegocio> tiposNegocios = Mappers
					.mapperTipoNegocio(tiposNegociosTO);
			response = new ResponseObtieneTipoNegocios(
					tiposNegocios);
		} finally {
			daoFactory.close();
		}
		
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.listas.ws.ListasService#obtieneSorter(cl.bluex.ws.common.head
	 * .Cabecera)
	 */
	@Override
	public ResponseObtieneSorter obtieneSorter(final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("inicio obtieneSorter");
		
		
		ResponseObtieneSorter response;
		final DaoFactory daoFactory = ListasDaoFactory.getInstance().getDaoFactory();
		final ListasDao listasDao = daoFactory.getListasDao();
		try {
			final List<SorterTO> tos = listasDao
					.obtieneSorter();
			final List<Sorter> sorters = Mappers.mapperSorter(tos);
			response = new ResponseObtieneSorter(sorters);
		} finally {
			daoFactory.close();
		}
		
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.listas.ws.ListasService#ObtieneTraduccionEmpresa(cl.bluex.ws
	 * .common.head.Cabecera)
	 */
	@Override
	public ResponseTraduccionEmpresa obtieneTraduccionEmpresa(
			final RequestObtieneTraduccionEmpresas request, final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio obtieneTraduccionEmpresa");
		
		ResponseTraduccionEmpresa response;
		final DaoFactory daoFactory = ListasDaoFactory.getInstance().getDaoFactory();
		final ListasDao listasDao = daoFactory.getListasDao();
		try {
			final List<TraduccionEmpresaTO> tos = listasDao.obtieneTraduccionEmpresa(
							request.getCodigo(), request.getCodigoUsuario(),
							request.getCodigoSistema(),
							request.getCodigoAplicacion());
			final List<TraduccionEmpresa> tipos = Mappers
					.mapperTraduccionEmpresa(tos);
			response = new ResponseTraduccionEmpresa(tipos);
		} finally {
			daoFactory.close();
		}
		
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.ws.ListasService#obtieneProductosServicios(long,
	 * java.lang.String, long, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseProductosServicios obtieneProductosServicios(
			final long codigoEmpresa, 
			final String codigoOrigen,
			final String tipo, 
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio obtieneProductosServicios");
		
		ResponseProductosServicios response;
		final DaoFactory daoFactory = ListasDaoFactory.getInstance().getDaoFactory();
		final ListasDao listasDao = daoFactory.getListasDao();
		try {
			final List<ProductoServicioTO> tos = listasDao.obtieneProductosServicios(
							codigoEmpresa, codigoOrigen, tipo);
			final List<ProductoServicio> beans = Mappers
					.mapperProductoServicio(tos);
			response = new ResponseProductosServicios(beans);
		} finally {
			daoFactory.close();
		}
		
		return response;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.listas.ws.ListasService#obtieneTraduccionProducto(
	 * cl.bluex.listas.bean.request.RequestObtieneTraduccionProducto, 
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseTraduccionesProducto obtieneTraduccionProducto(
			final RequestObtieneTraduccionProducto request, 
			final Cabecera cabecera) 
					throws BluexException {
		LOGGER.info("inicio obtieneTraduccionProducto");
		
		ResponseTraduccionesProducto response;
		final DaoFactory daoFactory = ListasDaoFactory.getInstance().getDaoFactory();
		final ListasDao listasDao = daoFactory.getListasDao();
		try {
			final List<TraduccionProductoTO> tos = listasDao.obtieneTraduccionProducto(
							request.getCodigoEmpresa(), request.getTipo());
			final List<TraduccionProducto> beans = Mappers
					.mapperTraduccionProducto(tos);
			response = new ResponseTraduccionesProducto(
					beans);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin obtieneTraduccionProducto");
		return response;
	}

	/* (non-Javadoc)
	 * @see cl.bluex.listas.ws.ListasService#obtieneParametrosGenerales(cl.bluex.listas.bean.request.RequestObtieneParametrosGenerales, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	
	public ResponseObtieneParametrosGenerales obtieneParametrosGenerales(
			final RequestObtieneParametrosGenerales request,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("inicio obtieneParametrosGenerales");
		ResponseObtieneParametrosGenerales response;
		
		final DaoFactory daoFactory = ListasDaoFactory.getInstance().getDaoFactory();
		final ListasDao listasDao = daoFactory.getListasDao();
		try {
			final List<ParametroGeneralTO> tos = listasDao.obtieneParametrosGenerales(request.getIdParametro(), request.getNombreCampo());
			
			final List<ParametroGeneral> beans = Mappers.mapperParametrosGenerales(tos);
			
			response = new ResponseObtieneParametrosGenerales(beans); 
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("fin obtieneParametrosGenerales");
		return response;
	}

}
