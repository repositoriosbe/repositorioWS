package cl.bluex.seguridad.to;

import java.io.Serializable;

/**
 * @author Edgardo Herrera
 * 
 */
public class Autenticacion implements Serializable {

    private static final long serialVersionUID = -6800468893242139572L;
    private String username;
    private String password;
    private String numIP;
    private String origen;
    private String codError;
    private String descError;

    /**
     * crea instancia de {@link Autenticacion}.
     */
    public Autenticacion() {
        super();
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     *            the username to set
     */
    public void setUsername(final String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     *            the password to set
     */
    public void setPassword(final String password) {
        this.password = password;
    }

    /**
     * @return the numIP
     */
    public String getNumIP() {
        return numIP;
    }

    /**
     * @param numIP
     *            the numIP to set
     */
    public void setNumIP(final String numIP) {
        this.numIP = numIP;
    }

    /**
     * @return the origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * @param origen
     *            the origen to set
     */
    public void setOrigen(final String origen) {
        this.origen = origen;
    }

    /**
     * @return the codError
     */
    public String getCodError() {
        return codError;
    }

    /**
     * @param codError
     *            the codError to set
     */
    public void setCodError(final String codError) {
        this.codError = codError;
    }

    /**
     * @return the descError
     */
    public String getDescError() {
        return descError;
    }

    /**
     * @param descError
     *            the descError to set
     */
    public void setDescError(final String descError) {
        this.descError = descError;
    }

}
