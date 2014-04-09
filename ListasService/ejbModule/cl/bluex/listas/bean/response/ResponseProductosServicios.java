package cl.bluex.listas.bean.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.listas.bean.ProductoServicio;

/**
 * Respuesta productos servicios.
 * 
 * @author Edgardo Herrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productosServicios")
public class ResponseProductosServicios {

	@XmlElement(name = "productoServicio")
	private List<ProductoServicio> productosServicios;
	
	/**
	 * Crea instancia de {@link ResponseProductosServicios}.
	 *
	 */
	public ResponseProductosServicios() {
	    super();
	}
	
	/**
	 * Crea instancia de {@link ResponseProductosServicios}.
	 *
	 * @param productosServicios
	 */
	public ResponseProductosServicios(final List<ProductoServicio> productosServicios) {
	    this.productosServicios = productosServicios;
	}

	/**
	 * @return the productosServicios
	 */
	public List<ProductoServicio> getProductosServicios() {
	    return productosServicios;
	}

	/**
	 * @param productosServicios the productosServicios to set
	 */
	public void setProductosServicios(final List<ProductoServicio> productosServicios) {
	    this.productosServicios = productosServicios;
	}
	
	
}
