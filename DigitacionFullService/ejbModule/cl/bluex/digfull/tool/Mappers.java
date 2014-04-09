package cl.bluex.digfull.tool;

import static cl.bluex.ws.common.util.Constantes.DOUBLE_CERO;
import static cl.bluex.ws.common.util.Constantes.LONG_CERO;

import java.util.ArrayList;
import java.util.List;

import cl.bluex.digfull.bean.EntradaObtieneTarifa;
import cl.bluex.digfull.bean.OrdenServicio;
import cl.bluex.digfull.bean.Referencia;
import cl.bluex.digfull.bean.ServicioComplementario;
import cl.bluex.digfull.bean.ServicioComplementarioDetalle;
import cl.bluex.digfull.bean.ServicioComplementarioPago;
import cl.bluex.digfull.bean.Tarifa;
import cl.bluex.digfull.bean.request.RequestInsertaWarehouse;
import cl.bluex.digmodel.to.EntradaObtieneTarifaTO;
import cl.bluex.digmodel.to.OrdenServicioTO;
import cl.bluex.digmodel.to.ReferenciaTO;
import cl.bluex.digmodel.to.ServicioComplementarioDetalleTO;
import cl.bluex.digmodel.to.ServicioComplementarioPagoTO;
import cl.bluex.digmodel.to.ServicioComplementarioTO;
import cl.bluex.digmodel.to.TarifaTO;
import cl.bluex.digmodel.to.WareHouseTO;

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
	 * Metodo mapea datos de bean a TO.
	 * 
	 * @param to
	 *            {@link OrdenServicio}
	 * @return {@link OrdenServicioTO}
	 */
	public static OrdenServicioTO mapperTo(final OrdenServicio bean) {
		final OrdenServicioTO valueTO = new OrdenServicioTO();
		valueTO.setEevvNmrId(bean.getEevvNmrId());
		valueTO.setCodigoTipoClaseTarifa(bean.getCodigoTipoClaseTarifa());
		valueTO.setTipoPago(bean.getTipoPago());
		valueTO.setTipoPagoOtros(bean.getTipoPagoOtros());
		valueTO.setTipoMedida(bean.getTipoMedida());
		valueTO.setIdAgente(bean.getIdAgente());
		valueTO.setDvAgente(bean.getDvAgente());
		valueTO.setRgnEstadoAgente(bean.getRgnEstadoAgente());
		valueTO.setDirComunaAgente(bean.getDirComunaAgente());
		valueTO.setDirCalleAgente(bean.getDirCalleAgente());
		valueTO.setDirNmrAgente(bean.getDirNmrAgente());
		valueTO.setDirBlockAgente(bean.getDirBlockAgente());
		valueTO.setDirDeptoAgente(bean.getDirDeptoAgente());
		valueTO.setDirPisoAgente(bean.getDirPisoAgente());
		valueTO.setDireccionAgente(bean.getDireccionAgente());
		valueTO.setCodigoPostalAgente(bean.getCodigoPostalAgente());
		valueTO.setPrfjFonoAgente(bean.getPrfjFonoAgente());
		valueTO.setFonoAgente(bean.getFonoAgente());
		valueTO.setExtFonoAgente(bean.getExtFonoAgente());
		valueTO.setIdEmbarque(bean.getIdEmbarque());
		valueTO.setDvEmbarque(bean.getDvEmbarque());
		valueTO.setNombreEmbarque(bean.getNombreEmbarque());
		valueTO.setDirRgnEstadoEmbarque(bean.getDirRgnEstadoEmbarque());
		valueTO.setDirCalleEmbarque(bean.getDirCalleEmbarque());
		valueTO.setDirComunaEmbarque(bean.getDirComunaEmbarque());
		valueTO.setDirNmrEmbarque(bean.getDirNmrEmbarque());
		valueTO.setDirBlockEmbarque(bean.getDirBlockEmbarque());
		valueTO.setDirPisoEmbarque(bean.getDirPisoEmbarque());
		valueTO.setDireccionEmbarque(bean.getDireccionEmbarque());
		valueTO.setCodigoPostalEmbarque(bean.getCodigoPostalEmbarque());
		valueTO.setPrfjFonoEmbarque(bean.getPrfjFonoEmbarque());
		valueTO.setFonoEmbarque(bean.getFonoEmbarque());
		valueTO.setExtfonoEmbarque(bean.getExtfonoEmbarque());
		valueTO.setIdDestino(bean.getIdDestino());
		valueTO.setDvDestino(bean.getDvDestino());
		valueTO.setDirRgnEstadoDestino(bean.getDirRgnEstadoDestino());
		valueTO.setDirComunaDestino(bean.getDirComunaDestino());
		valueTO.setDirCalleDestino(bean.getDirCalleDestino());
		valueTO.setDirNmrDestino(bean.getDirNmrDestino());
		valueTO.setDirBlockDestino(bean.getDirBlockDestino());
		valueTO.setDirDeptoDestino(bean.getDirDeptoDestino());
		valueTO.setDirPisoDestino(bean.getDirPisoDestino());
		valueTO.setDireccionDestino(bean.getDireccionDestino());
		valueTO.setCdgPostalDestino(bean.getCdgPostalDestino());
		valueTO.setPrfjFonoDestino(bean.getPrfjFonoDestino());
		valueTO.setFonoDestino(bean.getFonoDestino());
		valueTO.setExtFonoDestino(bean.getExtFonoDestino());
		valueTO.setValorDeclarado(bean.getValorDeclarado());
		valueTO.setValorSeguro(bean.getValorSeguro());
		valueTO.setValorAduana(bean.getValorAduana());
		valueTO.setValorFletepp(bean.getValorFletepp());
		valueTO.setValorFletecc(bean.getValorFletecc());
		valueTO.setValorValorapp(bean.getValorValorapp());
		valueTO.setValorValoracc(bean.getValorValoracc());
		valueTO.setValorGastoAgentepp(bean.getValorGastoAgentepp());
		valueTO.setValorGastoAgentecc(bean.getValorGastoAgentecc());
		valueTO.setValorGastoCarrierpp(bean.getValorGastoCarrierpp());
		valueTO.setValorGastoCarriercc(bean.getValorGastoCarriercc());
		valueTO.setValorImptopp(bean.getValorImptopp());
		valueTO.setValorImptocc(bean.getValorImptocc());
		valueTO.setValorVariospp(bean.getValorVariospp());
		valueTO.setValorVarioscc(bean.getValorVarioscc());
		valueTO.setCntPiezas(bean.getCntPiezas());
		valueTO.setPesoFisico(bean.getPesoFisico());
		valueTO.setPesoVolumen(bean.getPesoVolumen());
		valueTO.setTarifa(bean.getTarifa());
		valueTO.setDescripcionProducto(bean.getDescripcionProducto());
		valueTO.setCodigoMoneda(bean.getCodigoMoneda());
		valueTO.setCodigoEmpresa(bean.getCodigoEmpresa());
		valueTO.setCodigoEmpresaLaer(bean.getCodigoEmpresaLaer());
		valueTO.setCodigoPostaDestino(bean.getCodigoPostaDestino());
		valueTO.setCodigoTipoNegDestino(bean.getCodigoTipoNegDestino());
		valueTO.setCodigoPostaOrigen(bean.getCodigoPostaOrigen());
		valueTO.setCodigoTipoNegOrigen(bean.getCodigoTipoNegOrigen());
		valueTO.setCodigoServicio(bean.getCodigoServicio());
		valueTO.setCodigoUsuario(bean.getCodigoUsuario());
		valueTO.setCodigoFamilia(bean.getCodigoFamilia());
		valueTO.setCodigoProducto(bean.getCodigoProducto());
		valueTO.setDoctEevvNmrId(bean.getDoctEevvNmrId());
		valueTO.setTpclCodigoAgente(bean.getTpclCodigoAgente());
		valueTO.setClhlCodigoAgente(bean.getClhlCodigoAgente());
		valueTO.setClhlSucursalAgente(bean.getClhlSucursalAgente());
		valueTO.setTpclCodigoEmbarque(bean.getTpclCodigoEmbarque());
		valueTO.setClhlCodigoEmbarque(bean.getClhlCodigoEmbarque());
		valueTO.setClhlSucursalEmbarque(bean.getClhlSucursalEmbarque());
		valueTO.setTpclCodigoDestino(bean.getTpclCodigoDestino());
		valueTO.setClhlCodigoDestino(bean.getClhlCodigoDestino());
		valueTO.setClhlSucursalDestino(bean.getClhlSucursalDestino());
		valueTO.setNombreDestino(bean.getNombreDestino());
		valueTO.setCodigoOser(bean.getCodigoOser());
		valueTO.setCodigoEstado(bean.getCodigoEstado());
		valueTO.setCodigoOficinaDestino(bean.getCodigoOficinaDestino());
		valueTO.setObservacion(bean.getObservacion());
		valueTO.setTipoLlave(bean.getTipoLlave());
		valueTO.setLlaveTarifa(bean.getLlaveTarifa());
		valueTO.setCodigoCentroCosto(bean.getCodigoCentroCosto());
		valueTO.setFlagFactura(bean.getFlagFactura());
		valueTO.setProducto(bean.getProducto());
		valueTO.setCustomDuties(bean.getCustomDuties());
		valueTO.setCrrnSeqCodigo(bean.getCrrnSeqCodigo());
		valueTO.setNumeroWhr(bean.getNumeroWhr());
		valueTO.setLargo(bean.getLargo());
		valueTO.setAncho(bean.getAncho());
		valueTO.setAlto(bean.getAlto());
		valueTO.setWhrVolumen(bean.getWhrVolumen());
		valueTO.setWhrCntPiezas(bean.getWhrCntPiezas());
		valueTO.setFechaCreacion(bean.getFechaCreacion());

		return valueTO;
	}

	/**
	 * Metodo mapea datos de bean a TO.
	 * 
	 * @param {@link Referencia referencia}
	 * @return {@link ReferenciaTO}
	 */
	public static ReferenciaTO mapperTO(final Referencia referencia) {
		final ReferenciaTO to = new ReferenciaTO();
		to.setEevvNmrid(referencia.getEevvNmrid());
		to.setCodigoTipoReferencia(referencia.getCodigoTipoReferencia());
		return to;
	}

	/**
	 * Metodo mapea datos desde bean {@link ServicioComplementario} a TO
	 * {@link ServicioComplementarioTO}.
	 * 
	 * @param {@link ServicioComplementario value}
	 * @return {@link ServicioComplementarioTO}
	 */
	public static ServicioComplementarioTO mapperTo(
			final ServicioComplementario value) {
		final ServicioComplementarioTO to = new ServicioComplementarioTO();
		to.setCodigoServicio(value.getCodigoServicio());
		to.setEevvNmrid(value.getEevvNmrid());
		to.setNroReserva(value.getNroReserva());
		to.setRendida(value.getRendida());
		to.setSwBasico(value.getSwBasico());

		return to;
	}

	/**
	 * Metodo mapea datos desde bean {@link ServicioComplementarioDetalle} a TO
	 * {@link ServicioComplementarioDetalleTO}.
	 * 
	 * @param {@link ServicioComplementarioDetalle value}
	 * @return {@link ServicioComplementarioDetalleTO}
	 */
	public static ServicioComplementarioDetalleTO mapperTo(
			final ServicioComplementarioDetalle value) {
		final ServicioComplementarioDetalleTO to = new ServicioComplementarioDetalleTO();
		to.setEevvNmrid(value.getEevvNmrid());
		to.setCodigoServicio(value.getCodigoServicio());
		to.setCodigoEmpresa(value.getCodigoEmpresa());
		to.setIdDocumento(value.getIdDocumento());
		to.setTipoDocumentoServicio(value.getTipoDocumentoServicio());

		return to;
	}

	/**
	 * @param {@link ServicioComplementarioPago value}
	 * @return {@link ServicioComplementarioPagoTO}
	 */
	public static ServicioComplementarioPagoTO mapperTo(
			final ServicioComplementarioPago value) {
		final ServicioComplementarioPagoTO to = new ServicioComplementarioPagoTO();
		to.setEevvNmrId(value.getEevvNmrId());
		to.setCodigoServicio(value.getCodigoServicio());
		to.setNumeroLinea(value.getNumeroLinea());
		to.setIdDocumento(value.getIdDocumento());
		to.setTipoPago(value.getTipoPago());
		to.setTipoDocumentoServicio(value.getTipoDocumentoServicio());
		to.setMonto(value.getMonto());
		to.setSerieDocumento(value.getSerieDocumento());
		to.setBanco(value.getBanco());
		to.setFechaPago(value.getFechaPago());
		to.setIdDiasPago(value.getIdDiasPago());
		
		return to;
	}

	/**
	 * @param {@link EntradaObtieneTarifa value}
	 * @return {@link EntradaObtieneTarifaTO}
	 */
	public static EntradaObtieneTarifaTO mapperTo(
			final EntradaObtieneTarifa value) {
		final EntradaObtieneTarifaTO to = new EntradaObtieneTarifaTO();
		to.setCodigoEmpresa(value.getCodigoEmpresa());
		to.setCodigoServicio(value.getCodigoServicio());
		to.setCodigoProducto(value.getCodigoProducto());
		to.setCodigoFamilia(value.getCodigoFamilia());
		to.setCodigoCliente(value.getCodigoCliente());
		to.setCodigoSucursalCliente(value.getCodigoSucursalCliente());
		to.setCodigoTipoCliente(value.getCodigoTipoCliente());
		to.setCodigoPostaOrigen(value.getCodigoPostaOrigen());
		to.setCodigoPostaDestino(value.getCodigoPostaDestino());
		to.setCodigoMoneda(value.getCodigoMoneda());
		to.setPesovolumen(value.getPesovolumen());
		to.setPesofisico(value.getPesofisico());
		to.setFecha(value.getFecha());
		to.setCantidadPiezas(value.getCantidadPiezas());
		to.setValorApendice(value.getValorApendice());
		return to;
	}

	/**
	 * @param {@link TarifaTO to}
	 * @return {@link Tarifa}
	 */
	public static Tarifa mapperTo(final TarifaTO to) {
		final Tarifa bean = new Tarifa();

		final Double flete = to.getFlete();
		final Double tarifa = to.getTarifa();
		final Long cargoPorcentual = to.getCargoPorcentual();
		final Long cargoFijo = to.getCargoFijo();
		final Long numeroAcuerdo = to.getNumeroAcuerdo();

		bean.setTarifa(tarifa != null ? tarifa : DOUBLE_CERO);
		bean.setFlete(flete != null ? flete : DOUBLE_CERO);
		bean.setCodigoMetodoCalculo(to.getCodigoMetodoCalculo());
		bean.setUnidadBase(to.getUnidadBase());
		bean.setIndicadorUsaRi(to.getIndicadorUsaRi());
		bean.setIndicadorUnidades(to.getIndicadorUnidades());
		bean.setCargoPorcentual(cargoPorcentual != null ? cargoPorcentual
				: LONG_CERO);
		bean.setCargoFijo(cargoFijo != null ? cargoFijo : LONG_CERO);
		bean.setNumeroAcuerdo(numeroAcuerdo != null ? numeroAcuerdo : LONG_CERO);
		bean.setUsaPuntoEntrega(to.getUsaPuntoEntrega());
		bean.setSwActivacion(to.getSwActivacion());
		bean.setImpuesto(to.getImpuesto());

		return bean;
	}

	/**
	 * @param lista
	 *            de {@link ServicioComplementarioTO serviciosTO}
	 * @return lista de {@link ServicioComplementario}
	 */
	public static List<ServicioComplementario> mapperToSC(
			final List<ServicioComplementarioTO> serviciosTO) {

		final List<ServicioComplementario> servicios = new ArrayList<ServicioComplementario>();
		for (final ServicioComplementarioTO to : serviciosTO) {
			servicios.add(new ServicioComplementario(to));
		}
		return servicios;
	}

	/**
	 * @param detallesTO
	 * @return
	 */
	public static List<ServicioComplementarioDetalle> mapperToDetalles(
			final List<ServicioComplementarioDetalleTO> detallesTO) {

		final List<ServicioComplementarioDetalle> detalles = new ArrayList<ServicioComplementarioDetalle>();
		for (final ServicioComplementarioDetalleTO to : detallesTO) {
			detalles.add(new ServicioComplementarioDetalle(to));
		}
		return detalles;
	}

	/**
	 * @param pagosTO
	 * @return
	 */
	public static List<ServicioComplementarioPago> mapperToPagos(
			final List<ServicioComplementarioPagoTO> pagosTO) {
		final List<ServicioComplementarioPago> pagos = new ArrayList<ServicioComplementarioPago>();
		for (final ServicioComplementarioPagoTO to : pagosTO) {
			pagos.add(new ServicioComplementarioPago(to));
		}
		return pagos;
	}

	/**
	 * @param referenciasTO
	 * @return
	 */
	public static List<Referencia> mapperToReferencias(
			final List<ReferenciaTO> referenciasTO) {
		final List<Referencia> referencias = new ArrayList<Referencia>();
		for (final ReferenciaTO to : referenciasTO) {
			referencias.add(new Referencia(to));
		}
		return referencias;
	}

	/**
	 * @param request
	 * @return
	 */
	public static WareHouseTO mapperTo(final RequestInsertaWarehouse request) {
		final WareHouseTO to = new WareHouseTO();

		to.setEevvNmrid(request.getEevvNmrid());
		to.setNombreEmbarque(request.getNombreEmbarque());
		to.setNombreDestino(request.getNombreDestino());
		to.setTipoMedida(request.getTipoMedida());
		to.setCntPiezas(request.getCntPiezas());
		to.setPesoFisico(request.getPesoFisico());
		to.setPesoVolumen(request.getPesoVolumen());
		to.setTpclCodigoEmbarque(request.getTpclCodigoEmbarque());
		to.setClhlCodigoEmbarque(request.getClhlCodigoEmbarque());
		to.setClhlSucursalEmbarque(request.getClhlSucursalEmbarque());
		to.setCodigoEmpresa(request.getCodigoEmpresa());
		to.setCodigoEmpresaLaer(request.getCodigoEmpresaLaer());
		to.setCodigoFamilia(request.getCodigoFamilia());
		to.setCodigoProducto(request.getCodigoProducto());
		to.setCodigoServicio(request.getCodigoServicio());
		to.setDvEmbarque(request.getDvEmbarque());
		to.setIdEmbarque(request.getIdEmbarque());
		to.setObservaciones(request.getObservaciones());
		to.setLargo(request.getLargo());
		to.setAncho(request.getAncho());
		to.setAlto(request.getAlto());
		to.setCodigoTipoWarehouse(request.getCodigoTipoWarehouse());
		to.setCodigoUsuario(request.getCodigoUsuario());
		
		return to;
	}

}
