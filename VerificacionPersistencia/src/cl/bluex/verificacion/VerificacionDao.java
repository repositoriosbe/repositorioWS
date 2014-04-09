package cl.bluex.verificacion;

import java.util.List;

import cl.bluex.verificamodel.to.AcronimoTO;
import cl.bluex.verificamodel.to.BatchTO;
import cl.bluex.verificamodel.to.DetalleBatchTO;
import cl.bluex.verificamodel.to.OsBatchTO;
import cl.bluex.verificamodel.to.OserTO;
import cl.bluex.ws.common.exceptions.BluexException;


/**
 * Interfaz metodos listas.
 * 
 * @author Edgardo Herrera
 * 
 */
public interface VerificacionDao {

	/**
	 * metodo para creacion de batch.
	 * 
	 * @param batchTO
	 * @return
	 */
	long crearBatch(BatchTO batchTO) throws BluexException;

	/**
	 * metodo para cambio de estado del batch.
	 * 
	 * @param batchTO
	 */
	void cambioEstadoBatch(BatchTO batchTO) throws BluexException;

	/**
	 * Metodo para cerrar un batch.
	 * 
	 * @param batchTO
	 */
	void cerrarBatch(BatchTO batchTO) throws BluexException;

	/**
	 * Metodo para eliminar batch.
	 * 
	 * @param batchTO
	 */
	void eliminarBatch(BatchTO batchTO) throws BluexException;

	/**
	 * Metodo para insertar detalle de un batch.
	 * 
	 * @param detalleBatchTO
	 */
	void insertarDetalleBatch(DetalleBatchTO detalleBatchTO) throws BluexException;

	/**
	 * Metodo para eliminar un detalle batch.
	 * 
	 * @param detalleBatchTO
	 */
	void eliminarDetalleBatch(DetalleBatchTO detalleBatchTO) throws BluexException;

	/**
	 * Metodo para validar un detalle batch.
	 * 
	 * @param detalleBatchTO
	 */
	void validaDetalleBatch(DetalleBatchTO detalleBatchTO) throws BluexException;

	/**
	 * Metodo para cambio de estado detalle batch.
	 * 
	 * @param detalleBatchTO
	 */
	void cambioEstadoDetalleBatch(DetalleBatchTO detalleBatchTO) throws BluexException;

	/**
	 * Metodo que obtiene los acronimos.
	 * 
	 * @param codigoEmpresa
	 * @param codigoTipo
	 * @return lista de {@link AcronimoTO}
	 */
	List<AcronimoTO> obtieneAcronimos(int codigoEmpresa, String codigoTipo) throws BluexException;

	/**
	 * Metodo que obtiene los batch de origen.
	 * 
	 * @param batchTO
	 * @return lista de {@link BatchTO}
	 */
	List<BatchTO> obtieneBatchOrigen(BatchTO batchTO) throws BluexException;

	/**
	 * Metodo que obtiene la oser del batch.
	 * 
	 * @param osBatchTO
	 * @return lista de {@link OserTO}
	 */
	List<OserTO> obtieneOsBatch(OsBatchTO osBatchTO) throws BluexException;

	/**
	 * Metodo que actualiza la oser del batch.
	 * 
	 * @param oserTO
	 */
	void actualizaOsBatch(OserTO oserTO) throws BluexException;

	/**
	 * Metodo que reversa un batch.
	 * 
	 * @param batchTO
	 */
	void reversaBatch(BatchTO batchTO) throws BluexException;

	/**
	 * Metodo que reasigna batch.
	 * 
	 * @param batchTO
	 */
	void reasignaBatch(BatchTO batchTO) throws BluexException;


}
