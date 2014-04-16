package cl.bluex.seguridad;

import java.util.List;
import java.util.Map;

import cl.bluex.seguridad.to.Autenticacion;
import cl.bluex.seguridad.to.FavoritoTo;
import cl.bluex.seguridad.to.NewDatosUsuarioTO;
import cl.bluex.seguridad.to.NewUsuarioTO;
import cl.bluex.seguridad.to.OpcionesMenuTo;
import cl.bluex.seguridad.to.RolTO;
import cl.bluex.seguridad.to.TokenUsuarioTo;
import cl.bluex.seguridad.to.UsuarioTo;
import cl.bluex.seguridad.to.UsuarioValido;

import cl.bluex.ws.common.exceptions.BluexException;

// TODO: Auto-generated Javadoc
/**
 * The Interface SeguridadDao.
 *
 * @author Edgardo Herrera
 */
public interface SeguridadDao {
    
    /**
     * Metodo de autenticacion de los datos del usuario.
     *
     * @param datos the datos
     * @return {@link Autenticacion}
     * @throws BluexException the bluex exception
     */
    Autenticacion autenticacion(Autenticacion datos)throws BluexException;

    /**
     * Metodo que valida el usuario.
     *
     * @param username the username
     * @param password the password
     * @return lista de {@link UsuarioValido}
     * @throws BluexException the bluex exception
     */
    List<UsuarioValido> validarUsuario(final String username, final String password) throws BluexException;
    
    /**
     * Gets the validar usuario.
     *
     * @param newUsuarioTO the new usuario to
     * @return the validar usuario
     * @throws BluexException the bluex exception
     */
    NewDatosUsuarioTO getValidarUsuario(final NewUsuarioTO newUsuarioTO) throws BluexException;
    

    /**
     * Metodo que actualiza el numero de intentos.
     *
     * @param username el nombre de usuario
     * @return el numero de intentos
     * @throws BluexException the bluex exception
     */
    Integer actualizarNroIntentos(String username) throws BluexException;

    /**
     * Metodo que inserta un nuevo token del usuario.
     *
     * @param datos del usuario
     * @return el id del token
     * @throws BluexException the bluex exception
     */
    Integer insertarTokenUsuario(Map<String, Object> datos) throws BluexException;

    /**
     * Metodo que obtiene el token del usuario.
     *
     * @param username the username
     * @return lista de tokens del usuario
     * @throws BluexException the bluex exception
     */
    List<TokenUsuarioTo> traeTokenUsuario(String username) throws BluexException;

    /**
     * Metodo que obtiene las opciones del menu.
     *
     * @param codigoSistema el codigo del sistema
     * @param tokenUsuario el token del usuario
     * @return lista de {@link OpcionesMenuTo}
     * @throws BluexException the bluex exception
     */
    List<OpcionesMenuTo> obtieneOpcionesMenu(long codigoSistema, String tokenUsuario) throws BluexException;

    /**
     * Metodo que obtiene las opciones frecuentes del usuario.
     *
     * @param codigoSistema el codigo del sistema
     * @param tokenUsuario el token del usuario
     * @return lista de {@link OpcionesMenuTo}
     * @throws BluexException the bluex exception
     */
    List<OpcionesMenuTo> obtieneOpcionesFrecuentes(long codigoSistema, String tokenUsuario) throws BluexException;

    /**
     * Metodo que elimina el token dado.
     *
     * @param codigoToken el codigo del token
     * @throws BluexException the bluex exception
     */
    void eliminarToken(String codigoToken) throws BluexException;

    /**
     * Metodo que obtiene un usuario a partir de su token.
     *
     * @param token el token del usuario.
     * @return el usuario relacionado al token
     * @throws BluexException the bluex exception
     */
    UsuarioTo obtenerUsuario(String token) throws BluexException;

    /**
     * Metodo que actualiza el password.
     *
     * @param codigoUsuario el codigo del usuario
     * @param passNuevo el nuevo password
     * @return the integer
     * @throws BluexException the bluex exception
     */
    Integer actualizarPassword(Long codigoUsuario, String passNuevo) throws BluexException;

    /**
     * Metodo que crea un nuevo favorito.
     *
     * @param favorito a ingresar
     * @throws BluexException the bluex exception
     */
    void insertaFavorito(FavoritoTo favorito) throws BluexException;

    /**
     * Metodo que aumenta frecuencia en las opciones.
     *
     * @param favorito que se desea aumentar la frecuencia
     * @throws BluexException the bluex exception
     */
    void aumentaFrecuenciaOpc(FavoritoTo favorito) throws BluexException;

    /**
     * Metodo que elimina un favorito.
     *
     * @param favorito a eliminar
     * @throws BluexException the bluex exception
     */
    void eliminaFavorito(FavoritoTo favorito) throws BluexException;

    /**
     * Metodo que obtiene los datos del usuario.
     *
     * @param token que identifica al usuario
     * @return lista de {@link UsuarioTo}
     * @throws BluexException the bluex exception
     */
    List<UsuarioTo> obtieneDatosUsuario(String token) throws BluexException;
    
    /**
     * Metodo que valida si el token es valido.
     *
     * @param token a consultar
     * @return el token
     * @throws BluexException the bluex exception
     */
    TokenUsuarioTo tokenEsValido(String token) throws BluexException;

	/**
	 * Metodo que obtiene el rol del usuario.
	 *
	 * @param codigoSistema el codigo del sistema
	 * @param codigoApp el codigo de la app
	 * @param token the token
	 * @return lista de {@link RolTO}
	 * @throws BluexException the bluex exception
	 */
    List<RolTO> obtieneRolUsuario(final int codigoSistema, final int codigoApp, final String token) throws BluexException;
}
