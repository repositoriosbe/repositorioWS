package cl.bluex.etiquetasolucion.bean.response;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.etiquetasolucion.bean.ImpresionSolucion;


/**
 * The Class ResponseEtiquetaSolucion.
 *
 * @author rmoscoso
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseImpresionSolucion")
public class ResponseImpresionSolucion {


	/** The impresion solucion. */
	ImpresionSolucion impresionSolucion;
	
	/**
	 * Instantiates a new response impresion solucion.
	 */
	public ResponseImpresionSolucion() {
		super();
	}

	/**
	 * Instantiates a new response impresion solucion.
	 *
	 * @param to the to
	 */
	public ResponseImpresionSolucion(final ImpresionSolucion to) {
		super();
		this.impresionSolucion = to;
	}

	/**
	 * Gets the impresion solucion.
	 *
	 * @return the impresion solucion
	 */
	public ImpresionSolucion getImpresionSolucion() {
		return impresionSolucion;
	}

	/**
	 * Sets the impresion solucion.
	 *
	 * @param impresionSolucion the new impresion solucion
	 */
	public void setImpresionSolucion(ImpresionSolucion impresionSolucion) {
		this.impresionSolucion = impresionSolucion;
	}

	
}
