package cl.bluex.etiquetasolucionmodel.to;

import java.math.BigInteger;

/**
 * The Class ImpresionSolucionTO.
 */
public class ImpresionSolucionTO {

	/** The numero folio. */
	private String numeroFolio;
	
	/** The codigo especie valorada. */
	private BigInteger codigoEspecieValorada;
	
	/** The codigo barra sorter. */
	private String codigoBarraSorter;
	
	/** The conetenido. */
	private String contenido;
	
	
	/**
	 * Instantiates a new impresion solucion to.
	 */
	public ImpresionSolucionTO(){
		super();
	}


	/**
	 * Gets the numero folio.
	 *
	 * @return the numero folio
	 */
	public String getNumeroFolio() {
		return numeroFolio;
	}


	/**
	 * Sets the numero folio.
	 *
	 * @param numeroFolio the new numero folio
	 */
	public void setNumeroFolio(String numeroFolio) {
		this.numeroFolio = numeroFolio;
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
	 * Gets the codigo barra sorter.
	 *
	 * @return the codigo barra sorter
	 */
	public String getCodigoBarraSorter() {
		return codigoBarraSorter;
	}


	/**
	 * Sets the codigo barra sorter.
	 *
	 * @param codigoBarraSorter the new codigo barra sorter
	 */
	public void setCodigoBarraSorter(String codigoBarraSorter) {
		this.codigoBarraSorter = codigoBarraSorter;
	}


	/**
	 * Gets the contenido.
	 *
	 * @return the contenido
	 */
	public String getContenido() {
		return contenido;
	}


	/**
	 * Sets the contenido.
	 *
	 * @param contenido the new contenido
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}


	


	
	
	
	
}
