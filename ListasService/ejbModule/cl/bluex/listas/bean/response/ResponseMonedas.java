package cl.bluex.listas.bean.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.listas.bean.Moneda;

/**
 *
 * @author Edgardo Herrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "monedas")
public class ResponseMonedas {

    @XmlElement(name = "moneda")
    private List<Moneda> monedas;
    
    public ResponseMonedas() {
	super();
    }

    public ResponseMonedas(final List<Moneda> monedas) {
	this.monedas = monedas;
    }

    public List<Moneda> getMonedas() {
        return monedas;
    }

    public void setMonedas(final List<Moneda> monedas) {
        this.monedas = monedas;
    }
}
