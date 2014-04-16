package cl.bluex.etiquetasolucion.bean.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.etiquetasolucion.bean.Solucion;


/**
 * The Class ResponseEtiquetaSolucion.
 *
 * @author rmoscoso
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseEtiquetaSolucion")
public class ResponseEtiquetaSolucion {

	/** The lista solucion. */
	List<Solucion> listaSolucion;
	
	/**
	 * Instantiates a new response etiqueta solucion.
	 */
	public ResponseEtiquetaSolucion() {
		super();
	}

	/**
	 * Instantiates a new response etiqueta solucion.
	 *
	 * @param listaSolucion the lista solucion
	 */
	public ResponseEtiquetaSolucion(final List<Solucion> listaSolucion) {
		super();
		this.listaSolucion = listaSolucion;
	}

	/**
	 * Gets the parametros salida.
	 *
	 * @return the parametros salida
	 */
	public List<Solucion> getParametrosSalida() {
		return listaSolucion;
	}

	/**
	 * Sets the parametros salida.
	 *
	 * @param listaSolucion the new parametros salida
	 */
	public void setParametrosSalida(List<Solucion> listaSolucion) {
		this.listaSolucion = listaSolucion;
	}
	
}
