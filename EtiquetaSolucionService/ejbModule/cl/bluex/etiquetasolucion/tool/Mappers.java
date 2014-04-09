package cl.bluex.etiquetasolucion.tool;

import java.util.ArrayList;
import java.util.List;

import cl.bluex.etiquetasolucion.bean.ParametrosEntrada;
import cl.bluex.etiquetasolucion.bean.ParametrosSalida;
import cl.bluex.etiquetasolucionmodel.to.ParametrosEntradaTO;
import cl.bluex.etiquetasolucionmodel.to.ParametrosSalidaTO;


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
	 * Mapea de {@link ParametrosEntradaTO} a {@link ParametrosEntradaTO}.
	 * 
	 * @param bean {@link ParametrosEntrada}
	 * @return {@link ParametrosEntradaTO}
	 */
	public static ParametrosEntradaTO mapeaTOentrada(
			final ParametrosEntrada bean) {
		
		final ParametrosEntradaTO to = new ParametrosEntradaTO();
		
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
	 * Metodo que mapea una lista de {@link ParametrosSalidaTO} a una de {@link ParametrosSalida}.
	 * 
	 * @param tos lista de {@link ParametrosSalidaTO}
	 * @return lista de {@link ParametrosSalida}
	 */
	public static List<ParametrosSalida> mapeaTOsalida(
			final List<ParametrosSalidaTO> tos) {
		
		final List<ParametrosSalida> beans = new ArrayList<ParametrosSalida>();
		
		for(final ParametrosSalidaTO to : tos) {
			beans.add(new ParametrosSalida(to));
		}
		return beans;
	}

}
