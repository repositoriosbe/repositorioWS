package cl.bluex.ws.common.dao;

import org.apache.ibatis.session.SqlSession;

import cl.bluex.ws.common.context.ApplicationContext;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * The Class Dao.
 * 
 * @param <T>
 *            the generic type
 */
public abstract class AbstractDao<T> {

	/** The Constant DESC_ERROR. */
	protected static final String DESC_ERROR = "descError";

	/** The Constant COD_ERROR. */
	protected static final String COD_ERROR = "codError";
	
	/** The session. */
	private SqlSession session;

	/**
	 * Instantiates a new dao.
	 * 
	 * @param sqlSession
	 *            the sql session
	 */
	public AbstractDao(final SqlSession sqlSession) {
		this.session = sqlSession;
	}

	/**
	 * Procesa excepcion.
	 * 
	 * @param codigoError
	 *            the codigo error
	 * @param descError
	 *            the desc error
	 * @throws BluexException
	 *             the bluex exception
	 */
	protected void procesaExcepcion(final Integer codigoError,
			final String descError) throws BluexException {
		if (codigoError != null && codigoError != 0) {
			
			// Se obtiene la traducción del codigo de error si existe.
			final String codigo = ApplicationContext.getCurrentInstance()
					.getPropertyManager()
					.getProperty("general.error.bd." + codigoError.toString());
			
			if (codigo != null) {
				throw new BluexException(codigoError.toString(), codigo);
			} else {
				throw new BluexException(codigoError.toString(), descError);
			}
		}
	}

	/**
	 * Gets the mapper.
	 * 
	 * @return the mapper
	 * @throws BluexException
	 *             the bluex exception
	 */
	public T getMapper() throws BluexException {
		if (this.session == null) {
			throw new BluexException("SqlSession null");
		}
		return this.session.getMapper(getMapperClass());
	}

	/**
	 * Gets the mapper class.
	 * 
	 * @return the mapper class
	 */
	public abstract Class<T> getMapperClass();
}
