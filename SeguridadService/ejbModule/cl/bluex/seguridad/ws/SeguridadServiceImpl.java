package cl.bluex.seguridad.ws;

import static cl.bluex.ws.common.util.Constantes.CERO;
import static cl.bluex.ws.common.util.Constantes.CLIENTE_NO_ENCONTRADO;
import static cl.bluex.ws.common.util.Constantes.COD_OPCION_INSERT_TOKEN;
import static cl.bluex.ws.common.util.Constantes.COD_USUARIO;
import static cl.bluex.ws.common.util.Constantes.CONTRASENA_NO_VIGENTE;
import static cl.bluex.ws.common.util.Constantes.DD_MM_YYYY_HH_MM_SS;
import static cl.bluex.ws.common.util.Constantes.DIRECCION_IP;
import static cl.bluex.ws.common.util.Constantes.ERROR_SERVICIO;
import static cl.bluex.ws.common.util.Constantes.FECHA_INICIO;
import static cl.bluex.ws.common.util.Constantes.FECHA_TERMINO;
import static cl.bluex.ws.common.util.Constantes.NMR_ERROR;
import static cl.bluex.ws.common.util.Constantes.NO_PUEDE_INGRESAR_AL_SISTEMA;
import static cl.bluex.ws.common.util.Constantes.NO_SE_ACTUALIZO_EL_NUEVO_PASSWORD;
import static cl.bluex.ws.common.util.Constantes.NO_SE_ENCONTRO_USUARIO;
import static cl.bluex.ws.common.util.Constantes.NO_TIENE_SESIONES_HABILITADAS;
import static cl.bluex.ws.common.util.Constantes.NUMERO_INTENTOS_FALLIDOS;
import static cl.bluex.ws.common.util.Constantes.PASSWORD_ANTIGUO_INCORRECTO;
import static cl.bluex.ws.common.util.Constantes.PASS_ANTIGUO_IGUAL_NUEVO;
import static cl.bluex.ws.common.util.Constantes.TOKEN;
import static cl.bluex.ws.common.util.Constantes.YYYY_MM_DD_HHMMSS;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.apache.log4j.Logger;
import org.jboss.ws.api.annotation.WebContext;

import cl.bluex.seguridad.SeguridadDao;
import cl.bluex.seguridad.bean.NewDatosUsuario;
import cl.bluex.seguridad.bean.Rol;
import cl.bluex.seguridad.bean.request.RequestDatosUsuario;
import cl.bluex.seguridad.bean.request.RequestObtieneOpcionesMenu;
import cl.bluex.seguridad.bean.request.RequestObtieneRolUsuario;
import cl.bluex.seguridad.bean.response.ResponseDatosUsuario;
import cl.bluex.seguridad.bean.response.ResponseObtieneRolUsuario;
import cl.bluex.seguridad.factory.DaoFactory;
import cl.bluex.seguridad.factory.SeguridadDaoFactory;
import cl.bluex.seguridad.to.Autenticacion;
import cl.bluex.seguridad.to.FavoritoTo;
import cl.bluex.seguridad.to.NewDatosUsuarioTO;
import cl.bluex.seguridad.to.NewUsuarioTO;
import cl.bluex.seguridad.to.OpcionesMenuTo;
import cl.bluex.seguridad.to.RolTO;
import cl.bluex.seguridad.to.TokenUsuarioTo;
import cl.bluex.seguridad.to.UsuarioTo;
import cl.bluex.seguridad.to.UsuarioValido;
import cl.bluex.seguridad.ws.util.Mappers;
import cl.bluex.seguridad.ws.util.Util;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

/**
 * The Class SeguridadServiceImpl.
 *
 * @author Edgardo Herrera
 */
@WebService(
	name = "Seguridad",
	serviceName = "SeguridadService",
	portName = "SeguridadServicePort",
	endpointInterface = "cl.bluex.seguridad.ws.SeguridadService",
	targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType")
@SOAPBinding(
	parameterStyle = SOAPBinding.ParameterStyle.WRAPPED,
	style = SOAPBinding.Style.DOCUMENT,
	use = SOAPBinding.Use.ENCODED)
@Remote(SeguridadService.class)
@Stateless
@WebContext(
	contextRoot = "/SeguridadWS",
	urlPattern = "/BXSEG001_login")
public class SeguridadServiceImpl implements SeguridadService {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(SeguridadServiceImpl.class);
	
	/** The Constant VALOR_ERRONEO_TOTAL_INTENTOS_FALLIDOS. */
	private static final String VALOR_ERRONEO_TOTAL_INTENTOS_FALLIDOS = "el valor en total de intentos fallidos es erroneo";
	
	/** The Constant VALOR_ERRONEO_NRO_INTENTOS_FALLIDOS. */
	private static final String VALOR_ERRONEO_NRO_INTENTOS_FALLIDOS = "el valor en numero de intentos fallidos es erroneo";

	/**
	 * Crea instancia de {@link SeguridadServiceImpl}.
	 * 
	 */
	public SeguridadServiceImpl() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.seguridad.ws.SeguridadService#validarUsuario(java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String,
	 * cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public TokenUsuarioTo validarUsuario(
			final String username,
			final String password, 
			final String numIP, 
			final String origen,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("Inicio validarUsuario");

		final Autenticacion datos = new Autenticacion();
		datos.setUsername(username);
		datos.setPassword(password);
		datos.setNumIP(numIP);
		datos.setOrigen(origen);
		
		// Va a PCK_SEGURIDAD.prc_Autentificacion
		// y si es <> de null o <> Cero llama al metodo actualizarNroIntentos
		// no retorna nada
		autentificarUsuario(datos);

		// VALIDACION INTENTOS FALLIDOS
		// PCK_SEGURIDAD.fnc_DatosValidaUsuario
		// llama validarUsuario
		final UsuarioValido usuarioValido = validarIntentosFallidos(username,
				password);

		// VALIDACION VIGENCIA PASSWORD
		validarVigenciaPass(usuarioValido);

		final TokenUsuarioTo tokenUsuario = validarToken(datos, usuarioValido);

		LOGGER.info("Fin validarUsuario");
		return tokenUsuario;
	}

	
	
	/* (non-Javadoc)
	 * @see cl.bluex.seguridad.ws.SeguridadService#getValidarUsuario(cl.bluex.seguridad.bean.request.RequestDatosUsuario, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseDatosUsuario getValidarUsuario(RequestDatosUsuario request) throws BluexException {
		
		LOGGER.info("[getValidarUsuario] inicio getValidarUsuario.");
		
		ResponseDatosUsuario response;
		
		final DaoFactory daoFactory = SeguridadDaoFactory.getInstance().getDaoFactory();
		final SeguridadDao seguridaDao = daoFactory.getSeguridadDao();
		
		final Autenticacion datos = new Autenticacion();
		datos.setUsername(request.getParametrosEntrada().getUsername());
		datos.setPassword(request.getParametrosEntrada().getPassword());
		
		datos.setToken(this.crearNuevoToken(datos));
		
		try {
			
			final NewUsuarioTO entradaTO = Mappers.mapeaTOentrada(datos);
			final NewDatosUsuarioTO salidaTO = seguridaDao.getValidarUsuario(entradaTO);
			final NewDatosUsuario respuesta = Mappers.mapeaTOsalida(salidaTO);
			
			response = new ResponseDatosUsuario(respuesta);
			
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("[getValidarUsuario] fin getValidarUsuario.");
		
		return response;
	}
	
	
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.seguridad.ws.SeguridadService#obtieneOpcionesMenu(cl.bluex.ws
	 * .common.head.Cabecera)
	 */
	@Override
	public List<OpcionesMenuTo> obtieneOpcionesMenu(final RequestObtieneOpcionesMenu request, 
			final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("Inicio obtieneOpcionesMenu");
		
		List<OpcionesMenuTo> obtieneOpcionesMenu;
		
		tokenEsValido(cabecera.getToken());
		
		final DaoFactory daoFactory = SeguridadDaoFactory.getInstance().getDaoFactory();
		final SeguridadDao seguridadDao = daoFactory.getSeguridadDao();
		try {
			obtieneOpcionesMenu = seguridadDao.obtieneOpcionesMenu(request.getCodigoSistema(), cabecera.getToken());
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin obtieneOpcionesMenu");
		return obtieneOpcionesMenu;
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.seguridad.ws.SeguridadService#obtieneOpcionesFrecuentes(cl.bluex
	 * .seguridad.head.Cabecera)
	 */
	@Override
	public List<OpcionesMenuTo> obtieneOpcionesFrecuentes(
			final RequestObtieneOpcionesMenu request,
			final Cabecera cabecera) throws BluexException {
		LOGGER.info("Inicio obtieneOpcionesFrecuentes");
		
		List<OpcionesMenuTo> obtieneOpcionesFrecuentes;
		
		this.tokenEsValido(cabecera.getToken());
		
		final DaoFactory daoFactory = SeguridadDaoFactory.getInstance().getDaoFactory();
		final SeguridadDao seguridadDao = daoFactory.getSeguridadDao();
		try {
			obtieneOpcionesFrecuentes = seguridadDao.obtieneOpcionesFrecuentes(request.getCodigoSistema(), cabecera.getToken());
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin obtieneOpcionesFrecuentes");
		return obtieneOpcionesFrecuentes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.seguridad.ws.SeguridadService#cambiarContraseña(java.lang.String
	 * , java.lang.String, cl.bluex.seguridad.head.Cabecera)
	 */
	@Override
	public Integer cambiarContrasena(final String passAntiguo,
			final String passNuevo, 
			final Cabecera cabecera)
			throws BluexException {
		
		LOGGER.info("Inicio cambiarContraseña");
		
		Integer resultado;
		
		// actualizar password
		this.tokenEsValido(cabecera.getToken());

		final DaoFactory daoFactory = SeguridadDaoFactory.getInstance().getDaoFactory();
		final SeguridadDao seguridadDao = daoFactory.getSeguridadDao();
		try {
			// Validar si existe token y obtener usuario
			final UsuarioTo usuario = seguridadDao.obtenerUsuario(cabecera
					.getToken());

			if (usuario == null || usuario.getPassword() == null) {
				throw new BluexException(NMR_ERROR, CLIENTE_NO_ENCONTRADO);
			}
			// comparar si passAntiguo es igual a passNuevo
			if (passAntiguo.equals(passNuevo)) {
				throw new BluexException(NMR_ERROR, PASS_ANTIGUO_IGUAL_NUEVO);
			}
			if (!passAntiguo.equals(usuario.getPassword())) {
				throw new BluexException(NMR_ERROR, PASSWORD_ANTIGUO_INCORRECTO);
			}

			resultado = seguridadDao.actualizarPassword(
					usuario.getCodigoUsuario(), passNuevo);

			if (resultado == 0) {
				throw new BluexException(NMR_ERROR,
						NO_SE_ACTUALIZO_EL_NUEVO_PASSWORD);
			}
		} finally {
			daoFactory.close();
		}

		LOGGER.info("Fin cambiarContraseña");
		return resultado;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.seguridad.ws.SeguridadService#insertaFavorito(long, long,
	 * long, long, cl.bluex.seguridad.head.Cabecera)
	 */
	@Override
	public void insertaFavorito(final long codSistema, 
			final long codApp,
			final long codModulo, 
			final long codOpcion, 
			final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("Inicio insertaFavorito");
		
		this.tokenEsValido(cabecera.getToken());
			
		final DaoFactory daoFactory = SeguridadDaoFactory.getInstance().getDaoFactory();
		final SeguridadDao seguridadDao = daoFactory.getSeguridadDao();
		try {
			final FavoritoTo favorito = new FavoritoTo();
			favorito.setCodSistema(codSistema);
			favorito.setCodApp(codApp);
			favorito.setCodModulo(codModulo);
			favorito.setCodOpcion(codOpcion);
			favorito.setToken(cabecera.getToken());

			seguridadDao.insertaFavorito(favorito);
			
		} finally {
			daoFactory.close();
		}
		LOGGER.info("Fin insertaFavorito");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.seguridad.ws.SeguridadService#aumentaFrecuenciaOpc(long,
	 * long, long, long, cl.bluex.seguridad.head.Cabecera)
	 */
	@Override
	public void aumentaFrecuenciaOpc(
			final long codSistema, 
			final long codApp,
			final long codModulo, 
			final long codOpcion, 
			final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("Inicio aumentaFrecuenciaOpc");
		
		this.tokenEsValido(cabecera.getToken());
		
		final DaoFactory daoFactory = SeguridadDaoFactory.getInstance().getDaoFactory();
		final SeguridadDao seguridadDao = daoFactory.getSeguridadDao();
		try {
			final FavoritoTo favorito = new FavoritoTo();
			favorito.setCodSistema(codSistema);
			favorito.setCodApp(codApp);
			favorito.setCodModulo(codModulo);
			favorito.setCodOpcion(codOpcion);
			favorito.setToken(cabecera.getToken());

			seguridadDao.aumentaFrecuenciaOpc(favorito);

		} finally {
			daoFactory.close();
		}
		LOGGER.info("Fin aumentaFrecuenciaOpc");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.seguridad.ws.SeguridadService#eliminaFavorito(long, long,
	 * long, long, cl.bluex.seguridad.head.Cabecera)
	 */
	@Override
	public void eliminaFavorito(final long codSistema, 
			final long codApp,
			final long codModulo, 
			final long codOpcion, 
			final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("Inicio eliminaFavorito");
		
		this.tokenEsValido(cabecera.getToken());
		
		final DaoFactory daoFactory = SeguridadDaoFactory.getInstance().getDaoFactory();
		final SeguridadDao seguridadDao = daoFactory.getSeguridadDao();
		try {
			final FavoritoTo favorito = new FavoritoTo();
			favorito.setCodSistema(codSistema);
			favorito.setCodApp(codApp);
			favorito.setCodModulo(codModulo);
			favorito.setCodOpcion(codOpcion);
			favorito.setToken(cabecera.getToken());
			seguridadDao.eliminaFavorito(favorito);
		} finally {
			daoFactory.close();
		}
		LOGGER.info("Fin eliminaFavorito");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.seguridad.ws.SeguridadService#obtieneDatosUsuario(
	 * cl.bluex.seguridad.head.Cabecera)
	 */
	@Override
	public UsuarioTo obtieneDatosUsuario(final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("Inicio obtieneDatosUsuario");
		
		UsuarioTo usuarioTo;
		
		this.tokenEsValido(cabecera.getToken());
		
		final DaoFactory daoFactory = SeguridadDaoFactory.getInstance().getDaoFactory();
		final SeguridadDao seguridadDao = daoFactory.getSeguridadDao();
		try {
			final List<UsuarioTo> obtieneDatosUsuario = seguridadDao
					.obtieneDatosUsuario(cabecera.getToken());
			if (obtieneDatosUsuario.isEmpty()) {
				throw new BluexException(NMR_ERROR,
						NO_SE_ENCONTRO_USUARIO);
			}
			usuarioTo = obtieneDatosUsuario.get(0);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin obtieneDatosUsuario");
		return usuarioTo;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.seguridad.ws.SeguridadService#cerrarSesion(cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public void cerrarSesion(final Cabecera cabecera) throws BluexException {
		LOGGER.debug("Inicio cerrarSesion");
		
		this.eliminarToken(cabecera.getToken());
		
		LOGGER.debug("Fin cerrarSesion");
	}

	/**
	 * Validar token.
	 *
	 * @param autenticacion the autenticacion
	 * @param usuarioValido the usuario valido
	 * @return the token usuario to
	 * @throws BluexException the bluex exception
	 */
	private TokenUsuarioTo validarToken(final Autenticacion autenticacion,
			final UsuarioValido usuarioValido) throws BluexException {
		LOGGER.info("Inicio validarToken");
		
		final TokenUsuarioTo tokenUsuario;
		
		// OBTIENE TOKENS USUARIO
		final List<TokenUsuarioTo> tokens = traeTokenUsuario(autenticacion
				.getUsername());
		final String nuevoToken = this.validarToken(autenticacion,
				usuarioValido, tokens);
		
		
		// VALIDACION TOKEN
		final Date fechaActual = new Date();
		final DateFormat formatter = new SimpleDateFormat(
				DD_MM_YYYY_HH_MM_SS, Locale.getDefault());
		final String strFechaActual = formatter.format(fechaActual);
		Date fechaActualDate = null;
		try {
			fechaActualDate = formatter.parse(strFechaActual);
		} catch (final ParseException e) {
			throw new BluexException(NMR_ERROR, ERROR_SERVICIO);
		}
		final Calendar calFechaFinal = Calendar.getInstance();
		calFechaFinal.setTime(fechaActual);
		calFechaFinal.add(Calendar.DAY_OF_MONTH, 8);
		final Date fechaFin = calFechaFinal.getTime();
		final String strFechaFin = formatter.format(fechaFin);
		Date fechaFinDate = null;
		try {
			fechaFinDate = formatter.parse(strFechaFin);
		} catch (final ParseException e) {
			throw new BluexException(NMR_ERROR, ERROR_SERVICIO);
		}
		final Map<String, Object> param = new HashMap<String, Object>();
		param.put(TOKEN, nuevoToken);
		param.put(COD_USUARIO, usuarioValido.getCodigoUsuario());
		param.put(FECHA_INICIO, strFechaActual);
		param.put(FECHA_TERMINO, strFechaFin);
		param.put(DIRECCION_IP, autenticacion.getNumIP());
		param.put(COD_OPCION_INSERT_TOKEN, autenticacion.getOrigen());
		
		final DaoFactory daoFactory = SeguridadDaoFactory.getInstance().getDaoFactory();
		final SeguridadDao seguridadDao = daoFactory.getSeguridadDao();
		try {
			seguridadDao.insertarTokenUsuario(param);
			tokenUsuario = new TokenUsuarioTo();
			tokenUsuario.setUsername(autenticacion.getUsername());
			tokenUsuario.setPwduser(autenticacion.getPassword());
			tokenUsuario.setNumip(autenticacion.getNumIP());
			tokenUsuario.setNombres(usuarioValido.getNombreUsuario());
			tokenUsuario.setToken(nuevoToken);
			tokenUsuario.setRoles(usuarioValido.getRoles());
			tokenUsuario.setUrlFoto(usuarioValido.getUrlFoto());
			tokenUsuario.setFechaIngresoSession(fechaActualDate);
			tokenUsuario.setFechaTerminoSession(fechaFinDate);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin validarToken");
		return tokenUsuario;
	}

	/**
	 * Validar token.
	 *
	 * @param autenticacion the autenticacion
	 * @param usuarioValido the usuario valido
	 * @param tokens the tokens
	 * @return the string
	 * @throws BluexException the bluex exception
	 */
	private String validarToken(final Autenticacion autenticacion,
			final UsuarioValido usuarioValido, 
			final List<TokenUsuarioTo> tokens)
			throws BluexException {
		LOGGER.info("Inicio validarToken");

		String nuevoToken = "";

		if (tokens.isEmpty()) {
			return crearNuevoToken(autenticacion);
		}

		// LLego usuario a la cantidad de sesiones abiertas?
		final Integer cantidadSesiones = usuarioValido.getCantidadSesiones();

		if (cantidadSesiones == null || cantidadSesiones == 0) {
			throw new BluexException(NMR_ERROR,
					NO_TIENE_SESIONES_HABILITADAS);
		}
		if (tokens.size() >= cantidadSesiones) {
			if (cantidadSesiones != 1) {
				throw new BluexException(NMR_ERROR,
						NO_PUEDE_INGRESAR_AL_SISTEMA);
			}
			eliminarToken(tokens.get(0).getToken());
		}
		nuevoToken = crearNuevoToken(autenticacion);
		
		LOGGER.info("Fin validarToken");
		return nuevoToken;
	}

	/**
	 * Eliminar token.
	 *
	 * @param codigoToken the codigo token
	 * @throws BluexException the bluex exception
	 */
	private void eliminarToken(final String codigoToken) throws BluexException {
		LOGGER.info("Inicio eliminarToken");
		
		final DaoFactory daoFactory = SeguridadDaoFactory.getInstance().getDaoFactory();
		final SeguridadDao seguridadDao = daoFactory.getSeguridadDao();
		try {
			seguridadDao.eliminarToken(codigoToken);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin eliminarToken");
	}

	/**
	 * Validar vigencia pass.
	 *
	 * @param usuarioValido the usuario valido
	 * @throws BluexException the bluex exception
	 */
	private void validarVigenciaPass(final UsuarioValido usuarioValido)
			throws BluexException {
		LOGGER.info("Inicio validarVigenciaPass");
		
		final Date fechaActual = new Date();
		final Date fechaInicioVigente = usuarioValido.getFechaInicioVigente();
		final Date fechaFinVigente = usuarioValido.getFechaFinVigente();

		final Calendar calFechaActual = Calendar.getInstance();
		calFechaActual.setTime(fechaActual);

		final Calendar calFechaInicioVigente = Calendar.getInstance();
		calFechaInicioVigente.setTime(fechaInicioVigente);

		final Calendar calFechaFinVigente = Calendar.getInstance();
		calFechaFinVigente.setTime(fechaFinVigente);

		LOGGER.info(" [Fecha Inicio" + calFechaInicioVigente.getTime() + "]-[" + calFechaFinVigente.getTime() +"]");
		if (calFechaActual.before(calFechaInicioVigente)
				|| calFechaActual.after(calFechaFinVigente)) {
			throw new BluexException(NMR_ERROR, CONTRASENA_NO_VIGENTE);
		}
		
		LOGGER.info("Fin validarVigenciaPass");
	}

	/**
	 * Validar intentos fallidos.
	 *
	 * @param username the username
	 * @param password the password
	 * @return the usuario valido
	 * @throws BluexException the bluex exception
	 */
	private UsuarioValido validarIntentosFallidos(final String username,
			final String password) throws BluexException {
		LOGGER.info("Inicio metodo validarIntentosFallidos");
		
		final UsuarioValido usuarioValido;

		final DaoFactory daoFactory = SeguridadDaoFactory.getInstance().getDaoFactory();
		final SeguridadDao seguridadDao = daoFactory.getSeguridadDao();
		try {
			final List<UsuarioValido> usuariosValidos = seguridadDao.validarUsuario(username, password);
			usuarioValido = usuariosValidos.get(0);
			
			final Integer nroIntentosFallidos = usuarioValido.getNumIntentosFallidosIngreso();
			final String totalIntentosFallidos = usuarioValido.getTotalIntentosFallidos();
			
			if (nroIntentosFallidos == null) {
				throw new BluexException(NMR_ERROR, VALOR_ERRONEO_NRO_INTENTOS_FALLIDOS);
			}
			if ("".equals(totalIntentosFallidos) || totalIntentosFallidos == null) {
				throw new BluexException(NMR_ERROR, VALOR_ERRONEO_TOTAL_INTENTOS_FALLIDOS);
			}
			final int totalIntentos = Integer.parseInt(totalIntentosFallidos);
			
			if (nroIntentosFallidos >= totalIntentos) {
				throw new BluexException(NMR_ERROR, NUMERO_INTENTOS_FALLIDOS);
			}
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin metodo validarIntentosFallidos");
		return usuarioValido;
	}

	/**
	 * Autentificar usuario.
	 *
	 * @param datos the datos
	 * @throws BluexException the bluex exception
	 */
	private void autentificarUsuario(final Autenticacion datos)
			throws BluexException {
		LOGGER.info("Inicio autentificarUsuario");
		
		final DaoFactory daoFactory = SeguridadDaoFactory.getInstance().getDaoFactory();
		final SeguridadDao seguridadDao = daoFactory.getSeguridadDao();
		try {
			LOGGER.debug("Inicio llamada autenticacion");
			final Autenticacion autenticacionUsuario = seguridadDao.autenticacion(datos);
			
			if (autenticacionUsuario == null
					|| !CERO.equals(autenticacionUsuario.getCodError())) {
				LOGGER.debug("Inicio llamada actualizarNroIntentos");
				seguridadDao.actualizarNroIntentos(datos.getUsername());
				
				throw new BluexException(autenticacionUsuario.getCodError(),
						autenticacionUsuario.getDescError());
			}
		} finally {
			LOGGER.debug("close factory");
			daoFactory.close();
		}
		
		LOGGER.info("Fin autentificarUsuario");
	}

	/**
	 * Crear nuevo token.
	 *
	 * @param datos the datos
	 * @return the string
	 * @throws BluexException the bluex exception
	 */
	private String crearNuevoToken(final Autenticacion datos)
			throws BluexException {
		LOGGER.info("[crearNuevoToken] Inicio crearNuevoToken");
		
		final DateFormat formatter = new SimpleDateFormat(YYYY_MM_DD_HHMMSS,
				Locale.getDefault());
		final String strFechaActual = formatter.format(new Date());

		final String tokenSinEncriptar = datos.getUsername() + strFechaActual;
		final String nuevoToken = Util.encriptaEnMD5(tokenSinEncriptar);

		LOGGER.info("[crearNuevoToken] Fin crearNuevoToken");
		return nuevoToken;
	}
	
	/**
	 * Trae token usuario.
	 *
	 * @param username the username
	 * @return the list
	 * @throws BluexException the bluex exception
	 */
	private List<TokenUsuarioTo> traeTokenUsuario(final String username)
			throws BluexException {
		LOGGER.info("Fin crearNuevoToken");
		
		List<TokenUsuarioTo> tokens;
		
		final DaoFactory daoFactory = SeguridadDaoFactory.getInstance().getDaoFactory();
		final SeguridadDao seguridadDao = daoFactory.getSeguridadDao();
		try {
			LOGGER.debug("Inicio llamada traeTokenUsuario");
			tokens = seguridadDao.traeTokenUsuario(username);
			if (tokens == null) {
				tokens = new ArrayList<TokenUsuarioTo>();
			}
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Inicio crearNuevoToken");
		return tokens;
	}

	

	/* (non-Javadoc)
	 * @see cl.bluex.seguridad.ws.SeguridadService#obtieneRolUsuario(cl.bluex.seguridad.bean.request.RequestObtieneRolUsuario, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseObtieneRolUsuario obtieneRolUsuario(
			final RequestObtieneRolUsuario request,
			final Cabecera cabecera)
			throws BluexException {
		LOGGER.info("Inicio obtieneRolUsuario");
		
		final ResponseObtieneRolUsuario response;
		
		this.tokenEsValido(cabecera.getToken());
		
		final DaoFactory daoFactory = SeguridadDaoFactory.getInstance().getDaoFactory();
		final SeguridadDao seguridadDao = daoFactory.getSeguridadDao();
		try {
			final List<RolTO> rolesTO = seguridadDao.obtieneRolUsuario(request.getCodigoSistema(), request.getCodigoApp(), cabecera.getToken());
			final List<Rol> roles = Mappers.mapperRolesTO(rolesTO);
			response = new ResponseObtieneRolUsuario(roles);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("Fin obtieneRolUsuario");
		return response;
	}
	
	/**
	 * Token es valido.
	 *
	 * @param token the token
	 * @throws BluexException the bluex exception
	 */
	private void tokenEsValido(final String token) throws BluexException {
		LOGGER.info("Inicio metodo tokenEsValido");
		
		final SeguridadDaoFactory instance = SeguridadDaoFactory.getInstance();
		final DaoFactory daoFactory = instance
				.getDaoFactory();
		final SeguridadDao seguridadDao = daoFactory
				.getSeguridadDao();
		try {
			LOGGER.debug("Inicio llamada tokenEsValido");
			final TokenUsuarioTo tokenEsValido = seguridadDao
					.tokenEsValido(token);
			
			final String codError = tokenEsValido.getCodError();
			final String descError = tokenEsValido.getDescError();
			if (!CERO.equals(codError)) {
				throw new BluexException(codError, descError);
			}
		} finally {
			daoFactory.close();
		}
		LOGGER.info("Fin metodo tokenEsValido");
	}

}
