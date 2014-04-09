package cl.bluex.generadoretiqueta.bean.request;

import cl.bluex.generadoretiqueta.bean.ParametrosGuiaPieza;

/**
 * @author eherrera
 *
 */
public class RequestGuiasPorPieza {
	private ParametrosGuiaPieza parametrosGuiaPieza;
	
	/**
	 * crea instancia de RequestGuiasPorPieza
	 *
	 */
	public RequestGuiasPorPieza() {
		super();
	}


	/**
	 * @return the parametrosGuiaPieza
	 */
	public ParametrosGuiaPieza getParametrosGuiaPieza() {
		return parametrosGuiaPieza;
	}


	/**
	 * @param parametrosGuiaPieza the parametrosGuiaPieza to set
	 */
	public void setParametrosGuiaPieza(final ParametrosGuiaPieza parametrosGuiaPieza) {
		this.parametrosGuiaPieza = parametrosGuiaPieza;
	}
	
}
