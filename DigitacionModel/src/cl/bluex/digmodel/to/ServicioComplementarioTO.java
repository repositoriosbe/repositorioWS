package cl.bluex.digmodel.to;

import java.io.Serializable;

/**
 * @author Edgardo Herrera
 *
 */
public class ServicioComplementarioTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 4708563223862079288L;
    private long eevvNmrid;
    private String codigoServicio;
    private String swBasico;
    private long nroReserva;
    private String rendida;
    
    /**
     * Crea nueva instancia de {@link ServicioComplementarioTO}.
     */
    public ServicioComplementarioTO() {
	super();
    }

    /**
     * @return the eevvNmrid
     */
    public long getEevvNmrid() {
        return eevvNmrid;
    }

    /**
     * @param eevvNmrid the eevvNmrid to set
     */
    public void setEevvNmrid(final long eevvNmrid) {
        this.eevvNmrid = eevvNmrid;
    }

    /**
     * @return the codigoServicio
     */
    public String getCodigoServicio() {
        return codigoServicio;
    }

    /**
     * @param codigoServicio the codigoServicio to set
     */
    public void setCodigoServicio(final String codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    /**
     * @return the swBasico
     */
    public String getSwBasico() {
        return swBasico;
    }

    /**
     * @param swBasico the swBasico to set
     */
    public void setSwBasico(final String swBasico) {
        this.swBasico = swBasico;
    }

    /**
     * @return the nroReserva
     */
    public long getNroReserva() {
        return nroReserva;
    }

    /**
     * @param nroReserva the nroReserva to set
     */
    public void setNroReserva(final long nroReserva) {
        this.nroReserva = nroReserva;
    }

    /**
     * @return the rendida
     */
    public String getRendida() {
        return rendida;
    }

    /**
     * @param rendida the rendida to set
     */
    public void setRendida(final String rendida) {
        this.rendida = rendida;
    }

}
