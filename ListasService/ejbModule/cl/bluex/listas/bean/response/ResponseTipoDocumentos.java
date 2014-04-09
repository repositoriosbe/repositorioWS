package cl.bluex.listas.bean.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.listas.bean.TipoDocumento;


/**
 * @author Edgardo Herrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoDocumentos")
public class ResponseTipoDocumentos {

    @XmlElement(name = "tipoDocumento")
    private List<TipoDocumento> tipoDocumentos;
    
    public ResponseTipoDocumentos() {
	super();
    }
    
    public ResponseTipoDocumentos(final List<TipoDocumento> tipoDocumentos) {
	this.tipoDocumentos = tipoDocumentos;
    }

    public List<TipoDocumento> getTipoDocumentos() {
        return tipoDocumentos;
    }

    public void setTipoDocumentos(final List<TipoDocumento> tipoDocumentos) {
        this.tipoDocumentos = tipoDocumentos;
    }

}
