package cl.bluex.digexpress.bean.response;

import cl.bluex.digexpress.bean.HojaRuta;

// TODO: Auto-generated Javadoc
/**
 * The Class ResponseObtieneDatosCourier.
 */
public class ResponseObtieneDatosCourier {

	/** The hoja ruta. */
	private HojaRuta hojaRuta;

	/**
	 * Instantiates a new response obtiene datos courier.
	 */
	public ResponseObtieneDatosCourier() {
		super();
	}
	
	/**
	 * Instantiates a new response obtiene datos courier.
	 *
	 * @param hojaRuta the hoja ruta
	 */
	public ResponseObtieneDatosCourier(HojaRuta hojaRuta) {
		this.hojaRuta = hojaRuta;
	}

	/**
	 * Gets the hoja ruta.
	 *
	 * @return the hoja ruta
	 */
	public HojaRuta gethojaRuta() {
		return hojaRuta;
	}

	/**
	 * Sets the hoja ruta.
	 *
	 * @param hojaRuta the new hoja ruta
	 */
	public void sethojaRuta(HojaRuta hojaRuta) {
		this.hojaRuta = hojaRuta;
	}
	
	
}
