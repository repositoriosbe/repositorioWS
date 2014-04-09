package cl.bluex.listas.mybatis;

import static cl.bluex.ws.common.util.Constantes.CODIGO;
import static cl.bluex.ws.common.util.Constantes.CODIGO_APLICACION;
import static cl.bluex.ws.common.util.Constantes.CODIGO_CENTRO_COSTO;
import static cl.bluex.ws.common.util.Constantes.CODIGO_CLIENTE;
import static cl.bluex.ws.common.util.Constantes.CODIGO_COMUNA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_EMPRESA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_FAMILIA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_ORIGEN;
import static cl.bluex.ws.common.util.Constantes.CODIGO_PAIS;
import static cl.bluex.ws.common.util.Constantes.CODIGO_POSTA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_POSTA_PADRE;
import static cl.bluex.ws.common.util.Constantes.CODIGO_SISTEMA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_SUCURSAL_CLIENTE;
import static cl.bluex.ws.common.util.Constantes.CODIGO_TIPO_CLIENTE;
import static cl.bluex.ws.common.util.Constantes.CODIGO_TIPO_INFLUENCIA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_TIPO_NEGOCIO;
import static cl.bluex.ws.common.util.Constantes.CODIGO_USUARIO;
import static cl.bluex.ws.common.util.Constantes.COMUNA;
import static cl.bluex.ws.common.util.Constantes.ID_PARAMETRO;
import static cl.bluex.ws.common.util.Constantes.NOMBRE_PARAMETRO;
import static cl.bluex.ws.common.util.Constantes.RESULTADO;
import static cl.bluex.ws.common.util.Constantes.TIPO;
import static cl.bluex.ws.common.util.Constantes.TIPO_NEGOCIO;
import static cl.bluex.ws.common.util.Constantes.UNCHECKED;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import cl.bluex.listas.ListasDao;
import cl.bluex.listas.mapper.ListasMapper;
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
import cl.bluex.ws.common.dao.AbstractDao;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * Implementacion interfaz Dao.
 * 
 * @author Edgardo Herrera
 * 
 */
 public class ListasDaoImpl extends AbstractDao<ListasMapper> implements
 ListasDao {
	private Map<String, Object> params = new HashMap<String, Object>();

	/**
	 * crea instancia de ListasDaoImpl
	 * 
	 * @param sqlSession
	 */
	 public ListasDaoImpl(final SqlSession sqlSession) {
		 super(sqlSession);
	 }

	 @Override
	 public Class<ListasMapper> getMapperClass() {
		 return ListasMapper.class;
	 }

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.dao.Dao#obtieneEmpresas()
	 */
	@Override
	public List<EmpresaTO> obtieneEmpresas(final long codigoUsuario,
			final long codigoSistema, final long codigoAplicacion)
			throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_USUARIO, codigoUsuario);
		params.put(CODIGO_SISTEMA, codigoSistema);
		params.put(CODIGO_APLICACION, codigoAplicacion);

		getMapper().obtieneEmpresas(params);

		this.esExcepcion();
		
		@SuppressWarnings(UNCHECKED)
		final List<EmpresaTO> resultado = (List<EmpresaTO>) params.get(RESULTADO);

		return resultado;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.dao.Dao#obtieneTipoDocumentos()
	 */
	@Override
	@SuppressWarnings(UNCHECKED)
	public List<TipoDocumentoTO> obtieneTipoDocumentos() throws BluexException {
		params = new HashMap<String, Object>();
		getMapper().obtieneTipoDocumentos(params);

		this.esExcepcion();

		return (List<TipoDocumentoTO>) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.dao.Dao#obtienePaises(java.lang.String)
	 */
	@Override
	@SuppressWarnings(UNCHECKED)
	public List<PaisTO> obtienePaises(final String codigoPais)
			throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO, codigoPais);
		getMapper().obtienePaises(params);

		this.esExcepcion();

		return (List<PaisTO>) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.dao.Dao#obtieneComunas(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public List<ComunaTO> obtieneComunas(final String codigoPais,
			final String codigoPosta) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_PAIS, codigoPais);
		params.put(CODIGO_POSTA, codigoPosta);
		getMapper().obtieneComunas(params);
		
		this.esExcepcion();

		@SuppressWarnings(UNCHECKED)
		final List<ComunaTO> tos = (List<ComunaTO>) params.get(RESULTADO);
		return tos;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.dao.Dao#obtienePostas(java.lang.String, long, long)
	 */
	@Override
	@SuppressWarnings(UNCHECKED)
	public List<PostaTO> obtienePostas(final String codigo,
			final long tipoNegocio, final long comuna) throws BluexException {
		params.put(CODIGO, codigo);
		params.put(TIPO_NEGOCIO, tipoNegocio);
		params.put(COMUNA, comuna);

		if (comuna == -1) {
			getMapper().obtienePostas(params);
		} else {
			getMapper().obtienePostasComunas(params);
		}
		
		this.esExcepcion();

		return (List<PostaTO>) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.dao.Dao#obtieneRutas(java.lang.String)
	 */
	@Override
	@SuppressWarnings(UNCHECKED)
	public List<RutaTO> obtieneRutas(final String codigo) throws BluexException {
		params.put(CODIGO, codigo);
		getMapper().obtieneRutas(params);

		return (List<RutaTO>) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.dao.Dao#obtieneLocalidades(java.lang.String,
	 * java.lang.String, long, long, long)
	 */
	@Override
	@SuppressWarnings(UNCHECKED)
	public List<LocalidadTO> obtieneLocalidades(final String codigoPais,
			final String codigoPostaPadre, final String codigoPosta,
			final long codigoTipoNegocio, final long codigoTipoInfluencia,
			final long codigoComuna) throws BluexException {
		params.put(CODIGO_PAIS, codigoPais);
		params.put(CODIGO_POSTA_PADRE, codigoPostaPadre);
		params.put(CODIGO_POSTA, codigoPosta);
		params.put(CODIGO_TIPO_NEGOCIO, codigoTipoNegocio);
		params.put(CODIGO_TIPO_INFLUENCIA, codigoTipoInfluencia);
		params.put(CODIGO_COMUNA, codigoComuna);
		getMapper().obtieneLocalidades(params);

		return (List<LocalidadTO>) params.get(RESULTADO);
	}

	@Override
	@SuppressWarnings(UNCHECKED)
	public List<TraduccionTO> obtieneTraduccion(
			final String tipo,
			final String codigoOrigen,
			final long codigoEmpresa) throws BluexException {
		params.put(CODIGO, codigoOrigen);
		params.put(TIPO, tipo);
		params.put(CODIGO_EMPRESA, codigoEmpresa);
		getMapper().obtieneTraduccion(params);

		return (List<TraduccionTO>) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.dao.Dao#obtieneProductos(java.lang.String, long)
	 */
	@Override
	@SuppressWarnings(UNCHECKED)
	public List<ProductoTO> obtieneProductos(final String codigoFamilia,
			final long codigoEmpresa) throws BluexException {
		params.put(CODIGO_FAMILIA, codigoFamilia);
		params.put(CODIGO_EMPRESA, codigoEmpresa);
		getMapper().obtieneProductos(params);

		return (List<ProductoTO>) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.dao.Dao#obtieneFamiliaProductos()
	 */
	@Override
	@SuppressWarnings(UNCHECKED)
	public List<FamiliaProductoTO> obtieneFamiliaProductos()
			throws BluexException {
		getMapper().obtieneFamiliaProductos(params);

		return (List<FamiliaProductoTO>) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.dao.Dao#obtieneTipoServicios(long, java.lang.String)
	 */
	@Override
	@SuppressWarnings(UNCHECKED)
	public List<TipoServicioTO> obtieneTipoServicios(final long codigoEmpresa,
			final String tipo) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_EMPRESA, codigoEmpresa);
		params.put(TIPO, tipo);
		getMapper().obtieneTipoServicios(params);

		return (List<TipoServicioTO>) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.dao.Dao#obtienePersonalizacionesUsuario(long)
	 */
	@Override
	@SuppressWarnings(UNCHECKED)
	public List<PersonalizacionUsuarioTO> obtienePersonalizacionesUsuario(
			final long codigoUsuario) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_USUARIO, codigoUsuario);
		getMapper().obtienePersonalizacionesUsuario(params);

		return (List<PersonalizacionUsuarioTO>) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.dao.Dao#obtieneTipoDocumentosCliente()
	 */
	@Override
	@SuppressWarnings(UNCHECKED)
	public List<TipoDocumentoClienteTO> obtieneTipoDocumentosCliente()
			throws BluexException {
		params = new HashMap<String, Object>();
		getMapper().obtieneTipoDocumentosCliente(params);

		return (List<TipoDocumentoClienteTO>) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.dao.Dao#obtieneTipoFormaPagoCliente()
	 */
	@Override
	@SuppressWarnings(UNCHECKED)
	public List<TipoFormaPagoClienteTO> obtieneTipoFormaPagoCliente()
			throws BluexException {
		params = new HashMap<String, Object>();
		getMapper().obtieneTipoFormaPagoCliente(params);

		return (List<TipoFormaPagoClienteTO>) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.dao.Dao#obtieneBancos()
	 */
	@Override
	@SuppressWarnings(UNCHECKED)
	public List<BancoTO> obtieneBancos() throws BluexException {
		params = new HashMap<String, Object>();
		getMapper().obtieneBancos(params);

		return (List<BancoTO>) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.dao.Dao#obtieneDiasPago()
	 */
	@Override
	@SuppressWarnings(UNCHECKED)
	public List<DiaPagoTO> obtieneDiasPago() throws BluexException {
		params = new HashMap<String, Object>();
		getMapper().obtieneDiasPago(params);

		return (List<DiaPagoTO>) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.dao.Dao#obtieneMonedas()
	 */
	@Override
	@SuppressWarnings(UNCHECKED)
	public List<MonedaTO> obtieneMonedas() throws BluexException {
		params = new HashMap<String, Object>();
		getMapper().obtieneMonedas(params);

		return (List<MonedaTO>) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.dao.Dao#obtieneOficinas(long, java.lang.String)
	 */
	@Override
	@SuppressWarnings(UNCHECKED)
	public List<OficinaTO> obtieneOficinas(final long codigoEmpresa,
			final String codigoPosta) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_EMPRESA, codigoEmpresa);
		params.put(CODIGO_POSTA, codigoPosta);

		getMapper().obtieneOficinas(params);

		this.esExcepcion();

		return (List<OficinaTO>) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.dao.Dao#obtieneCentrosCosto(long, long, long, long,
	 * java.lang.String)
	 */
	@Override
	public List<CentroCostoTO> obtieneCentrosCosto(final long codigoEmpresa,
			final long codigoCliente, 
			final long codigoSucursalCliente,
			final long codigoTipoCliente, 
			final String codigoCentroCosto)
			throws BluexException {
		params.put(CODIGO_EMPRESA, codigoEmpresa);
		params.put(CODIGO_CLIENTE, codigoCliente);
		params.put(CODIGO_SUCURSAL_CLIENTE, codigoSucursalCliente);
		params.put(CODIGO_TIPO_CLIENTE, codigoTipoCliente);
		params.put(CODIGO_CENTRO_COSTO, codigoCentroCosto);
		getMapper().obtieneCentrosCosto(params);

		this.esExcepcion();

		@SuppressWarnings("unchecked")
		final List<CentroCostoTO> resultado = (List<CentroCostoTO>) params.get(RESULTADO);
		
		return resultado;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.dao.Dao#obtieneTiposEtiquetaFija()
	 */
	@Override
	@SuppressWarnings(UNCHECKED)
	public List<ConversionTO> obtieneConversiones(
			final String tipo,
			final long codigoEmpresa)
			throws BluexException {
		params = new HashMap<String, Object>();
		params.put(TIPO, tipo);
		params.put(CODIGO_EMPRESA, codigoEmpresa);

		getMapper().obtieneConversiones(params);

		this.esExcepcion();

		return (List<ConversionTO>) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.dao.Dao#obtieneTipoInfluencias()
	 */
	@Override
	@SuppressWarnings(UNCHECKED)
	public List<TipoInfluenciaTO> obtieneTipoInfluencias()
			throws BluexException {
		params = new HashMap<String, Object>();
		getMapper().obtieneTipoInfluencias(params);

		this.esExcepcion();

		return (List<TipoInfluenciaTO>) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.dao.Dao#obtieneTipoNegocios()
	 */
	@Override
	@SuppressWarnings(UNCHECKED)
	public List<TipoNegocioTO> obtieneTipoNegocios() throws BluexException {
		params = new HashMap<String, Object>();
		getMapper().obtieneTipoNegocios(params);

		this.esExcepcion();

		return (List<TipoNegocioTO>) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.dao.Dao#obtieneSorter()
	 */
	@Override
	@SuppressWarnings(UNCHECKED)
	public List<SorterTO> obtieneSorter() throws BluexException {
		params = new HashMap<String, Object>();
		getMapper().obtieneSorter(params);

		this.esExcepcion();

		return (List<SorterTO>) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.dao.Dao#obtieneTraduccionEmpresa()
	 */
	@Override
	@SuppressWarnings(UNCHECKED)
	public List<TraduccionEmpresaTO> obtieneTraduccionEmpresa(
			final long codigo, final long codigoUsuario,
			final long codigoSistema, final long codigoAplicacion)
			throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO, codigo);
		params.put(CODIGO_USUARIO, codigoUsuario);
		params.put(CODIGO_SISTEMA, codigoSistema);
		params.put(CODIGO_APLICACION, codigoAplicacion);

		getMapper().obtieneTraduccionEmpresa(params);

		this.esExcepcion();

		return (List<TraduccionEmpresaTO>) params.get(RESULTADO);
	}

	@Override
	public List<ProductoServicioTO> obtieneProductosServicios(
			final long codigoEmpresa, final String codigoOrigen,
			final String tipo) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_EMPRESA, codigoEmpresa);
		params.put(CODIGO_ORIGEN, codigoOrigen);
		params.put(TIPO, tipo);

		getMapper().obtieneProductosServicios(params);

		this.esExcepcion();

		@SuppressWarnings("unchecked")
		final List<ProductoServicioTO> tos = (List<ProductoServicioTO>) params
				.get(RESULTADO);
		return tos;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.listas.ListasDao#obtieneTraduccionProducto(long,
	 * java.lang.String)
	 */
	@Override
	public List<TraduccionProductoTO> obtieneTraduccionProducto(
			final long codigoEmpresa, final String tipo) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_EMPRESA, codigoEmpresa);
		params.put(TIPO, tipo);

		getMapper().obtieneTraduccionProducto(params);

		this.esExcepcion();

		@SuppressWarnings("unchecked")
		final List<TraduccionProductoTO> tos = (List<TraduccionProductoTO>) params
				.get(RESULTADO);

		return tos;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.listas.ListasDao#obtieneParametrosGenerales(java.lang.String, java.lang.String)
	 */
	@Override
	public List<ParametroGeneralTO> obtieneParametrosGenerales(
			final String idParametro, final String nombreCampo) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(ID_PARAMETRO, idParametro);
		params.put(NOMBRE_PARAMETRO, nombreCampo);
		
		getMapper().obtieneParametrosGenerales(params);
		
		this.esExcepcion();
		
		@SuppressWarnings("unchecked")
		final List<ParametroGeneralTO> tos = (List<ParametroGeneralTO>) params
				.get(RESULTADO);
		
		return tos;
	}

	private void esExcepcion() throws BluexException {
		final Integer codError = (Integer) params.get(COD_ERROR);
		final String descError = (String) params.get(DESC_ERROR);

		if (codError != 0) {
			throw new BluexException(codError.toString(), descError);
		}
	}

	

}
