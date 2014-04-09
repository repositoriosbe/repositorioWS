package cl.bluex.generadoretiqueta.bean.request;

import cl.bluex.generadoretiqueta.bean.ParametrosCodigoBulto;

/**
 * @author eherrera
 *
 */
public class RequestCodigoBulto {
	private ParametrosCodigoBulto parametrosCodigoBulto;
	
	/**
	 * crea instancia de RequestCodigoBulto
	 *
	 */
	public RequestCodigoBulto() {
		super();
	}

	/**
	 * @return the parametrosCodigoBulto
	 */
	public ParametrosCodigoBulto getParametrosCodigoBulto() {
		return parametrosCodigoBulto;
	}

	/**
	 * @param parametrosCodigoBulto the parametrosCodigoBulto to set
	 */
	public void setParametrosCodigoBulto(final ParametrosCodigoBulto parametrosCodigoBulto) {
		this.parametrosCodigoBulto = parametrosCodigoBulto;
	}

}
