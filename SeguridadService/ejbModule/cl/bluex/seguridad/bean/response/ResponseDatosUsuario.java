package cl.bluex.seguridad.bean.response;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.seguridad.bean.NewDatosUsuario;



/**
 * The Class ResponseDatosUsuario.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseDatosUsuario")
public class ResponseDatosUsuario {

	/** The parametros salida. */
	NewDatosUsuario parametrosSalida;
	
	/**
	 * Instantiates a new response datos usuario.
	 */
	public ResponseDatosUsuario() {
		super();
	}

	/**
	 * Instantiates a new response datos usuario.
	 *
	 * @param paramSalida the param salida
	 */
	public ResponseDatosUsuario(final NewDatosUsuario paramSalida) {
		super();
		this.parametrosSalida = paramSalida;
	}

	/**
	 * Gets the parametros salida.
	 *
	 * @return the parametros salida
	 */
	public NewDatosUsuario getParametrosSalida() {
		return parametrosSalida;
	}

	/**
	 * Sets the parametros salida.
	 *
	 * @param parametrosSalida the new parametros salida
	 */
	public void setParametrosSalida(NewDatosUsuario parametrosSalida) {
		this.parametrosSalida = parametrosSalida;
	}


	
	
}
