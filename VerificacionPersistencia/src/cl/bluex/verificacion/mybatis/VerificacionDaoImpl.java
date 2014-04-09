package cl.bluex.verificacion.mybatis;

import static cl.bluex.ws.common.util.Constantes.CENTRO_COSTO;
import static cl.bluex.ws.common.util.Constantes.CLHL_CODIGO_EMBARQUE;
import static cl.bluex.ws.common.util.Constantes.CLHL_SUCURSAL_EMBARQUE;
import static cl.bluex.ws.common.util.Constantes.CODIGO_EMPRESA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_ENCABEZADO;
import static cl.bluex.ws.common.util.Constantes.CODIGO_ESTADO_BATCH;
import static cl.bluex.ws.common.util.Constantes.CODIGO_ESTADO_DCBT;
import static cl.bluex.ws.common.util.Constantes.CODIGO_POSTA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_POSTA_DESTINO;
import static cl.bluex.ws.common.util.Constantes.CODIGO_POSTA_ORIGEN;
import static cl.bluex.ws.common.util.Constantes.CODIGO_PRODUCTO;
import static cl.bluex.ws.common.util.Constantes.CODIGO_TIPO;
import static cl.bluex.ws.common.util.Constantes.CODIGO_TIPO_SERVICIO;
import static cl.bluex.ws.common.util.Constantes.CODIGO_USUARIO;
import static cl.bluex.ws.common.util.Constantes.CODIGO_MONEDA;
import static cl.bluex.ws.common.util.Constantes.EEVV_NMR_ID;
import static cl.bluex.ws.common.util.Constantes.FECHA_CREACION_BATCH;
import static cl.bluex.ws.common.util.Constantes.FECHA_CREACION_OSER;
import static cl.bluex.ws.common.util.Constantes.NUMERO_DOCUMENTO_DESDE;
import static cl.bluex.ws.common.util.Constantes.NUMERO_DOCUMENTO_HASTA;
import static cl.bluex.ws.common.util.Constantes.NUMERO_SECUENCIA;
import static cl.bluex.ws.common.util.Constantes.PESO_FISICO;
import static cl.bluex.ws.common.util.Constantes.RESULTADO;
import static cl.bluex.ws.common.util.Constantes.TPCL_CODIGO_EMBARQUE;
import static cl.bluex.ws.common.util.Constantes.UNCHECKED;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import cl.bluex.verificacion.VerificacionDao;
import cl.bluex.verificacion.mapper.VerificacionMapper;
import cl.bluex.verificamodel.to.AcronimoTO;
import cl.bluex.verificamodel.to.BatchTO;
import cl.bluex.verificamodel.to.DetalleBatchTO;
import cl.bluex.verificamodel.to.OsBatchTO;
import cl.bluex.verificamodel.to.OserTO;
import cl.bluex.ws.common.dao.AbstractDao;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * Implementacion interfaz Dao.
 * 
 * @author Edgardo Herrera
 * 
 */
 public class VerificacionDaoImpl extends AbstractDao<VerificacionMapper> implements
 VerificacionDao {
	private Map<String, Object> params = new HashMap<String, Object>();

	
	private static final Logger LOGGER = Logger
			.getLogger(VerificacionDaoImpl.class);
	
	/**
	 * crea instancia de ListasDaoImpl
	 * 
	 * @param sqlSession
	 */
	 public VerificacionDaoImpl(final SqlSession sqlSession) {
		 super(sqlSession);
	 }

	 @Override
	 public Class<VerificacionMapper> getMapperClass() {
		 return VerificacionMapper.class;
	 }

	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.VerificacionDao#crearBatch(cl.bluex.verificamodel.to.BatchTO)
	 */
	@Override
	public long crearBatch(final BatchTO batchTO) throws BluexException {
		
		
		params = new HashMap<String, Object>();
		params.put(CODIGO_EMPRESA, batchTO.getCodigoEmpresa());
		params.put(CODIGO_ENCABEZADO, batchTO.getCodigoEncabezado());
		params.put(CODIGO_POSTA, batchTO.getCodigoPosta());
		params.put(CODIGO_USUARIO, batchTO.getCodigoUsuario());
		params.put(CODIGO_MONEDA, batchTO.getCodigoMoneda());
		
		getMapper().crearBatch(params);
		
		this.esExcepcion();
		
		final long numeroSecuencia = (Long) params.get(RESULTADO);
		
		return numeroSecuencia;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.VerificacionDao#cambioEstadoBatch(cl.bluex.verificamodel.to.BatchTO)
	 */
	@Override
	public void cambioEstadoBatch(final BatchTO batchTO) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_EMPRESA, batchTO.getCodigoEmpresa());
		params.put(CODIGO_ENCABEZADO, batchTO.getCodigoEncabezado());
		params.put(CODIGO_POSTA, batchTO.getCodigoPosta());
		params.put(CODIGO_USUARIO, batchTO.getCodigoUsuario());
		params.put(NUMERO_SECUENCIA, batchTO.getNumeroSecuencia());
		params.put(CODIGO_ESTADO_BATCH, batchTO.getCodigoEstadoBatch());
		
		getMapper().cambioEstadoBatch(params);
		
		this.esExcepcion();
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.VerificacionDao#cerrarBatch(cl.bluex.verificamodel.to.BatchTO)
	 */
	@Override
	public void cerrarBatch(final BatchTO batchTO) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_EMPRESA, batchTO.getCodigoEmpresa());
		params.put(CODIGO_ENCABEZADO, batchTO.getCodigoEncabezado());
		params.put(CODIGO_POSTA, batchTO.getCodigoPosta());
		params.put(CODIGO_USUARIO, batchTO.getCodigoUsuario());
		params.put(NUMERO_SECUENCIA, batchTO.getNumeroSecuencia());
		
		getMapper().cerrarBatch(params);
		
		this.esExcepcion();
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.VerificacionDao#eliminarBatch(cl.bluex.verificamodel.to.BatchTO)
	 */
	@Override
	public void eliminarBatch(final BatchTO batchTO) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_EMPRESA, batchTO.getCodigoEmpresa());
		params.put(CODIGO_ENCABEZADO, batchTO.getCodigoEncabezado());
		params.put(CODIGO_POSTA, batchTO.getCodigoPosta());
		params.put(NUMERO_SECUENCIA, batchTO.getNumeroSecuencia());
		
		getMapper().eliminarBatch(params);
		
		this.esExcepcion();
	}

	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.VerificacionDao#insertarDetalleBatch(cl.bluex.verificamodel.to.DetalleBatchTO)
	 */
	@Override
	public void insertarDetalleBatch(final DetalleBatchTO detalleBatchTO)
			throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_EMPRESA, detalleBatchTO.getCodigoEmpresa());
		params.put(CODIGO_POSTA, detalleBatchTO.getCodigoPosta());
		params.put(CODIGO_ENCABEZADO, detalleBatchTO.getCodigoEncabezado());
		params.put(NUMERO_SECUENCIA, detalleBatchTO.getNumeroSecuencia());
		params.put(EEVV_NMR_ID, detalleBatchTO.getEevvNmrId());
		params.put(CODIGO_USUARIO, detalleBatchTO.getCodigoUsuario());
		
		getMapper().insertarDetalleBatch(params);
		
		this.esExcepcion();
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.VerificacionDao#eliminarDetalleBatch(cl.bluex.verificamodel.to.DetalleBatchTO)
	 */
	@Override
	public void eliminarDetalleBatch(final DetalleBatchTO detalleBatchTO)
			throws BluexException {
		
		LOGGER.info("[eliminarDetalleBatch] : Iniciando metodo.");
		params = new HashMap<String, Object>();
		params.put(CODIGO_EMPRESA, detalleBatchTO.getCodigoEmpresa());
		params.put(CODIGO_POSTA, detalleBatchTO.getCodigoPosta());
		params.put(CODIGO_ENCABEZADO, detalleBatchTO.getCodigoEncabezado());
		params.put(NUMERO_SECUENCIA, detalleBatchTO.getNumeroSecuencia());
		params.put(EEVV_NMR_ID, detalleBatchTO.getEevvNmrId());
		
		LOGGER.info("[eliminarDetalleBatch] : Enviando datos a eliminar :" + params.toString());
		
		getMapper().eliminarDetalleBatch(params);
		
		LOGGER.info("[eliminarDetalleBatch] : Finalizando metodo." + params.get(RESULTADO));
		
		this.esExcepcion();
		
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.VerificacionDao#validaDetalleBatch(cl.bluex.verificamodel.to.DetalleBatchTO)
	 */
	@Override
	public void validaDetalleBatch(final DetalleBatchTO detalleBatchTO)
			throws BluexException {
		params = new HashMap<String, Object>();
		
		params.put(CODIGO_EMPRESA, detalleBatchTO.getCodigoEmpresa());
		params.put(CODIGO_POSTA, detalleBatchTO.getCodigoPosta());
		params.put(CODIGO_ENCABEZADO, detalleBatchTO.getCodigoEncabezado());
		params.put(NUMERO_SECUENCIA, detalleBatchTO.getNumeroSecuencia());
		params.put(EEVV_NMR_ID, detalleBatchTO.getEevvNmrId());
		
		
		getMapper().validaDetalleBatch(params);
		
		this.esExcepcion();
		
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.VerificacionDao#cambioEstadoDetalleBatch(cl.bluex.verificamodel.to.DetalleBatchTO)
	 */
	@Override
	public void cambioEstadoDetalleBatch(final DetalleBatchTO detalleBatchTO)
			throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_EMPRESA, detalleBatchTO.getCodigoEmpresa());
		params.put(CODIGO_POSTA, detalleBatchTO.getCodigoPosta());
		params.put(CODIGO_ENCABEZADO, detalleBatchTO.getCodigoEncabezado());
		params.put(NUMERO_SECUENCIA, detalleBatchTO.getNumeroSecuencia());
		params.put(EEVV_NMR_ID, detalleBatchTO.getEevvNmrId());
		params.put(CODIGO_ESTADO_DCBT, detalleBatchTO.getCodigoEstadoDcbt());
		params.put(CODIGO_USUARIO, detalleBatchTO.getCodigoUsuario());
		
		getMapper().cambioEstadoDetalleBatch(params);
		
		this.esExcepcion();
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.VerificacionDao#obtieneAcronimos(int, java.lang.String)
	 */
	@Override
	public List<AcronimoTO> obtieneAcronimos(final int codigoEmpresa,
			final String codigoTipo) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_EMPRESA, codigoEmpresa);
		params.put(CODIGO_TIPO, codigoTipo);
		
		getMapper().obtieneAcronimos(params);
		
		this.esExcepcion();
		
		@SuppressWarnings(UNCHECKED)
		final List<AcronimoTO> resultado = (List<AcronimoTO>) params.get(RESULTADO);
		
		return resultado;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.VerificacionDao#obtieneBatchOrigen(cl.bluex.verificamodel.to.BatchTO)
	 */
	@Override
	public List<BatchTO> obtieneBatchOrigen(final BatchTO batchTO)
			throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_EMPRESA, batchTO.getCodigoEmpresa());
		params.put(CODIGO_POSTA, batchTO.getCodigoPosta());
		params.put(FECHA_CREACION_BATCH, batchTO.getFechaCreacionBatch());
		params.put(CODIGO_ESTADO_BATCH, batchTO.getCodigoEstadoBatch());
		
		getMapper().obtieneBatchOrigen(params);
		
		this.esExcepcion();
		
		@SuppressWarnings(UNCHECKED)
		final List<BatchTO> resultado = (List<BatchTO>) params.get(RESULTADO);
		
		return resultado;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.VerificacionDao#obtieneOsBatch(cl.bluex.verificamodel.to.OsBatchTO)
	 */
	@Override
	public List<OserTO> obtieneOsBatch(final OsBatchTO osBatchTO) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_EMPRESA, osBatchTO.getCodigoEmpresa());
		params.put(CODIGO_POSTA, osBatchTO.getCodigoPosta());
		params.put(CODIGO_ENCABEZADO, osBatchTO.getCodigoEncabezado());
		params.put(NUMERO_SECUENCIA, osBatchTO.getNumeroSecuencia());
		params.put(FECHA_CREACION_BATCH, osBatchTO.getFechaCreacionBatch());
		params.put(NUMERO_DOCUMENTO_DESDE, osBatchTO.getNumeroDocumentoDesde());
		params.put(NUMERO_DOCUMENTO_HASTA, osBatchTO.getNumeroDocumentoHasta());
		
		getMapper().obtieneOsBatch(params);
		
		this.esExcepcion();
		
		@SuppressWarnings(UNCHECKED)
		final List<OserTO> resultado = (List<OserTO>) params.get(RESULTADO);
		
		return resultado;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.VerificacionDao#actualizaOsBatch(cl.bluex.verificamodel.to.OserTO)
	 */
	@Override
	public void actualizaOsBatch(final OserTO oserTO) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(EEVV_NMR_ID, oserTO.getEevvNmrId());
		params.put(FECHA_CREACION_OSER, oserTO.getFechaCreacionOs());
		params.put(CENTRO_COSTO, oserTO.getCentroCosto());
		params.put(CODIGO_POSTA_ORIGEN, oserTO.getCodigoPostaOrigen());
		params.put(CODIGO_POSTA_DESTINO, oserTO.getCodigoPostaDestino());
		params.put(CODIGO_TIPO_SERVICIO, oserTO.getCodigoTipoServicio());
		params.put(PESO_FISICO, oserTO.getPesofisico());
		params.put(CLHL_CODIGO_EMBARQUE, oserTO.getClhlcodigoEmbarque());
		params.put(CLHL_SUCURSAL_EMBARQUE, oserTO.getClhlsucursalEmbarque());
		params.put(TPCL_CODIGO_EMBARQUE, oserTO.getTpclcodigoEmbarque());
		params.put(CODIGO_EMPRESA, oserTO.getCodigoEmpresa());
		params.put(CODIGO_PRODUCTO, oserTO.getCodigoProducto());
		params.put(CODIGO_ESTADO_DCBT, oserTO.getCodigoEstadoDcbt());
		
		getMapper().actualizaOsBatch(params);
		
		this.esExcepcion();
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.VerificacionDao#reversaBatch(cl.bluex.verificamodel.to.BatchTO)
	 */
	@Override
	public void reversaBatch(final BatchTO batchTO) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_EMPRESA, batchTO.getCodigoEmpresa());
		params.put(CODIGO_POSTA, batchTO.getCodigoPosta());
		params.put(CODIGO_ENCABEZADO, batchTO.getCodigoEncabezado());
		params.put(NUMERO_SECUENCIA, batchTO.getNumeroSecuencia());
		params.put(CODIGO_USUARIO, batchTO.getCodigoUsuario());
		
		getMapper().reversaBatch(params);
		
		this.esExcepcion();
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.verificacion.VerificacionDao#reasignaBatch(cl.bluex.verificamodel.to.BatchTO)
	 */
	@Override
	public void reasignaBatch(final BatchTO batchTO) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_EMPRESA, batchTO.getCodigoEmpresa());
		params.put(CODIGO_POSTA, batchTO.getCodigoPosta());
		params.put(CODIGO_ENCABEZADO, batchTO.getCodigoEncabezado());
		params.put(NUMERO_SECUENCIA, batchTO.getNumeroSecuencia());
		params.put(EEVV_NMR_ID, batchTO.getEevvNmrId());
		params.put(CODIGO_USUARIO, batchTO.getCodigoUsuario());
		
		getMapper().reasignaBatch(params);
		
		this.esExcepcion();
	}

	private void esExcepcion() throws BluexException {
		final Integer codError = (Integer) params.get(COD_ERROR);
		final String descError = (String) params.get(DESC_ERROR);

		if (codError != 0) {
			throw new BluexException(codError.toString(), descError);
		}
	}

}
