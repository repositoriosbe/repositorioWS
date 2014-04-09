package cl.bluex.verificacion.tool;

import java.util.ArrayList;
import java.util.List;

import cl.bluex.verificacion.bean.Acronimo;
import cl.bluex.verificacion.bean.Batch;
import cl.bluex.verificacion.bean.DetalleBatch;
import cl.bluex.verificacion.bean.OsBatch;
import cl.bluex.verificacion.bean.Oser;
import cl.bluex.verificamodel.to.AcronimoTO;
import cl.bluex.verificamodel.to.BatchTO;
import cl.bluex.verificamodel.to.DetalleBatchTO;
import cl.bluex.verificamodel.to.OsBatchTO;
import cl.bluex.verificamodel.to.OserTO;
import cl.bluex.ws.common.exceptions.BluexException;


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
	 * Metodo de mapeo de objeto batch.
	 * 
	 * @param batch
	 * @return {@link BatchTO}
	 * @throws BluexException 
	 */
	public static BatchTO mapeaBatch(final Batch batch) throws BluexException {
		final BatchTO to = new BatchTO();
		to.setCodigoEmpresa(batch.getCodigoEmpresa());
		to.setCodigoEncabezado(batch.getCodigoEncabezado());
		to.setCodigoPosta(batch.getCodigoPosta());
		to.setCodigoUsuario(batch.getCodigoUsuario());
		to.setNumeroSecuencia(batch.getNumeroSecuencia());
		to.setCodigoEstadoBatch(batch.getCodigoEstadoBatch());
		to.setFechaCierreBatch(batch.getFechaCierreBatch());
		to.setFechaCreacionBatch(batch.getFechaCreacionBatch());
		to.setNumeroBatch(batch.getNumeroBatch());
		to.setTotalDetalleBatch(batch.getTotalDetalleBatch());
		to.setEevvNmrId(batch.getEevvNmrId());
		to.setCodigoMoneda(batch.getCodigoMoneda());
		
		return to;
	}

	/**
	 * Metodo que mapea el objeto DetalleBatch a DetalleBatchTO.
	 * 
	 * @param detalleBatch
	 * @return {@link DetalleBatchTO}
	 */
	public static DetalleBatchTO mapeaDetalleBatch(final DetalleBatch detalleBatch) {
		final DetalleBatchTO to = new DetalleBatchTO();
		to.setCodigoEmpresa(detalleBatch.getCodigoEmpresa());
		to.setCodigoEncabezado(detalleBatch.getCodigoEncabezado());
		to.setCodigoPosta(detalleBatch.getCodigoPosta());
		to.setCodigoUsuario(detalleBatch.getCodigoUsuario());
		to.setEevvNmrId(detalleBatch.getEevvNmrId());
		to.setCodigoEstadoDcbt(detalleBatch.getCodigoEstadoDcbt());
		to.setNumeroSecuencia(detalleBatch.getNumeroSecuencia());
		
		return to;
	}

	/**
	 * Metodo que mapea una lista de AcronimoTO a una lista de Acronimo.
	 * 
	 * @param tos
	 * @return lista de {@link Acronimo}
	 */
	public static List<Acronimo> mapeaAcronimos(final List<AcronimoTO> tos) {
		final List<Acronimo> beans = new ArrayList<Acronimo>();
		
		for (final AcronimoTO to: tos) {
			beans.add(new Acronimo(to));
		}
		return beans;
	}

	
	/**
	 * Metodo que mapea una lista de BatchTO a una lista de Batch.
	 * 
	 * @param tos
	 * @return lista de {@link Batch}
	 */
	public static List<Batch> mapeaBatches(final List<BatchTO> tos) {
		final List<Batch> beans = new ArrayList<Batch>();
		
		for (final BatchTO to: tos) {
			beans.add(new Batch(to));
		}
		return beans;
	}

	
	/**
	 * Metodo que mapea un OsBatch a OsBatchTO.
	 * 
	 * @param bean
	 * @return {@link OsBatchTO}
	 * @throws BluexException 
	 */
	public static OsBatchTO mapeaOsBatch(final OsBatch bean) throws BluexException {
		final OsBatchTO to = new OsBatchTO();
		to.setCodigoEmpresa(bean.getCodigoEmpresa());
		to.setCodigoEncabezado(bean.getCodigoEncabezado());
		to.setCodigoPosta(bean.getCodigoPosta());
		to.setFechaCreacionBatch(bean.getFechaCreacionBatch());
		to.setNumeroDocumentoDesde(bean.getNumeroDocumentoDesde());
		to.setNumeroDocumentoHasta(bean.getNumeroDocumentoHasta());
		to.setNumeroSecuencia(bean.getNumeroSecuencia());
		
		return to;
	}

	/**
	 * Metodo que mapea un OserTO a Oser.
	 * 
	 * @param tos de tipo {@link OserTO}
	 * @return lista de {@link Oser}
	 */
	public static List<Oser> mapeaOsers(final List<OserTO> tos) {
		final List<Oser> beans = new ArrayList<Oser>();
		
		for (final OserTO to: tos) {
			beans.add(new Oser(to));
		}
		return beans;
	}

	/**
	 * Metodo que mapea un {@link Oser} a un {@link OserTO}.
	 * 
	 * @param oser
	 * @return {@link OserTO}
	 * @throws BluexException 
	 */
	public static OserTO mapeaOser(final Oser oser) throws BluexException {
		final OserTO to = new OserTO();
		to.setEevvNmrSerie(oser.getEevvNmrSerie());
		to.setEevvNmrId(oser.getEevvNmrId());
		to.setCtacteEmba(oser.getCtacteEmba());
		to.setNombreCtacte(oser.getNombreCtacte());
		to.setCentroCosto(oser.getCentroCosto());
		to.setCodigoPostaOrigen(oser.getCodigoPostaOrigen());
		to.setCodigoPostaDestino(oser.getCodigoPostaDestino());
		to.setCodigoTipoServicio(oser.getCodigoTipoServicio());
		to.setCodigoServComple(oser.getCodigoServComple());
		to.setCntpiezas(oser.getCntpiezas());
		to.setPesofisico(oser.getPesofisico());
		to.setPesovolumen(oser.getPesovolumen());
		to.setMontoCOD(oser.getMontoCOD());
		to.setVlorimptopp(oser.getVlorimptopp());
		to.setVlorimptocc(oser.getVlorimptocc());
		to.setVlorfletepp(oser.getVlorfletepp());
		to.setVlorfletecc(oser.getVlorfletecc());
		to.setVlorvalorapp(oser.getVlorvalorapp());
		to.setVlorvaloracc(oser.getVlorvaloracc());
		to.setVlorvariospp(oser.getVlorvariospp());
		to.setVlorvarioscc(oser.getVlorvarioscc());
		to.setVlorseguro(oser.getVlorseguro());
		to.setVlordeclarado(oser.getVlordeclarado());
		to.setVloraduana(oser.getVloraduana());
		to.setTarifa(oser.getTarifa());
		to.setClhlcodigoEmbarque(oser.getClhlcodigoEmbarque());
		to.setClhlsucursalEmbarque(oser.getClhlsucursalEmbarque());
		to.setTpclcodigoEmbarque(oser.getTpclcodigoEmbarque());
		to.setNumeroBatch(oser.getNumeroBatch());
		to.setCodigoEmpresa(oser.getCodigoEmpresa());
		to.setCodigoProducto(oser.getCodigoProducto());
		to.setCodigoEstadoDcbt(oser.getCodigoEstadoDcbt());
		to.setFechaCreacionOs(oser.getFechaCreacionOs());
		
		return to;
	}
	
}
