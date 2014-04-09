package cl.bluex.monitor.bean.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Edgardo Herrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestObtieneInfoMonitor")
public class RequestObtieneInfoMonitor {

    @XmlElement(required = true)
    private long codigoEmpresa;
    
    @XmlElement(required = true)
    private long codigoSorter;
    /**
     * Constructor.
     */
    public RequestObtieneInfoMonitor() {
	super();
    }
    /**
     * @return the codigoEmpresa
     */
    public long getCodigoEmpresa() {
        return codigoEmpresa;
    }
    /**
     * @param codigoEmpresa the codigoEmpresa to set
     */
    public void setCodigoEmpresa(final long codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }
    /**
     * @return the codigoSorter
     */
    public long getCodigoSorter() {
        return codigoSorter;
    }
    /**
     * @param codigoSorter the codigoSorter to set
     */
    public void setCodigoSorter(final long codigoSorter) {
        this.codigoSorter = codigoSorter;
    }
}
