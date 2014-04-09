package cl.bluex.generadoretiqueta.bean.response;

import java.util.List;

import cl.bluex.generadoretiqueta.bean.DatosOperacionales;

/**
 * @author eherrera
 *
 */
public class ResponseDatosOperacionales {
	
	DatosOperacionales datosOperacionales;
	
	/**
	 * crea instancia de ResponseDatosOperacionales
	 *
	 */
	public ResponseDatosOperacionales() {
		super();
	}
	

	public ResponseDatosOperacionales(final DatosOperacionales datosOperacionales) {
		super();
		this.datosOperacionales = datosOperacionales;
	}


	/**
	 * @return the datosOperacionales
	 */
	public DatosOperacionales getDatosOperacionales() {
		return datosOperacionales;
	}

	/**
	 * @param datosOperacionales the datosOperacionales to set
	 */
	public void setDatosOperacionales(final DatosOperacionales datosOperacionales) {
		this.datosOperacionales = datosOperacionales;
	}
	
}
