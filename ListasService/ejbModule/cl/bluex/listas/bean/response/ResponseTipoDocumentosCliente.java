package cl.bluex.listas.bean.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.listas.bean.TipoDocumentoCliente;

/**
 * Clase de respuesta para {@link TipoDocumentoCliente}.
 * 
 * @author Edgardo Herrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoDocumentosCliente")
public class ResponseTipoDocumentosCliente {
    
    @XmlElement(name = "tipoDocumentoCliente")
    private List<TipoDocumentoCliente> tipoDocumentosCliente;
    
    /**
     * constructor por defecto.
     */
    public ResponseTipoDocumentosCliente() {
	super();
    }
    
    /**
     * Constructor.
     * 
     * @param tipoDocumentosCliente lista de {@link TipoDocumentoCliente}
     */
    public ResponseTipoDocumentosCliente(final List<TipoDocumentoCliente> tipoDocumentosCliente) {
	this.tipoDocumentosCliente = tipoDocumentosCliente;
    }

    /**
     * @return the tipoDocumentosCliente
     */
    public List<TipoDocumentoCliente> getTipoDocumentosCliente() {
        return tipoDocumentosCliente;
    }

    /**
     * @param tipoDocumentosCliente the tipoDocumentosCliente to set
     */
    public void setTipoDocumentosCliente(
    	final List<TipoDocumentoCliente> tipoDocumentosCliente) {
        this.tipoDocumentosCliente = tipoDocumentosCliente;
    }

}
