package cl.bluex.digmodel.to;

import java.io.Serializable;

/**
 * Almacena datos de Valorado.
 * 
 * @author Edgardo Herrera
 *
 */
public class ValoradoTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 2096426002622767520L;
    private String tipoEstado;
    private String swtValorado;
    
    /**
     * Crea instancia {@link ValoradoTO}.
     */
    public ValoradoTO() {
	super();
    }

    /**
     * @return the tipoEstado
     */
    public String getTipoEstado() {
        return tipoEstado;
    }

    /**
     * @param tipoEstado the tipoEstado to set
     */
    public void setTipoEstado(final String tipoEstado) {
        this.tipoEstado = tipoEstado;
    }

    /**
     * @return the swtValorado
     */
    public String getSwtValorado() {
        return swtValorado;
    }

    /**
     * @param swtValorado the swtValorado to set
     */
    public void setSwtValorado(final String swtValorado) {
        this.swtValorado = swtValorado;
    }

}
