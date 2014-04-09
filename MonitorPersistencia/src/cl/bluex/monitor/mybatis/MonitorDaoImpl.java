package cl.bluex.monitor.mybatis;

import static cl.bluex.ws.common.util.Constantes.CODIGO_EMPRESA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_SORTER;
import static cl.bluex.ws.common.util.Constantes.RESULTADO;
import static cl.bluex.ws.common.util.Constantes.UNCHECKED;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import cl.bluex.monitor.MonitorDao;
import cl.bluex.monitor.mapper.MonitorMapper;
import cl.bluex.monitor.to.DatosAgrupacionMonitorTO;
import cl.bluex.ws.common.dao.AbstractDao;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * Implementacion interfaz Dao.
 * 
 * @author Edgardo Herrera
 * 
 */
public class MonitorDaoImpl extends AbstractDao<MonitorMapper> implements
		MonitorDao {
	private Map<String, Object> params = new HashMap<String, Object>();
	
	private static final Logger LOGGER = Logger.getLogger(MonitorDaoImpl.class);

	/**
	 * crea instancia de MonitorDaoImpl
	 * 
	 * @param sqlSession
	 */
	public MonitorDaoImpl(final SqlSession sqlSession) {
		super(sqlSession);
	}

	@Override
	public Class<MonitorMapper> getMapperClass() {
		return MonitorMapper.class;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.monitor.dao.Dao#obtieneInformacionMonitor(long)
	 */
	@SuppressWarnings(UNCHECKED)
	@Override
	public List<DatosAgrupacionMonitorTO> obtieneInformacionMonitor(
			final long codigoEmpresa, final long codigoSorter)
			throws BluexException {
		
		LOGGER.info("[MonitorDaoImpl][obtieneInformacionMonitor] Parametros de Entrada : ");
		LOGGER.info("[MonitorDaoImpl][obtieneInformacionMonitor] codigoEmnpresa :" + codigoEmpresa);
		LOGGER.info("[MonitorDaoImpl][obtieneInformacionMonitor] codigoSorter   :" + codigoSorter);
		
		params = new HashMap<String, Object>();
		params.put(CODIGO_EMPRESA, codigoEmpresa);
		params.put(CODIGO_SORTER, codigoSorter);

		getMapper().obtieneInformacionMonitor(params);
		
		LOGGER.info("[MonitorDaoImpl][obtieneInformacionMonitor] resultado	: "	+ params.get(DESC_ERROR));

		this.esExcepcion();
		final List<DatosAgrupacionMonitorTO> resultado = (List<DatosAgrupacionMonitorTO>) params
				.get(RESULTADO);

		return resultado;
	}
	

	private void esExcepcion() throws BluexException {
		final Integer codError = (Integer) params.get(COD_ERROR);
		final String descError = (String) params.get(DESC_ERROR);

		if (codError != 0) {
			throw new BluexException(codError.toString(), descError);
		}
	}

}
