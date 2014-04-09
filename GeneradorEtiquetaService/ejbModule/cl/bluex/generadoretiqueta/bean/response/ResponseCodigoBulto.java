package cl.bluex.generadoretiqueta.bean.response;

import cl.bluex.generadoretiqueta.bean.CodigoBulto;

/**
 * @author eherrera
 *
 */
public class ResponseCodigoBulto {
	private CodigoBulto codigoBulto;
	
	/**
	 * crea instancia de ResponseCodigoBulto
	 *
	 */
	public ResponseCodigoBulto() {
		super();
	}
	
	public ResponseCodigoBulto(final CodigoBulto codigoBulto) {
		super();
		this.codigoBulto = codigoBulto;
	}

	/**
	 * @return the codigoBulto
	 */
	public CodigoBulto getCodigoBulto() {
		return codigoBulto;
	}

	/**
	 * @param codigoBulto the codigoBulto to set
	 */
	public void setCodigoBulto(final CodigoBulto codigoBulto) {
		this.codigoBulto = codigoBulto;
	}

}
