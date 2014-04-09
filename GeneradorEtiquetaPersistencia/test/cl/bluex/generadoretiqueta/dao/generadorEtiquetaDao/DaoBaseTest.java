package cl.bluex.generadoretiqueta.dao.generadorEtiquetaDao;

import org.junit.Before;

import cl.bluex.generadoretiqueta.GeneradorEtiquetaDao;
import cl.bluex.generadoretiqueta.factory.GeneradorEtiquetaDaoFactory;

/**
 * Test base para ListaDao.
 * 
 * @author Edgardo Herrera
 * 
 */
public class DaoBaseTest {

	private GeneradorEtiquetaDao dao;

	/**
	 * Crea instancia de {@link DaoBaseTest}.
	 * 
	 */
	public DaoBaseTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		dao = GeneradorEtiquetaDaoFactory.getInstance().getDaoFactory().getGeneradorEtiquetaDao();
	}

	/**
	 * @return the dao
	 */
	public GeneradorEtiquetaDao getDao() {
		return dao;
	}

}
