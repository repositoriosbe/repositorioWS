package cl.bluex.seguridad.bean.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.seguridad.bean.NewUsuario;

/**
 * The Class RequestDatosUsuario.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestDatosUsuario")
public class RequestDatosUsuario {

	
	/** The parametros entrada. */
	@XmlElement(required = true)
	private NewUsuario parametrosEntrada;
	
	/**
	 * Instantiates a new request datos usuario.
	 */
	public RequestDatosUsuario(){
		super();
	}

	/**
	 * Gets the parametros entrada.
	 *
	 * @return the parametros entrada
	 */
	public NewUsuario getParametrosEntrada() {
		return parametrosEntrada;
	}

	/**
	 * Sets the parametros entrada.
	 *
	 * @param parametrosEntrada the new parametros entrada
	 */
	public void setParametrosEntrada(NewUsuario parametrosEntrada) {
		this.parametrosEntrada = parametrosEntrada;
	}
	
	
}
