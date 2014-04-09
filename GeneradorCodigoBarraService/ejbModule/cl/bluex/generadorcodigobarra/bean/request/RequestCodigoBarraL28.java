package cl.bluex.generadorcodigobarra.bean.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.generadorcodigobarra.bean.ParametroCodigoBarraL28;

/**
 * @author eherrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestCodigoBarraL28")
public class RequestCodigoBarraL28 {
	@XmlElement(required = true)
	private ParametroCodigoBarraL28 parametro;
	
	/**
	 * crea instancia de RequestCodigoBarraL28
	 *
	 */
	public RequestCodigoBarraL28() {
		super();
	}

	/**
	 * @return the parametro
	 */
	public ParametroCodigoBarraL28 getParametro() {
		return parametro;
	}

	/**
	 * @param parametro the parametro to set
	 */
	public void setParametro(final ParametroCodigoBarraL28 parametro) {
		this.parametro = parametro;
	}
	
}
