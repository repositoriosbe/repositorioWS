package cl.bluex.digexpress.bean.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.digexpress.bean.HojaRuta;

/**
 * Almacena datos de respuesta de hoja de ruta.
 * 
 * @author Edgardo Herrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosHojasRuta")
public class ResponseDatosHojaRuta {

    @XmlElement(name = "hojaRuta")
    private HojaRuta hojaRuta;
    
    public ResponseDatosHojaRuta() {
	super();
    }
    
    public ResponseDatosHojaRuta(final HojaRuta hojaRuta) {
	this.hojaRuta = hojaRuta;
    }

    public HojaRuta getHojaRuta() {
        return hojaRuta;
    }

    public void setHojaRuta(final HojaRuta hojaRuta) {
        this.hojaRuta = hojaRuta;
    }
    
    
}
