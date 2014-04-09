package cl.bluex.listas.bean.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.listas.bean.Banco;

/**
 *
 * @author Edgardo Herrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bancos")
public class ResponseBancos {
    
    @XmlElement(name = "banco")
    private List<Banco> bancos;
    
    public ResponseBancos() {
	super();
    }
    
    public ResponseBancos(final List<Banco> bancos) {
	this.bancos = bancos;
    }

    public List<Banco> getBancos() {
        return bancos;
    }

    public void setBancos(final List<Banco> bancos) {
        this.bancos = bancos;
    }
    
}
