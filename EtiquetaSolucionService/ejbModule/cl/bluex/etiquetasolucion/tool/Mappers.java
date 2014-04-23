package cl.bluex.etiquetasolucion.tool;

import java.util.ArrayList;
import java.util.List;

import cl.bluex.etiquetasolucion.bean.ImpresionSolucion;
import cl.bluex.etiquetasolucion.bean.SolicitudImpresion;
import cl.bluex.etiquetasolucion.bean.Inquietud;
import cl.bluex.etiquetasolucion.bean.Solucion;
import cl.bluex.etiquetasolucionmodel.to.ImpresionSolucionTO;
import cl.bluex.etiquetasolucionmodel.to.SolicitudImpresionTO;
import cl.bluex.etiquetasolucionmodel.to.InquietudTO;
import cl.bluex.etiquetasolucionmodel.to.SolucionTO;


/**
 * Mapeos de objetos.
 * 
 * @author rmoscoso
 * 
 */
public final class Mappers {
	
	private Mappers() {
		super();
	}

	
	/**
	 * Mapea de {@link InquietudTO} a {@link InquietudTO}.
	 * 
	 * @param bean {@link Inquietud}
	 * @return {@link InquietudTO}
	 */
	public static InquietudTO mapeaTOentradaEtiqueta(
			final Inquietud bean) {
		
		final InquietudTO to = new InquietudTO();
		
		to.setCodigoCliente(bean.getCodigoCliente());
		to.setCodigoEmpresa(bean.getCodigoEmpresa());
		to.setCodigoOficina(bean.getCodigoOficina());
		to.setCodigoPosta(bean.getCodigoPosta());
		to.setCodigoTipoCliente(bean.getCodigoTipoCliente());
		to.setCodigoTipoDocumento(bean.getCodigoTipoDocumento());
		to.setFechaFin(bean.getFechaFin());
		to.setFechaInicio(bean.getFechaInicio());
		to.setSucursalCliente(bean.getSucursalCliente());
		
		return to;
	}
	
	/**
	 * Metodo que mapea una lista de {@link SolucionTO} a una de {@link Solucion}.
	 * 
	 * @param tos lista de {@link SolucionTO}
	 * @return lista de {@link Solucion}
	 */
	public static List<Solucion> mapeaTOsalidaEtiqueta(
			final List<SolucionTO> tos) {
		
		final List<Solucion> beans = new ArrayList<Solucion>();
		
		for(final SolucionTO to : tos) {
			beans.add(new Solucion(to));
		}
		return beans;
	}

	/**
	 * Mapea de {@link SolicitudImpresionTO} a {@link SolicitudImpresionTO}.
	 * 
	 * @param bean {@link SolicitudImpresion}
	 * @return {@link SolicitudImpresionTO}
	 */
	public static SolicitudImpresionTO mapeaTOentradaImpresion(
			final SolicitudImpresion bean) {
		
		final SolicitudImpresionTO to = new SolicitudImpresionTO();
		
		to.setCodigoEspecieValorada(bean.getCodigoEspecieValorada());
		to.setCodigoTemplate(bean.getCodigoTemplate());
		
		return to;
	}
	
	
	/**
	 * Metodo que mapea una to {@link ImpresionSolucionTO} a un to {@link ImpresionSolucion}.
	 * 
	 * @param to de {@link ImpresionSolucionTO}
	 * @return to de {@link ImpresionSolucion}
	 */
	public static ImpresionSolucion mapeaTOsalidaImpresion(
			final ImpresionSolucionTO to) {
		
		final ImpresionSolucion bean = new ImpresionSolucion();
		
		bean.setCodigoBarraSorter(to.getCodigoBarraSorter());
		bean.setCodigoEspecieValorada(to.getCodigoEspecieValorada());
		bean.setNumeroFolio(to.getNumeroFolio());
		bean.setContenido(to.getContenido());
		
		return bean;
	}


}
