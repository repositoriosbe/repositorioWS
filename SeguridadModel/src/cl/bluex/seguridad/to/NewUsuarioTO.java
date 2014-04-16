package cl.bluex.seguridad.to;


// TODO: Auto-generated Javadoc
/**
 * The Class NewUsuarioTO.
 */
public class NewUsuarioTO {

	/** The username. */
	private String username;
	
	/** The password. */
	private String password;
	
	/** The token. */
	private String token;
    	  
	
	/**
	 * Instantiates a new new usuario to.
	 */
	public NewUsuarioTO(){
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
	 * @param username the new username
	 */
	public void setUsername(String username) {
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
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
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
