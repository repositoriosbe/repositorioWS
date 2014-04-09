package cl.bluex.listas.mapper;

import java.util.Map;

/**
 * interfaz de mapeo.
 * 
 * @author Edgardo Herrera
 *
 */
public interface ListasMapper {

    
    /**
     * Mapper para Empresas.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneEmpresas(Map<String, Object> params);
    /**
     * Mapper para Tipo de documentos.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneTipoDocumentos(Map<String, Object> params);
    /**
     * Mapper para Paises.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtienePaises(Map<String, Object> params);
    /**
     * Mapper para Comunas.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneComunas(Map<String, Object> params);
    /**
     * Mapper para Postas.
     * 
     * @param {@link Map<String, Object> params}
     */    
    void obtienePostas(Map<String, Object> params);
    /**
     * Mapper para Postas por comunas.
     * 
     * @param {@link Map<String, Object> params}
     */    
    void obtienePostasComunas(Map<String, Object> params);
    /**
     * Mapper para Rutas.
     * 
     * @param {@link Map<String, Object> params}
     */    
    void obtieneRutas(Map<String, Object> params);
    /**
     * Mapper para localidades.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneLocalidades(Map<String, Object> params);
    /**
     * Mapper para productos.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneProductos(Map<String, Object> params);
    /**
     * Mapper para familia de productos.
     * 
     * @param {@link Map<String, Object> params}
     */    
    void obtieneFamiliaProductos(Map<String, Object> params);
    /**
     * Mapper para tipos de servicios.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneTipoServicios(Map<String, Object> params);
    /**
     * Mapper para traduccion.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneTraduccion(Map<String, Object> params);
    /**
     * Mapper para obtener personalizaciones de usuario.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtienePersonalizacionesUsuario(Map<String, Object> params);
    /**
     * Mapper para obtener tipo de documentos del cliente.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneTipoDocumentosCliente(Map<String, Object> params);
    /**
     * Mapper para obtener el tipo de forma de pago del cliente.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneTipoFormaPagoCliente(Map<String, Object> params);
    /**
     * Mapper para obtener bancos.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneBancos(Map<String, Object> params);
    /**
     * Mapper para obtener dias de pago.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneDiasPago(Map<String, Object> params);
    /**
     * Mapper para obtener monedas.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneMonedas(Map<String, Object> params);
    /**
     * Mapper para obtener oficinas.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneOficinas(Map<String, Object> params);
    /**
     * Mapper para obtener un centro de costo.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneCentrosCosto(Map<String, Object> params);
    /**
     * Mapper para obtener conversiones.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneConversiones(Map<String, Object> params);
    /**
     * Mapper para obtener tipos influencias.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneTipoInfluencias(Map<String, Object> params);
    /**
     * Mapper para obtener tipos negocios.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneTipoNegocios(Map<String, Object> params);
    /**
     * Mapper para obtener lista de sorter.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneSorter(Map<String, Object> params);
    /**
     * Mapper para obtener lista de tipos de etiquetas.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneTraduccionEmpresa(Map<String, Object> params);
    /**
     * Mapper para obtener lista de productos servicios.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneProductosServicios(Map<String, Object> params);
    /**
     * Mapper para obtener lista de traduccion producto.
     * 
     * @param {@link Map<String, Object> params}
     */
	void obtieneTraduccionProducto(Map<String, Object> params);
	/**
	 * @param params
	 */
	void obtieneParametrosGenerales(Map<String, Object> params);
    
}
