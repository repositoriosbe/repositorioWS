package cl.bluex.digexpress.tool;

import cl.bluex.digexpress.bean.Agrupacion;
import cl.bluex.digexpress.bean.CabeceraAgrupacion;
import cl.bluex.digexpress.bean.DetalleDigitacionExpress;
import cl.bluex.digmodel.to.AgrupacionTO;
import cl.bluex.digmodel.to.CabeceraAgrupacionTO;
import cl.bluex.digmodel.to.DetalleDigitacionExpressTO;

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
	 * Metodo mapea datos de TO a bean.
	 * 
	 * @param valueTO
	 *            {@link AgrupacionTO}
	 * @return {@link Agrupacion}
	 */
	public static Agrupacion mapperTO(final AgrupacionTO valueTO) {
		final Agrupacion value = new Agrupacion();
		value.setCodigoAgrupacion(valueTO.getCodigoAgrupacion());
		value.setCodigoEstado(valueTO.getCodigoEstado());
		value.setIdCabeceraAgrupacion(valueTO.getIdCabeceraAgrupacion());

		return value;
	}

	/**
	 * Metodo de mapeo para CabeceraAgrupacion a CabeceraAgrupacionTO.
	 * 
	 * @param cabeceraAgrupacion
	 *            objeto de origen
	 * @return objeto destino
	 */
	public static CabeceraAgrupacionTO mapperTo(final CabeceraAgrupacion bean) {
		final CabeceraAgrupacionTO to = new CabeceraAgrupacionTO();
		to.setCantidadDctosEstimados(bean.getCantidadDctosEstimados());
		to.setCantidadDoctosDigitados(bean.getCantidadDoctosDigitados());
		to.setCodigoAgrupacion(bean.getCodigoAgrupacion());
		to.setCodigoEmpresa(bean.getCodigoEmpresa());
		to.setCodigoEstado(bean.getCodigoEstado());
		to.setCodigoPosta(bean.getCodigoPosta());
		to.setCodigoRuta(bean.getCodigoRuta());
		to.setCodigoSorter(bean.getCodigoSorter());
		to.setCodigoUsuario(bean.getCodigoUsuario());
		to.setCourier(bean.getCourier());
		to.setDescripcion(bean.getDescripcion());
		to.setDescripcionEstado(bean.getDescripcionEstado());
		to.setDescripcionSorter(bean.getDescripcionSorter());
		to.setDigitacionOrigen(bean.getDigitacionOrigen());
		to.setFolioHojaRuta(bean.getFolioHojaRuta());
		to.setId(bean.getId());
		to.setMostrarMonitor(bean.getMostrarMonitor());
		to.setTipoBulto(bean.getTipoBulto());
		to.setVoucher(bean.getVoucher());
		
		return to;
	}

	/**
	 * @param value
	 * @return
	 */
	public static DetalleDigitacionExpressTO mapperTO(
			final DetalleDigitacionExpress value) {
		final DetalleDigitacionExpressTO to = new DetalleDigitacionExpressTO();
		
		to.setId(value.getId());
		to.setEevvNmrId(value.getEevvNmrId());
		to.setCantidadPiezas(value.getCantidadPiezas());
		to.setCodigoProducto(value.getCodigoProducto());
		to.setCodigoTipoServicio(value.getCodigoTipoServicio());
		to.setCodigoMnpl(value.getCodigoMnpl());
		to.setCodigoTipoDocumento(value.getCodigoTipoDocumento());
		to.setCodigoPais(value.getCodigoPais());
		to.setCodigoPsta(value.getCodigoPsta());
		to.setCodigoComuna(value.getCodigoComuna());
		to.setCodigoFamiliaProducto(value.getCodigoFamiliaProducto());
		to.setCodigoCliente(value.getCodigoCliente());
		to.setCodigoSucursalCliente(value.getCodigoSucursalCliente());
		to.setCodigoTipoCliente(value.getCodigoTipoCliente());
		to.setCodigoUsuario(value.getCodigoUsuario());
		
		return to;
	}

}
