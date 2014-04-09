package cl.bluex.digfull.bean.response;

import cl.bluex.digfull.bean.EspecieValorada;

/**
 * Respuesta Especie Valorada.
 * 
 * @author Edgardo Herrera
 */
public class ResponseEspecieValoradaFull {

	private EspecieValorada especieValorada;

	/**
	 * Instantiates a new response especie valorada.
	 */
	public ResponseEspecieValoradaFull() {
		super();
	}

	/**
	 * Instantiates a new response especie valorada.
	 * 
	 * @param especieValorada
	 *            the especie valorada
	 */
	public ResponseEspecieValoradaFull(final EspecieValorada especieValorada) {
		this.especieValorada = especieValorada;
	}

	/**
	 * Gets the especie valorada.
	 * 
	 * @return the especie valorada
	 */
	public EspecieValorada getEspecieValorada() {
		return especieValorada;
	}

	/**
	 * Sets the especie valorada.
	 * 
	 * @param especieValorada
	 *            the new especie valorada
	 */
	public void setEspecieValorada(final EspecieValorada especieValorada) {
		this.especieValorada = especieValorada;
	}

}
