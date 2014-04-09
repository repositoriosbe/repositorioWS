package cl.bluex.listas.bean.response;

import java.util.List;

import cl.bluex.listas.bean.Cliente;

/**
 * Almacena datos del cliente.
 * 
 * @author Edgardo Herrera
 *
 */
public class ResponseClientes {
    private List<Cliente> clientes;
    
    public ResponseClientes() {
	super();
    }

    public ResponseClientes(final List<Cliente> clientes) {
	super();
	this.clientes = clientes;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(final List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    

}
