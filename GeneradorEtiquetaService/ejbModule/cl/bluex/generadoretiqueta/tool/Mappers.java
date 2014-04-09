package cl.bluex.generadoretiqueta.tool;

import java.util.ArrayList;
import java.util.List;

import cl.bluex.generadoretiqueta.bean.DatosImpresion;
import cl.bluex.generadoretiqueta.bean.DatosOperacionales;
import cl.bluex.generadoretiqueta.bean.DatosRespuesta;
import cl.bluex.generadoretiqueta.bean.Destino;
import cl.bluex.generadoretiqueta.bean.EntradaDatosOperacionales;
import cl.bluex.generadoretiqueta.bean.Etiqueta;
import cl.bluex.generadoretiqueta.bean.Guia;
import cl.bluex.generadoretiqueta.bean.OrdenServicio;
import cl.bluex.generadoretiqueta.bean.ParamOrdenServicio;
import cl.bluex.generadoretiqueta.bean.ParametroDestino;
import cl.bluex.generadoretiqueta.bean.ParametrosCodigoBulto;
import cl.bluex.generadoretiqueta.bean.ParametrosGuia;
import cl.bluex.generadoretiqueta.bean.ParametrosGuiaPieza;
import cl.bluex.generadoretiqueta.bean.ParametrosReferencia;
import cl.bluex.generadoretiqueta.bean.PiezaMovimiento;
import cl.bluex.generadoretiqueta.bean.request.RequestGeneraEtiquetaDigExpress;
import cl.bluex.generadoretiqueta.to.DatosImpresionTO;
import cl.bluex.generadoretiqueta.to.DatosOperacionalesTO;
import cl.bluex.generadoretiqueta.to.DatosRespuestaTO;
import cl.bluex.generadoretiqueta.to.DestinoTO;
import cl.bluex.generadoretiqueta.to.EntradaDatosOperacionalesTO;
import cl.bluex.generadoretiqueta.to.EtiquetaTO;
import cl.bluex.generadoretiqueta.to.GuiaTO;
import cl.bluex.generadoretiqueta.to.OrdenServicioTO;
import cl.bluex.generadoretiqueta.to.ParamOrdenServicioTO;
import cl.bluex.generadoretiqueta.to.ParametroDestinoTO;
import cl.bluex.generadoretiqueta.to.ParametrosCodigoBultoTO;
import cl.bluex.generadoretiqueta.to.ParametrosGuiaPiezaTO;
import cl.bluex.generadoretiqueta.to.ParametrosGuiaTO;
import cl.bluex.generadoretiqueta.to.ParametrosReferenciaTO;
import cl.bluex.generadoretiqueta.to.PiezaMovimientoTO;

// TODO: Auto-generated Javadoc
/**
 * Mapeos de objetos.
 * 
 * @author Edgardo Herrera
 * 
 */
public final class Mappers {

	/**
	 * Instantiates a new mappers.
	 */
	private Mappers() {
		super();
	}

	/**
	 * Mapea datos desde {@link DestinoTO} a {@link Destino}.
	 *
	 * @param to the to
	 * @return {@link Destino}
	 */
	public static Destino mapperTo(final DestinoTO to) {
		final Destino bean = new Destino();

		bean.setCodigoComuna(to.getCodigoComuna());
		bean.setCodigoSubZona(to.getCodigoSubZona());
		bean.setCodigoZona(to.getCodigoZona());
		bean.setNombreComuna(to.getNombreComuna());

		return bean;
	}

	/**
	 * Mapea datos desde {@link DatosImpresion} a {@link DatosImpresionTO}.
	 *
	 * @param bean the bean
	 * @return {@link DatosImpresionTO}
	 */
	public static DatosImpresionTO mapperTo(final DatosImpresion bean) {
		final DatosImpresionTO to = new DatosImpresionTO();
		to.setCodigoBarra(bean.getCodigoBarra());
		to.setTipoEtiqueta(bean.getTipoEtiqueta());
		to.setEmpresa(bean.getEmpresa());
		to.setInicialTipoEtiqueta(bean.getInicialTipoEtiqueta());
		to.setFecha(bean.getFecha());
		to.setCodigoPosta(bean.getCodigoPosta());
		to.setNombrePosta(bean.getNombrePosta());
		to.setCodigoImpresora(bean.getCodigoImpresora());
		to.setCantidad(bean.getCantidad());
		to.setCodigoUsuario(bean.getCodigoUsuario());
		to.setCodigoFormatoImpresion(bean.getCodigoFormatoImpresion());
		to.setZona(bean.getZona());
		to.setComunaine(bean.getComunaine());

		return to;
	}

	/**
	 * Mapea datos desde {@link EtiquetaTO} a {@link Etiqueta}.
	 *
	 * @param to the to
	 * @return {@link Etiqueta}
	 */
	public static Etiqueta mapperTo(final EtiquetaTO to) {
		final Etiqueta bean = new Etiqueta();

		bean.setContenidoEtiqueta(to.getContenidoEtiqueta());

		return bean;
	}

	/**
	 * Mapper to.
	 *
	 * @param bean the bean
	 * @return the datos impresion to
	 */
	public static DatosImpresionTO mapperTo(
			final RequestGeneraEtiquetaDigExpress bean) {
		final DatosImpresionTO to = new DatosImpresionTO();
		
		to.setEmpresa(bean.getEmpresa());
		to.setCourier(bean.getCourier());
		to.setCantidad(bean.getCantidad());
		to.setFecha(bean.getFecha());
		to.setCodigoBarra(bean.getCodigoBarra());
		to.setBulto(bean.getBulto());
		to.setDescripcion(bean.getDescripcion());
		to.setCodigoUsuario(bean.getCodigoUsuario());
		to.setCodigoImpresora(bean.getCodigoImpresora());
		to.setCodigoFormatoImpresion(bean.getCodigoFormatoImpresion());
		to.setCodBodega(bean.getCodBodega());
		to.setRuta(bean.getRuta());
		to.setVoucher(bean.getVoucher());
		to.setUsuario(bean.getUsuario());
		

		return to;
	}

	/**
	 * Mapper guias.
	 *
	 * @param tos the tos
	 * @return the list
	 */
	public static List<Guia> mapperGuias(
			final List<GuiaTO> tos) {
		final List<Guia> beans = new ArrayList<Guia>();
		for (final GuiaTO to : tos) {
			beans.add(new Guia(to));
		}
		return beans;
	}

	/**
	 * Mapper de ParametrosReferencia a ParametrosReferenciaTO.
	 *
	 * @param bean the bean
	 * @return {@link ParametrosReferenciaTO}
	 */
	public static ParametrosReferenciaTO mapperParametrosReferencia(
			final ParametrosReferencia bean) {
		final ParametrosReferenciaTO to = new ParametrosReferenciaTO();
		to.setCodigoCliente(bean.getCodigoCliente());
		to.setCodigoEmpresa(bean.getCodigoEmpresa());
		to.setCodigoSucursalCliente(bean.getCodigoSucursalCliente());
		to.setCodigoTipoCliente(bean.getCodigoTipoCliente());
		to.setNumeroReferencia(bean.getNumeroReferencia());
		
		return to;
	}

	/**
	 * Mapeo de ParametrosGuia a ParametrosGuiaTO.
	 *
	 * @param bean the bean
	 * @return {@link ParametrosGuiaTO}
	 */
	public static ParametrosGuiaTO mapperParametrosGuia(
			final ParametrosGuia bean) {
		final ParametrosGuiaTO to = new ParametrosGuiaTO();
		to.setCodigoEmpresa(bean.getCodigoEmpresa());
		to.setNroBulto(bean.getNroBulto());
		to.setNumeroFolio(bean.getNumeroFolio());
		to.setTipoDocumento(bean.getTipoDocumento());
		
		return to;
	}

	/**
	 * Mapeo de ParametrosGuiaPieza a ParametrosGuiaPiezaTO.
	 *
	 * @param bean the bean
	 * @return {@link ParametrosGuiaPiezaTO}
	 */
	public static ParametrosGuiaPiezaTO mapperParametrosGuiaPieza(
			final ParametrosGuiaPieza bean) {
		final ParametrosGuiaPiezaTO to = new ParametrosGuiaPiezaTO();
		to.setCodigoEmpresaTrad(bean.getCodigoEmpresaTrad());
		to.setNroBulto(bean.getNroBulto());
		to.setNumeroFolio(bean.getNumeroFolio());
		to.setTipoDocumento(bean.getTipoDocumento());
		
		return to;
	}

	/**
	 * Mapeo de ParametroDestino a ParametroDestinoTO.
	 *
	 * @param bean the bean
	 * @return {@link ParametroDestinoTO}
	 */
	public static ParametroDestinoTO mapperTo(final ParametroDestino bean) {
		final ParametroDestinoTO to = new ParametroDestinoTO();
		to.setCodigoEmpresaTrad(bean.getCodigoEmpresaTrad());
		to.setCodigoInfluencia(bean.getCodigoInfluencia());
		to.setCodigoPosta(bean.getCodigoPosta());
		to.setCodigoTipoServicio(bean.getCodigoTipoServicio());
		to.setCodigoTipoNegocio(bean.getCodigoTipoNegocio());
		
		return to;
	}

	/**
	 * mapeo de ParamOrdenServicio a ParamOrdenServicioTO.
	 *
	 * @param bean the bean
	 * @return {@link ParamOrdenServicioTO}
	 */
	public static ParamOrdenServicioTO mapperParametrosOser(
			final ParamOrdenServicio bean) {
		final ParamOrdenServicioTO to = new ParamOrdenServicioTO();
		to.setNumeroSerieOser(bean.getNumeroSerieOser());
		to.setIdTipoDocumento(bean.getIdTipoDocumento());
		to.setCodigoEmpresa(bean.getCodigoEmpresa());
		
		return to;
	}

	/**
	 * mapea lista de OrdenServicioTO a lista de OrdenServicio.
	 *
	 * @param tos the tos
	 * @return lista de {@link OrdenServicio}
	 */
	public static List<OrdenServicio> mapperOsers(final List<OrdenServicioTO> tos) {
		final List<OrdenServicio> beans = new ArrayList<OrdenServicio>();
		for (final OrdenServicioTO to : tos) {
			beans.add(new OrdenServicio(to));
		}
		return beans;
	}
	
	
	/**
	 * mapeo de EntradaDatosOperacionales a EntradaDatosOperacionalesTO.
	 *
	 * @param bean the bean
	 * @return {@link EntradaDatosOperacionalesTO}
	 */
	public static EntradaDatosOperacionalesTO mapperParametrosDatosOperacionales(
			final EntradaDatosOperacionales bean) {
		final EntradaDatosOperacionalesTO to = new EntradaDatosOperacionalesTO();
		to.setNombreUsuario(bean.getNombreUsuario());
		to.setCodigoBodega(bean.getCodigoBodega());
		to.setCodigoOficina(bean.getCodigoOficina());
		to.setTipoBodega(bean.getTipoBodega());
		return to;
	}
	

	/**
	 * Mapper datos operacionales.
	 *
	 * @param to the to
	 * @return the datos operacionales
	 */
	public static DatosOperacionales mapperDatosOperacionales(final DatosOperacionalesTO to) {
		
		final DatosOperacionales bean = new DatosOperacionales();
		bean.setBodega(to.getBodega());
		bean.setCourier(to.getCourier());
		bean.setOficina(to.getOficina());
		bean.setTipoBodega(to.getTipoBodega());
		bean.setCodigoCurrier(to.getCodigoCurrier());
		return bean;
		
	}
	
	
	/**
	 * Mapea parametros de entrada.
	 *
	 * @param bean the bean
	 * @return {@link ParametrosCodigoBultoTO}
	 */
	public static ParametrosCodigoBultoTO mapperParametrosCodigoBulto(
			final ParametrosCodigoBulto bean) {
		final ParametrosCodigoBultoTO to = new ParametrosCodigoBultoTO();
		to.setCodigoEmpresa(bean.getCodigoEmpresa());
		to.setIdTipoDocumento(bean.getIdTipoDocumento());
		to.setNumeroSerieOser(bean.getNumeroSerieOser());
		
		return to;
	}
	
	
	
	/**
	 * mapeo de PiezaMovimiento a PiezaMovimientoTO.
	 *
	 * @param bean the bean
	 * @return {@link PiezaMovimientoTO}
	 */
	public static PiezaMovimientoTO mapperInsertaPiezaMovimiento(
			final PiezaMovimiento bean) {
		final PiezaMovimientoTO to = new PiezaMovimientoTO();
		
		to.setCodigoEmpresa(bean.getCodigoEmpresa());
		to.setCodigoTipoDocumento(bean.getCodigoTipoDocumento());
		to.setCodigoPieza(bean.getCodigoPieza());
		to.setObservacion(bean.getObservacion());
		to.setCodigoTipoEstado(bean.getCodigoTipoEstado());
		to.setCodigoTipoEvento(bean.getCodigoTipoEvento());
		to.setCodigoBodegaEntrada(bean.getCodigoBodegaEntrada());
		to.setTipoCodigoBodegaEntrada(bean.getTipoCodigoBodegaEntrada());
		to.setCodigoOficinaEntrada(bean.getCodigoOficinaEntrada());
		to.setCodigoPersona(bean.getCodigoPersona());
		to.setFechaMovimiento(bean.getFechaMovimiento());
		to.setCantidadPiezas(bean.getCantidadPiezas());
		to.setPesoFisico(bean.getPesoFisico());
		to.setCodigoPosta(bean.getCodigoPosta());
		to.setCodigoTipoNegocio(bean.getCodigoTipoNegocio());
		to.setCodigoTipoEstado(bean.getCodigoTipoEstado());
		to.setCodigoTipoServicio(bean.getCodigoTipoServicio());
		to.setCodigoTipoServicioPadre(bean.getCodigoTipoServicioPadre());
		to.setFoto(bean.getFoto());
		to.setResponsable(bean.getResponsable());
		to.setRuta(bean.getRuta());
		
		return to;
	}
	
	

	/**
	 * mapea DatosRespuestaTO a DatosRespuesta.
	 *
	 * @param to the to
	 * @return lista de {@link DatosRespuesta}
	 */
	public static DatosRespuesta mapperDatosRespuesta(final DatosRespuestaTO to) {
		
		final DatosRespuesta bean = new DatosRespuesta();
		bean.setMensaje(to.getMensaje());
		bean.setCodigo(to.getCodigo());
		
		return bean;
		
	}
	
	

}
