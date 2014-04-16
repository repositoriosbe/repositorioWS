package cl.bluex.seguridad.mapper;

import java.util.Map;

import cl.bluex.seguridad.to.UsuarioTo;

/**
 * The Interface SeguridadMapper.
 *
 * @author Edgardo Herrera
 */
public interface SeguridadMapper {

	/**
	 * Mapper autenticacion.
	 *
	 * @param params the params
	 */
    void autenticacion(Map<String, Object> params);
	
	/**
	 * Mapper validarUsuario.
	 *
	 * @param params the params
	 */
	void validarUsuario(Map<String, Object> params);
	
	
	/**
	 * Mapper validarUsuario.
	 *
	 * @param params the params
	 * @return the validar usuario
	 */
	void getValidarUsuario(Map<String, Object> params);
	
	/**
	 * Mapper actualizarNroIntentos.
	 *
	 * @param params the params
	 * @return the integer
	 */
	Integer actualizarNroIntentos(Map<String, Object> params);
	
	/**
	 * Mapper insertaTokenUsuario.
	 *
	 * @param params the params
	 * @return the integer
	 */
	Integer insertaTokenUsuario(Map<String, Object> params);
	/**
	 * Mapper traeTokenUsuario.
	 *
	 * @param params de entrada
	 */
	void traeTokenUsuario(Map<String, Object> params);
	/**
	 * Mapper obtieneOpcionesMenu.
	 *
	 * @param params de entrada
	 */
	void obtieneOpcionesMenu(Map<String, Object> params);
	/**
	 * Mapper obtieneOpcionesFrecuentes.
	 *
	 * @param params de entrada
	 */
	void obtieneOpcionesFrecuentes(Map<String, Object> params);
	
	/**
	 * Mapper eliminarToken.
	 *
	 * @param params the params
	 */
	void eliminarToken(Map<String, Object> params);
	
	/**
	 * Mapper obtenerUsuarioPassword.
	 *
	 * @param params the params
	 * @return the usuario to
	 */
	UsuarioTo obtenerUsuarioPassword(Map<String, Object> params);
	
	/**
	 * Mapper actualizarPassword.
	 *
	 * @param params de entrada
	 * @return the integer
	 */
	Integer actualizarPassword(Map<String, Object> params);
	
	/**
	 * Mapper insertaFavorito.
	 *
	 * @param params the params
	 */
	void insertaFavorito(Map<String, Object> params);
	
	/**
	 * Mapper aumentaFrecuenciaOpc.
	 *
	 * @param params the params
	 */
	void aumentaFrecuenciaOpc(Map<String, Object> params);
	
	/**
	 * Mapper eliminaFavorito.
	 *
	 * @param params the params
	 */
	void eliminaFavorito(Map<String, Object> params);
	/**
	 * Mapper obtieneDatosUsuario.
	 *
	 * @param params de entrada
	 */
	void obtieneDatosUsuario(Map<String, Object> params);
	
	/**
	 * Mapper validaToken.
	 *
	 * @param params the params
	 */
	void validaToken(Map<String, Object> params);
	
	/**
	 * Mapper obtieneRolUsuario.
	 *
	 * @param params the params
	 */
	void obtieneRolUsuario(Map<String, Object> params);

	
}
