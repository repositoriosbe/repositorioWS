package cl.bluex.seguridad.to;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class DatosUsuarioTO.
 * @author Ricardo Moscoso.
 */
public class NewDatosUsuarioTO implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5332757598940726309L;
	
	/** The codigo usuario. */
	private String codigoUsuario;
	
    /** The username. */
    private String username;
    
    /** The fecha inicio vigente. */
    private Date fechaInicioVigente;
   
    /** The fecha fin vigente. */
    private Date fechaFinVigente;
    
    /** The cod tipo usuario. */
    private String codTipoUsuario;
    
    /** The cantidad sesiones. */
    private Integer cantidadSesiones;
    
    /** The url foto. */
    private String urlFoto;
    
    /** The token. */
    private String token;
    
    /** The empresa pais. */
    private List<NewEmpresaPaisTO> listaEmpresaPais;
    
    
    /**
     * Instantiates a new new datos usuario to.
     */
    public NewDatosUsuarioTO(){
    	super();
    }


	/**
	 * Gets the codigo usuario.
	 *
	 * @return the codigo usuario
	 */
	public String getCodigoUsuario() {
		return codigoUsuario;
	}


	/**
	 * Sets the codigo usuario.
	 *
	 * @param codigoUsuario the new codigo usuario
	 */
	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}


	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}


	/**
	 * Sets the username.
	 *
	 * @param username the new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}


	/**
	 * Gets the fecha inicio vigente.
	 *
	 * @return the fecha inicio vigente
	 */
	public Date getFechaInicioVigente() {
		return fechaInicioVigente;
	}


	/**
	 * Sets the fecha inicio vigente.
	 *
	 * @param fechaInicioVigente the new fecha inicio vigente
	 */
	public void setFechaInicioVigente(Date fechaInicioVigente) {
		this.fechaInicioVigente = fechaInicioVigente;
	}


	/**
	 * Gets the fecha fin vigente.
	 *
	 * @return the fecha fin vigente
	 */
	public Date getFechaFinVigente() {
		return fechaFinVigente;
	}


	/**
	 * Sets the fecha fin vigente.
	 *
	 * @param fechaFinVigente the new fecha fin vigente
	 */
	public void setFechaFinVigente(Date fechaFinVigente) {
		this.fechaFinVigente = fechaFinVigente;
	}


	/**
	 * Gets the cod tipo usuario.
	 *
	 * @return the cod tipo usuario
	 */
	public String getCodTipoUsuario() {
		return codTipoUsuario;
	}


	/**
	 * Sets the cod tipo usuario.
	 *
	 * @param codTipoUsuario the new cod tipo usuario
	 */
	public void setCodTipoUsuario(String codTipoUsuario) {
		this.codTipoUsuario = codTipoUsuario;
	}


	/**
	 * Gets the cantidad sesiones.
	 *
	 * @return the cantidad sesiones
	 */
	public Integer getCantidadSesiones() {
		return cantidadSesiones;
	}


	/**
	 * Sets the cantidad sesiones.
	 *
	 * @param cantidadSesiones the new cantidad sesiones
	 */
	public void setCantidadSesiones(Integer cantidadSesiones) {
		this.cantidadSesiones = cantidadSesiones;
	}


	/**
	 * Gets the url foto.
	 *
	 * @return the url foto
	 */
	public String getUrlFoto() {
		return urlFoto;
	}


	/**
	 * Sets the url foto.
	 *
	 * @param urlFoto the new url foto
	 */
	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}


	/**
	 * Gets the token.
	 *
	 * @return the token
	 */
	public String getToken() {
		return token;
	}


	/**
	 * Sets the token.
	 *
	 * @param token the new token
	 */
	public void setToken(String token) {
		this.token = token;
	}


	/**
	 * Gets the lista empresa pais.
	 *
	 * @return the lista empresa pais
	 */
	public List<NewEmpresaPaisTO> getListaEmpresaPais() {
		return listaEmpresaPais;
	}


	/**
	 * Sets the lista empresa pais.
	 *
	 * @param listaEmpresaPais the new lista empresa pais
	 */
	public void setListaEmpresaPais(List<NewEmpresaPaisTO> listaEmpresaPais) {
		this.listaEmpresaPais = listaEmpresaPais;
	}
	

}
