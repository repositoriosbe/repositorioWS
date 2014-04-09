package cl.bluex.listas.bean.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.listas.bean.Pais;

/**
 * @author Edgardo Herrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paises")
public class ResponsePaises {
    
    @XmlElement(name = "pais")
    private List<Pais> paises;
    
    public ResponsePaises() {
	super();
    }

    public ResponsePaises(final List<Pais> paises) {
	this.paises = paises;
    }

    public List<Pais> getPaises() {
        return paises;
    }

    public void setPaises(final List<Pais> paises) {
        this.paises = paises;
    }

}
