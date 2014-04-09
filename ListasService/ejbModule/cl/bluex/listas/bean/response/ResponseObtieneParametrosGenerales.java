package cl.bluex.listas.bean.response;

import java.util.List;

import cl.bluex.listas.bean.ParametroGeneral;

/**
 * @author eherrera
 *
 */
public class ResponseObtieneParametrosGenerales {
	private List<ParametroGeneral> parametrosGenerales;

	/**
	 * crea instancia de ResponseObtieneParametrosGenerales
	 *
	 */
	public ResponseObtieneParametrosGenerales() {
		super();
	}
	
	/**
	 * crea instancia de ResponseObtieneParametrosGenerales
	 *
	 * @param parametrosGenerales
	 */
	public ResponseObtieneParametrosGenerales(final List<ParametroGeneral> parametrosGenerales) {
		super();
		this.parametrosGenerales = parametrosGenerales;
	}
	
	/**
	 * @return the parametrosGenerales
	 */
	public List<ParametroGeneral> getParametrosGenerales() {
		return parametrosGenerales;
	}

	/**
	 * @param parametrosGenerales the parametrosGenerales to set
	 */
	public void setParametrosGenerales(final List<ParametroGeneral> parametrosGenerales) {
		this.parametrosGenerales = parametrosGenerales;
	}
	
	
}
