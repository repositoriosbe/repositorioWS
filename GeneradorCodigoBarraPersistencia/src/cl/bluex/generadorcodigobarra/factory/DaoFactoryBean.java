package cl.bluex.generadorcodigobarra.factory;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author Edgardo Herrera
 * 
 */
public class DaoFactoryBean implements FactoryBean<DaoFactory> {

	private SqlSessionFactory sqlSessionFactory;

	public DaoFactoryBean() {
		super();
	}

	@Override
	public DaoFactory getObject() throws Exception {
		return new DaoFactoryImpl(sqlSessionFactory);
	}

	@Override
	public Class<?> getObjectType() {
		return DaoFactory.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

	public void setSqlSessionFactory(final SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
}
