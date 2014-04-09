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
@XmlType(name = "requestObtieneProductosServicios")
public class RequestObtieneProductosServicios {
    
    private long codigoEmpresa;
    private String codigoOrigen;
    private String tipo;

    public RequestObtieneProductosServicios() {
	super();
    }
    
    public RequestObtieneProductosServicios(final long codigoEmpresa,
            final String codigoOrigen,
            final String tipo) {
	super();
	this.codigoEmpresa = codigoEmpresa;
	this.codigoOrigen = codigoOrigen;
	this.tipo = tipo;
    }

	public long getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public void setCodigoEmpresa(final long codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public String getCodigoOrigen() {
		return codigoOrigen;
	}

	public void setCodigoOrigen(final String codigoOrigen) {
		this.codigoOrigen = codigoOrigen;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
	    return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(final String tipo) {
	    this.tipo = tipo;
	}

}
