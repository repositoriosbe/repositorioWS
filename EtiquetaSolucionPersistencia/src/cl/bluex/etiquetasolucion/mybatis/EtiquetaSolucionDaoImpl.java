package cl.bluex.etiquetasolucion.mybatis;

import static cl.bluex.ws.common.util.Constantes.UNCHECKED;
import static cl.bluex.ws.common.util.Constantes.RESULTADO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import cl.bluex.etiquetasolucion.EtiquetaSolucionDao;
import cl.bluex.etiquetasolucion.mapper.EtiquetaSolucionMapper;
import cl.bluex.etiquetasolucionmodel.to.InquietudTO;
import cl.bluex.etiquetasolucionmodel.to.SolucionTO;
import cl.bluex.ws.common.dao.AbstractDao;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * Implementacion interfaz Dao.
 * 
 * @author rmoscoso
 * 
 */
public class EtiquetaSolucionDaoImpl extends AbstractDao<EtiquetaSolucionMapper> implements
		EtiquetaSolucionDao {
	private static final Logger LOGGER = Logger
			.getLogger(EtiquetaSolucionDaoImpl.class);
	private Map<String, Object> params = new HashMap<String, Object>();

	/**
	 * crea instancia de EtiquetaSolucionDaoImpl
	 * 
	 * @param sqlSession
	 */
	public EtiquetaSolucionDaoImpl(final SqlSession sqlSession) {
		super(sqlSession);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.ws.common.dao.AbstractDao#getMapperClass()
	 */
	@Override
	public Class<EtiquetaSolucionMapper> getMapperClass() {
		return EtiquetaSolucionMapper.class;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.etiquetasolucion.EtiquetaSolucionDao#getSolucionEtiqueta(cl.bluex.etiquetasolucionmodel.to.Inp_EtiquetaSolucionTO)
	 */
	@Override
	public List<SolucionTO> getSolucionEtiqueta(
			final InquietudTO to) throws BluexException {
		
		LOGGER.info("[getSolucionEtiqueta] Iniciando llamada PL :");
		
		params = new HashMap<String, Object>();
		params.put("i_fch_ini" 	, to.getFechaInicio());
		params.put("i_fch_fin" 	, to.getFechaFin());
		params.put("i_empr_cdg"	, to.getCodigoEmpresa());
		params.put("i_fevl_cdg"	, to.getCodigoTipoDocumento());
		params.put("i_ofcn_cdg"	, to.getCodigoOficina());
		params.put("i_psta_cdg"	, to.getCodigoPosta());
		params.put("i_clhl_cdg"	, to.getCodigoCliente());
		params.put("i_clhl_scrs", to.getSucursalCliente());
		params.put("i_tpcl_cdg"	, to.getCodigoTipoCliente());
		
		LOGGER.info("Parametros de entrada : " + params.toString());
		
		getMapper().getSolucionEtiqueta(params);
		
		this.esExcepcion();
		
		@SuppressWarnings(UNCHECKED)
		final List<SolucionTO> resultado = (List<SolucionTO>) params.get(RESULTADO);
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
