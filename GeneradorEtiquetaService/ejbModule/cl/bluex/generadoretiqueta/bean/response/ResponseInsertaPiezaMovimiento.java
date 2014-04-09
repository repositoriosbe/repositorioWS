/**
 * 
 */
package cl.bluex.generadoretiqueta.bean.response;

import cl.bluex.generadoretiqueta.bean.DatosRespuesta;

/**
 * @author rmoscoso.
 *
 */
public class ResponseInsertaPiezaMovimiento {

	private DatosRespuesta datosRespuesta;
	
	/**
	 * Constructor de la clase. 
	 */
	public ResponseInsertaPiezaMovimiento() {
		super();
	}

	/**
	 * @param datosRespuesta
	 */
	public ResponseInsertaPiezaMovimiento(DatosRespuesta datosRespuesta) {
		this.datosRespuesta = datosRespuesta;
	}

	/**
	 * @return the datosRespuesta
	 */
	public DatosRespuesta getDatosRespuesta() {
		return datosRespuesta;
	}

	/**
	 * @param datosRespuesta the datosRespuesta to set
	 */
	public void setDatosRespuesta(DatosRespuesta datosRespuesta) {
		this.datosRespuesta = datosRespuesta;
	}

}
