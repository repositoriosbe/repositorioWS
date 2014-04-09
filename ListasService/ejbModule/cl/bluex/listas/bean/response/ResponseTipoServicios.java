package cl.bluex.listas.bean.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.listas.bean.TipoServicio;

/**
 * Clase de respuesta para tipo de servicios.
 * 
 * @author Edgardo Herrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoServicios")
public class ResponseTipoServicios {

    @XmlElement(name = "tipoServicio")
    private List<TipoServicio> tipoServicios;
    
    /**
     * constructor por defecto.
     */
    public ResponseTipoServicios() {
	super();
    }
    
    /**
     * Constructor.
     * 
     * @param tipoServicios lista de {@link TipoServicio}
     */
    public ResponseTipoServicios(final List<TipoServicio> tipoServicios) {
	this.tipoServicios = tipoServicios;
    }

    /**
     * @return the tipoServicios
     */
    public List<TipoServicio> getTipoServicios() {
        return tipoServicios;
    }

    /**
     * @param tipoServicios the tipoServicios to set
     */
    public void setTipoServicios(final List<TipoServicio> tipoServicios) {
        this.tipoServicios = tipoServicios;
    }

}
