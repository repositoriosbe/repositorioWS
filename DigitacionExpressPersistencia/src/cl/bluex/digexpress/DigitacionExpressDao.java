package cl.bluex.digexpress;

import java.util.List;

import cl.bluex.digmodel.to.AgrupacionTO;
import cl.bluex.digmodel.to.CabeceraAgrupacionTO;
import cl.bluex.digmodel.to.ClienteTO;
import cl.bluex.digmodel.to.DetalleDigitacionExpressTO;
import cl.bluex.digmodel.to.EspecieValoradaTO;
import cl.bluex.digmodel.to.HojaRutaTO;
import cl.bluex.digmodel.to.ValoradoTO;
import cl.bluex.ws.common.exceptions.BluexException;

// TODO: Auto-generated Javadoc
/**
 * Interface Dao.
 * 
 * @author Edgardo Herrera
 *
 */
public interface DigitacionExpressDao {
	

	 /**
     * Metodo que actualiza cabecerca agrupacion.
     *
     * @param cabeceraAgrupacionTO datos cabecera agrupacion.
     * @return {@link CabeceraAgrupacionTO}
     * @throws BluexException the bluex exception
     */
    CabeceraAgrupacionTO actualizaEncDigExpress(
	    CabeceraAgrupacionTO cabeceraAgrupacionTO) throws BluexException;

    /**
     * Metodo que inserta una digitacion express.
     *
     * @param detalleDigitacionTO datos de detalle digitacion
     * @return {@link Long}
     * @throws BluexException the bluex exception
     */
    Long insertaDigitExpress(DetalleDigitacionExpressTO detalleDigitacionTO) throws BluexException;

    /**
     * Metodo para eliminar agrupacion.
     *
     * @param codigo de agrupacion
     * @return {@link Long}
     * @throws BluexException the bluex exception
     */
    Long eliminarAgrupacion(Long codigo) throws BluexException;

    /**
     * Metodo que cierra agrupacion.
     *
     * @param codigo de agrupacion
     * @return {@link AgrupacionTO}
     * @throws BluexException the bluex exception
     */
    AgrupacionTO cerrarAgrupacion(Long codigo) throws BluexException;

    /**
     * Metodo que obtiene una agrupacion.
     *
     * @param cabeceraAgrupacionTO datos de la cabecera de la agrupacion
     * @return {@link CabeceraAgrupacionTO}
     * @throws BluexException the bluex exception
     */
    CabeceraAgrupacionTO obtieneAgrupacion(
	    CabeceraAgrupacionTO cabeceraAgrupacionTO) throws BluexException;

    /**
     * Metodo que obtiene la cabecera de una agrupacion.
     *
     * @param codigo de agrupacion
     * @return {@link CabeceraAgrupacionTO}
     * @throws BluexException the bluex exception
     */
    CabeceraAgrupacionTO obtieneCabeceraAgrupacion(long codigo) throws BluexException;

    /**
     * Metodo que obtiene los datos de una hoja de ruta.
     *
     * @param folio de la hoja de ruta
     * @return {@link HojaRutaTO}
     * @throws BluexException the bluex exception
     */
    HojaRutaTO obtieneDatosHojaRuta(String folio) throws BluexException;

    /**
     * Metodo que elimina una digitacion express.
     *
     * @param detalleDigitacionExpressTO datos del detalle de digitacion express
     * @return {@link Long}
     * @throws BluexException the bluex exception
     */
    Long eliminaDigitExpress(
	    DetalleDigitacionExpressTO detalleDigitacionExpressTO) throws BluexException;

    /**
     * Valida especie valorada.
     *
     * @param codigoEmpresa el codigo de la empresa
     * @param codigoTipoDocumento el codigo del tipo de documento
     * @param numeroDocumento el numero de documento
     * @return {@link EspecieValoradaTO}
     * @throws BluexException the bluex exception
     */
    EspecieValoradaTO validaEspecieValorada(long codigoEmpresa,
	    String codigoTipoDocumento, long numeroDocumento) throws BluexException;

    /**
     * Obtiene clientes valorados.
     *
     * @param codigoEmpresa el codigo de la empresa
     * @return lista de {@link ClienteTO}
     * @throws BluexException the bluex exception
     */
    List<ClienteTO> obtieneClientesValorados(long codigoEmpresa) throws BluexException;

    /**
     * Obtiene valorados.
     *
     * @param codigoCliente codigo de cliente
     * @param codigoTipoCliente codigo tipo de cliente
     * @param codigoEmpresa codigo de empresa
     * @param codigoSucursalCliente codigo de sucursal del cliente
     * @return lista de {@link ValoradoTO}
     * @throws BluexException the bluex exception
     */
    List<ValoradoTO> obtieneValorados(long codigoCliente,
	    long codigoTipoCliente, long codigoEmpresa,
	    long codigoSucursalCliente) throws BluexException;

    /**
     * Obtiene digit express.
     *
     * @param id the id
     * @param eevvNmrId the eevv nmr id
     * @return the list
     * @throws BluexException the bluex exception
     */
    List<DetalleDigitacionExpressTO> obtieneDigitExpress(long id, long eevvNmrId) throws BluexException;

    /**
     * Metodo que modifica el estado de una agrupacion.
     * Para cambiar a estado cerrado, utilizar metodo {@link #cerrarAgrupacion(Long)}
     *
     * @param idCabeceraAgrupacion id de la cabecera de agrupacion
     * @param codigoEstado el codigo del estado
     * @return {@link AgrupacionTO}
     * @throws BluexException the bluex exception
     */
    AgrupacionTO modificarEstadoAgrupacion(long idCabeceraAgrupacion, String codigoEstado) throws BluexException;
    
    
    

    HojaRutaTO obtieneDatosCourier(long codigoRuta,  long codigoEmpresa,  int codigoSorter) throws BluexException;

}
