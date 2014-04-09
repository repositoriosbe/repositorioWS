package cl.bluex.digfull;

import java.util.Date;
import java.util.List;

import cl.bluex.digmodel.to.DatosClienteTO;
import cl.bluex.digmodel.to.EntradaObtieneTarifaTO;
import cl.bluex.digmodel.to.EspecieValoradaTO;
import cl.bluex.digmodel.to.OrdenServicioTO;
import cl.bluex.digmodel.to.ReferenciaTO;
import cl.bluex.digmodel.to.ServicioComplementarioDetalleTO;
import cl.bluex.digmodel.to.ServicioComplementarioPagoTO;
import cl.bluex.digmodel.to.ServicioComplementarioTO;
import cl.bluex.digmodel.to.TarifaTO;
import cl.bluex.digmodel.to.TipoClienteTO;
import cl.bluex.digmodel.to.WareHouseTO;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * Interfaz Dao.
 * 
 * @author Edgardo Herrera
 *
 */
public interface DigitacionFullDao {

    /**
     * @param codigoEmpresa
     * @param codigoTipoDocumento
     * @param numeroDocumento
     * @return
     * @throws BluexException
     */
    EspecieValoradaTO validaEspecieValoradaFull(final long codigoEmpresa,
	    final String codigoTipoDocumento, final long numeroDocumento) throws BluexException;
	    
    /**
     * Metodo que inserta una orden de servicio.
     * 
     * @param ordenServicioTO
     * @throws BluexException
     */
    void insertaOrdenServicio(OrdenServicioTO ordenServicioTO) throws BluexException;

    /**
     * Metodo que actualiza una orden de servicio.
     * 
     * @param ordenServicioTO
     * @throws BluexException
     */
    void actualizaOrdenServicio(OrdenServicioTO ordenServicioTO) throws BluexException;
    
    /**
     * Metodo que valida el indicador de punto de venta.
     * 
     * @param codigoCliente codigo del cliente
     * @param sucursalCliente sucursal del cliente
     * @param tipoCliente tipo de cliente
     * @param fechaCreacionOser fecha creacion de la orden de servicio
     * @return {@link String}
     */
    String validaIndicadorPtoEntrega(long codigoCliente, long sucursalCliente,
	    long tipoCliente, Date fechaCreacionOser) throws BluexException;

    /**
     * Metodo que valida el tipo de cliente.
     * 
     * @param codigoCliente
     * @param sucursalCliente
     * @param tipoCliente
     * @param codigoEmpresa
     * @return {@link TipoClienteTO}
     */
    TipoClienteTO validaTipoCliente(long codigoCliente, long sucursalCliente,
	    long tipoCliente, long codigoEmpresa) throws BluexException;

    /**
     * Metodo que obtiene los datos del cliente.
     * 
     * @param codigoCliente
     * @param sucursalCliente
     * @param tipoCliente
     * @param codigoEmpresa
     * @return {@link DatosClienteTO}
     */
    DatosClienteTO obtieneDatosCliente(long codigoCliente,
	    long sucursalCliente, long tipoCliente, long codigoEmpresa) throws BluexException;

    /**
     * Metodo que inserta una referencia.
     * 
     * @param {@link ReferenciaTO valueTO}
     */
    void insertaReferencia(ReferenciaTO valueTO) throws BluexException;

    /**
     * Metodo de insercion de servicio complementario.
     * 
     * @param {@link ServicioComplementarioTO to}
     * @throws BluexException  
     */
    void insertaServicioComplementario(ServicioComplementarioTO to) throws BluexException;

    /**
     * Metodo de insercion de detalle de servicio complementario.
     * 
     * @param {@link ServicioComplementarioDetalleTO to}
     * @throws BluexException 
     */
    void insertaDetalleSC(ServicioComplementarioDetalleTO to) throws BluexException;
    
    /**
     * Metodo de actualizacion de detalle de servicio complementario.
     * 
     * @param {@link ServicioComplementarioDetalleTO to}
     * @throws BluexException
     */
    void actualizaDetalleSC(ServicioComplementarioDetalleTO to) throws BluexException;

    /**
     * Metodo de insercion de forma de pago de servicio complementario.
     * 
     * @param {@link ServicioComplementarioPagoTO to}
     * @throws BluexException 
     */
    void insertaFormaPagoSC(ServicioComplementarioPagoTO to) throws BluexException;
    
    /**
     * Metodo de actualizacion de forma de pago de servicio complementario.
     * 
     * @param {@link ServicioComplementarioPagoTO to}
     * @throws BluexException 
     */
    void actualizaFormaPagoSC(ServicioComplementarioPagoTO to) throws BluexException;

    /**
     * Metodo que obtiene el valor de un parametro general.
     * 
     * @param idParametro el id del parametro general
     * @param nombreCampo el nombre del parametro
     * @return {@link String} el valor
     * @throws BluexException
     */
    String obtieneParametroGeneral(String idParametro, String nombreCampo) throws BluexException;
    /**
     * Metodo que obtiene la tarifa.
     * 
     * @param {@link EntradaObtieneTarifaTO entradaTO} datos de entrada
     * @return {@link TarifaTO}
     */
    TarifaTO obtieneTarifa(EntradaObtieneTarifaTO entradaTO) throws BluexException;
    
    /**
     * Metodo que obtiene una orden de servicio.
     * 
     * @param codigoEmpresa
     * @param codigoTipoDocumento
     * @param numeroDocumento
     * @return
     */
    OrdenServicioTO obtieneOrdenServicio(long codigoEmpresa, 
	    String codigoTipoDocumento, 
	    long numeroDocumento) throws BluexException;

    /**
     * Metodo que obtiene una lista de servicios complementarios.
     * 
     * @param eevvNmrId el id de la especie valorada
     * @return lista de Servicios complementarios
     * 
     * @throws BluexException
     */
    List<ServicioComplementarioTO> obtieneServiciosComplementarios(
	    long eevvNmrId) throws BluexException;

    /**
     * Metodo que obtiene una lista de detalle de servicios complementarios.
     * 
     * @param eevvNmrId
     * @param codigoServicio
     * @return
     */
    List<ServicioComplementarioDetalleTO> obtieneDetalleSC(long eevvNmrId,
	    String codigoServicio) throws BluexException;

    /**
     * Metodo que obtiene una lista de formas de pago de servicios complementarios.
     * 
     * @param eevvNmrId
     * @param codigoServicio
     * @return
     */
    List<ServicioComplementarioPagoTO> obtieneFormaPagoSC(long eevvNmrId,
	    String codigoServicio) throws BluexException;

    /**
     * Metodo que obtiene una lista de referencias.
     * 
     * @param eevvNmrId
     * @return
     */
    List<ReferenciaTO> obtieneReferencias(long eevvNmrId) throws BluexException;

    /**
     * Metodo que elimina un servicio complementario.
     * 
     * @param eevvNmrId
     * @param codigoServicio
     */
    void eliminaServicioComplementario(long eevvNmrId, String codigoServicio) throws BluexException;

    /**
     * Metodo que elimina una referencia.
     * 
     * @param eevvNmrId
     * @param codigoTipoReferencia
     */
    void eliminaReferencia(long eevvNmrId, String codigoTipoReferencia) throws BluexException;

    
    /**
     * Metodo que elimina una forma de pago de servicio complementario.
     * 
     * @param eevvNmrId
     * @param codigoServicio
     */
    void eliminaFormaPagoSC(long eevvNmrId, String codigoServicio) throws BluexException;

	/**
	 * Metodo que obtiene la traduccion del servicio real.
	 * 
	 * @param codigoEmpresa
	 * @param codigoServicio
	 * @param codigoProducto
	 * @param codigoRegion
	 * @return
	 */
	String obtieneTraduccionServicioReal(long codigoEmpresa,
			String codigoServicio, String codigoProducto, long codigoRegion) throws BluexException;

	/**
	 * Metodo que obtiene la traduccion del servicio.
	 * 
	 * @param codigoEmpresa
	 * @param codigoServicioReal
	 * @param codigoRegion
	 * @return
	 */
	String obtieneTraduccionServicio(long codigoEmpresa,
			String codigoServicioReal, long codigoRegion) throws BluexException;

	/**
	 * Metodo que inserta un apendice.
	 * 
	 * @param eevvNmrId
	 * @param codigoTipoApendice
	 * @param valor
	 * @param descripcion
	 */
	void insertaApendices(long eevvNmrId, long codigoTipoApendice, long valor,
			String descripcion) throws BluexException;

	/**
	 * Metodo que valida indicador de unidades.
	 * 
	 * @param codigoCliente
	 * @param sucursalCliente
	 * @param tipoCliente
	 * @param fechaCreacionOser
	 * @return
	 */
	String validaIndicadorUnidades(long codigoCliente, long sucursalCliente,
			long tipoCliente, Date fechaCreacionOser) throws BluexException;

	/**
	 * Metodo para eliminar detalle servicio complementario.
	 * 
	 * @param codigoEmpresa
	 * @param codigoServicio
	 * @param eevvNmrid
	 */
	void eliminaDetalleSC(long codigoEmpresa, String codigoServicio,
		long eevvNmrid) throws BluexException;

	/**
	 * Metodo que inserta warehouses
	 * 
	 * @param warehouseTO
	 */
	void insertaWarehouse(WareHouseTO warehouseTO) throws BluexException;

}
