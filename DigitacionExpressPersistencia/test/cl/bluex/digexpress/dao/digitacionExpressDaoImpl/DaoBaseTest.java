package cl.bluex.digexpress.dao.digitacionExpressDaoImpl;

import org.junit.Before;

import cl.bluex.digexpress.DigitacionExpressDao;
import cl.bluex.digexpress.factory.DigitacionExpressDaoFactory;
import cl.bluex.digexpress.mybatis.DigitacionExpressDaoImpl;

/**
 * Test base para Dao.
 * 
 * @author Edgardo Herrera
 *
 */
public class DaoBaseTest {

    private DigitacionExpressDao dao;
    
    /**
     * Constructor test base.
     */
    public DaoBaseTest() {
	super();
    }
    
    @Before
    public void setUp() throws Exception {
	dao = DigitacionExpressDaoFactory.getInstance().getDaoFactory().getDigitacionExpressDao();
//	dao = new DigitacionExpressDaoImpl();
    }

    /**
     * @return the dao
     */
    public DigitacionExpressDao getDao() {
        return dao;
    }
}
