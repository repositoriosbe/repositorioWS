package cl.bluex.seguridad.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.seguridad.to.NewUsuarioTO;


/**
 * The Class NewUsuarioTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "newUsuario",
		propOrder = {
		"username",
		"password"
		})
public class NewUsuario {

	/** The username. */
	@XmlElement(required = true)
	private String username;
	
	/** The password. */
	@XmlElement(required = true)
	private String password;
	
	
	/**
	 * Instantiates a new new usuario to.
	 */
	public NewUsuario(){
		super();
	}
	
	/**
	 * Instantiates a new new usuario.
	 *
	 * @param to the to
	 */
	public NewUsuario(final NewUsuarioTO to) {
		if (to != null) {
			
			this.username = to.getUsername();
			this.password = to.getPassword();
			
		}
		
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

	
	
}
