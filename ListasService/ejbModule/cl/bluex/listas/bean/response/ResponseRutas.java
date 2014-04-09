package cl.bluex.listas.bean.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.listas.bean.Ruta;

/**
 * Clase encargada englobar la respuesta del servicio.
 *
 * @author Edgardo Herrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rutas")
public class ResponseRutas {
    /**
     * Lista de rutas.
     */
    @XmlElement(name = "ruta")
    private List<Ruta> rutas;

    /**
     * Constructor.
     */
    public ResponseRutas() {
	super();
    }

    /**
     * Constructor.
     * @param rutas lista de rutas
     */
    public ResponseRutas(final List<Ruta> rutas) {
	this.rutas = rutas;
    }

    /**
     * @return List<Ruta> lista de rutas
     */
    public final List<Ruta> getRutas() {
        return rutas;
    }

    /**
     * @param rutas List<Ruta> lista de rutas
     */
    public final void setRutas(final List<Ruta> rutas) {
        this.rutas = rutas;
    }
}
