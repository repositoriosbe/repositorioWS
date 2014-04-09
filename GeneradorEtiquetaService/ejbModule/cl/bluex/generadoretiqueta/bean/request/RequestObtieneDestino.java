package cl.bluex.generadoretiqueta.bean.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.generadoretiqueta.bean.ParametroDestino;

/**
 * @author Edgardo Herrera
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
	name = "requestObtieneDestino")
public class RequestObtieneDestino {
	
	private ParametroDestino parametroDestino;

	/**
	 * crea instancia de RequestObtieneDestino
	 *
	 */
	public RequestObtieneDestino() {
		super();
	}
	
	/**
	 * @return the parametroDestino
	 */
	public ParametroDestino getParametroDestino() {
		return parametroDestino;
	}

	/**
	 * @param parametroDestino the parametroDestino to set
	 */
	public void setParametroDestino(final ParametroDestino parametroDestino) {
		this.parametroDestino = parametroDestino;
	}

	

}
