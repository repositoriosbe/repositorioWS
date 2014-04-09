package cl.bluex.generadoretiqueta.bean;

import cl.bluex.generadoretiqueta.to.DatosOperacionalesTO;
import cl.bluex.generadoretiqueta.to.OrdenServicioTO;

// TODO: Auto-generated Javadoc
/**
 * The Class DatosOperacionales.
 */
public class DatosOperacionales {

	/** The courier. */
	private String courier;
	
	/** The oficina. */
	private String oficina;
	
	/** The bodega. */
	private String bodega;
	
	/** The tipo bodega. */
	private String tipoBodega;
	
	/** The codigo currier. */
	private String codigoCurrier;
	
	
	/**
	 * crea instancia de DatosOperacionales.
	 */
	public DatosOperacionales() {
		super();
	}
	
	/**
	 * crea instancia de OrdenServicio.
	 *
	 * @param to the to
	 */
	public DatosOperacionales(final DatosOperacionalesTO to) {
		if (to != null) {
			this.bodega = to.getBodega();
			this.courier = to.getCourier();
			this.oficina = to.getOficina();
			this.tipoBodega = to.getTipoBodega();
			this.codigoCurrier = to.getCodigoCurrier();
		}
	}
	
	/**
	 * Gets the courier.
	 *
	 * @return the courier
	 */
	public String getCourier() {
		return courier;
	}

	/**
	 * Sets the courier.
	 *
	 * @param courier the courier to set
	 */
	public void setCourier(final String courier) {
		this.courier = courier;
	}

	/**
	 * Gets the oficina.
	 *
	 * @return the courier
	 */
	public String getOficina() {
		return oficina;
	}

	/**
	 * Sets the oficina.
	 *
	 * @param oficina the oficina to set
	 */
	public void setOficina(final String oficina) {
		this.oficina = oficina;
	}

	/**
	 * Gets the bodega.
	 *
	 * @return the bodega
	 */
	public String getBodega() {
		return bodega;
	}

	/**
	 * Sets the bodega.
	 *
	 * @param bodega the bodega to set
	 */
	public void setBodega(final String bodega) {
		this.bodega = bodega;
	}

	/**
	 * Gets the tipo bodega.
	 *
	 * @return the tipoBodega
	 */
	public String getTipoBodega() {
		return tipoBodega;
	}

	/**
	 * Sets the tipo bodega.
	 *
	 * @param tipoBodega the tipoBodega to set
	 */
	public void setTipoBodega(final String tipoBodega) {
		this.tipoBodega = tipoBodega;
	}


	/**
	 * Gets the codigo currier.
	 *
	 * @return the codigo currier
	 */
	public String getCodigoCurrier() {
		return codigoCurrier;
	}


	/**
	 * Sets the codigo currier.
	 *
	 * @param codigoCurrier the new codigo currier
	 */
	public void setCodigoCurrier(final String codigoCurrier) {
		this.codigoCurrier = codigoCurrier;
	}
}
