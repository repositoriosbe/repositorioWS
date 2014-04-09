package cl.bluex.generadoretiqueta.mybatis;


import static cl.bluex.ws.common.util.Constantes.*;

//import static cl.bluex.ws.common.util.Constantes.BODEGA;
//import static cl.bluex.ws.common.util.Constantes.CODIGO;
//import static cl.bluex.ws.common.util.Constantes.CODIGO_CLIENTE;
//import static cl.bluex.ws.common.util.Constantes.CODIGO_COMUNA;
//import static cl.bluex.ws.common.util.Constantes.CODIGO_EMPRESA;
//import static cl.bluex.ws.common.util.Constantes.CODIGO_EMPRESA_TRAD;
//import static cl.bluex.ws.common.util.Constantes.CODIGO_ERROR_VALIDO;
//import static cl.bluex.ws.common.util.Constantes.CODIGO_FORMATO_IMPRESION;
//import static cl.bluex.ws.common.util.Constantes.CODIGO_IMPRESORA;
//import static cl.bluex.ws.common.util.Constantes.CODIGO_INFLUENCIA;
//import static cl.bluex.ws.common.util.Constantes.CODIGO_POSTA;
//import static cl.bluex.ws.common.util.Constantes.CODIGO_SUB_ZONA;
//import static cl.bluex.ws.common.util.Constantes.CODIGO_SUCURSAL_CLIENTE;
//import static cl.bluex.ws.common.util.Constantes.CODIGO_TIPO_CLIENTE;
//import static cl.bluex.ws.common.util.Constantes.CODIGO_TIPO_NEGOCIO;
//import static cl.bluex.ws.common.util.Constantes.CODIGO_TIPO_SERVICIO;
//import static cl.bluex.ws.common.util.Constantes.CODIGO_USUARIO;
//import static cl.bluex.ws.common.util.Constantes.CODIGO_ZONA;
//import static cl.bluex.ws.common.util.Constantes.CURIER;
//import static cl.bluex.ws.common.util.Constantes.EEVV_NMR_ID;
//import static cl.bluex.ws.common.util.Constantes.ID_ENCABEZADO;
//import static cl.bluex.ws.common.util.Constantes.NOMBRE_COMUNA;
//import static cl.bluex.ws.common.util.Constantes.NOMBRE_USUARIO;
//import static cl.bluex.ws.common.util.Constantes.NRO_BULTO;
//import static cl.bluex.ws.common.util.Constantes.NUMERO_FOLIO;
//import static cl.bluex.ws.common.util.Constantes.NUMERO_REFERENCIA;
//import static cl.bluex.ws.common.util.Constantes.NUMERO_SERIE_OSER;
//import static cl.bluex.ws.common.util.Constantes.MENSAJE;
//import static cl.bluex.ws.common.util.Constantes.OFICINA;
//import static cl.bluex.ws.common.util.Constantes.RESULTADO;
//import static cl.bluex.ws.common.util.Constantes.TIPO_BODEGA;
//import static cl.bluex.ws.common.util.Constantes.TIPO_DOCUMENTO;
//import static cl.bluex.ws.common.util.Constantes.TIPO_ETIQUETA;
//import static cl.bluex.ws.common.util.Constantes.UNCHECKED;
//import static cl.bluex.ws.common.util.Constantes.CODIGO_TIPO_DOCUMENTO;
//import static cl.bluex.ws.common.util.Constantes.CODIGO_PIEZA;
//import static cl.bluex.ws.common.util.Constantes.OBSERVACION;
//import static cl.bluex.ws.common.util.Constantes.CODIGO_TIPO_ESTADO;
//import static cl.bluex.ws.common.util.Constantes.CODIGO_BODEGA_ENTRADA;
//import static cl.bluex.ws.common.util.Constantes.TIPO_CODIGO_BODEGA_ENTRADA;
//import static cl.bluex.ws.common.util.Constantes.CODIGO_OFICINA_ENTRADA;
//import static cl.bluex.ws.common.util.Constantes.CODIGO_PERSONA;
//import static cl.bluex.ws.common.util.Constantes.CANTIDAD_PIEZAS;
//import static cl.bluex.ws.common.util.Constantes.PESO_FISICO;
//import static cl.bluex.ws.common.util.Constantes.CODIGO_POSTA;
//import static cl.bluex.ws.common.util.Constantes.CODIGO_TIPO_NEGOCIO;
//import static cl.bluex.ws.common.util.Constantes.CODIGO_TIPO_SERVICIO;
//import static cl.bluex.ws.common.util.Constantes.CODIGO_TIPO_SERVICIO_PADRE;
//import static cl.bluex.ws.common.util.Constantes.FOTO_NOMBRE;
//import static cl.bluex.ws.common.util.Constantes.FOTO_FECHA_ENVIO;
//import static cl.bluex.ws.common.util.Constantes.RESPONSABLE_RUT;
//import static cl.bluex.ws.common.util.Constantes.RESPONSABLE_DESCRIPCION;
//import static cl.bluex.ws.common.util.Constantes.RESPONSABLE_MOTIVO;
//import static cl.bluex.ws.common.util.Constantes.RUTA_PATENTE;
//import static cl.bluex.ws.common.util.Constantes.RUTA_NUMERO_ODOMETRO;
//import static cl.bluex.ws.common.util.Constantes.RUTA_CODIGO;
//import static cl.bluex.ws.common.util.Constantes.RESPONSABLE_NOMBRE;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import cl.bluex.generadoretiqueta.GeneradorEtiquetaDao;
import cl.bluex.generadoretiqueta.mapper.GeneradorEtiquetaMapper;
import cl.bluex.generadoretiqueta.to.CodigoBultoTO;
import cl.bluex.generadoretiqueta.to.DatosGeneracionEtiquetaHubTO;
import cl.bluex.generadoretiqueta.to.DatosGeneracionEtiquetaTO;
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
import cl.bluex.ws.common.dao.AbstractDao;
import cl.bluex.ws.common.exceptions.BluexException;

// TODO: Auto-generated Javadoc
/**
 * Implementacion interfaz Dao.
 * 
 * @version 1.0
 * @author Edgardo Herrera
 * 
 * @version 1.1, 09-12-2013 Ricardo Moscoso. (Blue Express)
 * 			Se agrega nuevo metodo {@link #obtieneDatosOperacionales}.
 * 
 * @version 1.2, 23-12-2013 Ricardo Moscoso. (Blue Express)
 * 			Se agrega nuevo metodo {@link #insertaPinchazoPzmv}.
 * 
 * 
 */
public class GeneradorEtiquetaDaoImpl extends
		AbstractDao<GeneradorEtiquetaMapper> implements GeneradorEtiquetaDao {
	
	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(GeneradorEtiquetaDaoImpl.class);
	
	/** The params. */
	private Map<String, Object> params = new HashMap<String, Object>();

	/**
	 * Instantiates a new generador etiqueta dao impl.
	 *
	 * @param sqlSession the sql session
	 */
	public GeneradorEtiquetaDaoImpl(final SqlSession sqlSession) {
		super(sqlSession);
	}

	/* (non-Javadoc)
	 * @see cl.bluex.ws.common.dao.AbstractDao#getMapperClass()
	 */
	@Override
	public Class<GeneradorEtiquetaMapper> getMapperClass() {
		return GeneradorEtiquetaMapper.class;
	}

	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.GeneradorEtiquetaDao#obtieneDestino(cl.bluex.generadoretiqueta.to.ParametroDestinoTO)
	 */
	@Override
	public DestinoTO obtieneDestino(final ParametroDestinoTO parametroDestinoTO) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_EMPRESA, parametroDestinoTO.getCodigoEmpresaTrad());
		params.put(CODIGO_TIPO_NEGOCIO, parametroDestinoTO.getCodigoTipoNegocio());
		params.put(CODIGO_POSTA, parametroDestinoTO.getCodigoPosta());
		params.put(CODIGO_INFLUENCIA, parametroDestinoTO.getCodigoInfluencia());
		params.put(CODIGO_TIPO_SERVICIO, parametroDestinoTO.getCodigoTipoServicio());
		
		LOGGER.info("codigoEmpresa " + parametroDestinoTO.getCodigoEmpresaTrad());
		LOGGER.info("codigoTipoNegocio " + parametroDestinoTO.getCodigoTipoNegocio());
		LOGGER.info("codigoPosta " + parametroDestinoTO.getCodigoPosta());
		LOGGER.info("codigoInfluencia " + parametroDestinoTO.getCodigoInfluencia());
		LOGGER.info("codigoTipoServicio " + parametroDestinoTO.getCodigoTipoServicio());
		
		getMapper().obtieneDestino(params);
		
		this.esExcepcion();

		final DestinoTO destinoTO = new DestinoTO();
		destinoTO.setCodigoComuna((String) params.get(CODIGO_COMUNA));
		destinoTO.setNombreComuna((String) params.get(NOMBRE_COMUNA));
		destinoTO.setCodigoSubZona((String)params.get(CODIGO_SUB_ZONA));
		destinoTO.setCodigoZona((String) params.get(CODIGO_ZONA));

		return destinoTO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.generadoretiqueta.GeneradorEtiquetaDao#obtieneTemplate(long,
	 * long, int)
	 */
	@Override
	public List<TemplateTO> obtieneTemplate(
			final long codigoUsuario,
			final long codigoImpresora, 
			final long codigoFormatoImpresion,
			final String tipoEtiqueta) 
			throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_USUARIO, codigoUsuario);
		params.put(CODIGO_IMPRESORA, codigoImpresora);
		params.put(CODIGO_FORMATO_IMPRESION, codigoFormatoImpresion);
		params.put(TIPO_ETIQUETA, tipoEtiqueta);
		
		
		getMapper().obtieneTemplate(params);

		this.esExcepcion();

		@SuppressWarnings(UNCHECKED)
		final List<TemplateTO> respuesta = (List<TemplateTO>) params
				.get(RESULTADO);

		return respuesta;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.generadoretiqueta.GeneradorEtiquetaDao#obtieneDatosImpresion
	 * (long)
	 */
	@Override
	public DatosGeneracionEtiquetaTO obtieneDatosImpresion(final long eevvNmrId)
			throws BluexException {
		DatosGeneracionEtiquetaTO to = new DatosGeneracionEtiquetaTO();

		params = new HashMap<String, Object>();
		params.put(EEVV_NMR_ID, eevvNmrId);

		getMapper().obtieneDatosImpresion(params);

		this.esExcepcion();

		@SuppressWarnings(UNCHECKED)
		final List<DatosGeneracionEtiquetaTO> resultados = (List<DatosGeneracionEtiquetaTO>) params
				.get(RESULTADO);

		if (!resultados.isEmpty()) {
			to = resultados.get(0);
		}
		return to;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.GeneradorEtiquetaDao#obtieneGuiasPorEncabezado(int, int)
	 */
	@Override
	public List<GuiaTO> obtieneGuiasPorEncabezado(
			final int idEncabezado)
			throws BluexException {
		params = new HashMap<String, Object>();
		params.put(ID_ENCABEZADO, idEncabezado);
		
		getMapper().obtieneGuiasPorEncabezado(params);
		
		this.esExcepcion();
		
		@SuppressWarnings(UNCHECKED)
		final List<GuiaTO> respuesta = (List<GuiaTO>) params.get(RESULTADO);
		
		return respuesta;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.GeneradorEtiquetaDao#obtieneGuiasPorFolio(int, int)
	 */
	@Override
	public List<GuiaTO> obtieneGuiasPorFolio(
			final ParametrosGuiaTO to)
			throws BluexException {
		params = new HashMap<String, Object>();
		
		params.put(CODIGO_EMPRESA, to.getCodigoEmpresa());
		params.put(NRO_BULTO, to.getNroBulto());
		params.put(TIPO_DOCUMENTO, to.getTipoDocumento());
		params.put(NUMERO_FOLIO, to.getNumeroFolio());
		
		getMapper().obtieneGuiasPorFolio(params);
		
		this.esExcepcion();
		
		@SuppressWarnings(UNCHECKED)
		final List<GuiaTO> respuesta = (List<GuiaTO>) params.get(RESULTADO);
		
		return respuesta;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.GeneradorEtiquetaDao#obtieneGuiasPorReferencia(int)
	 */
	@Override
	public List<GuiaTO> obtieneGuiasPorReferencia(final ParametrosReferenciaTO to)
			throws BluexException {
		params = new HashMap<String, Object>();
		
		params.put(CODIGO_CLIENTE, to.getCodigoCliente());
		params.put(CODIGO_EMPRESA, to.getCodigoEmpresa());
		params.put(CODIGO_SUCURSAL_CLIENTE, to.getCodigoSucursalCliente());
		params.put(CODIGO_TIPO_CLIENTE, to.getCodigoTipoCliente());
		params.put(NUMERO_REFERENCIA, to.getNumeroReferencia());
		
		getMapper().obtieneGuiasPorReferencia(params);
		
		this.esExcepcion();
		
		@SuppressWarnings(UNCHECKED)
		final List<GuiaTO> respuesta = (List<GuiaTO>) params.get(RESULTADO);
		
		return respuesta;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.GeneradorEtiquetaDao#obtieneGuiasPorPieza(cl.bluex.generadoretiqueta.to.ParametrosGuiaPiezaTO)
	 */
	@Override
	public List<GuiaTO> obtieneGuiasPorPieza(
			final ParametrosGuiaPiezaTO to) throws BluexException {
		params = new HashMap<String, Object>();
		
		params.put(CODIGO_EMPRESA_TRAD, to.getCodigoEmpresaTrad());
		params.put(NRO_BULTO, to.getNroBulto());
		params.put(NUMERO_FOLIO, to.getNumeroFolio());
		params.put(TIPO_DOCUMENTO, to.getTipoDocumento());
		
		getMapper().obtieneGuiasPorPieza(params);
		
		this.esExcepcion();
		
		@SuppressWarnings(UNCHECKED)
		final List<GuiaTO> respuesta = (List<GuiaTO>) params.get(RESULTADO);
		
		return respuesta;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.GeneradorEtiquetaDao#obtieneDatosImpresionHub(int)
	 */
	@Override
	public DatosGeneracionEtiquetaHubTO obtieneDatosImpresionHub(final long eevvNroId) 
			throws BluexException {
		DatosGeneracionEtiquetaHubTO to = new DatosGeneracionEtiquetaHubTO();

		params = new HashMap<String, Object>();
		params.put(EEVV_NMR_ID, eevvNroId);
		
		getMapper().obtieneDatosImpresionHub(params);
		
		this.esExcepcion();

		@SuppressWarnings(UNCHECKED)
		final List<DatosGeneracionEtiquetaHubTO> resultados = (List<DatosGeneracionEtiquetaHubTO>) params
				.get(RESULTADO);

		if (!resultados.isEmpty()) {
			to = resultados.get(0);
		}
		return to;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.GeneradorEtiquetaDao#obtieneOrdenesServicio(cl.bluex.generadoretiqueta.to.ParamOrdenServicioTO)
	 */
	@Override
	public List<OrdenServicioTO> obtieneOrdenesServicio(
			final ParamOrdenServicioTO parametrosTO) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(NUMERO_SERIE_OSER, parametrosTO.getNumeroSerieOser());
		params.put(TIPO_DOCUMENTO, parametrosTO.getIdTipoDocumento());
		params.put(CODIGO_EMPRESA, parametrosTO.getCodigoEmpresa());
		
		getMapper().obtieneOrdenesServicio(params);
		
		this.esExcepcion();
		
		@SuppressWarnings(UNCHECKED)
		final List<OrdenServicioTO> respuesta = (List<OrdenServicioTO>) params.get(RESULTADO);
		
		return respuesta;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.GeneradorEtiquetaDao#obtieneCodigoBultoL28(cl.bluex.generadoretiqueta.to.ParametrosCodigoBultoTO)
	 */
	@Override
	public CodigoBultoTO obtieneCodigoBultoL28(
			final ParametrosCodigoBultoTO parametrosTO) throws BluexException {
		CodigoBultoTO to = new CodigoBultoTO();
		
		params = new HashMap<String, Object>();
		params.put(CODIGO_EMPRESA, parametrosTO.getCodigoEmpresa());
		params.put(TIPO_DOCUMENTO, parametrosTO.getIdTipoDocumento());
		params.put(NUMERO_SERIE_OSER, parametrosTO.getNumeroSerieOser());
		
		getMapper().obtieneCodigoBultoL28(params);
		
		this.esExcepcion();

		@SuppressWarnings(UNCHECKED)
		final List<CodigoBultoTO> resultados = (List<CodigoBultoTO>) params
				.get(RESULTADO);

		if (!resultados.isEmpty()) {
			to = resultados.get(0);
		}
		return to;
	}

	/**
	 * Metodo encargado de obtener los datos operacionales.
	 *
	 * @param parametrosTO the parametros to
	 * @return 	DatosOperacionalesTO
	 * @throws BluexException the bluex exception
	 * @author 	Ricardo Moscoso.
	 */
	@Override
	public DatosOperacionalesTO obtieneDatosOperacionales(
			final EntradaDatosOperacionalesTO parametrosTO) throws BluexException {
		
			LOGGER.info("[GeneradorEtiquetaDaoImpl] obtieneDatosOperacionales :");
			LOGGER.info("[GeneradorEtiquetaDaoImpl] Nombre Usuario : " + parametrosTO.getNombreUsuario());
		
			params = new HashMap<String, Object>();
			params.put(NOMBRE_USUARIO, parametrosTO.getNombreUsuario());
			getMapper().obtieneDatosOperacionales(params);
			
			LOGGER.info("[GeneradorEtiquetaDaoImpl] Parametros de salida	: "	+ params.toString());
			
			final DatosOperacionalesTO datosoperacionalesTO = 
					new DatosOperacionalesTO((String)params.get(CURIER),(String)params.get(OFICINA),(String)params.get(BODEGA),
							(String)params.get(TIPO_BODEGA),(String)params.get(CODIGO_CURRIER));
			
			return datosoperacionalesTO;
	}
	
	
	/**
	 * Metodo .
	 *
	 * @param parametrosTO the parametros to
	 * @return 	DatosRespuestaTO
	 * @throws BluexException the bluex exception
	 */
	@Override
	public DatosRespuestaTO insertaPiezaMovimiento(
			final PiezaMovimientoTO parametrosTO) throws BluexException {
		
			LOGGER.info("[GeneradorEtiquetaDaoImpl] insertaPiezaMovimiento.");
		
			params = new HashMap<String, Object>();
			
			params.put(CODIGO_PIEZA, parametrosTO.getCodigoPieza());
			params.put(OBSERVACION, parametrosTO.getObservacion());
			params.put(CODIGO_TIPO_EVENTO, parametrosTO.getCodigoTipoEvento());
			params.put(CODIGO_BODEGA_ENTRADA, parametrosTO.getCodigoBodegaEntrada());
			params.put(TIPO_CODIGO_BODEGA_ENTRADA, parametrosTO.getTipoCodigoBodegaEntrada());
			params.put(CODIGO_OFICINA_ENTRADA, parametrosTO.getCodigoOficinaEntrada());
			params.put(CODIGO_PERSONA, parametrosTO.getCodigoPersona());
			params.put(FECHA_MOVIMIENTO, parametrosTO.getFechaMovimiento());
			params.put(CANTIDAD_PIEZAS, parametrosTO.getCantidadPiezas());
			params.put(PESO_FISICO, parametrosTO.getPesoFisico());
			params.put(RESPONSABLE_NOMBRE, parametrosTO.getResponsable().getNombre());
			params.put(RESPONSABLE_RUT, parametrosTO.getResponsable().getRut());
			params.put(FOTO_NOMBRE, parametrosTO.getFoto().getNombre());
			params.put(RESPONSABLE_TELEFONO, parametrosTO.getResponsable().getTelefono());
			params.put(FOTO_FECHA_ENVIO, parametrosTO.getFoto().getFechaEnvio());
			params.put(RESPONSABLE_DESCRIPCION, parametrosTO.getResponsable().getDescripcion());
			params.put(RESPONSABLE_MOTIVO, parametrosTO.getResponsable().getMotivo());
			params.put(RUTA_PATENTE, parametrosTO.getRuta().getPatente());
			params.put(RUTA_NUMERO_ODOMETRO, parametrosTO.getRuta().getNumeroOdometro());
			params.put(RUTA_CODIGO, parametrosTO.getRuta().getCodigo());
			params.put(CODIGO_POSTA, parametrosTO.getCodigoPosta());
			params.put(CODIGO_TIPO_NEGOCIO, parametrosTO.getCodigoTipoNegocio());
			params.put(CODIGO_TIPO_ESTADO, parametrosTO.getCodigoTipoEstado());
			params.put(CODIGO_TIPO_SERVICIO, parametrosTO.getCodigoTipoServicio());
			params.put(CODIGO_TIPO_SERVICIO_PADRE, parametrosTO.getCodigoTipoServicioPadre());
			
			LOGGER.info("[GeneradorEtiquetaDaoImpl] Parametros de Entrada : " + params.toString());
			getMapper().insertaPiezaMovimiento(params);
			LOGGER.info("[GeneradorEtiquetaDaoImpl] Parametros de Salida  : ");
			LOGGER.info("[GeneradorEtiquetaDaoImpl] codMensaje  : " + params.get(CODIGO) );
			LOGGER.info("[GeneradorEtiquetaDaoImpl] mensaje     : " + params.get(MESSAGE));
			
			final DatosRespuestaTO datosRespuestaTO =  new DatosRespuestaTO((Integer) params.get(CODIGO),(String) params.get(MESSAGE));
			
			return datosRespuestaTO;
	}
	
	/**
	 * Metodo .
	 *
	 * @param to the to
	 * @return 	DatosRespuestaTO
	 * @throws BluexException the bluex exception
	 */
	@Override
	public DatosRespuestaTO validaOficinaBodega(
			final EntradaDatosOperacionalesTO to) throws BluexException {
		
		
			LOGGER.info("[validaOficinaBodega] : Iniciando metodo.");
			LOGGER.info("[validaOficinaBodega] : Datos de Entrada	:");
			LOGGER.info("[validaOficinaBodega] : codigoOficina	:" + to.getCodigoOficina());
			LOGGER.info("[validaOficinaBodega] : tipoBodega		:" + to.getTipoBodega());
			LOGGER.info("[validaOficinaBodega] : codigoBodega	:" + to.getCodigoBodega());
			
			params = new HashMap<String, Object>();
			params.put(CODIGO_OFICINA, to.getCodigoOficina());
			params.put(TIPO_BODEGA, to.getTipoBodega());
			params.put(CODIGO_BODEGA, to.getCodigoBodega());
			
			getMapper().validaOficinaBodega(params);
			
			LOGGER.info("[validaOficinaBodega]  Parametros de Salida  : ");
			LOGGER.info("[validaOficinaBodega]  codMensaje  : " + params.get(CODIGO) );
			LOGGER.info("[validaOficinaBodega]  mensaje     : " + params.get(MESSAGE));
			
			final DatosRespuestaTO datosRespuestaTO =  new DatosRespuestaTO((Integer) params.get(CODIGO),(String) params.get(MESSAGE));
			
			return datosRespuestaTO;
	}
	
	
	
	
	
	/**
	 * Es excepcion.
	 *
	 * @throws BluexException the bluex exception
	 */
	private void esExcepcion() throws BluexException {
		final Integer codError = (Integer) params.get(COD_ERROR);
		final String descError = (String) params.get(DESC_ERROR);

		if (codError != CODIGO_ERROR_VALIDO) {
			LOGGER.info("codigo de error: " + codError);
			throw new BluexException(codError.toString(), descError);
		}
	}


}
