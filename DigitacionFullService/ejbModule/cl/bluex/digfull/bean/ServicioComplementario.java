package cl.bluex.digfull.bean;

import java.io.Serializable;

import cl.bluex.digmodel.to.ServicioComplementarioTO;

/**
 * Bean del servicio complementario.
 * 
 * @author Edgardo Herrera
 * 
 */
public class ServicioComplementario implements Serializable {
	/**
     * 
     */
	private static final long serialVersionUID = -4352364729483139211L;
	private long eevvNmrid;
	private String codigoServicio;
	private String swBasico;
	private long nroReserva;
	private String rendida;

	/**
	 * Constructor.
	 */
	public ServicioComplementario() {
		super();
	}

	public ServicioComplementario(final ServicioComplementarioTO servicioTO) {
		if (servicioTO != null) {
			this.eevvNmrid = servicioTO.getEevvNmrid();
			this.codigoServicio = servicioTO.getCodigoServicio();
			this.swBasico = servicioTO.getSwBasico();
			this.nroReserva = servicioTO.getNroReserva();
			this.rendida = servicioTO.getRendida();
		}
	}

	/**
	 * @return the eevvNmrid
	 */
	public long getEevvNmrid() {
		return eevvNmrid;
	}

	/**
	 * @param eevvNmrid
	 *            the eevvNmrid to set
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
	 * @param codigoServicio
	 *            the codigoServicio to set
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
	 * @param swBasico
	 *            the swBasico to set
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
	 * @param nroReserva
	 *            the nroReserva to set
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
	 * @param rendida
	 *            the rendida to set
	 */
	public void setRendida(final String rendida) {
		this.rendida = rendida;
	}

}
