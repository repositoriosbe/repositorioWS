package cl.bluex.listas.bean.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.listas.bean.TipoFormaPagoCliente;

/**
 * Clase de respuesta para tipo de formas de pago del cliente.
 * 
 * @author Edgardo Herrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoFormasPagoCliente")
public class ResponseTipoFormasPagoCliente {
    
    private List<TipoFormaPagoCliente> tipoFormaPagoCliente;
    
    /**
     * Constructor por defecto.
     */
    public ResponseTipoFormasPagoCliente() {
	super();
    }

    /**
     * 
     * @param tipoFormaPagoCliente una lista de los tipos de formas de pago del cliente
     */
    public ResponseTipoFormasPagoCliente(final List<TipoFormaPagoCliente> tipoFormaPagoCliente) {
	this.tipoFormaPagoCliente = tipoFormaPagoCliente;
    }

    /**
     * @return the tipoFormaPagoCliente
     */
    public List<TipoFormaPagoCliente> getTipoFormaPagoCliente() {
        return tipoFormaPagoCliente;
    }

    /**
     * @param tipoFormaPagoCliente the tipoFormaPagoCliente to set
     */
    public void setTipoFormaPagoCliente(
    	final List<TipoFormaPagoCliente> tipoFormaPagoCliente) {
        this.tipoFormaPagoCliente = tipoFormaPagoCliente;
    }

}
