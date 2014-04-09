package cl.bluex.generadoretiqueta.bean;

import cl.bluex.generadoretiqueta.to.OrdenServicioTO;

/**
 * @author eherrera
 *
 */
public class OrdenServicio {
	private String numeroSerieOser;
	private long numeroIdOser;
	private long cantidadPiezas;
	private String codigoCompuesto;
	
	/**
	 * crea instancia de OrdenServicio
	 *
	 */
	public OrdenServicio() {
		super();
	}
	
	/**
	 * crea instancia de OrdenServicio
	 *
	 * @param to
	 */
	public OrdenServicio(final OrdenServicioTO to) {
		if (to != null) {
			this.numeroSerieOser = to.getNumeroSerieOser();
			this.numeroIdOser = to.getNumeroIdOser();
			this.cantidadPiezas = to.getCantidadPiezas();
			this.codigoCompuesto = to.getCodigoCompuesto();
		}
	}

	/**
	 * @return the numeroSerieOser
	 */
	public String getNumeroSerieOser() {
		return numeroSerieOser;
	}

	/**
	 * @param numeroSerieOser the numeroSerieOser to set
	 */
	public void setNumeroSerieOser(final String numeroSerieOser) {
		this.numeroSerieOser = numeroSerieOser;
	}

	/**
	 * @return the numeroIdOser
	 */
	public long getNumeroIdOser() {
		return numeroIdOser;
	}

	/**
	 * @param numeroIdOser the numeroIdOser to set
	 */
	public void setNumeroIdOser(final long numeroIdOser) {
		this.numeroIdOser = numeroIdOser;
	}

	/**
	 * @return the cantidadPiezas
	 */
	public long getCantidadPiezas() {
		return cantidadPiezas;
	}

	/**
	 * @param cantidadPiezas the cantidadPiezas to set
	 */
	public void setCantidadPiezas(final long cantidadPiezas) {
		this.cantidadPiezas = cantidadPiezas;
	}

	/**
	 * @return the codigoCompuesto
	 */
	public String getCodigoCompuesto() {
		return codigoCompuesto;
	}

	/**
	 * @param codigoCompuesto the codigoCompuesto to set
	 */
	public void setCodigoCompuesto(final String codigoCompuesto) {
		this.codigoCompuesto = codigoCompuesto;
	}
	
}
