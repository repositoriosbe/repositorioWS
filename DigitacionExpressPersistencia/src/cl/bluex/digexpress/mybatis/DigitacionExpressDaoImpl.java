package cl.bluex.digexpress.mybatis;

import static cl.bluex.ws.common.util.Constantes.CANTIDAD_DOCTOS_DIGITADOS;
import static cl.bluex.ws.common.util.Constantes.CANTIDAD_DOCTOS_ESTIMADOS;
import static cl.bluex.ws.common.util.Constantes.CANTIDAD_PIEZAS;
import static cl.bluex.ws.common.util.Constantes.CODIGO;
import static cl.bluex.ws.common.util.Constantes.CODIGO_AGRUPACION;
import static cl.bluex.ws.common.util.Constantes.CODIGO_BODEGA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_CLIENTE;
import static cl.bluex.ws.common.util.Constantes.CODIGO_COMUNA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_EMPRESA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_ESTADO;
import static cl.bluex.ws.common.util.Constantes.CODIGO_FAMILIA_PRODUCTO;
import static cl.bluex.ws.common.util.Constantes.CODIGO_MNPL;
import static cl.bluex.ws.common.util.Constantes.CODIGO_OFICINA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_PAIS;
import static cl.bluex.ws.common.util.Constantes.CODIGO_POSTA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_PRODUCTO;
import static cl.bluex.ws.common.util.Constantes.CODIGO_PSTA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_RUTA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_SORTER;
import static cl.bluex.ws.common.util.Constantes.CODIGO_SUCURSAL_CLIENTE;
import static cl.bluex.ws.common.util.Constantes.CODIGO_TIPO_CLIENTE;
import static cl.bluex.ws.common.util.Constantes.CODIGO_TIPO_DOCUMENTO;
import static cl.bluex.ws.common.util.Constantes.CODIGO_TIPO_SERVICIO;
import static cl.bluex.ws.common.util.Constantes.CODIGO_USUARIO;
import static cl.bluex.ws.common.util.Constantes.COURIER;
import static cl.bluex.ws.common.util.Constantes.DESCRIPCION;
import static cl.bluex.ws.common.util.Constantes.DESCRIPCION_ESTADO;
import static cl.bluex.ws.common.util.Constantes.DESCRIPCION_SORTER;
import static cl.bluex.ws.common.util.Constantes.DIGITACION_ORIGEN;
import static cl.bluex.ws.common.util.Constantes.EEVV_NMR_ID;
import static cl.bluex.ws.common.util.Constantes.FECHA_CIERRE;
import static cl.bluex.ws.common.util.Constantes.FECHA_CREACION;
import static cl.bluex.ws.common.util.Constantes.FOLIO;
import static cl.bluex.ws.common.util.Constantes.FOLIO_HOJA_RUTA;
import static cl.bluex.ws.common.util.Constantes.ID;
import static cl.bluex.ws.common.util.Constantes.ID_CABECERA_AGRUPACION;
import static cl.bluex.ws.common.util.Constantes.PATENTE;
import static cl.bluex.ws.common.util.Constantes.MOSTRAR_MONITOR;
import static cl.bluex.ws.common.util.Constantes.NUMERO_DOCUMENTO;
import static cl.bluex.ws.common.util.Constantes.RESULTADO;
import static cl.bluex.ws.common.util.Constantes.SIN_VALOR_PARA_CODIGO;
import static cl.bluex.ws.common.util.Constantes.SUCURSAL_CLIENTE;
import static cl.bluex.ws.common.util.Constantes.TIPO_BULTO;
import static cl.bluex.ws.common.util.Constantes.TIPO_HOJA_RUTA;
import static cl.bluex.ws.common.util.Constantes.TIPO_NEGOCIO;
import static cl.bluex.ws.common.util.Constantes.ESTADO_RUTA;
import static cl.bluex.ws.common.util.Constantes.FOLIO_RUTA;
import static cl.bluex.ws.common.util.Constantes.UNCHECKED;
import static cl.bluex.ws.common.util.Constantes.VOUCHER;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import cl.bluex.digexpress.DigitacionExpressDao;
import cl.bluex.digexpress.mapper.DigitacionExpressMapper;
import cl.bluex.digmodel.to.AgrupacionTO;
import cl.bluex.digmodel.to.CabeceraAgrupacionTO;
import cl.bluex.digmodel.to.ClienteTO;
import cl.bluex.digmodel.to.DetalleDigitacionExpressTO;
import cl.bluex.digmodel.to.EspecieValoradaTO;
import cl.bluex.digmodel.to.HojaRutaTO;
import cl.bluex.digmodel.to.ValoradoTO;
import cl.bluex.ws.common.dao.AbstractDao;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.util.Util;

/**
 * Implementacion interfaz Dao.
 * 
 * @author Edgardo Herrera
 * 
 */
public class DigitacionExpressDaoImpl extends
AbstractDao<DigitacionExpressMapper> implements DigitacionExpressDao {
	
	private static final Logger LOGGER = Logger.getLogger(DigitacionExpressDaoImpl.class);
	
	private Map<String, Object> params = new HashMap<String, Object>();

	/**
	 * constructor.
	 */
	public DigitacionExpressDaoImpl(final SqlSession sqlSession) {
		super(sqlSession);
	}

	@Override
	public Class<DigitacionExpressMapper> getMapperClass() {
		return DigitacionExpressMapper.class;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.digexpress.dao.Dao#actualizaEncDigExpress(cl.bluex.digmodel.
	 * to.CabeceraAgrupacionTO)
	 */
	@Override
	public CabeceraAgrupacionTO actualizaEncDigExpress(
			final CabeceraAgrupacionTO valueTO) throws BluexException {
		params.put(ID, valueTO.getId());
		params.put(CODIGO_RUTA, valueTO.getCodigoRuta());
		params.put(COURIER, valueTO.getCourier());
		params.put(CODIGO_EMPRESA, valueTO.getCodigoEmpresa());
		params.put(DESCRIPCION, valueTO.getDescripcion());
		params.put(CANTIDAD_DOCTOS_ESTIMADOS,
				valueTO.getCantidadDctosEstimados());
		params.put(TIPO_BULTO, valueTO.getTipoBulto());
		params.put(FOLIO_HOJA_RUTA, valueTO.getFolioHojaRuta());
		params.put(CODIGO_USUARIO, valueTO.getCodigoUsuario());
		params.put(CODIGO_POSTA, valueTO.getCodigoPosta());
		params.put(MOSTRAR_MONITOR, valueTO.getMostrarMonitor());
		params.put(CODIGO_SORTER, valueTO.getCodigoSorter());
		params.put(DIGITACION_ORIGEN, valueTO.getDigitacionOrigen());

		getMapper().actualizaCabeceraAgrupacion(params);

		@SuppressWarnings("unchecked")
		final List<CabeceraAgrupacionTO> cabeceras = (List<CabeceraAgrupacionTO>) params
				.get(RESULTADO);

		if (cabeceras.isEmpty()) {
			throw new BluexException("-1", SIN_VALOR_PARA_CODIGO);
		}
		return cabeceras.get(0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.digexpress.dao.Dao#insertaDigitExpress(cl.bluex.digmodel.to.
	 * DetalleDigitacionExpressTO)
	 */
	@Override
	public Long insertaDigitExpress(final DetalleDigitacionExpressTO to)
			throws BluexException {

		
		LOGGER.info("[DigitacionExpressDaoImpl][insertaDigitExpress] Iniciando llamada PL :");
		
		params = new HashMap<String, Object>();
		params.put(ID, to.getId());
		params.put(EEVV_NMR_ID, to.getEevvNmrId());
		params.put(CANTIDAD_PIEZAS, to.getCantidadPiezas());
		params.put(CODIGO_PRODUCTO, to.getCodigoProducto());
		params.put(CODIGO_TIPO_SERVICIO, to.getCodigoTipoServicio());
		params.put(CODIGO_MNPL, to.getCodigoMnpl());
		params.put(CODIGO_TIPO_DOCUMENTO, to.getCodigoTipoDocumento());
		params.put(CODIGO_PAIS, to.getCodigoPais());
		params.put(CODIGO_PSTA, to.getCodigoPsta());
		params.put(CODIGO_COMUNA, to.getCodigoComuna());
		params.put(CODIGO_FAMILIA_PRODUCTO, to.getCodigoFamiliaProducto());
		params.put(CODIGO_CLIENTE, to.getCodigoCliente());
		params.put(CODIGO_SUCURSAL_CLIENTE, to.getCodigoSucursalCliente());
		params.put(CODIGO_TIPO_CLIENTE, to.getCodigoTipoCliente());

		LOGGER.info("[DigitacionExpressDaoImpl][insertaDigitExpress] Parametros de Entrada :" + params.toString());
		
		getMapper().insertaDigitExpress(params);
		
		LOGGER.info("[DigitacionExpressDaoImpl][insertaDigitExpress] Parametros de Salida :");
		LOGGER.info("[DigitacionExpressDaoImpl][insertaDigitExpress] resultado	:" + params.get("resultado").toString());
		LOGGER.info("[DigitacionExpressDaoImpl][insertaDigitExpress] codError 	:" + params.get("codError").toString());
		LOGGER.info("[DigitacionExpressDaoImpl][insertaDigitExpress] descError 	:" + params.get("descError").toString());

		this.esExcepcion();
		
		return (Long) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digexpress.dao.Dao#obtieneDigitExpress(long, long)
	 */
	@SuppressWarnings(UNCHECKED)
	@Override
	public List<DetalleDigitacionExpressTO> obtieneDigitExpress(final long id,
			final long eevvNmrId) throws BluexException {
		params = new HashMap<String, Object>();

		params.put(ID, id);
		params.put(EEVV_NMR_ID, eevvNmrId);

		getMapper().obtieneDigitExpress(params);

		return (List<DetalleDigitacionExpressTO>) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.digexpress.dao.Dao#eliminaDigitExpress(cl.bluex.digmodel.to.
	 * DetalleDigitacionExpressTO)
	 */
	@Override
	public Long eliminaDigitExpress(final DetalleDigitacionExpressTO detalleTO)
			throws BluexException {
		params = new HashMap<String, Object>();

		params.put(ID, detalleTO.getId());
		params.put(EEVV_NMR_ID, detalleTO.getEevvNmrId());

		getMapper().eliminaDigitExpress(params);

		return (Long) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digitacion.dao.Dao#eliminarAgrupacion(java.lang.Long)
	 */
	@Override
	public Long eliminarAgrupacion(final Long codigo) throws BluexException {
		params.put(CODIGO, codigo);

		getMapper().eliminarAgrupacion(params);

		return (Long) params.get(RESULTADO);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digitacion.dao.Dao#cerrarAgrupacion(java.lang.Long)
	 */
	@Override
	public AgrupacionTO cerrarAgrupacion(final Long codigo)
			throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO, codigo);

		getMapper().cerrarAgrupacion(params);

		final AgrupacionTO agrupacionTO = new AgrupacionTO();
		agrupacionTO.setCodigoEstado((String) params.get(CODIGO_ESTADO));

		return agrupacionTO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digexpress.dao.Dao#modificarEstadoAgrupacion(long,
	 * java.lang.String)
	 */
	@Override
	public AgrupacionTO modificarEstadoAgrupacion(
			final long idCabeceraAgrupacion, final String codigoEstado)
			throws BluexException {
		params = new HashMap<String, Object>();
		params.put(ID_CABECERA_AGRUPACION, idCabeceraAgrupacion);
		params.put(CODIGO_ESTADO, codigoEstado);

		getMapper().modificarEstadoAgrupacion(params);

		esExcepcion();

		final AgrupacionTO valueTO = new AgrupacionTO();
		valueTO.setCodigoAgrupacion((String) params.get(CODIGO_AGRUPACION));

		return valueTO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digexpress.dao.Dao#obtieneAgrupacion(cl.bluex.digmodel.to.
	 * CabeceraAgrupacionTO)
	 */
	@Override
	public CabeceraAgrupacionTO obtieneAgrupacion(
			final CabeceraAgrupacionTO valueTO) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_RUTA, valueTO.getCodigoRuta());
		params.put(COURIER, valueTO.getCourier());
		params.put(CODIGO_EMPRESA, valueTO.getCodigoEmpresa());
		params.put(DESCRIPCION, valueTO.getDescripcion());
		params.put(CANTIDAD_DOCTOS_ESTIMADOS,
				valueTO.getCantidadDctosEstimados());
		params.put(TIPO_BULTO, valueTO.getTipoBulto());
		params.put(FOLIO_HOJA_RUTA, valueTO.getFolioHojaRuta());
		params.put(CODIGO_USUARIO, valueTO.getCodigoUsuario());
		params.put(CODIGO_POSTA, valueTO.getCodigoPosta());
		params.put(MOSTRAR_MONITOR, valueTO.getMostrarMonitor());
		params.put(CODIGO_SORTER, valueTO.getCodigoSorter());
		params.put(DIGITACION_ORIGEN, valueTO.getDigitacionOrigen());

		getMapper().obtieneAgrupacion(params);

		this.esExcepcion();

		final CabeceraAgrupacionTO cabeceraTO = new CabeceraAgrupacionTO();
		cabeceraTO.setId((Long) params.get(ID_CABECERA_AGRUPACION));
		cabeceraTO.setCodigoAgrupacion((String) params.get(CODIGO_AGRUPACION));
		cabeceraTO.setCodigoEstado((String) params.get(CODIGO_ESTADO));
		cabeceraTO.setVoucher((Long) params.get(VOUCHER));
		return cabeceraTO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digexpress.dao.Dao#obtieneCabeceraAgrupacion(long)
	 */
	@Override
	public CabeceraAgrupacionTO obtieneCabeceraAgrupacion(final long codigo)
			throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO, codigo);
		getMapper().obtieneCabeceraAgrupacion(params);

		this.esExcepcion();

		final CabeceraAgrupacionTO cabeceraTO = new CabeceraAgrupacionTO();
		cabeceraTO.setCodigoAgrupacion((String) params.get(CODIGO_AGRUPACION));
		cabeceraTO.setCodigoEmpresa(Util.validaLong((Long) params.get(CODIGO_EMPRESA)));
		cabeceraTO.setCantidadDctosEstimados(Util.validaLong((Long) params.get(CANTIDAD_DOCTOS_ESTIMADOS)));
		cabeceraTO.setCantidadDoctosDigitados(Util.validaLong((Long) params.get(CANTIDAD_DOCTOS_DIGITADOS)));
		cabeceraTO.setCodigoUsuario(Util.validaLong((Long) params.get(CODIGO_USUARIO)));
		cabeceraTO.setFechaCreacion((Date) params.get(FECHA_CREACION));
		cabeceraTO.setFechaCierre((Date) params.get(FECHA_CIERRE));
		cabeceraTO.setCodigoEstado((String) params.get(CODIGO_ESTADO));
		cabeceraTO.setDescripcionEstado((String) params.get(DESCRIPCION_ESTADO));
		cabeceraTO.setTipoBulto((String) params.get(TIPO_BULTO));
		cabeceraTO.setCodigoRuta((Integer) params.get(CODIGO_RUTA));
		cabeceraTO.setFolioHojaRuta((String) params.get(FOLIO_HOJA_RUTA));
		cabeceraTO.setCourier((String) params.get(COURIER));
		cabeceraTO.setCodigoSorter(Util.validaLong((Long) params.get(CODIGO_SORTER)));
		cabeceraTO.setDescripcionSorter((String) params.get(DESCRIPCION_SORTER));
		cabeceraTO.setDescripcion((String) params.get(DESCRIPCION));
		cabeceraTO.setDigitacionOrigen((String) params.get(DIGITACION_ORIGEN));
		cabeceraTO.setCodigoPosta((String) params.get(CODIGO_POSTA));

		return cabeceraTO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digexpress.dao.Dao#obtieneDatosHojaRuta(java.lang.String)
	 */
	@Override
	public HojaRutaTO obtieneDatosHojaRuta(final String folio)
			throws BluexException {
		params.put(FOLIO, folio);
		getMapper().obtieneDatosHojaRuta(params);

		this.esExcepcion();

		final HojaRutaTO hojaTO = new HojaRutaTO();

		hojaTO.setCourier((String) params.get(COURIER));
		hojaTO.setCodigoRuta((Long) params.get(CODIGO_RUTA));
		hojaTO.setCodigoPosta((String) params.get(CODIGO_POSTA));
		hojaTO.setCodigoBodega((String) params.get(CODIGO_BODEGA));
		hojaTO.setCodigoOficina((String) params.get(CODIGO_OFICINA));
		hojaTO.setCodigoEmpresa((Long) params.get(CODIGO_EMPRESA));
		hojaTO.setTipoNegocio((Long) params.get(TIPO_NEGOCIO));
		hojaTO.setTipoHojaRuta((String) params.get(TIPO_HOJA_RUTA));
		hojaTO.setEstadoRuta((String) params.get(ESTADO_RUTA));
		hojaTO.setFolioRuta((String) params.get(FOLIO_RUTA));
		hojaTO.setPatente((String) params.get(PATENTE));
		

		return hojaTO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digexpress.dao.Dao#validaEspecieValorada(long,
	 * java.lang.String, long)
	 */
	@Override
	public EspecieValoradaTO validaEspecieValorada(final long codigoEmpresa,
			final String codigoTipoDocumento, final long numeroDocumento)
			throws BluexException {
		params.put(CODIGO_EMPRESA, codigoEmpresa);
		params.put(CODIGO_TIPO_DOCUMENTO, codigoTipoDocumento);
		params.put(NUMERO_DOCUMENTO, numeroDocumento);
		getMapper().validaEspecieValorada(params);

		this.esExcepcion();

		final Long idEspecieValorada = (Long) params.get(EEVV_NMR_ID);
		final Long codigoCliente = (Long) params.get(CODIGO_CLIENTE);
		final Long sucursalCliente = (Long) params.get(SUCURSAL_CLIENTE);

		final EspecieValoradaTO especie = new EspecieValoradaTO();
		if (idEspecieValorada != null) {
			especie.setEevvNmrId(idEspecieValorada);
		}
		if (codigoCliente != null) {
			especie.setCodigoCliente(codigoCliente);
		}
		if (sucursalCliente != null) {
			especie.setSucursalCliente(sucursalCliente);
		}

		return especie;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digexpress.dao.Dao#obtieneClientesValorados(long)
	 */
	@SuppressWarnings(UNCHECKED)
	@Override
	public List<ClienteTO> obtieneClientesValorados(final long codigoEmpresa)
			throws BluexException {
		params.put(CODIGO_EMPRESA, codigoEmpresa);
		getMapper().obtieneClientesValorados(params);

		return (List<ClienteTO>) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digexpress.dao.Dao#obtieneValorados(long, long, long, long)
	 */
	@SuppressWarnings(UNCHECKED)
	@Override
	public List<ValoradoTO> obtieneValorados(
			final long codigoCliente,
			final long codigoTipoCliente, 
			final long codigoEmpresa,
			final long codigoSucursalCliente) 
			throws BluexException {
		params = new HashMap<String, Object>();
		
		params.put(CODIGO_CLIENTE, codigoCliente);
		params.put(CODIGO_TIPO_CLIENTE, codigoTipoCliente);
		params.put(CODIGO_EMPRESA, codigoEmpresa);
		params.put(CODIGO_SUCURSAL_CLIENTE, codigoSucursalCliente);

		getMapper().obtieneValorados(params);

		return (List<ValoradoTO>) params.get(RESULTADO);
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.digexpress.DigitacionExpressDao#obtieneDatosCourier(java.lang.String, java.lang.String, java.lang.String)
	 */
	public HojaRutaTO obtieneDatosCourier( long codigoRuta,  long codigoEmpresa,  int codigoSorter) throws BluexException{
		
		params = new HashMap<String, Object>();
		params.put(CODIGO_RUTA, codigoRuta);
		params.put(CODIGO_EMPRESA, codigoEmpresa);
		params.put(CODIGO_SORTER, codigoSorter);
		
		getMapper().obtieneDatosCourier(params);

		this.esExcepcion();
		
		HojaRutaTO to = new HojaRutaTO(); 
		to.setCodigoRuta((Long) params.get(CODIGO_RUTA));
		to.setCodigoEmpresa((Long) params.get(CODIGO_EMPRESA));
		to.setCodigoSorter((Integer) params.get(CODIGO_SORTER));
		to.setCourier((String) params.get(COURIER));
		to.setCodigoPosta((String) params.get(CODIGO_POSTA));
		to.setCodigoBodega((String) params.get(CODIGO_BODEGA));
		to.setCodigoOficina((String) params.get(CODIGO_OFICINA));
		to.setTipoNegocio((Long) params.get(TIPO_NEGOCIO));
		to.setTipoHojaRuta((String) params.get(TIPO_HOJA_RUTA));
		to.setEstadoRuta((String) params.get(ESTADO_RUTA));
		to.setFolioRuta((String) params.get(FOLIO_RUTA));
		to.setPatente((String) params.get(PATENTE));
		
		return to;
	
	}
	
	
	private void esExcepcion() throws BluexException {
		final Integer codError = (Integer) params.get(COD_ERROR);
		final String descError = (String) params.get(DESC_ERROR);

		// procesaExcepcion(codError, descError);
		if (codError != 0) {
			throw new BluexException(codError.toString(), descError);
		}
	}

}
