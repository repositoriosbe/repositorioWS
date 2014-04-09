package cl.bluex.listas.bean.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.listas.bean.Traduccion;

/**
 * Clase de respuesta para traducciones.
 * 
 * @author Edgardo Herrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "traducciones")
public class ResponseTraducciones {

    @XmlElement(name = "traduccion")
    private List<Traduccion> traducciones;
    
    /**
     * constructor por defecto.
     */
    public ResponseTraducciones() {
	super();
    }
    
    /**
     * @param traducciones lista de {@link Traduccion}
     */
    public ResponseTraducciones(final List<Traduccion> traducciones) {
	this.traducciones = traducciones;
    }

    /**
     * @return the traducciones
     */
    public List<Traduccion> getTraducciones() {
        return traducciones;
    }

    /**
     * @param traducciones the traducciones to set
     */
    public void setTraducciones(final List<Traduccion> traducciones) {
        this.traducciones = traducciones;
    }

}

