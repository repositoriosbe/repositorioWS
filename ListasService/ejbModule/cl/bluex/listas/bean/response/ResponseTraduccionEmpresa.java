package cl.bluex.listas.bean.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.listas.bean.TraduccionEmpresa;

/**
 * 
 * @author Edgardo Herrera
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
	name = "traduccionEmpresas")
public class ResponseTraduccionEmpresa {

	@XmlElement(
		name = "traduccionEmpresa")
	private List<TraduccionEmpresa> traduccionEmpresas;

	/**
	 * crea instancia de ResponseTraduccionEmpresa
	 *
	 */
	public ResponseTraduccionEmpresa() {
		super();
	}

	/**
	 * crea instancia de ResponseTraduccionEmpresa
	 *
	 * @param traduccionEmpresas
	 */
	public ResponseTraduccionEmpresa(
			final List<TraduccionEmpresa> traduccionEmpresas) {
		this.traduccionEmpresas = traduccionEmpresas;
	}

	/**
	 * @return the traduccionEmpresas
	 */
	public List<TraduccionEmpresa> getTraduccionEmpresas() {
		return traduccionEmpresas;
	}

	/**
	 * @param traduccionEmpresas the traduccionEmpresas to set
	 */
	public void setTraduccionEmpresas(final List<TraduccionEmpresa> traduccionEmpresas) {
		this.traduccionEmpresas = traduccionEmpresas;
	}

}
