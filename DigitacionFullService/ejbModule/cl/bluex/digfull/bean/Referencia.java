package cl.bluex.digfull.bean;

import java.io.Serializable;

import cl.bluex.digmodel.to.ReferenciaTO;

/**
 * Bean de referencia.
 * 
 * @author Edgardo Herrera
 * 
 */
public class Referencia implements Serializable {

	/**
     * 
     */
	private static final long serialVersionUID = -5191726438862240754L;

	private long eevvNmrid;
	private String codigoTipoReferencia;

	/**
	 * Constructor.
	 */
	public Referencia() {
		super();
	}

	/**
	 * Constructor.
	 * 
	 * @param {@link ReferenciaTO to}
	 */
	public Referencia(final ReferenciaTO to) {
		if (to != null) {
			this.eevvNmrid = to.getEevvNmrid();
			this.codigoTipoReferencia = to.getCodigoTipoReferencia();
		}
	}

	/**
	 * @return the codigoTipoReferencia
	 */
	public String getCodigoTipoReferencia() {
		return codigoTipoReferencia;
	}

	/**
	 * @param codigoTipoReferencia
	 *            the codigoTipoReferencia to set
	 */
	public void setCodigoTipoReferencia(final String codigoTipoReferencia) {
		this.codigoTipoReferencia = codigoTipoReferencia;
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

}
