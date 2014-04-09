package cl.bluex.generadoretiqueta.to;

/**
 * @author eherrera
 *
 */
public class OrdenServicioTO {
	private String numeroSerieOser;
	private long numeroIdOser;
	private long cantidadPiezas;
	private String codigoCompuesto;
	
	/**
	 * crea instancia de OrdenServicioTO
	 *
	 */
	public OrdenServicioTO() {
		super();
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
