package cl.bluex.digfull.mapper;

import java.util.Map;

/**
 * interfaz de mapeo.
 * 
 * @author Edgardo Herrera
 *
 */
public interface DigitacionFullMapper {

    /**
     * Mapper para validar la especie valorada Full.
     * 
     * @param {@link Map<String, Object> params}
     */
    void validaEspecieValoradaFull(Map<String, Object> params);
    /**
     * Mapper para insertar orden de servicio.
     * 
     * @param {@link Map<String, Object> params}
     */
    void insertaOrdenServicio(Map<String, Object> params);
    /**
     * Mapper para actualizar orden de servicio.
     * 
     * @param {@link Map<String, Object> params}
     */
    void actualizaOrdenServicio(Map<String, Object> parametros);
    /**
     * Mapper para validar indicador punto de entrega.
     * 
     * @param {@link Map<String, Object> params}
     */
    void validaIndicadorPtoEntrega(Map<String, Object> params);
    /**
     * Mapper para validar el tipo de cliente.
     * 
     * @param {@link Map<String, Object> params}
     */
    void validaTipoCliente(Map<String, Object> params);
    /**
     * Mapper para obtener datos del cliente.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneDatosCliente(Map<String, Object> params);
    /**
     * Mapper para insertar datos de referencia.
     * 
     * @param {@link Map<String, Object> params}
     */
    void insertaReferencia(Map<String, Object> params);
    /**
     * Mapper para insertar servicio complementario.
     * 
     * @param {@link Map<String, Object> params}
     */
    void insertaServicioComplementario(Map<String, Object> params);
    /**
     * Mapper para insertar detalle servicio complementario.
     * 
     * @param {@link Map<String, Object> params}
     */
    void insertaDetalleSC(Map<String, Object> params);
    /**
     * Mapper para actualizar detalle servicio complementario.
     * 
     * @param {@link Map<String, Object> params}
     */
    void actualizaDetalleSC(Map<String, Object> params);
    /**
     * Mapper para insertar formas de pago servicio complementario.
     * 
     * @param {@link Map<String, Object> params}
     */
    void insertaFormaPagoSC(Map<String, Object> params);
    /**
     * Mapper para actualizar formas de pago servicio complementario.
     * 
     * @param {@link Map<String, Object> params}
     */
    void actualizaFormaPagoSC(Map<String, Object> agregaFormaPagoSC);
    /**
     * Mapper para obtener valor de parametro general.
     * 
     * @param {@link Map<String, Object> params}
     */
    String obtieneParametroGeneral(Map<String, Object> params);
    /**
     * Mapper para obtener tarifa.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneTarifa(Map<String, Object> params);
    /**
     * Mapper para obtener una orden de servicio.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneOrdenServicio(Map<String, Object> params);
    /**
     * Mapper para obtener una lista de servicios complementarios.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneServiciosComplementarios(Map<String, Object> params);
    /**
     * Mapper para obtener una lista de detalle de servicios complementarios.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneDetalleSC(Map<String, Object> params);
    /**
     * Mapper para obtener una lista de formas de pago de servicios complementarios.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneFormaPagoSC(Map<String, Object> params);
    /**
     * Mapper para obtener una lista de referencias.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneReferencias(Map<String, Object> params);
    /**
     * Mapper para eliminar un servicio complementario.
     * 
     * @param {@link Map<String, Object> params}
     */
    void eliminaServicioComplementario(Map<String, Object> params);
    /**
     * Mapper para eliminar una referencia.
     * 
     * @param {@link Map<String, Object> params}
     */
    void eliminaReferencia(Map<String, Object> params);
    /**
     * Mapper para eliminar un detalle de servicio complementario.
     * 
     * @param {@link Map<String, Object> params}
     */
    void eliminaDetalleSC(Map<String, Object> params);
    /**
     * Mapper para eliminar una forma de pago de servicio complementario.
     * 
     * @param {@link Map<String, Object> params}
     */
    void eliminaFormaPagoSC(Map<String, Object> params);
    /**
     * Mapper para traduccion servicio real.
     * 
     * @param {@link Map<String, Object> params}
     */
	void obtieneTraduccionServicioReal(Map<String, Object> params);
	/**
     * Mapper para traduccion servicio.
     * 
     * @param {@link Map<String, Object> params}
     */
	void obtieneTraduccionServicio(Map<String, Object> params);
	/**
     * Mapper para insertar apendice.
     * 
     * @param {@link Map<String, Object> params}
     */
	void insertaApendices(Map<String, Object> params);
	/**
     * Mapper para validar indicador de unidades.
     * 
     * @param {@link Map<String, Object> params}
     */
	void validaIndicadorUnidades(Map<String, Object> params);
	/**
     * Mapper para insertar warehouse.
     * 
     * @param {@link Map<String, Object> params}
     */
	void insertaWarehouse(Map<String, Object> params);
    
}
