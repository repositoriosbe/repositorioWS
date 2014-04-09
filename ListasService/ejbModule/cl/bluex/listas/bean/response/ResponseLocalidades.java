package cl.bluex.listas.bean.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.listas.bean.Localidad;

/**
 * Clase encargada englobar la respuesta del servicio.
 *
 * @author Edgardo Herrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "localidades")
public class ResponseLocalidades {
    /**
     * Lista de localidades.
     */
    @XmlElement(name = "localidad")
    private List<Localidad> localidades;

    /**
     * Constructor.
     */
    public ResponseLocalidades() {
	super();
    }

    /**
     * Constructor.
     * @param localidades lista de localidades
     */
    public ResponseLocalidades(final List<Localidad> localidades) {
	this.localidades = localidades;
    }

    /**
     * @return List<Localidad> lista de localidades
     */
    public final List<Localidad> getlocalidades() {
        return localidades;
    }

    /**
     * @param localidades List<Localidad> lista de localidades
     */
    public final void setLocalidades(final List<Localidad> localidades) {
        this.localidades = localidades;
    }
}
