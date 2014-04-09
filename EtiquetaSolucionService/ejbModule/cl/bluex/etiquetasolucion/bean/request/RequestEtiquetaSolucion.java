package cl.bluex.etiquetasolucion.bean.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.etiquetasolucion.bean.ParametrosEntrada;

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
	private ParametrosEntrada parametrosEntrada;
	
	
	
	/**
	 * Instantiates a new request etiqueta solucion.
	 */
	public RequestEtiquetaSolucion() {
		super();
	}



	/**
	 * @return the parametrosEntrada
	 */
	public ParametrosEntrada getParametrosEntrada() {
		return parametrosEntrada;
	}



	/**
	 * @param parametrosEntrada the parametrosEntrada to set
	 */
	public void setParametrosEntrada(ParametrosEntrada parametrosEntrada) {
		this.parametrosEntrada = parametrosEntrada;
	}





	
}
