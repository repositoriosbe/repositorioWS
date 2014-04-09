package cl.bluex.digmodel.to;

import java.io.Serializable;

/**
 * @author Edgardo Herrera
 *
 */
public class TipoInfluenciaTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -1924836124006402147L;
    private long codigo;
    private String nombreTipoInfluencia;
    
    /**
     * Crea instancia de {@link TipoInfluenciaTO}.
     */
    public TipoInfluenciaTO() {
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
     * @return the nombreTipoInfluencia
     */
    public String getNombreTipoInfluencia() {
        return nombreTipoInfluencia;
    }

    /**
     * @param nombreTipoInfluencia the nombreTipoInfluencia to set
     */
    public void setNombreTipoInfluencia(final String nombreTipoInfluencia) {
        this.nombreTipoInfluencia = nombreTipoInfluencia;
    }

}
