package cl.bluex.seguridad.to;

import java.io.Serializable;

/**
 * @author Edgardo Herrera
 * 
 */
public class FavoritoTo implements Serializable {

    private static final long serialVersionUID = 533144719420208107L;

    private String token;
    private long codSistema;
    private long codApp;
    private long codModulo;
    private long codOpcion;
    private String codError;
    private String descError;

    /**
     * crea instancia de {@link FavoritoTo}.
     */
    public FavoritoTo() {
        super();
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
     * @return the codSistema
     */
    public long getCodSistema() {
        return codSistema;
    }

    /**
     * @param codSistema
     *            the codSistema to set
     */
    public void setCodSistema(final long codSistema) {
        this.codSistema = codSistema;
    }

    /**
     * @return the codApp
     */
    public long getCodApp() {
        return codApp;
    }

    /**
     * @param codApp
     *            the codApp to set
     */
    public void setCodApp(final long codApp) {
        this.codApp = codApp;
    }

    /**
     * @return the codModulo
     */
    public long getCodModulo() {
        return codModulo;
    }

    /**
     * @param codModulo
     *            the codModulo to set
     */
    public void setCodModulo(final long codModulo) {
        this.codModulo = codModulo;
    }

    /**
     * @return the codOpcion
     */
    public long getCodOpcion() {
        return codOpcion;
    }

    /**
     * @param codOpcion
     *            the codOpcion to set
     */
    public void setCodOpcion(final long codOpcion) {
        this.codOpcion = codOpcion;
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
