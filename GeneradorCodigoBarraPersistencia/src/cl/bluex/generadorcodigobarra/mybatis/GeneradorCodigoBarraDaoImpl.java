package cl.bluex.generadorcodigobarra.mybatis;

import static cl.bluex.ws.common.util.Constantes.CANTIDAD_PIEZAS;
import static cl.bluex.ws.common.util.Constantes.CODIGO_CLIENTE;
import static cl.bluex.ws.common.util.Constantes.CODIGO_EMPRESA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_POSTA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_PRODUCTO;
import static cl.bluex.ws.common.util.Constantes.CODIGO_SUCURSAL_CLIENTE;
import static cl.bluex.ws.common.util.Constantes.CODIGO_TIPO_CLIENTE;
import static cl.bluex.ws.common.util.Constantes.EEVV_NMR_SERIE;
import static cl.bluex.ws.common.util.Constantes.RESULTADO;
import static cl.bluex.ws.common.util.Constantes.TIPO_SERVICIO;
import static cl.bluex.ws.common.util.Constantes.UNCHECKED;
import static cl.bluex.ws.common.util.Constantes.TIPO_DOCUMENTO;
import static cl.bluex.ws.common.util.Constantes.TIPO_NEGOCIO;
import static cl.bluex.ws.common.util.Constantes.NUMERO_PIEZAS;
import static cl.bluex.ws.common.util.Constantes.CODIGO_EMPRESA_DOCUMENTO;




import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
//import org.jboss.logging.Logger;

import cl.bluex.generadorcodigobarra.GeneradorCodigoBarraDao;
import cl.bluex.generadorcodigobarra.mapper.GeneradorCodigoBarraMapper;
import cl.bluex.generadorcodigobarramodel.to.CodigoBarraL28TO;
import cl.bluex.generadorcodigobarramodel.to.ParametroCodigoBarraL28TO;
import cl.bluex.ws.common.dao.AbstractDao;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * Implementacion interfaz Dao.
 * 
 * @author Edgardo Herrera
 * 
 */
public class GeneradorCodigoBarraDaoImpl extends AbstractDao<GeneradorCodigoBarraMapper> implements
		GeneradorCodigoBarraDao {
	private static final Logger LOGGER = Logger
			.getLogger(GeneradorCodigoBarraDaoImpl.class);
	private Map<String, Object> params = new HashMap<String, Object>();

	/**
	 * crea instancia de ListasDaoImpl
	 * 
	 * @param sqlSession
	 */
	public GeneradorCodigoBarraDaoImpl(final SqlSession sqlSession) {
		super(sqlSession);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.ws.common.dao.AbstractDao#getMapperClass()
	 */
	@Override
	public Class<GeneradorCodigoBarraMapper> getMapperClass() {
		return GeneradorCodigoBarraMapper.class;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.generadorcodigobarra.GeneradorCodigoBarraDao#obtieneCodigoBarraL28(cl.bluex.generadorcodigobarramodel.to.ParametroCodigoBarraL28TO)
	 */
	@Override
	public List<CodigoBarraL28TO> obtieneCodigoBarraL28(
			final ParametroCodigoBarraL28TO to) throws BluexException {
		
		LOGGER.info("[GeneradorCodigoBarraDaoImpl] Iniciando llamada PL :");
		LOGGER.info(EEVV_NMR_SERIE 		 	 + ":" + to.getNumeroSerie());
		LOGGER.info(CODIGO_EMPRESA			 + ":" + to.getCodigoEmpresa());
		LOGGER.info(NUMERO_PIEZAS			 + ":" + to.getNumeroPiezas());
		LOGGER.info(CODIGO_PRODUCTO 		 + ":" + to.getTipoProducto());
		LOGGER.info(TIPO_SERVICIO			 + ":" + to.getTipoServicio());
		LOGGER.info(CODIGO_CLIENTE 		     + ":" + to.getCodigoCliente());
		LOGGER.info(CODIGO_SUCURSAL_CLIENTE  + ":" + to.getCodigoSucursal());
		LOGGER.info(CODIGO_TIPO_CLIENTE 	 + ":" + to.getCodigoTipoCliente());
		LOGGER.info(CODIGO_POSTA 			 + ":" + to.getCodigoPosta());
		LOGGER.info(TIPO_DOCUMENTO			 + ":" + to.getTipoDocumento());
		LOGGER.info(TIPO_NEGOCIO 			 + ":" + to.getTipoNegocio());
		LOGGER.info(TIPO_NEGOCIO 			 + ":" + to.getTipoNegocio());
		LOGGER.info(CODIGO_EMPRESA_DOCUMENTO + ":" + to.getCodigoEmpresaDocumento());
		
		params = new HashMap<String, Object>();
		params.put(EEVV_NMR_SERIE,to.getNumeroSerie());
		params.put(CODIGO_EMPRESA,to.getCodigoEmpresa());
		params.put(NUMERO_PIEZAS,to.getNumeroPiezas());
		params.put(CODIGO_PRODUCTO,to.getTipoProducto());
		params.put(TIPO_SERVICIO,to.getTipoServicio());
		params.put(CODIGO_CLIENTE,to.getCodigoCliente());
		params.put(CODIGO_SUCURSAL_CLIENTE,to.getCodigoSucursal());
		params.put(CODIGO_TIPO_CLIENTE,to.getCodigoTipoCliente());
		params.put(CODIGO_POSTA,to.getCodigoPosta());
		params.put(TIPO_DOCUMENTO,to.getTipoDocumento());
		params.put(TIPO_NEGOCIO,to.getTipoNegocio());
		params.put(CODIGO_EMPRESA_DOCUMENTO,to.getCodigoEmpresaDocumento());
		
		
		getMapper().obtieneCodigoBarraL28(params);
		
		LOGGER.info("[GeneradorCodigoBarraDaoImpl] Parametros de Salida :" + params.toString());

		this.esExcepcion();
		
		@SuppressWarnings(UNCHECKED)
		final List<CodigoBarraL28TO> resultado = (List<CodigoBarraL28TO>) params
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
