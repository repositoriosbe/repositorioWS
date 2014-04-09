package cl.bluex.listas.bean.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.ws.common.util.Validate;

/**
 * @author Edgardo Herrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestObtienePostasComunas")
public class RequestObtienePostasComunas {
	
	@XmlElement(required = true)
	@Validate(required = true)
    private String codigo;
    private long tipoNegocio;
    private long comuna;
    
    /**
     * Crea instancia de {@link RequestObtienePostasComunas}.
     *
     */
    public RequestObtienePostasComunas() {
	super();
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(final String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the tipoNegocio
     */
    public long getTipoNegocio() {
        return tipoNegocio;
    }

    /**
     * @param tipoNegocio the tipoNegocio to set
     */
    public void setTipoNegocio(final long tipoNegocio) {
        this.tipoNegocio = tipoNegocio;
    }

    /**
     * @return the comuna
     */
    public long getComuna() {
        return comuna;
    }

    /**
     * @param comuna the comuna to set
     */
    public void setComuna(final long comuna) {
        this.comuna = comuna;
    }
    
}
