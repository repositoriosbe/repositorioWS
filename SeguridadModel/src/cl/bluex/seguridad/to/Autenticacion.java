package cl.bluex.seguridad.to;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class Autenticacion.
 *
 * @author Edgardo Herrera
 */
public class Autenticacion implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -6800468893242139572L;
    
    /** The username. */
    private String username;
    
    /** The password. */
    private String password;
    
    /** The num ip. */
    private String numIP;
    
    /** The origen. */
    private String origen;
    
    /** The cod error. */
    private String codError;
    
    /** The desc error. */
    private String descError;
    
    /** The token. */
    private String token;

    /**
     * crea instancia de {@link Autenticacion}.
     */
    public Autenticacion() {
        super();
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
     * @param username            the username to set
     */
    public void setUsername(final String username) {
        this.username = username;
    }

    /**
     * Gets the password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     *
     * @param password            the password to set
     */
    public void setPassword(final String password) {
        this.password = password;
    }

    /**
     * Gets the num ip.
     *
     * @return the numIP
     */
    public String getNumIP() {
        return numIP;
    }

    /**
     * Sets the num ip.
     *
     * @param numIP            the numIP to set
     */
    public void setNumIP(final String numIP) {
        this.numIP = numIP;
    }

    /**
     * Gets the origen.
     *
     * @return the origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Sets the origen.
     *
     * @param origen            the origen to set
     */
    public void setOrigen(final String origen) {
        this.origen = origen;
    }

    /**
     * Gets the cod error.
     *
     * @return the codError
     */
    public String getCodError() {
        return codError;
    }

    /**
     * Sets the cod error.
     *
     * @param codError            the codError to set
     */
    public void setCodError(final String codError) {
        this.codError = codError;
    }

    /**
     * Gets the desc error.
     *
     * @return the descError
     */
    public String getDescError() {
        return descError;
    }

    /**
     * Sets the desc error.
     *
     * @param descError            the descError to set
     */
    public void setDescError(final String descError) {
        this.descError = descError;
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

}
