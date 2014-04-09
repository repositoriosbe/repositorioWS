package cl.bluex.digexpress.bean;

/**
 * bean de la agrupacion.
 * 
 * @author Edgardo Herrera
 * 
 */
public class Agrupacion {
	private long idCabeceraAgrupacion;
	private String codigoAgrupacion;
	private String codigoEstado;

	public Agrupacion() {
		super();
	}

	/**
	 * Constructor.
	 * 
	 * @param codigoAgrupacion
	 *            codigo de la agrupacion.
	 */
	public Agrupacion(final String codigoAgrupacion) {
		this.codigoAgrupacion = codigoAgrupacion;
	}

	/**
	 * Constructor.
	 * 
	 * @param idCabeceraAgrupacion
	 *            id cabecera de la agrupacion
	 */
	public Agrupacion(final long idCabeceraAgrupacion) {
		this.idCabeceraAgrupacion = idCabeceraAgrupacion;
	}

	/**
	 * Constructor.
	 * 
	 * @param codigoAgrupacion
	 *            codigo de la agrupacion.
	 * @param codigoEstado
	 *            codigo del estado de la agrupacion.
	 */
	public Agrupacion(final String codigoAgrupacion, final String codigoEstado) {
		this(codigoAgrupacion);
		this.codigoEstado = codigoEstado;
	}

	/**
	 * @return the codigoEstado
	 */
	public String getCodigoEstado() {
		return codigoEstado;
	}

	/**
	 * @param codigoEstado
	 *            the codigoEstado to set
	 */
	public void setCodigoEstado(final String codigoEstado) {
		this.codigoEstado = codigoEstado;
	}

	/**
	 * @return the codigoAgrupacion
	 */
	public String getCodigoAgrupacion() {
		return codigoAgrupacion;
	}

	/**
	 * @param codigoAgrupacion
	 *            the codigoAgrupacion to set
	 */
	public void setCodigoAgrupacion(final String codigoAgrupacion) {
		this.codigoAgrupacion = codigoAgrupacion;
	}

	/**
	 * @return the idCabeceraAgrupacion
	 */
	public long getIdCabeceraAgrupacion() {
		return idCabeceraAgrupacion;
	}

	/**
	 * @param idCabeceraAgrupacion
	 *            the idCabeceraAgrupacion to set
	 */
	public void setIdCabeceraAgrupacion(final long idCabeceraAgrupacion) {
		this.idCabeceraAgrupacion = idCabeceraAgrupacion;
	}

}
