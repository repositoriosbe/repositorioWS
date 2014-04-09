package cl.bluex.digexpress.bean.request;

import cl.bluex.digexpress.bean.HojaRuta;


/**
 * The Class RequestObtieneDatosCourier.
 */
public class RequestObtieneDatosCourier {
	
	
	/** The hoja ruta. */
	private HojaRuta hojaRuta;
	
	
	
	/**
	 * Instantiates a new request obtiene datos courier.
	 */
	public RequestObtieneDatosCourier() {
		super();
	}

	/**
	 * Instantiates a new request obtiene datos courier.
	 *
	 * @param hojaRuta the hoja ruta
	 */
	public RequestObtieneDatosCourier(HojaRuta hojaRuta) {
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
