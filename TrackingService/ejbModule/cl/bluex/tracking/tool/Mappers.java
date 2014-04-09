package cl.bluex.tracking.tool;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import cl.bluex.trackingmodel.to.ParametrosTrackingReferenciaTO;
import cl.bluex.trackingmodel.to.TrackingReferenciaTO;
import cl.bluex.tracking.bean.ParametrosTrackingReferencia;
import cl.bluex.tracking.bean.TrackingReferencia;


/**
 * Mapeos de objetos.
 * 
 * @author Edgardo Herrera
 * 
 */
public final class Mappers {
	
	private static final Logger LOGGER = Logger.getLogger(Mappers.class);

	private Mappers() {
		super();
	}

	
	/**
	 * Mapea de {@link ParametrosTrackingReferencia} a {@link ParametrosTrackingReferenciaTO}.
	 * 
	 * @param bean {@link ParametrosTrackingReferencia}
	 * @return {@link ParametrosTrackingReferenciaTO}
	 */
	public static ParametrosTrackingReferenciaTO mapeaTO(
			final ParametrosTrackingReferencia bean) {
		final ParametrosTrackingReferenciaTO to = new ParametrosTrackingReferenciaTO();
		
		 to.setCodigoEmpresa(bean.getCodigoEmpresa());
		 to.setCodigoCliente(bean.getCodigoCliente());
		 to.setCodigoSucursal(bean.getCodigoSucursal());
		 to.setCodigoTipoCliente(bean.getCodigoTipoCliente());
		 to.setFechaInicio(bean.getFechaInicio());
		 to.setFechaFin(bean.getFechaFin());
		 to.setCodigoReferencia(bean.getCodigoReferencia());
		 
		 LOGGER.info("codigoEmpresa: " + to.getCodigoEmpresa());
		 LOGGER.info("codigoCliente: " + to.getCodigoCliente());
		 LOGGER.info("codigoSucursal: " + to.getCodigoSucursal());
		 LOGGER.info("codigoTipoCliente: " + to.getCodigoTipoCliente());
		 LOGGER.info("fechaInicio: " + to.getFechaInicio());
		 LOGGER.info("fechaFin: " + to.getFechaFin());
		 LOGGER.info("codigoReferencia: " + to.getCodigoReferencia());
		 
		 return to;
	}

	/**
	 * Metodo que mapea una lista de {@link TrackingReferenciaTO} a una de {@link TrackingReferencia}.
	 * 
	 * @param tos lista de {@link TrackingReferenciaTO}
	 * @return lista de {@link TrackingReferencia}
	 */
	public static List<TrackingReferencia> mapeaTrackings(
			final List<TrackingReferenciaTO> tos) {
		final List<TrackingReferencia> beans = new ArrayList<TrackingReferencia>();
		LOGGER.info("largo: " + tos.size());
		for (final TrackingReferenciaTO to : tos) {
			LOGGER.info("fechaCreacion: " + to.getFechaCreacion());
			LOGGER.info("numeroGuia: " + to.getNumeroGuia());
			LOGGER.info("codPostaOrigen: " + to.getCodPostaOrigen());
			LOGGER.info("descPostaOrigen: " + to.getDescPostaOrigen());
			LOGGER.info("codPostaDestino: " + to.getCodPostaDestino());
			LOGGER.info("descPostaDestino: " + to.getDescPostaDestino());
			LOGGER.info("codigoProducto: " + to.getCodigoProducto());
			LOGGER.info("nombreProducto: " + to.getNombreProducto());
			LOGGER.info("codigoTipoServicio: " + to.getCodigoTipoServicio());
			LOGGER.info("descTipoServicio: " + to.getDescTipoServicio());
			LOGGER.info("codigoReferencia: " + to.getCodigoReferencia());
			LOGGER.info("codigoPiezas: " + to.getCodigoPiezas());
			LOGGER.info("fechaMovimientoPiezas: " + to.getFechaMovimientoPiezas());
			LOGGER.info("codigoCargaTipoExcep: " + to.getCodigoCargaTipoExcep());
			LOGGER.info("descCargaTipoExcep: " + to.getDescCargaTipoExcep());
			LOGGER.info("codigoCargaTipoEvento: " + to.getCodigoCargaTipoEvento());
			LOGGER.info("descCargaTipoEvento: " + to.getDescCargaTipoEvento());
			LOGGER.info("codigoCargaPersonalizacion: " + to.getCodigoCargaPersonalizacion());
			LOGGER.info("cantidadPiezasMovimiento: " + to.getCantidadPiezasMovimiento());
			LOGGER.info("pesoPiezasMovimiento: " + to.getPesoPiezasMovimiento());
			LOGGER.info("observPiezasMovimiento: " + to.getObservPiezasMovimiento());
			
			beans.add(new TrackingReferencia(to));
		}
		return beans;
	}
	
}
