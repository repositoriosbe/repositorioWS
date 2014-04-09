package cl.bluex.listas.bean.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.listas.bean.TipoInfluencia;

/**
 * @author Edgardo Herrera
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
	name = "tiposInfluencias")
public class ResponseObtieneTipoInfluencias {

	@XmlElement(
		name = "tipoInfluencia")
	private List<TipoInfluencia> tiposInfluencias;

	/**
	 * Crea nueva instancia de {@link ResponseObtieneConversiones}.
	 */
	public ResponseObtieneTipoInfluencias() {
		super();
	}

	
	/**
	 * crea instancia de ResponseObtieneTipoInfluencias
	 *
	 * @param tiposInfluencias
	 */
	public ResponseObtieneTipoInfluencias(
			final List<TipoInfluencia> tiposInfluencias) {
		this.tiposInfluencias = tiposInfluencias;
	}

	/**
	 * @return the tiposInfluencias
	 */
	public List<TipoInfluencia> getTiposInfluencias() {
		return tiposInfluencias;
	}

	/**
	 * @param tiposInfluencias
	 *            the tiposInfluencias to set
	 */
	public void setTiposInfluencias(final List<TipoInfluencia> tiposInfluencias) {
		this.tiposInfluencias = tiposInfluencias;
	}

}
