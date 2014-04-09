package cl.bluex.seguridad.bean.response;

import java.util.List;

import cl.bluex.seguridad.bean.Rol;

/**
 * @author eherrera
 *
 */
public class ResponseObtieneRolUsuario {
	private List<Rol> roles;
	
	/**
	 * crea instancia de ResponseObtieneRolUsuario
	 *
	 */
	public ResponseObtieneRolUsuario() {
		super();
	}

	/**
	 * crea instancia de ResponseObtieneRolUsuario
	 *
	 * @param rol
	 */
	public ResponseObtieneRolUsuario(final List<Rol> roles) {
		super();
		this.roles = roles;
	}

	/**
	 * @return the roles
	 */
	public List<Rol> getRoles() {
		return roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(final List<Rol> roles) {
		this.roles = roles;
	}

}
