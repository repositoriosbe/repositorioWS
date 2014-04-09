package cl.bluex.listas.bean.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.listas.bean.Producto;

/**
 * @author Edgardo Herrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productos")
public class ResponseProductos {

    @XmlElement(name = "producto")
    private List<Producto> producto;
    
    public ResponseProductos() {
	super();
    }
    
    public ResponseProductos(final List<Producto> producto) {
	this.producto = producto;
    }

    public List<Producto> getProducto() {
        return producto;
    }

    public void setProducto(final List<Producto> producto) {
        this.producto = producto;
    }

}
