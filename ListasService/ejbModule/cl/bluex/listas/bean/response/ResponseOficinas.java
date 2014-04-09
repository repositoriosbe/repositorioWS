package cl.bluex.listas.bean.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.listas.bean.Oficina;

/**
 * Respuesta oficinas.
 * 
 * @author Edgardo Herrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oficinas")
public class ResponseOficinas {
    
    @XmlElement(name = "oficina")
    private List<Oficina> oficinas;
    
    /**
     * Constructor.
     */
    public ResponseOficinas() {
	super();
    }

    public ResponseOficinas(final List<Oficina> oficinas) {
	this.oficinas = oficinas;
    }

    public List<Oficina> getOficinas() {
        return oficinas;
    }

    public void setOficinas(final List<Oficina> oficinas) {
        this.oficinas = oficinas;
    }
    
}
