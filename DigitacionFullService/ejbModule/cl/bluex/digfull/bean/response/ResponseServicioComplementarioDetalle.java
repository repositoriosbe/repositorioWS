package cl.bluex.digfull.bean.response;

import java.util.List;

import cl.bluex.digfull.bean.ServicioComplementarioDetalle;

/**
 * @author Edgardo Herrera
 * 
 */
public class ResponseServicioComplementarioDetalle {
	private List<ServicioComplementarioDetalle> detalles;

	/**
	 * Crea instancia de {@link ResponseServicioComplementarioDetalle}.
	 * 
	 */
	public ResponseServicioComplementarioDetalle() {
		super();
	}

	/**
	 * Crea instancia de {@link ResponseServicioComplementarioDetalle}.
	 * 
	 * @param detalles
	 */
	public ResponseServicioComplementarioDetalle(
			final List<ServicioComplementarioDetalle> detalles) {
		super();
		this.detalles = detalles;
	}

	/**
	 * @return the detalles
	 */
	public List<ServicioComplementarioDetalle> getDetalles() {
		return detalles;
	}

	/**
	 * @param detalles
	 *            the detalles to set
	 */
	public void setDetalles(final List<ServicioComplementarioDetalle> detalles) {
		this.detalles = detalles;
	}

}
