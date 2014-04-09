package cl.bluex.generadoretiqueta;

import java.util.List;

import cl.bluex.generadoretiqueta.to.CodigoBultoTO;
import cl.bluex.generadoretiqueta.to.DatosGeneracionEtiquetaHubTO;
import cl.bluex.generadoretiqueta.to.DatosGeneracionEtiquetaTO;
import cl.bluex.generadoretiqueta.to.DatosOperacionalesTO;
import cl.bluex.generadoretiqueta.to.DatosRespuestaTO;
import cl.bluex.generadoretiqueta.to.DestinoTO;
import cl.bluex.generadoretiqueta.to.EntradaDatosOperacionalesTO;
import cl.bluex.generadoretiqueta.to.GuiaTO;
import cl.bluex.generadoretiqueta.to.OrdenServicioTO;
import cl.bluex.generadoretiqueta.to.ParamOrdenServicioTO;
import cl.bluex.generadoretiqueta.to.ParametroDestinoTO;
import cl.bluex.generadoretiqueta.to.ParametrosCodigoBultoTO;
import cl.bluex.generadoretiqueta.to.ParametrosGuiaPiezaTO;
import cl.bluex.generadoretiqueta.to.ParametrosGuiaTO;
import cl.bluex.generadoretiqueta.to.ParametrosReferenciaTO;
import cl.bluex.generadoretiqueta.to.PiezaMovimientoTO;
import cl.bluex.generadoretiqueta.to.TemplateTO;
import cl.bluex.ws.common.exceptions.BluexException;

// TODO: Auto-generated Javadoc
/**
 * Interfaz metodos listas.
 * 
 * @author Edgardo Herrera
 *
 */
public interface GeneradorEtiquetaDao {

    /**
     * Metodo que obtiene el destino.
     *
     * @param parametroDestinoTO the parametro destino to
     * @return the destino to
     * @throws BluexException the bluex exception
     */
    DestinoTO obtieneDestino(ParametroDestinoTO parametroDestinoTO) throws BluexException;

    
    /**
     * Metodo que obtiene el template.
     *
     * @param codigoUsuario el codigo del usuario
     * @param codigoImpresora el codigo de la impresora
     * @param codigoFormatoImpresion el codigo del formato de impresion
     * @param tipoEtiqueta el tipo de etiqueta
     * @return una lista de {@link TemplateTO}
     * @throws BluexException the bluex exception
     */
    List<TemplateTO> obtieneTemplate(
    		long codigoUsuario, 
    		long codigoImpresora, 
    		long codigoFormatoImpresion,
    		String tipoEtiqueta) throws BluexException;

	/**
	 * Obtiene datos impresion.
	 *
	 * @param eevvNmrId the eevv nmr id
	 * @return the datos generacion etiqueta to
	 * @throws BluexException the bluex exception
	 */
    DatosGeneracionEtiquetaTO obtieneDatosImpresion(long eevvNmrId) throws BluexException;

    /**
     * Método que obtiene las guias por encabezado.
     *
     * @param idEncabezado the id encabezado
     * @return the list
     * @throws BluexException the bluex exception
     */
    List<GuiaTO> obtieneGuiasPorEncabezado(int idEncabezado) throws BluexException;

	/**
	 * Metodo que obtiene las guias por folio.
	 *
	 * @param parametrosGuiaTO the parametros guia to
	 * @return the list
	 * @throws BluexException the bluex exception
	 */
	List<GuiaTO> obtieneGuiasPorFolio(ParametrosGuiaTO parametrosGuiaTO) throws BluexException;

	/**
	 * Metodo que obtiene las guias por referencia.
	 *
	 * @param parametrosReferenciaTO the parametros referencia to
	 * @return the list
	 * @throws BluexException the bluex exception
	 */
	List<GuiaTO> obtieneGuiasPorReferencia(ParametrosReferenciaTO parametrosReferenciaTO) throws BluexException;


	/**
	 * Metodo que obtiene los datos para la impresion de la etiqueta HUB.
	 *
	 * @param eevvNroId the eevv nro id
	 * @return {@link DatosGeneracionEtiquetaHubTO}
	 * @throws BluexException the bluex exception
	 */
	DatosGeneracionEtiquetaHubTO obtieneDatosImpresionHub(long eevvNroId) throws BluexException;


	/**
	 * Metodo que obtiene las guias por pieza.
	 *
	 * @param parametrosPiezaTO the parametros pieza to
	 * @return lista de {@link GuiaTO}
	 * @throws BluexException the bluex exception
	 */
	List<GuiaTO> obtieneGuiasPorPieza(ParametrosGuiaPiezaTO parametrosPiezaTO) throws BluexException;


	/**
	 * Metodo que obtiene las ordenes de servicio.
	 *
	 * @param parametrosTO the parametros to
	 * @return lista de {@link OrdenServicioTO}
	 * @throws BluexException the bluex exception
	 */
	List<OrdenServicioTO> obtieneOrdenesServicio(
			ParamOrdenServicioTO parametrosTO) throws BluexException;


	/**
	 * Metodo que obtiene el codigo bulto L28.
	 *
	 * @param parametrosTO the parametros to
	 * @return {@link CodigoBultoTO}
	 * @throws BluexException the bluex exception
	 */
	CodigoBultoTO obtieneCodigoBultoL28(ParametrosCodigoBultoTO parametrosTO) throws BluexException;
	
	/**
	 * Metodo.
	 *
	 * @param parametrosTO the parametros to
	 * @return lista de {@link DatosOperacionalesTO}
	 * @throws BluexException the bluex exception
	 */
	DatosOperacionalesTO obtieneDatosOperacionales(
			EntradaDatosOperacionalesTO parametrosTO) throws BluexException;

	
	
    /**
     * Metodo.
     *
     * @param piezaMovimientoTO the pieza movimiento to
     * @return DatosRespuestaTO
     * @throws BluexException the bluex exception
     */
    DatosRespuestaTO insertaPiezaMovimiento(PiezaMovimientoTO piezaMovimientoTO) throws BluexException;
	
	
	/**
	 * Valida oficina bodega.
	 *
	 * @param parametrosTO the parametros to
	 * @return the datos operacionales to
	 * @throws BluexException the bluex exception
	 */
    DatosRespuestaTO validaOficinaBodega(
			EntradaDatosOperacionalesTO parametrosTO) throws BluexException;
    
}
