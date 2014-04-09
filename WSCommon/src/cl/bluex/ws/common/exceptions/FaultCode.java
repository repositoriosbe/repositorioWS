package cl.bluex.ws.common.exceptions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "FaultCode", propOrder = { "codigo", "mensaje" })
@XmlType(name = "FaultCode", propOrder = { "codigo" })
public class FaultCode {

    private String codigo;
//    private String mensaje;

    /**
     * crea instancia de FaultCode
     *
     */
    public FaultCode() {
    	super();
    }

    /**
     * crea instancia de FaultCode
     *
     * @param codigo
     */
    FaultCode(final String codigo) {
    	this.codigo = codigo;
    }
    
    /**
     * crea instancia de FaultCode
     *
     * @param codigo
     * @param mensaje
     */
    FaultCode(final String codigo, final String mensaje) {
    	this.codigo = codigo;
//    	this.mensaje = mensaje;
    }

    public String getCodigo() {
    	return this.codigo;
    }

    public void setCodigo(final String codigo) {
    	this.codigo = codigo;
    }

//	public String getMensaje() {
//		return mensaje;
//	}
//
//	public void setMensaje(final String mensaje) {
//		this.mensaje = mensaje;
//	}

}
