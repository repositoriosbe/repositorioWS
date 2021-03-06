package cl.bluex.etiquetasolucion.bean.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.etiquetasolucion.bean.Inquietud;

/**
 * The Class RequestEtiquetaSolucion.
 *
 * @author rmoscoso
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestEtiquetaSolucion")
public class RequestEtiquetaSolucion {
	
	/** The inp etiqueta solucion. */
	@XmlElement(required = true)
	private Inquietud inquietud;
	
	
	/**
	 * Instantiates a new request etiqueta solucion.
	 */
	public RequestEtiquetaSolucion() {
		super();
	}


	/**
	 * Gets the inquietud.
	 *
	 * @return the inquietud
	 */
	public Inquietud getInquietud() {
		return inquietud;
	}


	/**
	 * Sets the inquietud.
	 *
	 * @param inquietud the new inquietud
	 */
	public void setInquietud(Inquietud inquietud) {
		this.inquietud = inquietud;
	}






	
}
