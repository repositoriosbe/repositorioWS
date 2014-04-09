package cl.bluex.digexpress.bean.response;

import java.util.List;

import cl.bluex.digexpress.bean.DetalleDigitacionExpress;

/**
 * Almacena datos de respuesta de detalles de la digitacion express.
 * 
 * @author Edgardo Herrera
 * 
 */
public class ResponseDetallesDigExp {
	private List<DetalleDigitacionExpress> detalles;

	/**
	 * crea instancia de ResponseDetallesDigExp
	 *
	 */
	public ResponseDetallesDigExp() {
		super();
	}

	/**
	 * crea instancia de ResponseDetallesDigExp
	 *
	 * @param detalles
	 */
	public ResponseDetallesDigExp(final List<DetalleDigitacionExpress> detalles) {
		this.detalles = detalles;
	}

	/**
	 * @return the detalles
	 */
	public List<DetalleDigitacionExpress> getDetalles() {
		return detalles;
	}

	/**
	 * @param detalles the detalles to set
	 */
	public void setDetalles(final List<DetalleDigitacionExpress> detalles) {
		this.detalles = detalles;
	}

}
