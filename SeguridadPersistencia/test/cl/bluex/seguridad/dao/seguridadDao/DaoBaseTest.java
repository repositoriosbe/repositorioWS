package cl.bluex.seguridad.dao.seguridadDao;

import org.junit.Before;

import cl.bluex.seguridad.SeguridadDao;
import cl.bluex.seguridad.factory.SeguridadDaoFactory;

/**
 * Test base para SeguridadDao.
 * 
 * @author Edgardo Herrera
 * 
 */
public class DaoBaseTest {
	private SeguridadDao dao;

	/**
	 * Crea instancia de {@link DaoBaseTest}.
	 * 
	 */
	public DaoBaseTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		dao = SeguridadDaoFactory.getInstance().getDaoFactory()
				.getSeguridadDao();
		// dao = new SeguridadDaoImpl();
	}

	/**
	 * @return the dao
	 */
	public SeguridadDao getDao() {
		return dao;
	}

}
