package cl.bluex.generadoretiqueta.mapper;

import java.util.Map;

import cl.bluex.ws.common.exceptions.BluexException;

// TODO: Auto-generated Javadoc
/**
 * interfaz de mapeo.
 * 
 * @author Edgardo Herrera
 *
 */
public interface GeneradorEtiquetaMapper {
    
    /**
     * Mapper para destino.
     *
     * @param params the params
     * @throws BluexException the bluex exception
     */
    void obtieneDestino(Map<String, Object> params) throws BluexException;

    /**
     * Mapper para template.
     *
     * @param params the params
     * @throws BluexException the bluex exception
     */
    void obtieneTemplate(Map<String, Object> params) throws BluexException;

    /**
     * Mapper para obtener datos para la etiqueta.
     *
     * @param params the params
     * @throws BluexException the bluex exception
     */
	void obtieneDatosImpresion(Map<String, Object> params) throws BluexException;

	/**
	 * Mapper para obtener datos de las guias.
	 *
	 * @param params the params
	 * @throws BluexException the bluex exception
	 */
	void obtieneGuiasPorEncabezado(Map<String, Object> params) throws BluexException;

	/**
	 * Mapper para obtener guias por folio.
	 *
	 * @param params the params
	 * @throws BluexException the bluex exception
	 */
	void obtieneGuiasPorFolio(Map<String, Object> params) throws BluexException;

	/**
	 * Mapper para obtener guias por referencia.
	 *
	 * @param params the params
	 * @throws BluexException the bluex exception
	 */
	void obtieneGuiasPorReferencia(Map<String, Object> params) throws BluexException;

	/**
	 * Mapper para obtener los datos de impresion de la etiqueta HUB.
	 *
	 * @param params the params
	 * @throws BluexException the bluex exception
	 */
	void obtieneDatosImpresionHub(Map<String, Object> params) throws BluexException;

	/**
	 * Mapper para obtener guias por referencia.
	 *
	 * @param params the params
	 * @throws BluexException the bluex exception
	 */
	void obtieneGuiasPorPieza(Map<String, Object> params) throws BluexException;

	/**
	 * Mapper para obtener orden de servicio.
	 *
	 * @param params the params
	 * @throws BluexException the bluex exception
	 */
	void obtieneOrdenesServicio(Map<String, Object> params) throws BluexException;

	/**
	 * Mapper para obtener codigo bulto L28.
	 *
	 * @param params the params
	 * @throws BluexException the bluex exception
	 */
	void obtieneCodigoBultoL28(Map<String, Object> params) throws BluexException;
    
	
	/**
	 * Mapper.
	 *
	 * @param params the params
	 * @throws BluexException the bluex exception
	 */
	void obtieneDatosOperacionales(Map<String, Object> params) throws BluexException;
	
	
	/**
	 * Mapper.
	 *
	 * @param params the params
	 * @throws BluexException the bluex exception
	 */
	void insertaPiezaMovimiento(Map<String, Object> params) throws BluexException;
	
	/**
	 * Valida oficina bodega.
	 *
	 * @param params the params
	 * @throws BluexException the bluex exception
	 */
	void validaOficinaBodega(Map<String, Object> params) throws BluexException;
	
}
