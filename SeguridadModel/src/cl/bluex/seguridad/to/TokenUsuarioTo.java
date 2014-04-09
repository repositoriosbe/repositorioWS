package cl.bluex.seguridad.to;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Edgardo Herrera
 * 
 */
public class TokenUsuarioTo implements Serializable {

    private static final long serialVersionUID = -3978010659854371282L;

    private String username;
    private String numip;
    private String pwduser;
    private String nombres;
    private String token;
    private Date fechaIngresoSession;
    private Date fechaTerminoSession;
    private String roles;
    private String urlFoto;
    private String codError;
    private String descError;

    /**
     * instancia de {@link TokenUsuarioTO}.
     */
    public TokenUsuarioTo() {
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
     * @return the numip
     */
    public String getNumip() {
        return numip;
    }

    /**
     * @param numip
     *            the numip to set
     */
    public void setNumip(final String numip) {
        this.numip = numip;
    }

    /**
     * @return the pwduser
     */
    public String getPwduser() {
        return pwduser;
    }

    /**
     * @param pwduser
     *            the pwduser to set
     */
    public void setPwduser(final String pwduser) {
        this.pwduser = pwduser;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres
     *            the nombres to set
     */
    public void setNombres(final String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token
     *            the token to set
     */
    public void setToken(final String token) {
        this.token = token;
    }

    /**
     * @return the fechaIngresoSession
     */
    public Date getFechaIngresoSession() {
        return fechaIngresoSession;
    }

    /**
     * @param fechaIngresoSession
     *            the fechaIngresoSession to set
     */
    public void setFechaIngresoSession(final Date fechaIngresoSession) {
        this.fechaIngresoSession = fechaIngresoSession;
    }

    /**
     * @return the fechaTerminoSession
     */
    public Date getFechaTerminoSession() {
        return fechaTerminoSession;
    }

    /**
     * @param fechaTerminoSession
     *            the fechaTerminoSession to set
     */
    public void setFechaTerminoSession(final Date fechaTerminoSession) {
        this.fechaTerminoSession = fechaTerminoSession;
    }

    /**
     * @return the roles
     */
    public String getRoles() {
        return roles;
    }

    /**
     * @param roles
     *            the roles to set
     */
    public void setRoles(final String roles) {
        this.roles = roles;
    }

    /**
     * @return the urlFoto
     */
    public String getUrlFoto() {
        return urlFoto;
    }

    /**
     * @param urlFoto
     *            the urlFoto to set
     */
    public void setUrlFoto(final String urlFoto) {
        this.urlFoto = urlFoto;
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
