package cl.bluex.etiquetasolucion.bean;

import java.io.Serializable;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.etiquetasolucionmodel.to.SolicitudImpresionTO;


/**
 * The Class Impresion.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitudImpresion",	
	propOrder = {
		"codigoEspecieValorada",			
		"codigoTemplate"	
		})
public class SolicitudImpresion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3071395057713987421L;

	/** The codigo especie valorada. */
	@XmlElement(required = true)
	private BigInteger codigoEspecieValorada;	
	
	/** The codigo template. */
	@XmlElement(required = true)
	private String codigoTemplate;			
	
	

	/**
	 * Instantiates a new impresion.
	 */
	public SolicitudImpresion() {
		super();
	}
	
	
	/**
	 * Instantiates a new impresion.
	 *
	 * @param to the to
	 */
	public SolicitudImpresion(final SolicitudImpresionTO to) {
		if (to != null) {
			
			this.codigoEspecieValorada = to.getCodigoEspecieValorada();
			this.codigoTemplate = to.getCodigoTemplate();
			
		}
		
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