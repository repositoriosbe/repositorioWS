package cl.bluex.listas.bean.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.listas.bean.FamiliaProducto;

/**
 * 
 * @author Edgardo Herrera
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
	name = "familiaProductos")
public class ResponseFamiliaProductos {

	@XmlElement(
		name = "familiaProducto")
	private List<FamiliaProducto> familiaProducto;

	/**
	 * crea instancia de ResponseFamiliaProductos
	 * 
	 */
	public ResponseFamiliaProductos() {
		super();
	}

	/**
	 * crea instancia de ResponseFamiliaProductos
	 * 
	 * @param familiaProducto
	 */
	public ResponseFamiliaProductos(final List<FamiliaProducto> familiaProducto) {
		this.familiaProducto = familiaProducto;
	}

	/**
	 * @return the familiaProducto
	 */
	public List<FamiliaProducto> getFamiliaProducto() {
		return familiaProducto;
	}

	/**
	 * @param familiaProducto
	 *            the familiaProducto to set
	 */
	public void setFamiliaProducto(final List<FamiliaProducto> familiaProducto) {
		this.familiaProducto = familiaProducto;
	}

}
