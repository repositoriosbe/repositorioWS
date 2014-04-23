package cl.bluex.etiquetasolucion.bean.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.etiquetasolucion.bean.SolicitudImpresion;

/**
 * The Class RequestEtiquetaSolucion.
 *
 * @author rmoscoso
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestImpresionSolucion")
public class RequestImpresionSolucion {
	
	/** The inp etiqueta solucion. */
	@XmlElement(required = true)
	private SolicitudImpresion impresion;
	
	
	/**
	 * Instantiates a new request etiqueta solucion.
	 */
	public RequestImpresionSolucion() {
		super();
	}


	/**
	 * Gets the impresion.
	 *
	 * @return the impresion
	 */
	public SolicitudImpresion getImpresion() {
		return impresion;
	}


	/**
	 * Sets the impresion.
	 *
	 * @param impresion the new impresion
	 */
	public void setImpresion(SolicitudImpresion impresion) {
		this.impresion = impresion;
	}







	
}
