package cl.bluex.listas.bean.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.ws.common.util.Validate;

/**
 * Almacena datos de la comuna.
 * 
 * @author Edgardo Herrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestComuna")
public class RequestComuna {
	
	@XmlElement(required = true)
	@Validate(required = true)
    private String codigoPais;
	
	@XmlElement(required = true)
	@Validate(required = true)
    private String codigoPosta;
    
    /**
     * Instancia un nuevo request comuna.
     */
    public RequestComuna() {
	super();
    }
    
    /**
     * Instancia un nuevo request comuna.
     * 
     * @param codigoPais codigo del pais
     * @param codigoPosta codigo de la posta
     */
    public RequestComuna(final String codigoPais, final String codigoPosta) {
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
