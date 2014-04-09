package cl.bluex.listas.bean;

import cl.bluex.digmodel.to.PersonalizacionUsuarioTO;

/**
 * Almacena datos de personalizacion de usuario.
 * 
 * @author Edgardo Herrera
 *
 */
public class PersonalizacionUsuario {
	private String nombreCampo;
	private long campoNumber;
	private String campoString;

	/**
	 * crea instancia de PersonalizacionUsuario
	 *
	 */
	public PersonalizacionUsuario() {
		super();
	}

	/**
	 * crea instancia de PersonalizacionUsuario
	 *
	 * @param personalizacionTO
	 */
	public PersonalizacionUsuario(
			final PersonalizacionUsuarioTO personalizacionTO) {
		if (personalizacionTO != null) {
			this.nombreCampo = personalizacionTO.getNombreCampo();
			this.campoNumber = personalizacionTO.getCampoNumber();
			this.campoString = personalizacionTO.getCampoString();
		}
	}

	/**
	 * @return the nombreCampo
	 */
	public String getNombreCampo() {
		return nombreCampo;
	}

	/**
	 * @param nombreCampo the nombreCampo to set
	 */
	public void setNombreCampo(final String nombreCampo) {
		this.nombreCampo = nombreCampo;
	}

	/**
	 * @return the campoNumber
	 */
	public long getCampoNumber() {
		return campoNumber;
	}

	/**
	 * @param campoNumber the campoNumber to set
	 */
	public void setCampoNumber(final long campoNumber) {
		this.campoNumber = campoNumber;
	}

	/**
	 * @return the campoString
	 */
	public String getCampoString() {
		return campoString;
	}

	/**
	 * @param campoString the campoString to set
	 */
	public void setCampoString(final String campoString) {
		this.campoString = campoString;
	}

}
