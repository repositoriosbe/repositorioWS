package cl.bluex.ws.common.dao;

import org.apache.ibatis.session.SqlSession;

import cl.bluex.ws.common.exceptions.BluexException;

public abstract class Dao<T> {

	protected static final String DESC_ERROR = "descError";
	protected static final String COD_ERROR = "codError";

	private SqlSession session;

	public Dao(final SqlSession sqlSession) {
		this.session = sqlSession;
	}

	protected void procesaExcepcion(final Integer codigoError, final String descError)
			throws BluexException {
		if (codigoError != null && codigoError != 0) {
			throw new BluexException(codigoError.toString(), descError);
		}
	}

	public T getMapper() throws BluexException {
		if (session == null) {
			throw new BluexException("SqlSession null");
		}
		return this.session.getMapper(getMapperClass());
	}

	public abstract Class<T> getMapperClass();
}
