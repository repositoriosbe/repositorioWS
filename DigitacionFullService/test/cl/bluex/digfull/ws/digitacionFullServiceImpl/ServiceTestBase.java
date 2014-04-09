package cl.bluex.digfull.ws.digitacionFullServiceImpl;

import org.junit.Before;

import cl.bluex.digfull.ws.DigitacionFullServiceImpl;
import cl.bluex.ws.common.head.Cabecera;


/**
 * Clase base para test de capa dao.
 *
 * @author Edgardo Herrera
 *
 */
public class ServiceTestBase {
    
    private DigitacionFullServiceImpl servicio;
    private Cabecera cabecera;

    /**
     * constructor test.
     */
    public ServiceTestBase() {
	super();
    }
    
    /**
     * Metodo de configuracion de test.
     *
     * @throws Exception exception generica
     */
    @Before
    public final void setUp() throws Exception {
	servicio = new DigitacionFullServiceImpl();
	cabecera = new Cabecera();
    }

    /**
     * @return the servicio
     */
    public DigitacionFullServiceImpl getServicio() {
        return servicio;
    }

    /**
     * @return the cabecera
     */
    public Cabecera getCabecera() {
        return cabecera;
    }
}
