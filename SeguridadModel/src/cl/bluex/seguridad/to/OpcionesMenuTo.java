package cl.bluex.seguridad.to;

import java.io.Serializable;

/**
 * @author Edgardo Herrera
 * 
 */
public class OpcionesMenuTo implements Serializable {

    private static final long serialVersionUID = -1528120384918484194L;
    private Integer sisCodigo;
    private String sistema;
    private Integer appsCodigo;
    private String app;
    private String appsIcono;
    private Integer modlCodigo;
    private String modulo;
    private String modlIcono;
    private Integer opcnCodigo;
    private String opcion;
    private String opcnTipo;
    private String opcnTipoEjecucion;
    private String opcnUrl;
    private String opcnIcono;
    private Integer mOrden;
    private Integer oOrden;
    private Integer opcFrec;
    private String opcSwtFav;

    /**
     * Crea instancia de {@link OpcionesMenuTo}.
     * 
     */
    public OpcionesMenuTo() {
        super();
    }

    /**
     * @return the sisCodigo
     */
    public Integer getSisCodigo() {
        return sisCodigo;
    }

    /**
     * @param sisCodigo
     *            the sisCodigo to set
     */
    public void setSisCodigo(final Integer sisCodigo) {
        this.sisCodigo = sisCodigo;
    }

    /**
     * @return the sistema
     */
    public String getSistema() {
        return sistema;
    }

    /**
     * @param sistema
     *            the sistema to set
     */
    public void setSistema(final String sistema) {
        this.sistema = sistema;
    }

    /**
     * @return the appsCodigo
     */
    public Integer getAppsCodigo() {
        return appsCodigo;
    }

    /**
     * @param appsCodigo
     *            the appsCodigo to set
     */
    public void setAppsCodigo(final Integer appsCodigo) {
        this.appsCodigo = appsCodigo;
    }

    /**
     * @return the app
     */
    public String getApp() {
        return app;
    }

    /**
     * @param app
     *            the app to set
     */
    public void setApp(final String app) {
        this.app = app;
    }

    /**
     * @return the appsIcono
     */
    public String getAppsIcono() {
        return appsIcono;
    }

    /**
     * @param appsIcono
     *            the appsIcono to set
     */
    public void setAppsIcono(final String appsIcono) {
        this.appsIcono = appsIcono;
    }

    /**
     * @return the modlCodigo
     */
    public Integer getModlCodigo() {
        return modlCodigo;
    }

    /**
     * @param modlCodigo
     *            the modlCodigo to set
     */
    public void setModlCodigo(final Integer modlCodigo) {
        this.modlCodigo = modlCodigo;
    }

    /**
     * @return the modulo
     */
    public String getModulo() {
        return modulo;
    }

    /**
     * @param modulo
     *            the modulo to set
     */
    public void setModulo(final String modulo) {
        this.modulo = modulo;
    }

    /**
     * @return the modlIcono
     */
    public String getModlIcono() {
        return modlIcono;
    }

    /**
     * @param modlIcono
     *            the modlIcono to set
     */
    public void setModlIcono(final String modlIcono) {
        this.modlIcono = modlIcono;
    }

    /**
     * @return the opcnCodigo
     */
    public Integer getOpcnCodigo() {
        return opcnCodigo;
    }

    /**
     * @param opcnCodigo
     *            the opcnCodigo to set
     */
    public void setOpcnCodigo(final Integer opcnCodigo) {
        this.opcnCodigo = opcnCodigo;
    }

    /**
     * @return the opcion
     */
    public String getOpcion() {
        return opcion;
    }

    /**
     * @param opcion
     *            the opcion to set
     */
    public void setOpcion(final String opcion) {
        this.opcion = opcion;
    }

    /**
     * @return the opcnTipo
     */
    public String getOpcnTipo() {
        return opcnTipo;
    }

    /**
     * @param opcnTipo
     *            the opcnTipo to set
     */
    public void setOpcnTipo(final String opcnTipo) {
        this.opcnTipo = opcnTipo;
    }

    /**
     * @return the opcnTipoEjecucion
     */
    public String getOpcnTipoEjecucion() {
        return opcnTipoEjecucion;
    }

    /**
     * @param opcnTipoEjecucion
     *            the opcnTipoEjecucion to set
     */
    public void setOpcnTipoEjecucion(final String opcnTipoEjecucion) {
        this.opcnTipoEjecucion = opcnTipoEjecucion;
    }

    /**
     * @return the opcnUrl
     */
    public String getOpcnUrl() {
        return opcnUrl;
    }

    /**
     * @param opcnUrl
     *            the opcnUrl to set
     */
    public void setOpcnUrl(final String opcnUrl) {
        this.opcnUrl = opcnUrl;
    }

    /**
     * @return the opcnIcono
     */
    public String getOpcnIcono() {
        return opcnIcono;
    }

    /**
     * @param opcnIcono
     *            the opcnIcono to set
     */
    public void setOpcnIcono(final String opcnIcono) {
        this.opcnIcono = opcnIcono;
    }

    /**
     * @return the mOrden
     */
    public Integer getmOrden() {
        return mOrden;
    }

    /**
     * @param mOrden
     *            the mOrden to set
     */
    public void setmOrden(final Integer mOrden) {
        this.mOrden = mOrden;
    }

    /**
     * @return the oOrden
     */
    public Integer getoOrden() {
        return oOrden;
    }

    /**
     * @param oOrden
     *            the oOrden to set
     */
    public void setoOrden(final Integer oOrden) {
        this.oOrden = oOrden;
    }

    /**
     * @return the opcFrec
     */
    public Integer getOpcFrec() {
        return opcFrec;
    }

    /**
     * @param opcFrec
     *            the opcFrec to set
     */
    public void setOpcFrec(final Integer opcFrec) {
        this.opcFrec = opcFrec;
    }

    /**
     * @return the opcSwtFav
     */
    public String getOpcSwtFav() {
        return opcSwtFav;
    }

    /**
     * @param opcSwtFav
     *            the opcSwtFav to set
     */
    public void setOpcSwtFav(final String opcSwtFav) {
        this.opcSwtFav = opcSwtFav;
    }

}
