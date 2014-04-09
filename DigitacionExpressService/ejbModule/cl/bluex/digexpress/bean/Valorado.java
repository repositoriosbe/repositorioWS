package cl.bluex.digexpress.bean;

import cl.bluex.digmodel.to.ValoradoTO;

/**
 * Almacena datos de valorado.
 * 
 * @author Edgardo Herrera
 *
 */
public class Valorado {
    private String tipoEstado;
    private String swtValorado;
    
    public Valorado() {
	super();
    }

    public Valorado(final ValoradoTO valoradoTO) {
	if (valoradoTO != null) {
	    this.tipoEstado = valoradoTO.getTipoEstado();
	    this.swtValorado = valoradoTO.getSwtValorado();
	}
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
