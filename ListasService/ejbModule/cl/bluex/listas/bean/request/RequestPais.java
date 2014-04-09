package cl.bluex.listas.bean.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Almacena datos de entrada del pais.
 * 
 * @author Edgardo Herrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestPais")
public class RequestPais {
    
    private String codigoPais;
    private String codigoPosta;

    public RequestPais() {
	super();
    }
    
    public RequestPais(final String codigoPais, final String codigoPosta) {
	super();
	this.codigoPais = codigoPais;
	this.codigoPosta = codigoPosta;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(final String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getCodigoPosta() {
        return codigoPosta;
    }

    public void setCodigoPosta(final String codigoPosta) {
        this.codigoPosta = codigoPosta;
    }

}
