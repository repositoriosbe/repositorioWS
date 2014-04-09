package cl.bluex.generadoretiqueta.bean.request;

import cl.bluex.generadoretiqueta.bean.ParamOrdenServicio;

/**
 * @author eherrera
 *
 */
public class RequestObtieneOrdenesServicio {
	private ParamOrdenServicio paramatros;
	
	/**
	 * crea instancia de RequestObtieneOrdenesServicio
	 *
	 */
	public RequestObtieneOrdenesServicio() {
		super();
	}

	/**
	 * @return the paramatros
	 */
	public ParamOrdenServicio getParamatros() {
		return paramatros;
	}

	/**
	 * @param paramatros the paramatros to set
	 */
	public void setParamatros(final ParamOrdenServicio paramatros) {
		this.paramatros = paramatros;
	}
	
}
