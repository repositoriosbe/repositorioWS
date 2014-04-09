package cl.bluex.ws.common.dao;

import java.sql.SQLException;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import cl.bluex.ws.common.exceptions.BluexException;

/**
 * A factory for creating AbstractDao objects.
 * 
 * @author Sebastián Elias Navia Iturriaga
 */
public abstract class AbstractDaoFactory implements DaoTransaction {
	private static final Logger LOGGER = Logger.getLogger(AbstractDaoFactory.class);
	
	/** The sql session factory. */
	private final SqlSessionFactory sqlSessionFactory;

	/** The session. */
	private SqlSession session;
	private boolean autoCommit = true;

	/**
	 * Instantiates a new abstract dao factory.
	 * 
	 * @param sqlSessionFactory
	 *            the sql session factory
	 */
	public AbstractDaoFactory(final SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	/**
	 * Gets the session.
	 * 
	 * @return the session
	 * @throws BluexException
	 *             the bluex exception
	 */
	public SqlSession getSession() throws BluexException {
		if (this.session == null) {
			this.createSession();
		}
		return this.session;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.common.dao.DaoTransaction#createTransaction()
	 */
	@Override
	public void createTransaction() throws BluexException {
		this.autoCommit = false;
		createSession();
	}

	/**
	 * Creates a new AbstractDao object.
	 * 
	 * @param autoCommit
	 *            the auto commit
	 * @throws BluexException
	 *             the bluex exception
	 */
	public void createSession() throws BluexException {
		try {
			this.session = this.sqlSessionFactory.openSession(this.autoCommit);
		} catch (final PersistenceException e) {
			throw new BluexException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.common.dao.DaoTransaction#commit()
	 */
	@Override
	public void commit() {
		if (this.session != null) {
			this.session.commit(true);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.common.dao.DaoTransaction#close()
	 */
	@Override
	public void close() {
		if (this.session != null) {
			try {
				if (!this.session.getConnection().isClosed()) {
					this.session.getConnection().close();
				}
			} catch (final SQLException e) {
				LOGGER.info("no se puede cerrar la conexion", e);
			}
			this.session.close();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.common.dao.DaoTransaction#rollback()
	 */
	@Override
	public void rollback() {
		if (this.session != null) {
			this.session.rollback(true);
		}
	}

}
