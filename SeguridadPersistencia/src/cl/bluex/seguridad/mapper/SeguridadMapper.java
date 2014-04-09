package cl.bluex.seguridad.mapper;

import java.util.Map;

import cl.bluex.seguridad.to.Autenticacion;
import cl.bluex.seguridad.to.FavoritoTo;
import cl.bluex.seguridad.to.TokenUsuarioTo;
import cl.bluex.seguridad.to.UsuarioTo;

/**
 * @author Edgardo Herrera
 *
 */
public interface SeguridadMapper {

	/**
	 * Mapper autenticacion.
	 *
	 * @param {@link Autenticacion}
	 */
    void autenticacion(Map<String, Object> params);
	/**
	 * Mapper validarUsuario.
	 *
	 * @param datos de entrada
	 */
	void validarUsuario(Map<String, Object> params);
	/**
	 * Mapper actualizarNroIntentos.
	 *
	 * @param {@link String username}
	 */
	Integer actualizarNroIntentos(Map<String, Object> params);
	/**
	 * Mapper insertaTokenUsuario.
	 *
	 * @param datos de entrada
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
	 * @param {@link String codigoToken}
	 */
	void eliminarToken(Map<String, Object> params);
	/**
	 * Mapper obtenerUsuarioPassword.
	 *
	 * @param {@link UsuarioTo usuario}
	 */
	UsuarioTo obtenerUsuarioPassword(Map<String, Object> params);
	/**
	 * Mapper actualizarPassword.
	 *
	 * @param params de entrada
	 */
	Integer actualizarPassword(Map<String, Object> params);
	/**
	 * Mapper insertaFavorito.
	 *
	 * @param {@link FavoritoTo favorito}
	 */
	void insertaFavorito(Map<String, Object> params);
	/**
	 * Mapper aumentaFrecuenciaOpc.
	 *
	 * @param {@link FavoritoTo favorito}
	 */
	void aumentaFrecuenciaOpc(Map<String, Object> params);
	/**
	 * Mapper eliminaFavorito.
	 *
	 * @param {@link FavoritoTo favorito}
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
	 * @param {@link TokenUsuarioTo tokenUsuario}
	 */
	void validaToken(Map<String, Object> params);
	/**
	 * Mapper obtieneRolUsuario.
	 * 
	 * @param params
	 */
	void obtieneRolUsuario(Map<String, Object> params);

	
}
