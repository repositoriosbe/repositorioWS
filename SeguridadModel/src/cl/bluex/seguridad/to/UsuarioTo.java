package cl.bluex.seguridad.to;

import java.io.Serializable;

/**
 * @author Edgardo Herrera
 * 
 */
public class UsuarioTo implements Serializable {

    private static final long serialVersionUID = 1336078098423382405L;

    private Long codigoUsuario;
    private String username;
    private String nombreUsuario;
    private String password;
    private String codigoToken;
    private String roles;
    private String fechaIngresoUsuario;
    private String urlFoto;
    private String codError;
    private String descError;

    /**
     * Constructor.
     */
    public UsuarioTo() {
        super();
    }

    /**
     * @return the codigoUsuario
     */
    public Long getCodigoUsuario() {
        return codigoUsuario;
    }

    /**
     * @param codigoUsuario
     *            the codigoUsuario to set
     */
    public void setCodigoUsuario(final Long codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario
     *            the nombreUsuario to set
     */
    public void setNombreUsuario(final String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
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
     * @return the codigoToken
     */
    public String getCodigoToken() {
        return codigoToken;
    }

    /**
     * @param codigoToken
     *            the codigoToken to set
     */
    public void setCodigoToken(final String codigoToken) {
        this.codigoToken = codigoToken;
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
     * @return the fechaIngresoUsuario
     */
    public String getFechaIngresoUsuario() {
        return fechaIngresoUsuario;
    }

    /**
     * @param fechaIngresoUsuario
     *            the fechaIngresoUsuario to set
     */
    public void setFechaIngresoUsuario(final String fechaIngresoUsuario) {
        this.fechaIngresoUsuario = fechaIngresoUsuario;
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

}
