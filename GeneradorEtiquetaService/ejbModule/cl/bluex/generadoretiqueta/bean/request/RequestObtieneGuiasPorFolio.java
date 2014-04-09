package cl.bluex.generadoretiqueta.bean.request;

import cl.bluex.generadoretiqueta.bean.ParametrosGuia;

/**
 * @author eherrera
 *
 */
public class RequestObtieneGuiasPorFolio {
	private ParametrosGuia parametrosGuia;
	
	/**
	 * crea instancia de RequestObtieneGuiasPorFolio
	 *
	 */
	public RequestObtieneGuiasPorFolio() {
		super();
	}


	/**
	 * @return the parametrosGuia
	 */
	public ParametrosGuia getParametrosGuia() {
		return parametrosGuia;
	}


	/**
	 * @param parametrosGuia the parametrosGuia to set
	 */
	public void setParametrosGuia(final ParametrosGuia parametrosGuia) {
		this.parametrosGuia = parametrosGuia;
	}

}
