package cl.bluex.generadoretiqueta.bean;

/**
 * @author Edgardo Herrera
 * 
 */
public class Destino {
	private String codigoComuna;
	private String nombreComuna;
	private String codigoZona;
	private String codigoSubZona;

	/**
	 * Crea instancia de {@link Destino}.
	 * 
	 */
	public Destino() {
		super();
	}

	/**
	 * @return the nombreComuna
	 */
	public String getNombreComuna() {
		return nombreComuna;
	}

	/**
	 * @param nombreComuna the nombreComuna to set
	 */
	public void setNombreComuna(final String nombreComuna) {
		this.nombreComuna = nombreComuna;
	}

	/**
	 * @return the codigoZona
	 */
	public String getCodigoZona() {
		return codigoZona;
	}

	/**
	 * @param codigoZona the codigoZona to set
	 */
	public void setCodigoZona(final String codigoZona) {
		this.codigoZona = codigoZona;
	}

	/**
	 * @return the codigoSubZona
	 */
	public String getCodigoSubZona() {
		return codigoSubZona;
	}

	/**
	 * @param codigoSubZona the codigoSubZona to set
	 */
	public void setCodigoSubZona(final String codigoSubZona) {
		this.codigoSubZona = codigoSubZona;
	}

	/**
	 * @return the codigoComuna
	 */
	public String getCodigoComuna() {
		return codigoComuna;
	}

	/**
	 * @param codigoComuna the codigoComuna to set
	 */
	public void setCodigoComuna(final String codigoComuna) {
		this.codigoComuna = codigoComuna;
	}

}
