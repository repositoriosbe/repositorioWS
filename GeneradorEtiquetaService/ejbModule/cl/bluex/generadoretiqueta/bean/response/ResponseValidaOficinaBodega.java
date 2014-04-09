/**
 * 
 */
package cl.bluex.generadoretiqueta.bean.response;

import cl.bluex.generadoretiqueta.bean.DatosRespuesta;

/**
 * @author rmoscoso.
 *
 */
public class ResponseValidaOficinaBodega {

	private DatosRespuesta datosRespuesta;
	
	/**
	 * Constructor de la clase. 
	 */
	public ResponseValidaOficinaBodega() {
		super();
	}

	/**
	 * @param datosRespuesta
	 */
	public ResponseValidaOficinaBodega(DatosRespuesta datosRespuesta) {
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
