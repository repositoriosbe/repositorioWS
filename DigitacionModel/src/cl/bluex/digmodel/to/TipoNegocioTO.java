package cl.bluex.digmodel.to;

import java.io.Serializable;

/**
 * @author Edgardo Herrera
 *
 */
public class TipoNegocioTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -1577382301346199068L;
    private long codigo;
    private String nombreTipoNegocio;
    
    /**
     * Crea instancia de {@link TipoNegocioTO}.
     */
    public TipoNegocioTO() {
	super();
    }

    /**
     * @return the codigo
     */
    public long getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(final long codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombreTipoNegocio
     */
    public String getNombreTipoNegocio() {
        return nombreTipoNegocio;
    }

    /**
     * @param nombreTipoNegocio the nombreTipoNegocio to set
     */
    public void setNombreTipoNegocio(final String nombreTipoNegocio) {
        this.nombreTipoNegocio = nombreTipoNegocio;
    }

}
