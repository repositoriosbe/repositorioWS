package cl.bluex.seguridad.mybatis;

import static cl.bluex.ws.common.util.Constantes.CODIGO_SISTEMA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_APLICACION;
import static cl.bluex.ws.common.util.Constantes.COD_OPCION_INSERT_TOKEN;
import static cl.bluex.ws.common.util.Constantes.COD_USUARIO;
import static cl.bluex.ws.common.util.Constantes.DIRECCION_IP;
import static cl.bluex.ws.common.util.Constantes.FECHA_INICIO;
import static cl.bluex.ws.common.util.Constantes.FECHA_TERMINO;
import static cl.bluex.ws.common.util.Constantes.PASSWORD;
import static cl.bluex.ws.common.util.Constantes.RESULTADO;
import static cl.bluex.ws.common.util.Constantes.TOKEN;
import static cl.bluex.ws.common.util.Constantes.TOKEN_USUARIO;
import static cl.bluex.ws.common.util.Constantes.UNCHECKED;
import static cl.bluex.ws.common.util.Constantes.USERNAME;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import cl.bluex.seguridad.SeguridadDao;
import cl.bluex.seguridad.mapper.SeguridadMapper;
import cl.bluex.seguridad.to.Autenticacion;
import cl.bluex.seguridad.to.FavoritoTo;
import cl.bluex.seguridad.to.OpcionesMenuTo;
import cl.bluex.seguridad.to.RolTO;
import cl.bluex.seguridad.to.TokenUsuarioTo;
import cl.bluex.seguridad.to.UsuarioTo;
import cl.bluex.seguridad.to.UsuarioValido;
import cl.bluex.ws.common.dao.AbstractDao;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * @author Edgardo Herrera
 * 
 */
public class SeguridadDaoImpl extends AbstractDao<SeguridadMapper> implements
		SeguridadDao {
	private Map<String, Object> params = new HashMap<String, Object>();
	
	public SeguridadDaoImpl(final SqlSession sqlSession) {
		super(sqlSession);
	}

	@Override
	public Class<SeguridadMapper> getMapperClass() {
		return SeguridadMapper.class;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.persistencia.dao.Dao#autenticacion(cl.bluex.persistencia.to.
	 * Autenticacion)
	 */
	@Override
	public Autenticacion autenticacion(final Autenticacion datos)
			throws BluexException {
		params = new HashMap<String, Object>();
		params.put(USERNAME, datos.getUsername());
		params.put(PASSWORD, datos.getPassword());
		getMapper().autenticacion(params);
		
		datos.setCodError(((Integer)params.get(COD_ERROR)).toString());
		datos.setDescError((String)params.get(DESC_ERROR));
		
		return datos;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.persistencia.dao.Dao#validarUsuario(java.util.Map)
	 */
	@Override
	@SuppressWarnings(UNCHECKED)
	public List<UsuarioValido> validarUsuario(final String username, final String password)
			throws BluexException {
		params = new HashMap<String, Object>();
		params.put(USERNAME, username);
		params.put(PASSWORD, password);
		
		getMapper().validarUsuario(params);
		
		this.esExcepcion();

		return (List<UsuarioValido>) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.persistencia.dao.Dao#actualizarNroIntentos(java.lang.String)
	 */
	@Override
	public Integer actualizarNroIntentos(final String username)
			throws BluexException {
		params = new HashMap<String, Object>();
		params.put(USERNAME, username);
		
		final Integer actualizarNroIntentos = getMapper().actualizarNroIntentos(params);
		
		this.esExcepcion();
		
		return actualizarNroIntentos;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.persistencia.dao.Dao#insertarTokenUsuario(java.util.Map)
	 */
	@Override
	public Integer insertarTokenUsuario(final Map<String, Object> datos)
			throws BluexException {
		params = new HashMap<String, Object>();
		params.put(TOKEN, datos.get(TOKEN));
		params.put(COD_USUARIO, datos.get(COD_USUARIO));
		params.put(FECHA_INICIO, datos.get(FECHA_INICIO));
		params.put(FECHA_TERMINO, datos.get(FECHA_TERMINO));
		params.put(DIRECCION_IP, datos.get(DIRECCION_IP));
		params.put(COD_OPCION_INSERT_TOKEN, datos.get(COD_OPCION_INSERT_TOKEN));
		
		final Integer insertaTokenUsuario = getMapper().insertaTokenUsuario(params);
		
		this.esExcepcion();
		
		return insertaTokenUsuario;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.persistencia.dao.Dao#traeTokenUsuario(java.util.Map)
	 */
	@Override
	@SuppressWarnings(UNCHECKED)
	public List<TokenUsuarioTo> traeTokenUsuario(
			final String username) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(USERNAME, username);
		getMapper().traeTokenUsuario(params);
		
		this.esExcepcion();

		return (List<TokenUsuarioTo>) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.persistencia.dao.Dao#obtieneOpcionesMenu(java.lang.String)
	 */
	@Override
	@SuppressWarnings(UNCHECKED)
	public List<OpcionesMenuTo> obtieneOpcionesMenu(final long codigoSistema, final String tokenUsuario)
			throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_SISTEMA, codigoSistema);
		params.put(TOKEN_USUARIO, tokenUsuario);
		getMapper().obtieneOpcionesMenu(params);
		
		this.esExcepcion();

		return (List<OpcionesMenuTo>) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.persistencia.dao.Dao#obtieneOpcionesFrecuentes(java.lang.String)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<OpcionesMenuTo> obtieneOpcionesFrecuentes(
			final long codigoSistema, 
			final String tokenUsuario) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_SISTEMA, codigoSistema);
		params.put(TOKEN_USUARIO, tokenUsuario);
		getMapper().obtieneOpcionesFrecuentes(params);

		this.esExcepcion();
		
		return (List<OpcionesMenuTo>) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.persistencia.dao.Dao#eliminarToken(java.lang.String)
	 */
	@Override
	public void eliminarToken(final String codigoToken) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(TOKEN, codigoToken);
		getMapper().eliminarToken(params);
		
		this.esExcepcion();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.persistencia.dao.Dao#obtenerUsuario(java.lang.String)
	 */
	@Override
	public UsuarioTo obtenerUsuario(final String token) throws BluexException {
		params = new HashMap<String, Object>();
		params.put("codigoToken", token);
		
		getMapper().obtenerUsuarioPassword(params);
		
		final UsuarioTo usuario = new UsuarioTo();
		usuario.setCodigoUsuario((Long) params.get("codigoUsuario"));
		usuario.setPassword((String) params.get("password"));
		usuario.setCodError(((Integer) params.get("codError")).toString());
		usuario.setDescError((String) params.get("descError"));
		
		return usuario;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.persistencia.dao.Dao#actualizarPassword(java.lang.Long,
	 * java.lang.String)
	 */
	@Override
	public Integer actualizarPassword(final Long codigoUsuario,
			final String passNuevo) throws BluexException {
		params = new HashMap<String, Object>();
		params.put("codigoUsuario", codigoUsuario);
		params.put("passNuevo", passNuevo);
		getMapper().actualizarPassword(params);
		
		this.esExcepcion();

		return (Integer) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.persistencia.dao.Dao#insertaFavorito(cl.bluex.persistencia.to
	 * .FavoritoTo)
	 */
	@Override
	public void insertaFavorito(final FavoritoTo favorito)
			throws BluexException {
		params = new HashMap<String, Object>();
		params.put(TOKEN, favorito.getToken());
		params.put("codSist", favorito.getCodSistema());
		params.put("codApp", favorito.getCodApp());
		params.put("codModulo", favorito.getCodModulo());
		params.put("codOpcion", favorito.getCodOpcion());

		getMapper().insertaFavorito(params);
		
		this.esExcepcion();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.persistencia.dao.Dao#aumentaFrecuenciaOpc(cl.bluex.persistencia
	 * .to.FavoritoTo)
	 */
	@Override
	public void aumentaFrecuenciaOpc(final FavoritoTo favorito)
			throws BluexException {
		params = new HashMap<String, Object>();
		params.put(TOKEN, favorito.getToken());
		params.put("codSistema", favorito.getCodSistema());
		params.put("codApp", favorito.getCodApp());
		params.put("codModulo", favorito.getCodModulo());
		params.put("codOpcion", favorito.getCodOpcion());
		
		getMapper().aumentaFrecuenciaOpc(params);
		
		this.esExcepcion();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.persistencia.dao.Dao#eliminaFavorito(cl.bluex.persistencia.to
	 * .FavoritoTo)
	 */
	@Override
	public void eliminaFavorito(final FavoritoTo favorito)
			throws BluexException {
		params = new HashMap<String, Object>();
		params.put(TOKEN, favorito.getToken());
		params.put("codSistema", favorito.getCodSistema());
		params.put("codApp", favorito.getCodApp());
		params.put("codModulo", favorito.getCodModulo());
		params.put("codOpcion", favorito.getCodOpcion());
		
		getMapper().eliminaFavorito(params);
		
		this.esExcepcion();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.persistencia.dao.Dao#obtieneDatosUsuario(java.lang.String)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<UsuarioTo> obtieneDatosUsuario(final String token)
			throws BluexException {
		params = new HashMap<String, Object>();
		params.put(TOKEN, token);

		getMapper().obtieneDatosUsuario(params);

		return (List<UsuarioTo>) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.persistencia.dao.Dao#tokenEsValido(java.lang.String)
	 */
	@Override
	public TokenUsuarioTo tokenEsValido(final String token)
			throws BluexException {
		params = new HashMap<String, Object>();
		params.put(TOKEN, token);

		final TokenUsuarioTo tokenUsuario = new TokenUsuarioTo();
		tokenUsuario.setToken(token);

		getMapper().validaToken(params);
		
		tokenUsuario.setCodError(((Integer)params.get(COD_ERROR)).toString());
		tokenUsuario.setDescError((String)params.get(DESC_ERROR));

		return tokenUsuario;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.seguridad.SeguridadDao#obtieneRolUsuario(int, int)
	 */
	@Override
	public List<RolTO> obtieneRolUsuario(final int codigoSistema, final int codigoApp, final String token) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(TOKEN, token);
		params.put(CODIGO_SISTEMA, codigoSistema);
		params.put(CODIGO_APLICACION, codigoApp);
		
		getMapper().obtieneRolUsuario(params);
		
		this.esExcepcion();
		
		@SuppressWarnings("unchecked")
		final List<RolTO> resultado = (List<RolTO>) params.get(RESULTADO);
		return resultado;
	}
	
	private void esExcepcion() throws BluexException {
		final Integer codError = (Integer) params.get(COD_ERROR);
		final String descError = (String) params.get(DESC_ERROR);

		if (codError != 0) {
			throw new BluexException(codError.toString(), descError);
		}
	}
}
