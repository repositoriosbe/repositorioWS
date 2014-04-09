package cl.bluex.listas.bean.response;

import java.util.List;

import cl.bluex.listas.bean.TraduccionProducto;

/**
 * @author eherrera
 *
 */
public class ResponseTraduccionesProducto {
	private List<TraduccionProducto> traduccionesProducto;
	
	/**
	 * crea instancia de ResponseTraduccionesProducto
	 *
	 */
	public ResponseTraduccionesProducto() {
		super();
	}

	/**
	 * crea instancia de ResponseTraduccionesProducto
	 *
	 * @param traduccionesProducto
	 */
	public ResponseTraduccionesProducto(
			final List<TraduccionProducto> traduccionesProducto) {
		super();
		this.traduccionesProducto = traduccionesProducto;
	}

	/**
	 * @return the traduccionesProducto
	 */
	public List<TraduccionProducto> getTraduccionesProducto() {
		return traduccionesProducto;
	}

	/**
	 * @param traduccionesProducto the traduccionesProducto to set
	 */
	public void setTraduccionesProducto(
			final List<TraduccionProducto> traduccionesProducto) {
		this.traduccionesProducto = traduccionesProducto;
	}
	
}
