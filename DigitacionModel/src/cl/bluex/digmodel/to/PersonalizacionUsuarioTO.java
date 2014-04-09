package cl.bluex.digmodel.to;

import java.io.Serializable;

/**
 * Almacena datos de la personalizacion del usuario.
 * 
 * @author Edgardo Herrera
 *
 */
public class PersonalizacionUsuarioTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 637850785838243203L;
    private String nombreCampo;
    private long campoNumber;
    private String campoString;
    
    /**
     * Crea nueva instancia de {@link PersonalizacionUsuarioTO}.
     */
    public PersonalizacionUsuarioTO() {
	super();
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
