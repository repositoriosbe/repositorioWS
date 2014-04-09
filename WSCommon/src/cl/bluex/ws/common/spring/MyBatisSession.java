package cl.bluex.ws.common.spring;

import java.io.IOException;
import java.io.Serializable;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.FactoryBean;

import cl.bluex.ws.common.exceptions.BluexException;

/**
 * The Class MyBatisSession.
 */
public class MyBatisSession implements Serializable,
		FactoryBean<SqlSessionFactory> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3596930555868302625L;

	/** The sql session factory. */
	private SqlSessionFactory sqlSessionFactory;

	/** The config. */
	private String config;

	/**
	 * Instantiates a new my batis session.
	 */
	public MyBatisSession() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.FactoryBean#getObject()
	 */
	@Override
	public SqlSessionFactory getObject() throws BluexException {
		if (this.sqlSessionFactory == null) {
			try {
				this.sqlSessionFactory = new SqlSessionFactoryBuilder()
						.build(Resources.getResourceAsStream(this.config));
			} catch (final IOException e) {
				throw new BluexException(e);
			}
		}
		return this.sqlSessionFactory;
	}

	/**
	 * Sets the config.
	 * 
	 * @param config
	 *            the new config
	 */
	public void setConfig(final String config) {
		this.config = config;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.FactoryBean#getObjectType()
	 */
	@Override
	public Class<?> getObjectType() {
		return SqlSessionFactory.class;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.FactoryBean#isSingleton()
	 */
	@Override
	public boolean isSingleton() {
		return true;
	}
}
