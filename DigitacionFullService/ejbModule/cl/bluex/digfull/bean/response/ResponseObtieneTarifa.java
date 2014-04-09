package cl.bluex.digfull.bean.response;

import cl.bluex.digfull.bean.Tarifa;

/**
 * @author Edgardo Herrera
 * 
 */
public class ResponseObtieneTarifa {

	private Tarifa tarifa;

	/**
	 * Constructor.
	 */
	public ResponseObtieneTarifa() {
		super();
	}

	/**
	 * Constructor.
	 * 
	 * @param {@link RespuestaTarifa tarifa}
	 */
	public ResponseObtieneTarifa(final Tarifa tarifa) {
		this.tarifa = tarifa;
	}

	/**
	 * @return the tarifa
	 */
	public Tarifa getTarifa() {
		return tarifa;
	}

	/**
	 * @param tarifa
	 *            the tarifa to set
	 */
	public void setTarifa(final Tarifa tarifa) {
		this.tarifa = tarifa;
	}

}
