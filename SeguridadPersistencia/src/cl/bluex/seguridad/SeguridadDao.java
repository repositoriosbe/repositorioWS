package cl.bluex.seguridad;

import java.util.List;
import java.util.Map;

import cl.bluex.seguridad.to.Autenticacion;
import cl.bluex.seguridad.to.FavoritoTo;
import cl.bluex.seguridad.to.OpcionesMenuTo;
import cl.bluex.seguridad.to.RolTO;
import cl.bluex.seguridad.to.TokenUsuarioTo;
import cl.bluex.seguridad.to.UsuarioTo;
import cl.bluex.seguridad.to.UsuarioValido;

import cl.bluex.ws.common.exceptions.BluexException;

/**
 * @author Edgardo Herrera
 *
 */
public interface SeguridadDao {
    
    /**
     * Metodo de autenticacion de los datos del usuario.
     * 
     * @param {@link Autenticacion datos} los datos para la autenticacion
     * @return {@link Autenticacion}
     */
    Autenticacion autenticacion(Autenticacion datos)throws BluexException;

    /**
     * Metodo que valida el usuario.
     * 
     * @param datos a validar
     * @return lista de {@link UsuarioValido}
     */
    List<UsuarioValido> validarUsuario(final String username, final String password) throws BluexException;

    /**
     * Metodo que actualiza el numero de intentos.
     * 
     * @param username el nombre de usuario
     * @return el numero de intentos
     */
    Integer actualizarNroIntentos(String username) throws BluexException;

    /**
     * Metodo que inserta un nuevo token del usuario.
     * 
     * @param datos del usuario
     * @return el id del token
     */
    Integer insertarTokenUsuario(Map<String, Object> datos) throws BluexException;

    /**
     * Metodo que obtiene el token del usuario.
     * 
     * @param params datos del usuario
     * @return lista de tokens del usuario
     */
    List<TokenUsuarioTo> traeTokenUsuario(String username) throws BluexException;

    /**
     * Metodo que obtiene las opciones del menu.
     * 
     * @param codigoSistema el codigo del sistema
     * @param tokenUsuario el token del usuario
     * @return lista de {@link OpcionesMenuTo}
     * @throws BluexException
     */
    List<OpcionesMenuTo> obtieneOpcionesMenu(long codigoSistema, String tokenUsuario) throws BluexException;

    /**
     * Metodo que obtiene las opciones frecuentes del usuario.
     * 
     * @param codigoSistema el codigo del sistema
     * @param tokenUsuario el token del usuario
     * @return lista de {@link OpcionesMenuTo}
     */
    List<OpcionesMenuTo> obtieneOpcionesFrecuentes(long codigoSistema, String tokenUsuario) throws BluexException;

    /**
     * Metodo que elimina el token dado.
     * 
     * @param codigoToken el codigo del token
     */
    void eliminarToken(String codigoToken) throws BluexException;

    /**
     * Metodo que obtiene un usuario a partir de su token.
     * 
     * @param token el token del usuario.
     * @return el usuario relacionado al token
     */
    UsuarioTo obtenerUsuario(String token) throws BluexException;

    /**
     * Metodo que actualiza el password.
     * 
     * @param codigoUsuario el codigo del usuario
     * @param passNuevo el nuevo password
     * @return 
     */
    Integer actualizarPassword(Long codigoUsuario, String passNuevo) throws BluexException;

    /**
     * Metodo que crea un nuevo favorito.
     * 
     * @param favorito a ingresar
     */
    void insertaFavorito(FavoritoTo favorito) throws BluexException;

    /**
     * Metodo que aumenta frecuencia en las opciones.
     * 
     * @param favorito que se desea aumentar la frecuencia
     */
    void aumentaFrecuenciaOpc(FavoritoTo favorito) throws BluexException;

    /**
     * Metodo que elimina un favorito.
     * 
     * @param favorito a eliminar
     */
    void eliminaFavorito(FavoritoTo favorito) throws BluexException;

    /**
     * Metodo que obtiene los datos del usuario.
     * 
     * @param token que identifica al usuario
     * @return lista de {@link UsuarioTo}
     */
    List<UsuarioTo> obtieneDatosUsuario(String token) throws BluexException;
    
    /**
     * Metodo que valida si el token es valido.
     * 
     * @param token a consultar
     * @return el token
     */
    TokenUsuarioTo tokenEsValido(String token) throws BluexException;

	/**
	 * Metodo que obtiene el rol del usuario.
	 * 
	 * @param codigoSistema el codigo del sistema
	 * @param codigoApp el codigo de la app
	 * @return lista de {@link RolTO}
	 */
    List<RolTO> obtieneRolUsuario(final int codigoSistema, final int codigoApp, final String token) throws BluexException;
}
