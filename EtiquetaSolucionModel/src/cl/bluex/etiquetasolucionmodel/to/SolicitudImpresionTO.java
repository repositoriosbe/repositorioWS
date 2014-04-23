package cl.bluex.etiquetasolucionmodel.to;

import java.math.BigInteger;


/**
 * The Class ImpresionTO.
 */
public class SolicitudImpresionTO {

	
	/** The codigo especie valorada. */
	private BigInteger codigoEspecieValorada;	
	
	/** The codigo template. */
	private String codigoTemplate;	
	
	
	/**
	 * Instantiates a new impresion to.
	 */
	public SolicitudImpresionTO(){
		super();
	}


	/**
	 * Gets the codigo especie valorada.
	 *
	 * @return the codigo especie valorada
	 */
	public BigInteger getCodigoEspecieValorada() {
		return codigoEspecieValorada;
	}


	/**
	 * Sets the codigo especie valorada.
	 *
	 * @param codigoEspecieValorada the new codigo especie valorada
	 */
	public void setCodigoEspecieValorada(BigInteger codigoEspecieValorada) {
		this.codigoEspecieValorada = codigoEspecieValorada;
	}


	/**
	 * Gets the codigo template.
	 *
	 * @return the codigo template
	 */
	public String getCodigoTemplate() {
		return codigoTemplate;
	}


	/**
	 * Sets the codigo template.
	 *
	 * @param codigoTemplate the new codigo template
	 */
	public void setCodigoTemplate(String codigoTemplate) {
		this.codigoTemplate = codigoTemplate;
	}
	
	
	
}
