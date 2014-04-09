package cl.bluex.generadoretiqueta.bean.request;

import cl.bluex.generadoretiqueta.bean.EntradaDatosOperacionales;

/**
 * @author rmoscoso
 *
 */
public class RequestEntradaDatosOperacionales {
	
	private EntradaDatosOperacionales parametros;
	
	/**
	 * crea instancia de RequestEntradaDatosOperacionales
	 *
	 */
	public RequestEntradaDatosOperacionales() {
		super();
	}

	/**
	 * @return the parametros
	 */
	public EntradaDatosOperacionales getParametros() {
		return parametros;
	}

	/**
	 * @param parametros the parametros to set
	 */
	public void setParametros(EntradaDatosOperacionales parametros) {
		this.parametros = parametros;
	}
	
	
}
