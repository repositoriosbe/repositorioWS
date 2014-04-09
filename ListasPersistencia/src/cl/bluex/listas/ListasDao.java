package cl.bluex.listas;

import java.util.List;

import cl.bluex.digmodel.to.BancoTO;
import cl.bluex.digmodel.to.CentroCostoTO;
import cl.bluex.digmodel.to.ComunaTO;
import cl.bluex.digmodel.to.ConversionTO;
import cl.bluex.digmodel.to.DiaPagoTO;
import cl.bluex.digmodel.to.EmpresaTO;
import cl.bluex.digmodel.to.FamiliaProductoTO;
import cl.bluex.digmodel.to.LocalidadTO;
import cl.bluex.digmodel.to.MonedaTO;
import cl.bluex.digmodel.to.OficinaTO;
import cl.bluex.digmodel.to.PaisTO;
import cl.bluex.digmodel.to.ParametroGeneralTO;
import cl.bluex.digmodel.to.PersonalizacionUsuarioTO;
import cl.bluex.digmodel.to.PostaTO;
import cl.bluex.digmodel.to.ProductoServicioTO;
import cl.bluex.digmodel.to.ProductoTO;
import cl.bluex.digmodel.to.RutaTO;
import cl.bluex.digmodel.to.SorterTO;
import cl.bluex.digmodel.to.TipoDocumentoClienteTO;
import cl.bluex.digmodel.to.TipoDocumentoTO;
import cl.bluex.digmodel.to.TipoFormaPagoClienteTO;
import cl.bluex.digmodel.to.TipoInfluenciaTO;
import cl.bluex.digmodel.to.TipoNegocioTO;
import cl.bluex.digmodel.to.TipoServicioTO;
import cl.bluex.digmodel.to.TraduccionEmpresaTO;
import cl.bluex.digmodel.to.TraduccionProductoTO;
import cl.bluex.digmodel.to.TraduccionTO;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * Interfaz metodos listas.
 * 
 * @author Edgardo Herrera
 * 
 */
public interface ListasDao {

	/**
	 * Metodo para obtener lista de empresas.
	 * 
	 * @param codigoUsuario
	 *            codigo de usuario
	 * @param codigoSistema
	 *            codigo del sistema
	 * @param codigoAplicacion
	 *            codigo de la aplicacion
	 * @return
	 * @throws BluexException
	 */
	List<EmpresaTO> obtieneEmpresas(long codigoUsuario, long codigoSistema,
			long codigoAplicacion) throws BluexException;

	/**
	 * Metodo para obtener lista de tipo de documentos.
	 * 
	 * @return lista de {@link TipoDocumentoTO}
	 * @throws BluexException
	 */
	List<TipoDocumentoTO> obtieneTipoDocumentos() throws BluexException;

	/**
	 * Metodo para obtener lista de paises.
	 * 
	 * @param codigoPais
	 *            el codigo del pais
	 * @return lista de {@link PaisTO}
	 * @throws BluexException
	 */
	List<PaisTO> obtienePaises(String codigoPais) throws BluexException;

	/**
	 * Metodo para obtener lista de comunas.
	 * 
	 * @param {@link String codigoPais} el codigo del pais
	 * @param {@link String codigoPosta} el codigo de la posta
	 * 
	 * @return lista de {@link ComunaTO}
	 * @throws BluexException
	 */
	List<ComunaTO> obtieneComunas(String codigoPais, String codigoPosta)
			throws BluexException;

	/**
	 * Metodo para obtener lista de postas.
	 * 
	 * @param codigo
	 *            el codigo de posta
	 * @param tipoNegocio
	 *            el codigo del tipo de negocio
	 * @param comuna
	 *            el codigo de la comuna
	 * @return lista de {@link PostaTO}
	 * @throws BluexException
	 */
	List<PostaTO> obtienePostas(String codigo, long tipoNegocio, long comuna)
			throws BluexException;

	/**
	 * Metodo para obtener lista de Rutas.
	 * 
	 * @param {@link String codigo}
	 * @return
	 * @throws BluexException
	 */
	List<RutaTO> obtieneRutas(String codigo) throws BluexException;

	/**
	 * obtiene las localidades segun parametros enviados. Si codigoPostaPadre es
	 * cero traera todas las localidades de todas las postas Si codigoComuna es
	 * cero obtiene todas las localidades de todas las comunas
	 * 
	 * @param codigoPais
	 *            el codigo del pais a consultar
	 * @param codigoPostaPadre
	 *            el codigo de la posta padre
	 * @param codigoPosta
	 *            el codigo de la posta
	 * @param codigoTipoNegocio
	 *            el codigo del tipo de negocio
	 * @param codigoTipoInfluencia
	 *            el codigo del tipo de influencia
	 * @param codigoComuna
	 *            el codigo de la comuna
	 * @return una lista de {@link LocalidadTO}
	 * @throws BluexException
	 *             excepcion generica
	 */
	List<LocalidadTO> obtieneLocalidades(String codigoPais,
			String codigoPostaPadre, String codigoPosta,
			long codigoTipoNegocio, long codigoTipoInfluencia, long codigoComuna)
			throws BluexException;

	/**
	 * Metodo que obtiene los productos.
	 * 
	 * @param codigoFamilia
	 *            codigo de familia
	 * @param codigoEmpresa
	 *            codigo de empresa
	 * @return lista de {@link ProductoTO}
	 * @throws BluexException
	 */
	List<ProductoTO> obtieneProductos(String codigoFamilia, long codigoEmpresa)
			throws BluexException;

	/**
	 * Metodo que obtiene las familias de productos.
	 * 
	 * @return lista de {@link FamiliaProductoTO}
	 * @throws BluexException
	 */
	List<FamiliaProductoTO> obtieneFamiliaProductos() throws BluexException;

	/**
	 * metodo que obtiene los tipos de servicio.
	 * 
	 * @param codigoEmpresa
	 *            codigo de la empresa
	 * @param tipo
	 *            de servicio
	 * @return lista de {@link TipoServicioTO}
	 * @throws BluexException
	 */
	List<TipoServicioTO> obtieneTipoServicios(long codigoEmpresa, String tipo)
			throws BluexException;

	/**
	 * Metodo que obtiene las traducciones.
	 * 
	 * @param tipo
	 *            el tipo de traduccion
	 * @param codigoOrigen
	 *            el codigo de origen
	 * @param codigoEmpresa el codigo de la empresa
	 * @return lista de {@link TraduccionTO}
	 * @throws BluexException
	 */
	List<TraduccionTO> obtieneTraduccion(
			String tipo, 
			String codigoOrigen, 
			long codigoEmpresa)
			throws BluexException;

	/**
	 * Metodo que obtiene las personalizaciones del Usuario.
	 * 
	 * @param codigoUsuario
	 *            el codigo del usuario
	 * @return lista de {@link PersonalizacionUsuarioTO}
	 * @throws BluexException
	 */
	List<PersonalizacionUsuarioTO> obtienePersonalizacionesUsuario(
			long codigoUsuario) throws BluexException;

	/**
	 * Metodo que obtiene los tipos de documentos del cliente.
	 * 
	 * @return lista de {@link TipoDocumentoClienteTO}
	 * @throws BluexException
	 */
	List<TipoDocumentoClienteTO> obtieneTipoDocumentosCliente()
			throws BluexException;

	/**
	 * Metodo que obtiene los tipos de forma de pago del cliente.
	 * 
	 * @return lista de {@link TipoFormaPagoClienteTO}
	 * @throws BluexException
	 */
	List<TipoFormaPagoClienteTO> obtieneTipoFormaPagoCliente()
			throws BluexException;

	/**
	 * Metodo que obtiene los bancos.
	 * 
	 * @return lista de {@link BancoTO}
	 * @throws BluexException
	 */
	List<BancoTO> obtieneBancos() throws BluexException;

	/**
	 * Metodo que obtiene los dias de pago.
	 * 
	 * @return lista de {@link DiaPagoTO}
	 * @throws BluexException
	 */
	List<DiaPagoTO> obtieneDiasPago() throws BluexException;

	/**
	 * Metodo que obtiene las monedas.
	 * 
	 * @return lista de {@link MonedaTO}
	 * @throws BluexException
	 */
	List<MonedaTO> obtieneMonedas() throws BluexException;

	/**
	 * Metodo que obtiene oficinas.
	 * 
	 * @param codigoEmpresa
	 *            codigo de la empresa
	 * @param codigoPosta
	 *            codigo de la posta
	 * @return lista de {@link OficinaTO}
	 * @throws BluexException
	 */
	List<OficinaTO> obtieneOficinas(long codigoEmpresa, String codigoPosta)
			throws BluexException;

	/**
	 * Metodo que obtiene una lista de centros de costo.
	 * 
	 * @param codigoEmpresa
	 *            codigo de la empresa
	 * @param codigoCliente
	 *            codigo del cliente
	 * @param codigoSucursalCliente
	 *            codigo de sucursal del cliente
	 * @param codigoTipoCliente
	 *            codigo del tipo de cliente
	 * @param codigoCentroCosto
	 *            codigo del centro de costo
	 * @return lista de {@link CentroCostoTO}
	 * @throws BluexException
	 */
	List<CentroCostoTO> obtieneCentrosCosto(long codigoEmpresa, 
			long codigoCliente,
			long codigoSucursalCliente, 
			long codigoTipoCliente,
			String codigoCentroCosto) throws BluexException;

	/**
	 * Metodo que obtiene conversiones.
	 * 
	 * @param tipo el tipo de la conversion
	 * @param codigoEmpresa el codigo de la empresa
	 * @return una lista con las conversiones
	 * @throws BluexException
	 */
	List<ConversionTO> obtieneConversiones(String tipo, long codigoEmpresa) throws BluexException;

	/**
	 * Metodo que obtiene los tipos de influencia.
	 * 
	 * @return lista de {@link TipoInfluenciaTO}
	 * @throws BluexException
	 */
	List<TipoInfluenciaTO> obtieneTipoInfluencias() throws BluexException;

	/**
	 * Metodo que obtiene los tipos de negocio.
	 * 
	 * @return lista de {@link TipoNegocioTO}
	 * @throws BluexException
	 */
	List<TipoNegocioTO> obtieneTipoNegocios() throws BluexException;

	/**
	 * Metodo que obtiene los sorter.
	 * 
	 * @return lista de {@link SorterTO}
	 * @throws BluexException
	 */
	List<SorterTO> obtieneSorter() throws BluexException;

	/**
	 * Metodo que obtiene la traduccion de la empresa.
	 * 
	 * @param n
	 * @param m
	 * @param l
	 * 
	 * @return lista de {@link TraduccionEmpresaTO}
	 * @throws BluexException
	 */
	List<TraduccionEmpresaTO> obtieneTraduccionEmpresa(long codigo,
			long codigoUsuario, long codigoSistema, long codigoAplicacion)
			throws BluexException;

	/**
	 * Metodo que obtiene los productos servicios.
	 * 
	 * @return lista de {@link ProductoServicioTO}
	 * @throws BluexException
	 */
	List<ProductoServicioTO> obtieneProductosServicios(long codigoEmpresa,
			String codigoOrigen, String tipo) throws BluexException;

	/**
	 * Metodo que obtiene una lista de traducciones de producto.
	 * 
	 * @param codigoEmpresa el codigo de la empresa
	 * @param tipo el tipo
	 * @return lista de {@link TraduccionProductoTO}
	 */
	List<TraduccionProductoTO> obtieneTraduccionProducto(long codigoEmpresa,
			String tipo) throws BluexException;

	/**
	 * Metodo qie obtiene una lista de parametros generales.
	 * 
	 * @param idParametro el id del parametro
	 * @param nombreCampo el nombre del campo
	 * @return lista de {@link ParametroGeneralTO}
	 */
	List<ParametroGeneralTO> obtieneParametrosGenerales(String idParametro,
			String nombreCampo) throws BluexException;

}
