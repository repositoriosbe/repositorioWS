package cl.bluex.verificacion.mapper;

import java.util.Map;

import cl.bluex.ws.common.exceptions.BluexException;


/**
 * interfaz de mapeo.
 * 
 * @author Edgardo Herrera
 *
 */
public interface VerificacionMapper {

	/**
	 * Mapper creacion Batch.
	 * 
	 * @param {@link Map<String, Object> params}
	 */
	void crearBatch(Map<String, Object> params) throws BluexException;

	/**
	 * Mapper cambio estado batch.
	 * 
	 * @param {@link Map<String, Object> params}
	 */
	void cambioEstadoBatch(Map<String, Object> params) throws BluexException;

	/**
	 * Mapper cerrar el batch.
	 * 
	 * @param {@link Map<String, Object> params}
	 */
	void cerrarBatch(Map<String, Object> params) throws BluexException;

	/**
	 * Mapper eliminar batch.
	 * 
	 * @param {@link Map<String, Object> params}
	 */
	void eliminarBatch(Map<String, Object> params) throws BluexException;

	/**
	 * Mapper insertar detalle batch.
	 * 
	 * @param {@link Map<String, Object> params}
	 */
	void insertarDetalleBatch(Map<String, Object> params) throws BluexException;

	/**
	 * Mapper eliminar detalle batch.
	 * 
	 * @param {@link Map<String, Object> params}
	 */
	void eliminarDetalleBatch(Map<String, Object> params) throws BluexException;

	/**
	 * Mapper valida detalle batch.
	 * 
	 * @param {@link Map<String, Object> params}
	 */
	void validaDetalleBatch(Map<String, Object> params) throws BluexException;

	/**
	 * Mapper cambio estado detalle batch.
	 * 
	 * @param {@link Map<String, Object> params}
	 */
	void cambioEstadoDetalleBatch(Map<String, Object> params) throws BluexException;

	/**
	 * Mapper obtiene acronimos.
	 * 
	 * @param {@link Map<String, Object> params}
	 */
	void obtieneAcronimos(Map<String, Object> params) throws BluexException;

	/**
	 * Mapper obtiene batch origen.
	 * 
	 * @param {@link Map<String, Object> params}
	 */
	void obtieneBatchOrigen(Map<String, Object> params) throws BluexException;

	/**
	 * Mapper obtiene oser batch.
	 * 
	 * @param {@link Map<String, Object> params}
	 */
	void obtieneOsBatch(Map<String, Object> params) throws BluexException;

	/**
	 * Mapper que actualiza oser del batch.
	 * 
	 * @param {@link Map<String, Object> params}
	 */
	void actualizaOsBatch(Map<String, Object> params) throws BluexException;

	/**
	 * Mapper que reversa el batch.
	 * 
	 * @param {@link Map<String, Object> params}
	 */
	void reversaBatch(Map<String, Object> params) throws BluexException;

	/**
	 * Mapper que reasigna Batch.
	 * 
	 * @param  {@link Map<String, Object> params}
	 */
	void reasignaBatch(Map<String, Object> params) throws BluexException;

    
    
    
}
