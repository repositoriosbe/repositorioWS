package cl.bluex.generadoretiqueta.ws.generadorEtiquetaServiceImpl;

import org.junit.Before;

import cl.bluex.ws.common.head.Cabecera;
import cl.bluex.generadoretiqueta.ws.GeneradorEtiquetaServiceImpl;

/**
 * Clase base para test de capa dao.
 * 
 * @author Edgardo Herrera
 * 
 */
public class ServiceTestBase {
	/**
	 * Clase concreta del servicio a testear.
	 */
	private GeneradorEtiquetaServiceImpl servicio;
	private Cabecera cabecera;

	public ServiceTestBase() {
		super();
	}

	/**
	 * Metodo de configuracion de test.
	 * 
	 * @throws Exception
	 *             exception generica
	 */
	@Before
	public final void setUp() throws Exception {
		servicio = new GeneradorEtiquetaServiceImpl();
		cabecera = new Cabecera();
		cabecera.setToken("a18e9393557e3693454dd92b97f3b93e");
	}

	/**
	 * @return the servicio
	 */
	public GeneradorEtiquetaServiceImpl getServicio() {
		return servicio;
	}

	/**
	 * @return the cabecera
	 */
	public Cabecera getCabecera() {
		return cabecera;
	}

}
