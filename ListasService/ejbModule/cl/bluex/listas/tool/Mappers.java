package cl.bluex.listas.tool;

import java.util.ArrayList;
import java.util.List;

import cl.bluex.listas.bean.Banco;
import cl.bluex.listas.bean.CentroCosto;
import cl.bluex.listas.bean.Comuna;
import cl.bluex.listas.bean.Conversion;
import cl.bluex.listas.bean.DiaPago;
import cl.bluex.listas.bean.Empresa;
import cl.bluex.listas.bean.FamiliaProducto;
import cl.bluex.listas.bean.Localidad;
import cl.bluex.listas.bean.Moneda;
import cl.bluex.listas.bean.Oficina;
import cl.bluex.listas.bean.Pais;
import cl.bluex.listas.bean.ParametroGeneral;
import cl.bluex.listas.bean.PersonalizacionUsuario;
import cl.bluex.listas.bean.Posta;
import cl.bluex.listas.bean.Producto;
import cl.bluex.listas.bean.ProductoServicio;
import cl.bluex.listas.bean.Ruta;
import cl.bluex.listas.bean.Sorter;
import cl.bluex.listas.bean.TipoDocumento;
import cl.bluex.listas.bean.TipoDocumentoCliente;
import cl.bluex.listas.bean.TipoFormaPagoCliente;
import cl.bluex.listas.bean.TipoInfluencia;
import cl.bluex.listas.bean.TipoNegocio;
import cl.bluex.listas.bean.TipoServicio;
import cl.bluex.listas.bean.Traduccion;
import cl.bluex.listas.bean.TraduccionEmpresa;
import cl.bluex.listas.bean.TraduccionProducto;
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

/**
 * Mapeos de objetos.
 * 
 * @author Edgardo Herrera
 * 
 */
public final class Mappers {

	private Mappers() {
		super();
	}

	/**
	 * Metodo que copia data de una lista de {@link TipoDocumentoTO} a
	 * {@link TipoDocumento}.
	 * 
	 * @param tos
	 *           lista de {@link TipoDocumentoTO}
	 * @return lista de {@link TipoDocumento}
	 */
	public static List<TipoDocumento> mapperTipoDocumentos(
			final List<TipoDocumentoTO> tos) {
		final List<TipoDocumento> beans = new ArrayList<TipoDocumento>();

		for (final TipoDocumentoTO to : tos) {
			beans.add(new TipoDocumento(to));
		}
		return beans;
	}

	/**
	 * Metodo que copia data de una lista de {@link PaisTO} a {@link Pais}.
	 * 
	 * @param tos
	 *           lista de {@link PaisTO}
	 * @return lista de {@link Pais}
	 */
	public static List<Pais> mapperPaises(final List<PaisTO> tos) {
		final List<Pais> beans = new ArrayList<Pais>();
		for (final PaisTO to : tos) {
			beans.add(new Pais(to));
		}
		return beans;
	}

	/**
	 * Metodo que copia data de una lista de {@link ComunaTO} a {@link Comuna}.
	 * 
	 * @param tos
	 *           lista de {@link ComunaTO}
	 * @return lista de {@link Comuna}
	 */
	public static List<Comuna> mapperComunas(final List<ComunaTO> tos) {
		final List<Comuna> beans = new ArrayList<Comuna>();
		for (final ComunaTO to : tos) {
			beans.add(new Comuna(to));
		}
		return beans;
	}

	/**
	 * Metodo que copia data de una lista de {@link RutaTO} a {@link Ruta}.
	 * 
	 * @param tos
	 *           lista de {@link RutaTO}
	 * @return lista de {@link Ruta}
	 */
	public static List<Ruta> mapperRutas(final List<RutaTO> tos) {
		final List<Ruta> beans = new ArrayList<Ruta>();
		for (final RutaTO to : tos) {
			beans.add(new Ruta(to));
		}
		return beans;
	}

	/**
	 * Metodo que copia data de una lista de {@link LocalidadTO} a
	 * {@link Localidad}.
	 * 
	 * @param tos
	 *           lista de {@link LocalidadTO}
	 * @return lista de {@link Localidad}
	 */
	public static List<Localidad> mapperLocalidades(final List<LocalidadTO> tos) {
		final List<Localidad> beans = new ArrayList<Localidad>();
		for (final LocalidadTO to : tos) {
			beans.add(new Localidad(to));
		}
		return beans;
	}

	/**
	 * Metodo que copia data de una lista de {@link ProductoTO} a
	 * {@link Producto}.
	 * 
	 * @param tos
	 *           lista de {@link ProductoTO}
	 * @return lista de {@link Producto}
	 */
	public static List<Producto> mapperProductos(final List<ProductoTO> tos) {
		final List<Producto> beans = new ArrayList<Producto>();
		for (final ProductoTO to : tos) {
			beans.add(new Producto(to));
		}
		return beans;
	}

	/**
	 * Metodo que copia data de una lista de {@link FamiliaProductoTO} a
	 * {@link FamiliaProducto}.
	 * 
	 * @param tos
	 *           lista de {@link FamiliaProductoTO}
	 * @return lista de {@link FamiliaProducto}
	 */
	public static List<FamiliaProducto> mapperFamiliaProductos(
			final List<FamiliaProductoTO> tos) {
		final List<FamiliaProducto> beans = new ArrayList<FamiliaProducto>();
		for (final FamiliaProductoTO to : tos) {
			beans.add(new FamiliaProducto(to));
		}
		return beans;
	}

	/**
	 * Metodo que copia data de una lista de {@link TipoServicioTO} a
	 * {@link TipoServicio}.
	 * 
	 * @param tos
	 *           lista de {@link FamiliaProductoTO}
	 * @return lista de {@link TipoServicioTO}
	 */
	public static List<TipoServicio> mapperTipoServicios(
			final List<TipoServicioTO> tos) {
		final List<TipoServicio> beans = new ArrayList<TipoServicio>();
		for (final TipoServicioTO to : tos) {
			beans.add(new TipoServicio(to));
		}
		return beans;
	}

	/**
	 * Metodo que copia data de una lista de {@link TraduccionTO} a
	 * {@link Traduccion}.
	 * 
	 * @param tos
	 *           lista de {@link TraduccionTO}
	 * @return lista de {@link Traduccion}
	 */
	public static List<Traduccion> mapperTraducciones(
			final List<TraduccionTO> tos) {
		final List<Traduccion> beans = new ArrayList<Traduccion>();
		for (final TraduccionTO to : tos) {
			beans.add(new Traduccion(to));
		}
		return beans;
	}

	/**
	 * Metodo que copia data de una lista de {@link PersonalizacionUsuarioTO} a
	 * {@link PersonalizacionUsuario}.
	 * 
	 * @param tos
	 *           lista de {@link PersonalizacionUsuarioTO}
	 * @return lista de {@link PersonalizacionUsuario}
	 */
	public static List<PersonalizacionUsuario> mapperPersonalizaciones(
			final List<PersonalizacionUsuarioTO> tos) {
		final List<PersonalizacionUsuario> beans = new ArrayList<PersonalizacionUsuario>();
		for (final PersonalizacionUsuarioTO to : tos) {
			beans.add(new PersonalizacionUsuario(to));
		}
		return beans;
	}

	/**
	 * Metodo que copia data de una lista de {@link TipoDocumentoClienteTO} a
	 * {@link TipoDocumentoCliente}.
	 * 
	 * @param tos
	 *           lista de {@link TipoDocumentoClienteTO}
	 * @return lista de {@link TipoDocumentoCliente}
	 */
	public static List<TipoDocumentoCliente> mapperTipoDocumentoCliente(
			final List<TipoDocumentoClienteTO> tos) {
		final List<TipoDocumentoCliente> beans = new ArrayList<TipoDocumentoCliente>();
		for (final TipoDocumentoClienteTO to : tos) {
			beans.add(new TipoDocumentoCliente(to));
		}
		return beans;
	}

	/**
	 * Metodo que copia data de una lista de {@link TipoFormaPagoClienteTO} a
	 * {@link TipoFormaPagoCliente}.
	 * 
	 * @param tos
	 *           lista de {@link TipoFormaPagoClienteTO}
	 * @return lista de {@link TipoFormaPagoCliente}
	 */
	public static List<TipoFormaPagoCliente> mapperTipoFormaPagoCliente(
			final List<TipoFormaPagoClienteTO> tos) {
		final List<TipoFormaPagoCliente> beans = new ArrayList<TipoFormaPagoCliente>();
		for (final TipoFormaPagoClienteTO to : tos) {
			beans.add(new TipoFormaPagoCliente(to));
		}
		return beans;
	}

	/**
	 * Metodo que copia data de una lista de {@link BancoTO} a {@link Banco}.
	 * 
	 * @param tos
	 *           lista de {@link BancoTO}
	 * @return lista de {@link Banco}
	 */
	public static List<Banco> mapperBancos(final List<BancoTO> tos) {
		final List<Banco> beans = new ArrayList<Banco>();
		for (final BancoTO to : tos) {
			beans.add(new Banco(to));
		}
		return beans;
	}

	/**
	 * Metodo que copia data de una lista de {@link DiaPagoTO} a {@link DiaPago}
	 * .
	 * 
	 * @param tos
	 *           lista de {@link DiaPagoTO}
	 * @return lista de {@link DiaPago}
	 */
	public static List<DiaPago> mapperDiasPago(final List<DiaPagoTO> tos) {
		final List<DiaPago> beans = new ArrayList<DiaPago>();
		for (final DiaPagoTO to : tos) {
			beans.add(new DiaPago(to));
		}
		return beans;
	}

	/**
	 * Metodo que copia data de una lista de {@link MonedaTO} a {@link Moneda}.
	 * 
	 * @param tos
	 *           lista de {@link MonedaTO}
	 * @return lista de {@link Moneda}
	 */
	public static List<Moneda> mapperMonedas(final List<MonedaTO> tos) {
		final List<Moneda> beans = new ArrayList<Moneda>();
		for (final MonedaTO to : tos) {
			beans.add(new Moneda(to));
		}
		return beans;
	}

	/**
	 * Metodo que copia data de una lista de {@link ConversionTO} a
	 * {@link Conversion}.
	 * 
	 * @param tos
	 *           lista de {@link ConversionTO}
	 * @return lista de {@link Conversion}
	 */
	public static List<Conversion> mapperConversion(final List<ConversionTO> tos) {
		final List<Conversion> beans = new ArrayList<Conversion>();

		for (final ConversionTO to : tos) {
			beans.add(new Conversion(to));
		}
		return beans;
	}

	/**
	 * Metodo que copia data de una lista de {@link TipoInfluenciaTO} a
	 * {@link TipoInfluencia}.
	 * 
	 * @param tos 
	 *            lista de {@link TipoInfluenciaTO}
	 * @return lista de {@link TipoInfluencia}
	 */
	public static List<TipoInfluencia> mapperTipoInfluencia(
			final List<TipoInfluenciaTO> tos) {
		final List<TipoInfluencia> beans = new ArrayList<TipoInfluencia>();

		for (final TipoInfluenciaTO to : tos) {
			beans.add(new TipoInfluencia(to));
		}
		return beans;
	}

	/**
	 * Metodo que copia data de una lista de {@link TipoNegocioTO} a
	 * {@link TipoNegocio}.
	 * 
	 * @param tos
	 *            lista de {@link TipoNegocioTO}
	 * @return lista de {@link TipoNegocio}
	 */
	public static List<TipoNegocio> mapperTipoNegocio(
			final List<TipoNegocioTO> tos) {
		final List<TipoNegocio> beans = new ArrayList<TipoNegocio>();

		for (final TipoNegocioTO to : tos) {
			beans.add(new TipoNegocio(to));
		}
		return beans;
	}

	/**
	 * Metodo que copia data de una lista de {@link SorterTO} a {@link Sorter}.
	 * 
	 * @param tos
	 *            lista de {@link SorterTO}
	 * @return lista de {@link Sorter}
	 */
	public static List<Sorter> mapperSorter(final List<SorterTO> tos) {
		final List<Sorter> beans = new ArrayList<Sorter>();

		for (final SorterTO to : tos) {
			beans.add(new Sorter(to));
		}
		return beans;
	}

	/**
	 * Metodo que copia data de una lista de {@link OficinaTO} a {@link Oficina}
	 * .
	 * 
	 * @param tos
	 *            lista de {@link OficinaTO}
	 * @return lista de {@link Oficina}
	 */
	public static List<Oficina> mapperOficinas(final List<OficinaTO> tos) {
		final List<Oficina> beans = new ArrayList<Oficina>();
		for (final OficinaTO to : tos) {
			beans.add(new Oficina(to));
		}
		return beans;
	}

	/**
	 * Metodo que copia data de una lista de {@link EmpresaTO} a {@link Empresa}
	 * .
	 * 
	 * @param tos
	 *            lista de {@link EmpresaTO}
	 * @return lista de {@link Empresa}
	 */
	public static List<Empresa> mapperEmpresas(final List<EmpresaTO> tos) {
		final List<Empresa> beans = new ArrayList<Empresa>();
		for (final EmpresaTO to : tos) {
			beans.add(new Empresa(to));
		}
		return beans;
	}

	/**
	 * Metodo que copia data de una lista de {@link PostaTO} a {@link Posta}.
	 * 
	 * @param postasTO
	 *            lista de {@link PostaTO}
	 * @return lista de {@link Posta}
	 */
	public static List<Posta> mapperPostas(final List<PostaTO> postasTO) {
		final List<Posta> postas = new ArrayList<Posta>();
		for (final PostaTO postaTO : postasTO) {
			postas.add(new Posta(postaTO));
		}
		return postas;
	}

	/**
	 * Metodo que copia data de una lista de {@link TraduccionEmpresaTO} a
	 * {@link TraduccionEmpresa}.
	 * 
	 * @param tos
	 *            lista de {@link TraduccionEmpresaTO}
	 * @return lista de {@link TraduccionEmpresa}
	 */
	public static List<TraduccionEmpresa> mapperTraduccionEmpresa(
			final List<TraduccionEmpresaTO> tos) {
		final List<TraduccionEmpresa> beans = new ArrayList<TraduccionEmpresa>();
		for (final TraduccionEmpresaTO to : tos) {
			beans.add(new TraduccionEmpresa(to));
		}
		return beans;
	}

	/**
	 * Metodo que copia data de una lista de {@link ProductoServicioTO} a
	 * {@link ProductoServicio}.
	 * 
	 * @param tos
	 *            lista de {@link ProductoServicioTO}
	 * @return lista de {@link ProductoServicio}
	 */
	public static List<ProductoServicio> mapperProductoServicio(
			final List<ProductoServicioTO> tos) {
		final List<ProductoServicio> beans = new ArrayList<ProductoServicio>();
		for (final ProductoServicioTO to : tos) {
			beans.add(new ProductoServicio(to));
		}
		return beans;
	}

	/**
	 * @param tos
	 * @return lista de {@link TraduccionProducto}
	 */
	public static List<TraduccionProducto> mapperTraduccionProducto(
			final List<TraduccionProductoTO> tos) {
		final List<TraduccionProducto> beans = new ArrayList<TraduccionProducto>();
		for(final TraduccionProductoTO to : tos) {
			beans.add(new TraduccionProducto(to));
		}
		return beans;
	}

	/**
	 * Mapea lista de parametro general.
	 * 
	 * @param tos
	 * @return lista de {@link ParametroGeneral}
	 */
	public static List<ParametroGeneral> mapperParametrosGenerales(
			final List<ParametroGeneralTO> tos) {
		final List<ParametroGeneral> beans = new ArrayList<ParametroGeneral>();
		for (final ParametroGeneralTO to : tos) {
			beans.add(new ParametroGeneral(to));
		}
		return beans;
	}

	
	/**
	 * Mapea lista de centros de costo.
	 * 
	 * @param tos
	 * @return lista de {@link CentroCosto}
	 */
	public static List<CentroCosto> mapperCentroCosto(
			final List<CentroCostoTO> tos) {
		final List<CentroCosto> beans = new ArrayList<CentroCosto>();
		for (final CentroCostoTO to : tos) {
			beans.add(new CentroCosto(to));
		}
		return beans;
	}

}
