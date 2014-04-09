package cl.bluex.generadoretiqueta.bean.request;

import cl.bluex.generadoretiqueta.bean.ParametrosReferencia;

/**
 * @author eherrera
 *
 */
public class RequestGuiasPorReferencia {
	private ParametrosReferencia parametrosReferencia;
	
	/**
	 * crea instancia de RequestGuiasPorReferencia
	 *
	 */
	public RequestGuiasPorReferencia() {
		super();
	}

	/**
	 * @return the parametrosReferencia
	 */
	public ParametrosReferencia getParametrosReferencia() {
		return parametrosReferencia;
	}

	/**
	 * @param parametrosReferencia the parametrosReferencia to set
	 */
	public void setParametrosReferencia(final ParametrosReferencia parametrosReferencia) {
		this.parametrosReferencia = parametrosReferencia;
	}

}
