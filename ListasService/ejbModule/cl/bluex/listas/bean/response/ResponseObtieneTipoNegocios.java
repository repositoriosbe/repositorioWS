package cl.bluex.listas.bean.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.listas.bean.TipoNegocio;

/**
 * @author Edgardo Herrera
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
	name = "tiposNegocios")
public class ResponseObtieneTipoNegocios {
	@XmlElement(
		name = "tipoNegocio")
	private List<TipoNegocio> tiposNegocios;

	/**
	 * Crea instancia de {@link ResponseObtieneTipoNegocios}.
	 */
	public ResponseObtieneTipoNegocios() {
		super();
	}

	/**
	 * crea instancia de ResponseObtieneTipoNegocios
	 *
	 * @param tiposNegocios
	 */
	public ResponseObtieneTipoNegocios(final List<TipoNegocio> tiposNegocios) {
		this.tiposNegocios = tiposNegocios;
	}

	/**
	 * @return the tiposNegocios
	 */
	public List<TipoNegocio> getTiposNegocios() {
		return tiposNegocios;
	}

	/**
	 * @param tiposNegocios
	 *            the tiposNegocios to set
	 */
	public void setTiposNegocios(final List<TipoNegocio> tiposNegocios) {
		this.tiposNegocios = tiposNegocios;
	}

}
