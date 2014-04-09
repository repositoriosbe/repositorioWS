package cl.bluex.digexpress.bean.response;

import cl.bluex.digexpress.bean.EspecieValorada;

/**
 * Almacena datos de respuesta para especie valorada.
 * 
 * @author Edgardo Herrera
 */
public class ResponseEspecieValorada {
    private EspecieValorada especieValorada;
    
    /**
     * Instantiates a new response especie valorada.
     */
    public ResponseEspecieValorada() {
	super();
    }
    
    /**
     * Instantiates a new response especie valorada.
     *
     * @param especieValorada the especie valorada
     */
    public ResponseEspecieValorada(final EspecieValorada especieValorada) {
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
     * @param especieValorada the new especie valorada
     */
    public void setEspecieValorada(final EspecieValorada especieValorada) {
        this.especieValorada = especieValorada;
    }
}
