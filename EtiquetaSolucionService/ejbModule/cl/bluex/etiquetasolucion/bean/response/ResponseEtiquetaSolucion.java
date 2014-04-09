package cl.bluex.etiquetasolucion.bean.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.etiquetasolucion.bean.ParametrosSalida;


// TODO: Auto-generated Javadoc
/**
 * The Class ResponseEtiquetaSolucion.
 *
 * @author rmoscoso
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseEtiquetaSolucion")
public class ResponseEtiquetaSolucion {

	/** The out etiqueta soulucion. */
	List<ParametrosSalida> parametrosSalida;
	
	/**
	 * Instantiates a new response etiqueta solucion.
	 */
	public ResponseEtiquetaSolucion() {
		super();
	}

	/**
	 * Instantiates a new response etiqueta solucion.
	 *
	 * @param paramSalida the param salida
	 */
	public ResponseEtiquetaSolucion(final List<ParametrosSalida> paramSalida) {
		super();
		this.parametrosSalida = paramSalida;
	}

	/**
	 * Gets the parametros salida.
	 *
	 * @return the parametrosSalida
	 */
	public List<ParametrosSalida> getParametrosSalida() {
		return parametrosSalida;
	}

	/**
	 * Sets the parametros salida.
	 *
	 * @param parametrosSalida the parametrosSalida to set
	 */
	public void setParametrosSalida(List<ParametrosSalida> parametrosSalida) {
		this.parametrosSalida = parametrosSalida;
	}



	
	
}
