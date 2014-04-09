package cl.bluex.listas.bean.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.listas.bean.Posta;

/**
 * @author Edgardo Herrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "postas")
public class ResponsePostas {
    
    @XmlElement(name = "posta")
    private List<Posta> postas;
    
    public ResponsePostas() {
	super();
    }
    
    public ResponsePostas(final List<Posta> postas) {
	this.postas = postas;
    }

    public List<Posta> getPostas() {
        return postas;
    }

    public void setPostas(final List<Posta> postas) {
        this.postas = postas;
    }

    

}
