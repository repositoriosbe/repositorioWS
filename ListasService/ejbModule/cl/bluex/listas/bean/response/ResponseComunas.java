package cl.bluex.listas.bean.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.listas.bean.Comuna;

/**
 *
 * @author Edgardo Herrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comunas")
public class ResponseComunas {
    
    @XmlElement(name = "comuna")
    private List<Comuna> comunas;
    
    public ResponseComunas() {
	super();
    }
    
    public ResponseComunas(final List<Comuna> comunas) {
	this.comunas = comunas;
    }

    public List<Comuna> getComunas() {
        return comunas;
    }

    public void setComunas(final List<Comuna> comunas) {
        this.comunas = comunas;
    }

}
