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
@XmlType(name = "requestObtieneTraduccionEmpresa")
public class RequestObtieneTraduccionEmpresa {
    
    private long codigo;

    public RequestObtieneTraduccionEmpresa() {
	super();
    }
    
    public RequestObtieneTraduccionEmpresa(final long codigo) {
	super();
	this.codigo = codigo;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(final long codigo) {
        this.codigo = codigo;
    }

}
