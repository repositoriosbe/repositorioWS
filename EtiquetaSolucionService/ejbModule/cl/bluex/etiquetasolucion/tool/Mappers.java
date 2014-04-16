package cl.bluex.etiquetasolucion.tool;

import java.util.ArrayList;
import java.util.List;

import cl.bluex.etiquetasolucion.bean.Inquietud;
import cl.bluex.etiquetasolucion.bean.Solucion;
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
	public static InquietudTO mapeaTOentrada(
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
	public static List<Solucion> mapeaTOsalida(
			final List<SolucionTO> tos) {
		
		final List<Solucion> beans = new ArrayList<Solucion>();
		
		for(final SolucionTO to : tos) {
			beans.add(new Solucion(to));
		}
		return beans;
	}

}
