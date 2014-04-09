package cl.bluex.generadoretiqueta.to;

// TODO: Auto-generated Javadoc
/**
 * The Class DatosOperacionalesTO.
 *
 * @author rmoscoso
 */
public class DatosOperacionalesTO {

	
	
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
	 * crea instancia de DatosOperacionalesTO.
	 */
	public DatosOperacionalesTO() {
		super();
	
	}
	
	/**
	 * Instantiates a new datos operacionales to.
	 *
	 * @param courier the courier
	 * @param oficina the oficina
	 * @param bodega the bodega
	 * @param tipoBodega the tipo bodega
	 */
	public DatosOperacionalesTO(String courier, String oficina, String bodega, String tipoBodega, String codigoCurrier) {
		super();
		this.courier = courier;
		this.oficina = oficina;
		this.bodega = bodega;
		this.tipoBodega = tipoBodega;
		this.codigoCurrier = codigoCurrier;
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
