package cl.bluex.generadoretiqueta.bean.response;

import java.util.List;

import cl.bluex.generadoretiqueta.bean.Guia;

/**
 * @author eherrera
 *
 */
public class ResponseGuias {
	private List<Guia> guias;
	
	/**
	 * crea instancia de ResponseGuiasPorEncabezado
	 *
	 */
	public ResponseGuias() {
		super();
	}
	
	/**
	 * crea instancia de ResponseGuiasPorEncabezado
	 *
	 * @param guias
	 */
	public ResponseGuias(final List<Guia> guias) {
		this.guias = guias;
	}

	/**
	 * @return the guias
	 */
	public List<Guia> getGuias() {
		return guias;
	}

	/**
	 * @param guias the guias to set
	 */
	public void setGuias(final List<Guia> guias) {
		this.guias = guias;
	}
	
}
