package cl.bluex.seguridad.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import cl.bluex.seguridad.to.OpcionesMenuTo;
import cl.bluex.seguridad.to.TokenUsuarioTo;
import cl.bluex.seguridad.to.UsuarioTo;
import cl.bluex.seguridad.bean.request.RequestObtieneOpcionesMenu;
import cl.bluex.seguridad.bean.request.RequestObtieneRolUsuario;
import cl.bluex.seguridad.bean.response.ResponseObtieneRolUsuario;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

/**
 * interfaz servicio de seguridad.
 * 
 * @author Edgardo Herrera
 *
 */
@WebService(name = "Seguridad",
	targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType")
public interface SeguridadService {

    /**
     * Este metodo se encarga de validar la existencia y credenciales de un
     * usuario.
     * 
     * @param username el nombre de usuario
     * @param password el password del usuario
     * @param numIP el numero de IP de la maquina
     * @param origen el origen
     * @param cabecera objeto {@link Cabecera} que contiene el token
     * @return el objeto {@link TokenUsuarioTo}
     * @throws SeguridadException
     */
    @WebMethod(operationName = "validarUsuario",
	    action = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/validarUsuario")
    @WebResult(name = "TokenUsuarioTo",
	    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/",
	    partName = "TokenUsuarioTo")
    @RequestWrapper(localName = "requestValidaUsuario",
	    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/",
	    className = "cl.bluex.seguridad.ws.RequestValidaUsuario")
    @ResponseWrapper(localName = "responseValidaUsuario",
	    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/",
	    className = "cl.bluex.seguridad.ws.ResponseValidaUsuario")
    TokenUsuarioTo validarUsuario(
	    @WebParam(name = "NameUsuario",
		    header = false,
		    partName = "NameUsuario",
		    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") String username,
	    @WebParam(name = "PassUsuario",
		    header = false,
		    partName = "PassUsuario",
		    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") String password,
	    @WebParam(name = "NumIP",
		    header = false,
		    partName = "NumIP",
		    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") String numIP,
	    @WebParam(name = "Origen",
		    header = false,
		    partName = "Origen",
		    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") String origen,
	    @WebParam(name = "Cabecera",
		    header = true,
		    partName = "Cabecera",
		    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") Cabecera cabecera)
	    throws BluexException;

    /**
     * Este método se encarga de obtener las opciones para el menu del usuario.
     * 
     * @param cabecera objeto {@link Cabecera} que contiene el token
     * @return una colección de objeto {@link OpcionesMenuTo}
     * @throws SeguridadException
     */
	@WebMethod(
		operationName = "obtieneOpcionesMenu",
		action = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/obtieneOpcionesMenu")
	@WebResult(
		name = "OpcionesMenu",
		targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/",
		partName = "OpcionesMenu")
	@ResponseWrapper(
		localName = "responseOpcionesMenu",
		targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/",
		className = "cl.bluex.seguridad.ws.ResponseOpcionesMenu")
	List<OpcionesMenuTo> obtieneOpcionesMenu(
			@WebParam(
				name = "requestObtieneOpcionesMenu",
				partName = "requestObtieneOpcionesMenu",
				header = false) RequestObtieneOpcionesMenu request,
			@WebParam(
				name = "Cabecera",
				header = true,
				partName = "Cabecera",
				targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") Cabecera cabecera)
			throws BluexException;

    /**
     * Este método se encarga de obtener las opciones favoritas del usuario.
     * 
     * @param cabecera objeto {@link Cabecera} que contiene el token
     * @return una colección de objeto {@link OpcionesMenuTo}
     * @throws SeguridadException
     */
    @WebMethod(operationName = "obtieneOpcionesFrecuentes",
	    action = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/obtieneOpcionesMenu")
    @WebResult(name = "ObtieneOpcionesFrecuentes",
	    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/",
	    partName = "OpcionesMenu")
    @RequestWrapper(localName = "requestOpcionesFrecuentesMenu",
	    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/",
	    className = "cl.bluex.seguridad.ws.RequestOpcionesFrecuentesMenu")
    @ResponseWrapper(localName = "responseOpcionesFrecuentesMenu",
	    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/",
	    className = "cl.bluex.seguridad.ws.ResponseOpcionesFrecuentesMenu")
    List<OpcionesMenuTo> obtieneOpcionesFrecuentes(
		@WebParam(
				name = "requestObtieneOpcionesFrecuentes",
				partName = "requestObtieneOpcionesFrecuentes",
				header = false) RequestObtieneOpcionesMenu request,
	    @WebParam(name = "Cabecera",
		    header = true,
		    partName = "Cabecera",
		    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") Cabecera cabecera)
	    throws BluexException;

    /**
     * Este método se encarga de cambiar la contraseña del usuario.
     * 
     * @param passAntiguo
     *            el password actual
     * @param passNuevo
     *            el password nuevo
     * @param cabecera
     *            objeto {@link Cabecera} que contiene el token
     * @return {@link Integer}
     * @throws SeguridadException
     */
    @WebMethod(operationName = "cambiarContrasena",
	    action = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/cambioContrasena")
    @WebResult(name = "Status",
	    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/",
	    partName = "Status")
    @RequestWrapper(localName = "requestStatus",
	    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/",
	    className = "cl.bluex.seguridad.ws.RequestStatus")
    @ResponseWrapper(localName = "responseStatus",
	    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/",
	    className = "cl.bluex.seguridad.ws.ResponseStatus")
    Integer cambiarContrasena(
	    @WebParam(name = "PassAntiguo",
		    header = false,
		    partName = "PassAntiguo",
		    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") String passAntiguo,
	    @WebParam(name = "PassNuevo",
		    header = false,
		    partName = "PassNuevo",
		    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") String passNuevo,
	    @WebParam(name = "Cabecera",
		    header = true,
		    partName = "Cabecera",
		    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") Cabecera cabecera)
	    throws BluexException;

    /**
     * Método que crea un favorito para el usuario.
     * 
     * @param codSistema
     *            el codigo del sistema
     * @param codApp
     *            el codigo de la aplicación
     * @param codModulo
     *            el codigo del modulo
     * @param codOpcion
     *            el codigo de la opción
     * @param cabecera
     *            objeto {@link Cabecera} que contiene el token
     * @throws SeguridadException
     */
    @WebMethod(operationName = "insertaFavorito",
	    action = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/insertaFavorito")
    @WebResult(name = "InsertaFavorito",
	    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/",
	    partName = "InsertaFavorito")
    @RequestWrapper(localName = "requestInsertaFavorito",
	    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/",
	    className = "cl.bluex.seguridad.ws.RequestInsertaFavorito")
    @ResponseWrapper(localName = "responseInsertaFavorito",
	    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/",
	    className = "cl.bluex.seguridad.ws.ResponseInsertaFavorito")
    void insertaFavorito(
	    @WebParam(name = "CodSistema",
		    header = false,
		    partName = "CodSistema",
		    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") long codSistema,
	    @WebParam(name = "CodApp",
		    header = false,
		    partName = "CodApp",
		    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") long codApp,
	    @WebParam(name = "CodModulo",
		    header = false,
		    partName = "CodModulo",
		    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") long codModulo,
	    @WebParam(name = "CodOpcion",
		    header = false,
		    partName = "CodOpcion",
		    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") long codOpcion,
	    @WebParam(name = "Cabecera",
		    header = true,
		    partName = "Cabecera",
		    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") Cabecera cabecera)
	    throws BluexException;

    /**
     * Método que aumenta el contador de frecuencia en que han sido usadas las
     * aplicaciones.
     * 
     * @param codSistema codigo del sistema
     * @param codApp codigo de la aplicación
     * @param codModulo codigo de modulo
     * @param codOpcion codigo de opción
     * @param cabecera objeto {@link Cabecera} que contiene el token
     * @throws SeguridadException
     */
    @WebMethod(operationName = "aumentaFrecuenciaOpc",
	    action = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/aumentaFrecuenciaOpc")
    @WebResult(name = "AumentaFrecuenciaOpc",
	    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/",
	    partName = "AumentaFrecuenciaOpc")
    @RequestWrapper(localName = "requestAumentaFrecuenciaOpc",
	    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/",
	    className = "cl.bluex.seguridad.ws.RequestAumentaFrecuenciaOpc")
    @ResponseWrapper(localName = "responseAumentaFrecuenciaOpc",
	    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/",
	    className = "cl.bluex.seguridad.ws.ResponseAumentaFrecuenciaOpc")
    void aumentaFrecuenciaOpc(
	    @WebParam(name = "CodSistema",
		    header = false,
		    partName = "CodSistema",
		    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") long codSistema,
	    @WebParam(name = "CodApp",
		    header = false,
		    partName = "CodApp",
		    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") long codApp,
	    @WebParam(name = "CodModulo",
		    header = false,
		    partName = "CodModulo",
		    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") long codModulo,
	    @WebParam(name = "CodOpcion",
		    header = false,
		    partName = "CodOpcion",
		    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") long codOpcion,
	    @WebParam(name = "Cabecera",
		    header = true,
		    partName = "Cabecera",
		    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") Cabecera cabecera)
	    throws BluexException;

    /**
     * Método que elimina un favorito del usuario.
     * 
     * @param codSistema codigo del sistema
     * @param codApp codigo de la aplicación
     * @param codModulo codigo de modulo
     * @param codOpcion codigo de opción
     * @param cabecera objeto {@link Cabecera} que contiene el token
     * @throws SeguridadException
     */
    @WebMethod(operationName = "eliminaFavorito",
	    action = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/eliminaFavorito")
    @WebResult(name = "EliminaFavorito",
	    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/",
	    partName = "EliminaFavorito")
    @RequestWrapper(localName = "requestEliminaFavorito",
	    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/",
	    className = "cl.bluex.seguridad.ws.RequestEliminaFavorito")
    @ResponseWrapper(localName = "responseEliminaFavorito",
	    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/",
	    className = "cl.bluex.seguridad.ws.ResponseEliminaFavorito")
    void eliminaFavorito(
	    @WebParam(name = "CodSistema",
		    header = false,
		    partName = "CodSistema",
		    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") long codSistema,
	    @WebParam(name = "CodApp",
		    header = false,
		    partName = "CodApp",
		    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") long codApp,
	    @WebParam(name = "CodModulo",
		    header = false,
		    partName = "CodModulo",
		    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") long codModulo,
	    @WebParam(name = "CodOpcion",
		    header = false,
		    partName = "CodOpcion",
		    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") long codOpcion,
	    @WebParam(name = "Cabecera",
		    header = true,
		    partName = "Cabecera",
		    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") Cabecera cabecera)
	    throws BluexException;

    /**
     * @param cabecera objeto {@link Cabecera} que contiene el token
     * @return {@link UsuarioTo} datos del usuario
     * @throws SeguridadException
     */
    @WebMethod(operationName = "obtieneDatosUsuario",
	    action = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/obtieneDatosUsuario")
    @WebResult(name = "ObtieneDatosUsuario",
	    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/",
	    partName = "EliminaFavorito")
    @RequestWrapper(localName = "requestObtieneDatosUsuario",
	    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/",
	    className = "cl.bluex.seguridad.ws.RequestObtieneDatosUsuario")
    @ResponseWrapper(localName = "responseObtieneDatosUsuario",
	    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/",
	    className = "cl.bluex.seguridad.ws.ResponseObtieneDatosUsuario")
    UsuarioTo obtieneDatosUsuario(
	    @WebParam(name = "Cabecera",
		    header = true,
		    partName = "Cabecera",
		    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") Cabecera cabecera)
	    throws BluexException;
    
    
    /**
     * Método que se encarga de cerrar la sesion de un usuario.
     * 
     * @param cabecera la cabecera que contiene el token y usuario
     * @throws BluexException
     */
    @WebMethod(operationName = "cerrarSesion",
	    action = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/cerrarSesion")
    @WebResult(name = "cerrarSesion",
	    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/",
	    partName = "cerrarSesion")
    void cerrarSesion(
	    @WebParam(name = "Cabecera",
		    header = true,
		    partName = "Cabecera",
		    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") Cabecera cabecera)
	    throws BluexException;
    
    @WebMethod(operationName = "obtieneRolUsuario",
	    action = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/obtieneRolUsuario")
    @WebResult(name = "responseObtieneRolUsuario",
	    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType/",
	    partName = "responseObtieneRolUsuario")
    ResponseObtieneRolUsuario obtieneRolUsuario(
		@WebParam(
			name = "requestObtieneRolUsuario",
			partName = "requestObtieneRolUsuario",
			targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType",
			header = false) RequestObtieneRolUsuario request,
	    @WebParam(name = "Cabecera",
		    header = true,
		    partName = "Cabecera",
		    targetNamespace = "http://SeguridadWS/BXSEG001_login/SeguridadPortType") Cabecera cabecera)
	    throws BluexException;
}
