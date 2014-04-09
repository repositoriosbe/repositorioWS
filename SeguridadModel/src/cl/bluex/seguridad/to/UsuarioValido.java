package cl.bluex.seguridad.to;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Edgardo Herrera
 * 
 */
public class UsuarioValido implements Serializable {

    private static final long serialVersionUID = 450484111584919800L;

    private Long codigoUsuario;
    private String nombreUsuario;
    private Date fechaInicioVigente;
    private Date fechaFinVigente;
    private String codTipoUsuario;
    private Integer numIntentosFallidosIngreso;
    private String totalIntentosFallidos;
    private Integer cantidadSesiones;
    private String urlFoto;
    private String roles;

    /**
     * Crea instancia de {@link UsuarioValido}.
     * 
     */
    public UsuarioValido() {
        super();
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(final String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Date getFechaInicioVigente() {
        return fechaInicioVigente;
    }

    public void setFechaInicioVigente(final Date fechaInicioVigente) {
        this.fechaInicioVigente = fechaInicioVigente;
    }

    public Date getFechaFinVigente() {
        return fechaFinVigente;
    }

    public void setFechaFinVigente(final Date fechaFinVigente) {
        this.fechaFinVigente = fechaFinVigente;
    }

    public String getCodTipoUsuario() {
        return codTipoUsuario;
    }

    public void setCodTipoUsuario(final String codTipoUsuario) {
        this.codTipoUsuario = codTipoUsuario;
    }

    public Integer getNumIntentosFallidosIngreso() {
        return numIntentosFallidosIngreso;
    }

    public void setNumIntentosFallidosIngreso(
            final Integer numIntentosFallidosIngreso) {
        this.numIntentosFallidosIngreso = numIntentosFallidosIngreso;
    }

    public String getTotalIntentosFallidos() {
        return totalIntentosFallidos;
    }

    public void setTotalIntentosFallidos(final String totalIntentosFallidos) {
        this.totalIntentosFallidos = totalIntentosFallidos;
    }

    public Long getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(final Long codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Integer getCantidadSesiones() {
        return cantidadSesiones;
    }

    public void setCantidadSesiones(final Integer cantidadSesiones) {
        this.cantidadSesiones = cantidadSesiones;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(final String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(final String roles) {
        this.roles = roles;
    }

}
