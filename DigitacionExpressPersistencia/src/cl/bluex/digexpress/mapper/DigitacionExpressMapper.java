package cl.bluex.digexpress.mapper;

import java.util.Map;

// TODO: Auto-generated Javadoc
/**
 * interfaz de mapeo.
 * 
 * @author Edgardo Herrera
 *
 */
public interface DigitacionExpressMapper {

    /**
     * Mapper para actualizacion de la cabecera de agrupacion.
     *
     * @param params the params
     */
    void actualizaCabeceraAgrupacion(Map<String, Object> params);
    
    /**
     * Mapper para insercion digitacion express.
     *
     * @param params the params
     */
    void insertaDigitExpress(Map<String, Object> params);
    
    /**
     * Mapper para eliminacion digitacion express.
     *
     * @param params the params
     */    
    void eliminaDigitExpress(Map<String, Object> params);
    
    /**
     * Mapper para eliminacion agrupacion.
     *
     * @param params the params
     */
    void eliminarAgrupacion(Map<String, Object> params);
    
    /**
     * Mapper para cierre de agrupacion.
     *
     * @param params the params
     */
    void cerrarAgrupacion(Map<String, Object> params);
    
    /**
     * Mapper que modifica estado agrupacion.
     *
     * @param params the params
     */
    void modificarEstadoAgrupacion(Map<String, Object> params);
    
    /**
     * Mapper para obtener agrupacion.
     *
     * @param params the params
     */
    void obtieneAgrupacion(Map<String, Object> params);
    
    /**
     * Mapper para obtener la cabecera de la agrupacion.
     *
     * @param params the params
     */
    void obtieneCabeceraAgrupacion(Map<String, Object> params);
    
    /**
     * Mapper para obtener datos de la hoja de ruta.
     *
     * @param params the params
     */
    void obtieneDatosHojaRuta(Map<String, Object> params);
    
    /**
     * Mapper para validar la especie valorada.
     *
     * @param params the params
     */
    void validaEspecieValorada(Map<String, Object> params);
    
    /**
     * Mapper para obtener los clientes valorados.
     *
     * @param params the params
     */
    void obtieneClientesValorados(Map<String, Object> params);
    
    /**
     * Mapper para obtener valorados.
     *
     * @param params the params
     */
    void obtieneValorados(Map<String, Object> params);
    
    /**
     * Mapper para obtener digitacion express.
     *
     * @param params the params
     */
    void obtieneDigitExpress(Map<String, Object> params);
    
    /**
     * Obtiene datos courier.
     *
     * @param params the params
     */
    void obtieneDatosCourier(Map<String, Object> params);
    
    
    
}
