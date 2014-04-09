package cl.bluex.tracking.mybatis;

import static cl.bluex.ws.common.util.Constantes.CODIGO_EMPRESA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_CLIENTE;
import static cl.bluex.ws.common.util.Constantes.CODIGO_SUCURSAL_CLIENTE;
import static cl.bluex.ws.common.util.Constantes.CODIGO_TIPO_CLIENTE;
import static cl.bluex.ws.common.util.Constantes.FECHA_INICIO;
import static cl.bluex.ws.common.util.Constantes.FECHA_FIN;
import static cl.bluex.ws.common.util.Constantes.CODIGO_REFERENCIA;
import static cl.bluex.ws.common.util.Constantes.RESULTADO;
import static cl.bluex.ws.common.util.Constantes.UNCHECKED;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import cl.bluex.trackingmodel.to.ParametrosTrackingReferenciaTO;
import cl.bluex.trackingmodel.to.TrackingReferenciaTO;
import cl.bluex.tracking.TrackingDao;
import cl.bluex.tracking.mapper.TrackingMapper;
import cl.bluex.ws.common.dao.AbstractDao;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * Implementacion interfaz Dao.
 * 
 * @author Edgardo Herrera
 * 
 */
public class TrackingDaoImpl extends AbstractDao<TrackingMapper> implements
		TrackingDao {
	private static final Logger LOGGER = Logger
			.getLogger(TrackingDaoImpl.class);
	private Map<String, Object> params = new HashMap<String, Object>();

	/**
	 * crea instancia de ListasDaoImpl
	 * 
	 * @param sqlSession
	 */
	public TrackingDaoImpl(final SqlSession sqlSession) {
		super(sqlSession);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.ws.common.dao.AbstractDao#getMapperClass()
	 */
	@Override
	public Class<TrackingMapper> getMapperClass() {
		return TrackingMapper.class;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.tracking.TrackingDao#obtieneTrackingReferencia(cl.bluex.
	 * trackingmodel.to.ParametrosTrackingReferenciaTO)
	 */
	@Override
	public List<TrackingReferenciaTO> obtieneTrackingReferencia(
			final ParametrosTrackingReferenciaTO to) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_EMPRESA, to.getCodigoEmpresa());
		params.put(CODIGO_CLIENTE, to.getCodigoCliente());
		params.put(CODIGO_SUCURSAL_CLIENTE, to.getCodigoSucursal());
		params.put(CODIGO_TIPO_CLIENTE, to.getCodigoTipoCliente());
		params.put(FECHA_INICIO, to.getFechaInicio());
		params.put(FECHA_FIN, to.getFechaFin());
		params.put(CODIGO_REFERENCIA, to.getCodigoReferencia());

		getMapper().obtieneTrackingReferencia(params);

		this.esExcepcion();

		@SuppressWarnings(UNCHECKED)
		final List<TrackingReferenciaTO> resultado = (List<TrackingReferenciaTO>) params
				.get(RESULTADO);
		
		LOGGER.info("largo resultado: " + resultado.size());
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
